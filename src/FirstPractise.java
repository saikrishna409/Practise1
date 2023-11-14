
public class FirstPractise {
//comment1
	private int num;
	private String name;
	private int price;
	
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


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "FirstPratise [num=" + num + ", name=" + name + "]";
	}


	public static void main(String[] args) {
		FirstPractise practise = creation();
		System.out.println("HELLO"+practise.getName());

	}


	private static FirstPractise creation() {
		FirstPractise practise = new FirstPractise();
		practise.setName("Java");
		practise.setNum(1);
		return practise;
	}

}
