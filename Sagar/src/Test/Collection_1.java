package Test;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection_1 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("akanksha");
		al.add("sagar");
		al.add("samu");
		
		al.get(1);
		al.get(2);
		System.out.println(al.get(0));
		System.out.println(al);
		 Iterator cr= al.iterator();
		 while(cr.hasNext()) {
			 System.out.println(cr.next());
		 }
	}

}
