import org.junit.Test;

public class test {
	
	//new message
	@Test
	public static void testPurpose() {
          System.out.println("Inside testpurpose");
	}

	public static void main(String[] args) {
		// Test Class
		testPurpose();
		Zookie zookie = new Zookie();
		System.out.println(zookie);
	}

}
