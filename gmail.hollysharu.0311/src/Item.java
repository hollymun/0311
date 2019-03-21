import java.util.Date;
import java.io.Serializable;

public class Item implements Serializable {

	private int num;
	private String name;
	private Date productDate;
	private int price;

	// default Constructor - 매개변수가 없는 생성자
	public Item() {
		super();
	}

	// 매개변수가 있는 생성자
	public Item(int num, String name, Date productDate, int price) {
		super();
		this.num = num;
		this.name = name;
		this.productDate = productDate;
		this.price = price;
	}

	// 접근자 메소드 생성
	// : 객체 지향 언어에서는 인스턴스 변수에 직접 접근하지 말고 접근자 메소드를 통해서 접근하도록 권장함
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getProductDate() {
		return productDate;
	}

	public void setProductDate(Date productDate) {
		this.productDate = productDate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// 인스턴스 변수들의 값을 빠르게 확인하기 위한 메소드 - 디버깅을 위한 메소드
	// 인스턴스 이름만 대입하면 데이터가 호출되기 때문
	@Override
	public String toString() {
		return "Item [num=" + num + ", name=" + name + ", productDate=" + productDate + ", price=" + price + "]";
	}

}
