package arrayList;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		
		ArrayList<String> car = new ArrayList<String>();
		
		car.add("Volvo");
		car.add("BMW");
		car.add("Ford");
		car.add("Mazda");
		
		System.out.println(car.get(1));
		
		
		ArrayList<Integer> number = new ArrayList<Integer>();
		
		number.add(50);
		number.add(70);
		number.add(90);
		
		
		for(int x : number)
		System.out.println(x);
		

	}

}
