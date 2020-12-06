package hashMap;

import java.util.HashMap;

public class HasMapPractice {

	public static void main(String[] args) {

		HashMap<String,String> capitalCities = new HashMap<String,String>();

		capitalCities.put("England","London");
		capitalCities.put("Bangladesh","Dhaka");
		capitalCities.put("Kuwait","Kuwait City");
		capitalCities.put("Peru","Lima");
		capitalCities.put("Brunei","Bondor seri begwan");

		System.out.println(capitalCities);
		
		
		HashMap <String,Integer> nameAge = new HashMap<String, Integer>();
		
		nameAge.put("Haque",60);
		nameAge.put("Khanjada",70);
		nameAge.put("nayan",100);
		
		
		System.out.println(nameAge);


	}

}
