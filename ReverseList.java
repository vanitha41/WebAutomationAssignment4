package ListAssignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input – Java, Selenium, TestNG, Git, Github
		//Output- Github, Git, TestNG, Selenium, Java
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("Selenium");
		list.add("TestNG");
		list.add("Git");
		list.add("Github");
		
		System.out.println("list:"+list);
		//Collections.reverse(list);
		//System.out.println("reverse"+list);
		
		for(int i=0,j=list.size()-1;i<j;i++) {
			
			list.add(i,list.remove(j));
			
		}
		System.out.println("list:"+list);
		
		
		

	}

}
