package test.my.sample;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		Map<Person,String> ma = new HashMap<Person,String>();
		ma.put(new Person("test", "123"), "123");
		ma.put(new Person("test", "123"),"123");
		
		System.out.println(ma.size());
	}
}
