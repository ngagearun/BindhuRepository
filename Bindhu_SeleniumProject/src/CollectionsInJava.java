import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class CollectionsInJava {

	public static void main(String[] args) {
		
		
		List list=new LinkedList();
		list.add(1000);
		list.add("Arun");
		list.add(12.5f);
		list.add(1000);
		list.add("Arun");
		list.add(12.5f);
		list.add(2, "kumar");
		/*System.out.println(list);
		
		System.out.println(list.size());
		System.out.println(list.get(3));*/
		
		
		
		Set set=new TreeSet();
		set.add(1000);
	    set.add(200);
	    set.add(20);
	    set.add(40);
		
		System.out.println(set);
		
		
		
		
		
		

	}

}
