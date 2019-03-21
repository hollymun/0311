import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class LogWriting {

	public static void main(String[] args) {
		//오늘 날짜에 해당하는 파일이름 만들기 (2019-03-11.log - 있으면 추가
		//1)오늘 날짜를 저장하는 클래스의 인스턴스 만들기
		Calendar cal = new GregorianCalendar();
		
		//2)년월일 추출 
		//int year = cal.get(Calendar.YEAR);
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		//3)파일이름 생성 - String.format : pringf와 사용법은 동일 
		String filename = String.format("../%4d-%02d-%02d.log", year, month, day);

		
		try(PrintWriter pw = new PrintWriter(new FileWriter(filename, true))){
			pw.println("로그를 기록합니다\n");
			pw.println("오늘은 에러를 안 내야 할 텐데\n");
			pw.flush();
			
		}
		catch(Exception e) {
			System.out.printf("%s\n", e.getMessage());
			e.printStackTrace();
		}
	}

}
