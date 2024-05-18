package Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class M {

	public static void main(String[] args) {
		/*
		 * HashSet hs=new HashSet(); hs.add(10); hs.add(20); hs.add("aka");
		 * System.out.println(hs); Iterator s= hs.iterator(); while(s.hasNext()) {
		 * System.out.println(s.next()); }
		 */
		System.out.println("___________");
		HashMap<Integer,String> b=new HashMap();
		b.put(11, "aka");
		b.put(2, "sagar");
		b.put(23,"pgl");
		System.out.println(b);
		
	for(Map.Entry t:b.entrySet()) {
		System.out.println(t.getKey()+" ->"+t.getValue());
		
	}
		
		/*
		 * Set v=b.entrySet(); System.out.println(v); Iterator itr=v.iterator();
		 * while(itr.hasNext()) { System.out.println(itr.next()); Map.Entry y=
		 * (Map.Entry)itr.next(); System.out.println(y.getKey()+"....s "+ y.getValue());
		 * }
		 */
	}

}
