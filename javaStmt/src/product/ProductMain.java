package product;

public class ProductMain {
	public static void main(String[] args) {
		Tv tv = new Tv();
		tv.setTvInfo("LG", "TV", "lg1234", "1000만화소", "IPS");
		Computer com = new Computer();
		com.setComputerInfo("삼성", "컴퓨터", "sm1234", "512GH", "8G", "1TB");
		SmartPhone phone = new SmartPhone();
		phone.setSmartPhoneInfo("삼성", "갤럭시", "gal1234", "1000만 화소", "6인치");

		//List<Product> list = new List<Product>(); //deep copy
		Product[] cart = new Product[3];
		cart[0] = tv;
		cart[1] = com;
		cart[2] = phone;
		
		for (Product product : cart) {
			System.out.println(product.dispaly());
			System.out.println();
		}
	}
}
