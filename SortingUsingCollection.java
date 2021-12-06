package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		
		String[] input = {"HCL","Wipro","Aspire Systems","CTS"};
		
		List<String> values = new ArrayList<String>();
				
		for (String eachData: input) {
		 System.out.println(values);
			values.add(eachData);
	}
	 System.out.println("The Sorted == ");
	 Collections.sort(values);
	 
	 for(int i=0;i<values.size();i++);{
	int i=0;
	System.out.println(values.get(i));


	}

}
}
