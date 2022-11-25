package ListAssignment4;

import java.util.ArrayList;
import java.util.List;

public class FindGit {
	//Input – Git, Github, GitLab,GitBash, Selenium, Java, Maven
	//Output- Git, Github, Gitlab, GitBash
	public static void main(String[]args) {
	List<String> list = new ArrayList<String>();
	list.add("Git");
	list.add("Github");
	list.add("GitLab");
	list.add("GitBash");
	list.add("Selenium");
	list.add("Java");
	list.add("Maven");
	list.add("GitB");
	
	System.out.println("list:"+list);
	for(int i=0;i<list.size();i++) {
		if(!list.get(i).startsWith("Git")) {
			list.remove(i);
			--i;
		}
		
	}
	System.out.println("list:"+list);
	
	
	}
	
	
	
	


}
