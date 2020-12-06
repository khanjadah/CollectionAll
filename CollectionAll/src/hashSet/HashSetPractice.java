package hashSet;

import java.util.HashSet;

public class HashSetPractice {

	public static void main(String[] args) {
		
		HashSet<String> car = new HashSet<String>();
		
		car.add("Volvo");
		car.add("BMW");
		car.add("Ford");
		car.add("Mazda");
		car.add("BMW");
		
		System.out.println(car);
		
	}

}
