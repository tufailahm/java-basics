package consdemo;

public class ShoppingApp {

	public static void main(String[] args) {
		Review review1 = new Review(10182, "Daniel", 5);
		review1.reviewCount++;		//91763
		System.out.println(review1.reviewCount);	//91763	//11

		Review review2 = new Review(10185, "Richard", 5);
		review2.reviewCount++;		//11
		
		//Each and every object will have
		//separate copy of instance variables 
		System.out.println(review2.reviewCount);	//11

		Review review3 = new Review();
		review3.reviewCount++;
		
		System.out.println(review1.reviewCount);	//91763	//11

	}

}
