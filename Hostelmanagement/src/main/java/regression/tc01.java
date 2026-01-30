package regression;

import Allpages7.Loginpage;

public class tc01 extends Loginpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BrowserInitilization(Loginpage.Browser , Loginpage.URL);
		//Enter_username("test@gmail.com");
		//Enter_pass("hgg45");
		click_login();
	}

}
