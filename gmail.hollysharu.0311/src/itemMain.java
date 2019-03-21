import java.util.List;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;

//SerializableMain
public class itemMain {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		try(ObjectOutputStream oos = new ObjectOutputStream(
											new FileOutputStream("./oos.txt"))){
			//oos.writeObject("안녕하세요 Hello");
			
			//java.io.Serializable 인터페이스를 implements 하지 않은 클래스의 객체는 
			//파일이나 네트워크를 통해서 전송할 수 있음 
			Item item = new Item(1, "돌도끼텀블러", new Date(), 12000);
			oos.writeObject(item);
			item = new Item(2, "스타벅스텀블러", new Date(), 44000);
			oos.writeObject(item);
			
			
		}
		catch(Exception e) {
			System.out.printf("%s\n", e.getMessage());
			e.getStackTrace();
		}
		
		try(ObjectInputStream ois = new ObjectInputStream(
										new FileInputStream("./oos.txt"))){
			//원래의 자료형으로 형 변환해서 읽으면 됨 
			//String msg = (String)ois.readObject();
			//System.out.printf("%s\n", msg);
			
			Item item = (Item)ois.readObject();
			System.out.printf("%s\n", item);
			item = (Item)ois.readObject();
			System.out.printf("%s\n", item);
			
		}
		catch(Exception e) {
			System.out.printf("%s\n", e.getMessage());
			e.getStackTrace();
		}
		
	}

}
