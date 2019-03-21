import java.io.FileReader;

public class CharacterFileStream {

	public static void main(String[] args) {
		
/*			
		try(FileWriter fw = new FileWriter("../Input.txt", true)){
			fw.write("파일에 문자 단위로 기록합니다\n");
			fw.write("flush를 호출하지 않으면 기록이 되지 않을 수 있습니다\n");

			System.out.printf("인코딩 방식:%s\n", fw.getEncoding());
		}
		catch(Exception e) {
			System.out.printf("%s\n", e.getMessage());
			e.printStackTrace();
		}
*/
		
		try(FileReader fr = new FileReader("../Input.txt")){
			//파일 내용을 전부 읽어서 출력하기 
			//횟수를 알면 for 모르면 while 
			while(true) {
				char [] buf = new char[1];
				int r = fr.read(buf);
				if(r <= 0) {
					break;
				}
			/*	
				for(char ch : buf) {
					System.out.printf("%c", ch);
				}
			*/
				//반복문보단 바로 출력
				String msg = new String(buf);
				System.out.printf("%s", msg);
			}
			
			System.out.printf("인코딩 방식:%s\n", fr.getEncoding());
		}
		catch(Exception e) {
			System.out.printf("%s\n", e.getMessage());
			e.printStackTrace();
		}
		
		
		
		
	}

}
