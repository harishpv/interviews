import java.util.Hashtable;

public class TestExample {
	final static String str;
	public static void main(int args[]) {
		String str = "h";
		System.out.println(TestExample.str);
	}
	public static void main(String args[]) {
		String str = "h";
		System.out.println(TestExample.str+8);
	}
	static {
		str="hi";
	}
	
	int check() {
		try {
			
			return 1;
		} catch(Exception e) {
			System.out.println(1);
			return 1;
		} finally {
			System.out.println(1);
			return 1;
		}
	}
}
