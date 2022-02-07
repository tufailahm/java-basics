package consdemo;

class Revature
{
	
}
public class StringDemo {

	public static void main(String[] args) {
		
		String string1 = "The quick brown Fox jumps over the lazy Dog";
		/*
		 * System.out.print("10. "+"\t"); String s2 = string1.substring(0, 30); String
		 * s1 = string1.substring(31, 43); System.out.println(s2);
		 * System.out.print("\t"); System.out.println(s1);
		 */
		
		/*
		 * int index1 = string1.indexOf("f"); int index2 = string1.indexOf("f") + 3;
		 * System.out.println(string1.substring(index1, index2)); // Dog
		 * System.out.println(string1.substring(40, 43));
		 */


		System.out.print("11. ");
		String fox = string1.substring(16,20);
		System.out.println("\t"+fox);
		System.out.print("\t");
		String dog = string1.substring(40,43);
		System.out.println(dog);
		
		
	//	string1.indexOf("fox"), string1.indexOf("fox") + 3) + "-" + string1.substring(string1.indexOf("dog")));

		
	}
}
