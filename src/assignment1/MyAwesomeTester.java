package assignment1;

public class MyAwesomeTester {
	public static void main(String[] args) {
		Basket basket = new Basket();
		basket.add(new Egg("steve",3,3));
		System.out.println(basket.getTotalTax());
		System.out.println("Hello world");
	}

}
