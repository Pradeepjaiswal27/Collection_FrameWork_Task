package Task;

import java.util.ArrayList;
import java.util.List;

public class Task5 {

	public static void main(String[] args) {
		List<Integer> al=new ArrayList<>();
		al.add(121);
		al.add(111);
		al.add(111);
		al.add(1211);
		System.out.println(al);
		int size = al.size();
		for(int i=0;i<size-1;i++) {
			if(al.get(i)==al.get(i+1)) {
				System.out.println(al.get(i)+" is Duplicate number..");
			}
		}

	}

}
