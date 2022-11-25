package listassignments;

import java.util.ArrayList;
import java.util.List;

public class ListOfLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Create a list which can accept another list as an element.
        List 1- 11,22,33
	    List 2-  9,19,29	
	    List 3-  7,17,27
	Hint - ArrayList<ArrayList<Integer>> l1=new ArrayList<>();*/
		
		List<List<Integer>> lists = new ArrayList<>();
		List<Integer>innerlist1 = new ArrayList<>();
		innerlist1.add(11);
		innerlist1.add(22);
		innerlist1.add(33);
		lists.add(innerlist1);
		
		List<Integer>innerlist2 = new ArrayList<>();
		innerlist2.add(9);
		innerlist2.add(19);
		innerlist2.add(29);
		lists.add(innerlist2);
		
		List<Integer>innerlist3 = new ArrayList<>();
		innerlist3.add(7);
		innerlist3.add(17);
		innerlist3.add(27);
		lists.add(innerlist3);

		System.out.println(lists);

	}

}
