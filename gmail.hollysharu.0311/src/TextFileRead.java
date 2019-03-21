import java.io.BufferedReader;
import java.io.FileReader;

public class TextFileRead {

	public static void main(String[] args) {
/*
		//try - resource 구문 : close를 호출하지 않아도 자동 호출됨 
		try(BufferedReader br = new BufferedReader(new FileReader ("../readLine_sample.txt"))){
			//BufferedReader 클래스의 readLine 메소드는 줄 단위로 읽어서 리턴하는 메소드 
			//읽은 데이터가 없으면 null을 리턴함		
			while(true) {
				String str = br.readLine();
				System.out.printf("%s\n", str);
				if(str == null) {
					break;
				}
			}
		}
*/		
		//읽어서 저장해야 하는 경우 
		//읽은 데이터를 추가할 StringBuilder 객체를 생성 
		try(BufferedReader br = new BufferedReader(new FileReader ("../readLine_sample.txt"))){
			StringBuilder sb = new StringBuilder();
			//String content = "";
			while(true) {
				//StringBuilder str2 = new StringBuilder(br.readLine());
				String str = br.readLine();
				//?????????????????ㅇ왜 여기는 빌더로 안 만들어지고 스트링으로만 되지.. 어차피 반복문 안이니까 복사해서 쓰는 거...
				//전체 파일은 수정 가능하지만 줄 단위로는 스트링을 쓰는 것...? 이것도 빌더로는 안 되는 건가,,, 
				if(str == null) {
					break;
				}
				//문자열을 계속 복사해서 사용하기 때문에 메모리효율 떨어짐
				//content = content + str;
				
				//StringBuilder에 문자열 추가 - 복사 작업을 하지 않음 
				sb.append(str);
			}
			//System.out.printf("%s", content);
			
			//StringBuilder의 데이터를 String으로 변환 
			String content = sb.toString();
			System.out.printf("%s", content);
			
		}
		catch(Exception e) {
			System.out.printf("%s\n", e.getMessage());
			e.printStackTrace();
		}
		
		
	}

}
