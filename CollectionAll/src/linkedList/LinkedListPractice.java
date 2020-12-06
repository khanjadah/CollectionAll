package linkedList;

import java.util.LinkedList;


//2 kind of memory, 1 is heap memory, 2 is stack memory
//Stack memory: is ,last in first out, its a short time memory.its happen with compile time.
//Heap memory: Long time memory for the moment. its happen with run time.

// Final , Finally , Finalize = is a method name, use to garbage colletor before.
public class LinkedListPractice {

	public static void main(String[] args) {
		
		LinkedList<String> car = new LinkedList<String>();
		
		car.add("Volvo");
		car.add("Bmw");
		car.add("Ford");
		
		car.addFirst("Mazda");
		car.addLast("Bmw");
	   //car.removeLast();
		car.addFirst("Ferari");
		
		System.out.println(car.contains("tyota"));
		System.out.println(car.getFirst());
		
		System.out.println(car);
		
		System.out.println(car.contains("Mazda"));

	}

}
