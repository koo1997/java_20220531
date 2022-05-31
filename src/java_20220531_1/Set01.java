package java_20220531_1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set01 {

	public static void main(String[] args) {
		
		
		Set<String> set = new HashSet<>();
		set.add("java");
		set.add("java");
		set.add("c");
		set.add("python");
		set.add("python");
		
		System.out.println(set.size());
		
		
//		List<String> list = new ArrayList<>();
//		list.addAll(set);
		
 		for(String s:set) {
			System.out.print(s+" ");
		}
		System.out.println();
		
		Iterator<String> it= set.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
			
		}
		System.out.println();
		
		set.forEach(x->System.out.print(x+" "));
		System.out.println();
//		set.remove("java");
		
		
//		set.retainAll(Arrays.asList("java","python","set"));
//		set.forEach(x->System.out.print(x+" "));
		
		String []str= new String[set.size()];
		str = set.toArray(str);
		System.out.println(str[0]);
		
		
		
	}

}
