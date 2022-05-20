package chap13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/*p.380 */
public class IteratorEx {
	//ArrayList<E>
	//List<E>
//	Set<E>
	//HashSet<E>
	List <Iterator> list = new ArrayList<Iterator>();
	Set <Iterator> set = new HashSet<Iterator>();
	//Iterator <Integer> it = null;
	
	for(int i=0;i <5;i++) {
		list.add(i);
		set.add(i);
	}
	it = list.iterator();
}
