package CGWeek1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataTypeDemo {
	
	
	public static void main(String[] args)
	{ 
// List<int[]> list = new ArrayList<>(); 
//		 while(true)
//		 {
//			 list.add(new int[100000]);
//		 }
//		int[] n=new int[Integer.MAX_VALUE];
		
//		Pattern mobileNumber= Pattern.compile("[0-9]{10}");
//		Matcher matchmobile= mobileNumber.matcher("1234567890");
//		if(matchmobile.matches())
//		{
//			System.out.println("Valid");
//		}
//		else
//		{
//			System.out.println("invalid");
//		}
		
//		Pattern PanCardnumber=Pattern.compile("[A-Z]{5}[0-9]{4}[A-Z]{1}");
//		Matcher matchPan=PanCardnumber.matcher("BSXPV8648E");
//		if(matchPan.matches())
//		{
//			System.out.println("matches");
//		}
//		else
//		{
//			System.out.println("don't matches");
//		}
		
//		PriorityQueue<Integer> p= new PriorityQueue<Integer>();
//		p.add(20);
//		p.add(10);
//		p.add(30);
//		p.add(5);
//		p.add(15);
//		p.add(3);
//		
//		System.out.print(p);
//		
		
		Map<String, Map<String, Object>> userProfile= new HashMap<>();
		Map<String, Object> user1Profile= new HashMap<>();
		user1Profile.put("Name", "Smruti");
		user1Profile.put("Age", "30");
		
		Map<String, Object> user2Profile= new HashMap<>();
		user2Profile.put("Name", "Biswarupa");
		user2Profile.put("Age", "26");
		
		userProfile.put("user1",user1Profile);
		userProfile.put("user2", user2Profile);
		
		System.out.println(userProfile.get("user1"));
		
		
	}

}
