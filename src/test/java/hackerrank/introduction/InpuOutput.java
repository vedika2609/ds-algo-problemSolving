package hackerrank.introduction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import net.minidev.json.JSONObject;

public class InpuOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		double d = scan.nextDouble();
		scan.nextLine(); /*After supplying data for double, we would hit the enter key. 
		What nextInt() and nextDouble() does is it assigns integer to appropriate variable and keeps the enter key unread in the keyboard buffer.
		 so when its time to supply String the nextLine() will read the enter key from the user thinking that the user has entered the enter key.
		 (that's we get empty output) . Unlike C, there is no flush() to clean buffer, so we have to flush by not taking it in variable.*/
		String s = scan.nextLine();
		System.out.println(String.join("", Collections.nCopies(15, "*")));
		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + i);
		System.out.println(String.join("", Collections.nCopies(15, "*")));

		String s1= "java";
		String s2 = "java";
		String s3 = "JAVA";
		s2.toUpperCase();
		s3.toUpperCase();
		boolean b1 = s1==s2;
		boolean b2 = s1==s3;
		System.out.println(b1);
		System.out.println(b2);

		Set h = new HashSet();
		h.add("one");
		h.add("two");
		h.add("three");
		h.add("four");
		h.add("one");
		h.add("four");
		List l = new ArrayList();
		l.add("one");
		l.add("two");
		l.add("three");
		h.retainAll(l);
		System.out.println("Size: " + h.size()+l.size());

		//		public static JSONObject function(JSONObject obj, String keyMain,String valueMain, String newValue) throws Exception {
		//		    // We need to know keys of Jsonobject
		//		    JSONObject json = new JSONObject();
		//		    Iterator iterator = obj.keys();
		//		    String key = null;
		//		    while (iterator.hasNext()) {
		//		        key = (String) iterator.next();
		//		        // if object is just string we change value in key
		//		        if ((obj.optJSONArray(key)==null) && (obj.optJSONObject(key)==null)) {
		//		            if ((key.equals(keyMain)) && (obj.get(key).toString().equals(valueMain))) {
		//		                // put new value
		//		                obj.put(key, newValue);
		//		                return obj;
		//		            }
		//		        }
		//
		//		        // if it's jsonobject
		//		        if (obj.optJSONObject(key) != null) {
		//		            function(obj.getJSONObject(key), keyMain, valueMain, newValue);
		//		        }
		//
		//		        // if it's jsonarray
		//		        if (obj.optJSONArray(key) != null) {
		//		            JSONArray jArray = obj.getJSONArray(key);
		//		            for (int i=0;i<jArray.length();i++) {
		//		                    function(jArray.getJSONObject(i), keyMain, valueMain, newValue);
		//		            }
		//		        }
		//		    }
		//		    return obj;
		//		}
		//	}

	}
}
