package Assignment2;
import java.util.*;

public class Q1ArrayListAddElement1position {
	public static void main(String[] args)
	{
		List <String> list1= new ArrayList<String>();
		list1.add("my name is Rahul.");
		list1.add("Your name is prince");
		System.out.println(list1);
		//adding elements at specific positions
		list1.add(0,"my name is sakshi");
		list1.add(3,"my name is yes");
		System.out.println(list1);
	}

}
