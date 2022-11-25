package ListAssignment4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input – Java, TestNG, Maven, Java, 
		//Output – Java, TestNG, Maven
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("TestNG");
		list.add("Maven");
		list.add("Java");
		
		System.out.println("list:"+list);
		
		Set<String> set = new TreeSet<>(list);
		System.out.println("Set:"+set);
		

	}

}
