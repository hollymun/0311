import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class SevenApi {

	public static void main(String[] args) {
		//스트림 변수 선언
		
		//1.7에서는 이 영역에서 스트림 생성하지 않아도 됨
		//finally를 사용하지 않을 것이기 때문 
		//파일에 대한 참조를 생성 
		Path path = Paths.get("../Output.txt");
			
		//try안에서 스트림을 생성하면 직접 받을 필요가 없음 
		try(OutputStream os = Files.newOutputStream(path)){
			//스트림 생성 
			//스트림 생성 
			os.write(97);
			os.flush();
		}
		catch(Exception e) {
			//예외가 발생했을 때 수행할 코드
			System.out.printf("%s\n", e.getMessage());
			//예외를 역추적하는 코드를 출력 
			e.printStackTrace();
		}
/*		//위 catch구문 때문에 아래 구문 쓸 필요가 없어짐 
 * 		finally {
			//스트림 닫기 
		}
*/
		
		try(InputStream is = Files.newInputStream(path)){
			int ch = is.read();
			System.out.printf("%c\n", ch);
		}
		catch(Exception e) {
			System.out.printf("%s\n", e.getMessage());
			e.printStackTrace();
		}
		
		
		
		
	}

}
