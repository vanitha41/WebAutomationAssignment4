package ListAssignment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Input – 10,45, 90,45, 23, 90, 44
	//	Output – 45,90
		List<Integer> list = new ArrayList<>(); 
				Arrays.asList(10,45,90,45,23,90,44);
		list.add(10);
		list.add(45);
		
		
		
		
		
		System.out.println(list);
		list.remove(1);
		if(list.size()>=2)
		
		list.remove(list.size()-2);
		else
			list.remove(0);
		System.out.println(list);
	}

}
