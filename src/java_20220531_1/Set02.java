package java_20220531_1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Set02 {	
	public static void main(String[] args) {
		
//		Set<String> set = new TreeSet();
//		SortedSet<String> set = new TreeSet();
		NavigableSet<String> set = new TreeSet();
		set.addAll(Arrays.asList(new String[] {"java","a","b","C","d","e"}));
		System.out.println(set.first());
		System.out.println(set.last());
		set.forEach(x->System.out.print(x+" "));
		System.out.println();
		
		set.descendingSet().forEach(x->System.out.print(x+" "));
		System.out.println();
		Iterator<String> it = set.descendingIterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		set.subSet("a", "b").forEach(x->System.out.print(x+" "));
		System.out.println();
		set.subSet("a",true, "d",true).forEach(x->System.out.print(x+" "));
		System.out.println();
		set.headSet("d").forEach(x->System.out.print(x+" "));
		System.out.println();
		set.tailSet("a").forEach(x->System.out.print(x+" "));
		System.out.println();
		set.tailSet("a",false).forEach(x->System.out.print(x+" "));
		System.out.println();
		set.tailSet("b",true).forEach(x->System.out.print(x+" "));
			
	}

}
