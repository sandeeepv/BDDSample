package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ModuleOneStepDef {
		//@Before ("@SmokeTest")
		//public void setup() {
	//		System.out.println("Setup DB ");
			
	//	}
	
	
	@Before(order=1) 
		public void setupDB() {
		System.out.println("Setup DB");
	}
		
	@Before(order=3)
	public void readPropertyFile() {
		System.out.println("Read prop file");
		
	}
	
	@Before(order=2) 
	public void initBrowser() {
	System.out.println("Setup Browser");
			
		}
		
	
		@Before ("@RegressionTest")
		public void setup1() {
			System.out.println("Setup DB 2");
			
		}
		@After
		public void teardown() {
			System.out.println("After hook");
		}

		@Given("User is loggedIn")
		public void user_is_logged_in() {
			System.out.println("user logged in");
		
		}

		@When("User enters contact details")
		public void user_enters_contact_details() {
			System.out.println("User enters contact details");
		   
		}



			@When("User view contact details")
			public void user_view_contact_details() {
			System.out.println("User view contact details");
			   
			}

			@When("User update contact details")
			public void user_update_contact_details() {
			System.out.println("User update contact details");
				}



				@When("User enters Deal details")
				public void user_enters_deal_details() {
				System.out.println("User enters deal details");
				   
				}

				@When("User view Deal details")
				public void user_view_deal_details() {
				System.out.println("User view Deal  details");				   
					}

					@When("User update Deal details")
					public void user_update_deal_details() {
						System.out.println("User update  Deal details");						    
						}
						
						
					@Given("User logged out")
					public void user_logged_out() {
							    
							}


}
