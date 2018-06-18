package fish;
import java.util.*;
public class fish{
	public static void main(String[] args){
		Integer[] iray = {5,18,19,9,3,7};
		List<Integer> list1 = new LinkedList<Integer>(Arrays.asList(iray));
		System.out.println("Original List: ");
		output(list1);
		
		Collections.sort(list1);
		System.out.println("Sorted list: ");
		output(list1);
		
		Collections.reverse(list1);
		System.out.println("Reversed list: ");
		output(list1);
		
		Collections.fill(list1, 3);
		System.out.println("Filled list: ");
		output(list1);
		
		String[] sray = {"eggs", "ramen", "noodles", "musk", "apples", "bacon"};
		List<String> list2 = new LinkedList<String>(Arrays.asList(sray));
		System.out.println("Original CList: ");
		output(list2);
		
		Collections.sort(list2);
		System.out.println("Sorted Clist: ");
		output(list2);
		
		Collections.reverse(list2);
		System.out.println("Reversed Clist: ");
		output(list2);
		
		Collections.fill(list2, "PRANAY");
		System.out.println("Filled Clist: ");
		output(list2);
		
	}
	
	public static <T> void output(List<T> l){
		for(T b : l){
			System.out.printf("%s ", b);
		}
		System.out.println();
	}
}