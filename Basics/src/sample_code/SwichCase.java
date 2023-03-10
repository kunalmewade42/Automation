package sample_code;

public class SwichCase {

	public static void main(String[] args) {
		
		
String browser = "FireFOX";
   //browser.toLowerCase();

		
		switch (browser.toLowerCase()) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch ff");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		case "opera":
			System.out.println("launch opera");
			break;

		default:
			System.out.println("please pass the correct browser name...");
			break;
		}
		
	}

}
