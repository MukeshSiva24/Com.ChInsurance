package CHStepDefinition;

import java.util.List;
import java.util.Vector;

import CHCommonMethods.BaseClass;
import CHPojo.Locators;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
	BaseClass base=BaseClass.getInstance();
	Locators locate=new Locators();

@Given("Launch The CHInsurance Application {string}")
public void launch_the_ch_insurance_application(String url) {
  
	base.launchApplication(url);
	
}

@When("User click the service Module")
public void user_click_the_service_module() {
	try {
		Thread.sleep(5000);
		base.explicityWaitsClick(locate.getMouseActionService(), 20);
	}
	catch (Exception e) {
		System.out.println(e);
	}
}

@Then("Validate dropdown data")
public void validate_dropdown_data() {
   
	try {
			if(base.display(locate.getClaimsContacts())) {
				System.out.println("Claims Contacts is Visible");

			}
		    if(base.display(locate.getCommercialInsurance())) {
				System.out.println("Commercial Insurance is Visible");

		    }
		    if(base.display(locate.getPersonalInsu())) {
				System.out.println("Personal Insurance is Visible");

		    }
		    if(base.display(locate.getRiskManagement())) {
				System.out.println("Risk Management is Visible");

		    }
		    if(base.display(locate.getDataBreach())) {
				System.out.println("Data Breach is Visible");

		    }
		    else{
				System.out.println("Data is not Visible");

		    }
		}
		catch (Exception e) {
			System.out.println(e);
		}
   
    
}

@When("user Click The personal Insurance")
public void user_click_the_personal_insurance() {
	try {
		base.clicks(locate.getPersonalInsu());
		}
		catch (Exception e) {
			System.out.println(e);
		}
    }

@Then("Validate The Personal Insurance Page is Navigated")
public void validate_the_personal_insurance_page_is_navigated() {
	try {
		base.display(locate.getPersonalInsurancePage());
		}
		catch (Exception e) {
			System.out.println(e);
		}
}

@When("user Click Policy Review")
public void user_click_policy_review() {
	try {
		Thread.sleep(3000);
		base.javaScriptClick(locate.getReviewButton());
//		base.explicityWaitsClick(locate.getReviewButton(), 10);
	}
		catch (Exception e) {
			System.out.println(e);
		}
}

@Then("Validate Lets Talk Popup is Visible")
public void validate_lets_talk_popup_is_visible() {
	try {
//		Thread.sleep(3000);		
	   if(base.display(locate.getLetsTalk())) {
			System.out.println("Let's Talk is Visible");
	   }
	   else {
			System.out.println("Let's Talk Not Visible");

	   }
		}
		catch (Exception e) {
			System.out.println(e);
		}
}

@Then("Validate The Address is Visible in popup")
public void validate_the_address_is_visible_in_popup() {
	
	try {
	    if(base.display(locate.getAddress())) {
			System.out.println("Address is Visible");

	    }
	    else {
			System.out.println("Address is not Visible");

	    }
		}
		catch (Exception e) {
			System.out.println(e);
		}
}

@When("User Click the Map and Satellite")
public void user_click_the_map_and_satellite() {
	
	try {
//		base.frames(locate.getMapFrame());
		base.frames(locate.getMapFrame1());
		base.explicityWaitsClick(locate.getSatellite(), 30);	
		 base.explicityWaitsClick(locate.getMap(), 10);
		    }
		catch (Exception e) {
			System.out.println(e);
		}
   
}

@When("User Click Full Screen, Zoom in and Zoom Out in Map")
public void user_click_full_screen_zoom_in_and_zoom_out_in_map() {
	
	try {
		 base.explicityWaitsClick(locate.getFullScreen(), 30);
		 Thread.sleep(3000);
		    base.explicityWaitsClick(locate.getZoomIn(), 20);
			 Thread.sleep(3000);

		    base.explicityWaitsClick(locate.getZoomOut(), 20);
			 Thread.sleep(3000);

		    base.explicityWaitsClick(locate.getFullScreen(), 20);
		    
			 Thread.sleep(3000);
			 base.switchFramesDefault();
		}
		catch (Exception e) {
			System.out.println(e);
		}
   
}

@When("User Enter the Name, Email, Subject and Message {string} {string} {string} {string}")
public void user_enter_the_name_email_subject_and_message(String Name, String Email, String Subject, String Message) {
	
	try {
		 base.sendValue(locate.getName(), Name);
		   base.sendValue(locate.getEmail(), Email);
		   base.sendValue(locate.getSubject(), Subject);
		   base.sendValue(locate.getMessage(), Message);		}
		catch (Exception e) {
			System.out.println(e);
		}
  

   
}

@When("User Click The Submit")
public void user_click_the_submit() {
	
	try {
		   base.clicks(locate.getSubmit());
//		   base.explicityWaitsClick(locate.getRobote(), 20);
		   
		}
		catch (Exception e) {
			System.out.println(e);
		}
}

@Then("Validate The Message is Visible after Submit {string}")
public void validate_the_message_is_visible_after_submit(String Message) {
	
	
	
	try {
		Thread.sleep(5000);
		  if(base.display(locate.getRobotConfirm())) {
			   System.out.println(Message);
		   }
		   else {
			   System.out.println("Not Visible");
		   }		}
		catch (Exception e) {
			System.out.println(e);
		}
 
}





@When("Click HI-V Blog Module")
public void click_hi_v_blog_module() {
	try {
		Thread.sleep(3000);
	base.movetoElements(locate.getHi5Blog());
	}
	catch(Exception e) {
		System.out.println(e);
	}
}

@When("Click Personal Insurance")
public void click_Personal_Insurance() {
	try {
	base.explicityWaitsClick(locate.getPostPersonalInsurance(), 20);
	}
	catch(Exception e) {
		System.out.println(e);
	}
	
   }

@Then("Validate Latest Post is Visible in Top")
public void validate_latest_post_is_visible_in_top() {
	try {
		if(base.display(locate.getTopPersonalInsuPost())) {
			System.out.println("Personal Insurance is Visible");
		}
		else {
			
			System.out.println("Personal Insurance is Not Visible");

			
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	
    
}

@When("Click The First Post in Top")
public void click_the_first_post_in_top() {
	try {
		base.explicityWaitsClick(locate.getTopPersonalInsuPost(), 20);
		}
		catch(Exception e) {
			System.out.println(e);
		}
    
}

@Then("Validate The Latest Post is Navigated")
public void validate_the_latest_post_is_navigated() {
	try {
		base.explicityWaitsClick(locate.getPersonalInsurNavigatePost(), 20);
		}
		catch(Exception e) {
			System.out.println(e);
		}
    
}

@When("Click Like button")
public void click_like_button() {
	try {
//		base.javaScriptScrollUp(locate.getLikeSimple());
		Thread.sleep(3000);
		base.explicityWaitsClick(locate.getLikeSimple(), 20);
		}
		catch(Exception e) {
			System.out.println(e);
		}
}
@Then("Validate Number of Like is Visible")
public void validate_number_of_like_is_visible() {
    try {
    	if(base.display(locate.getLikeNo())) {
    		System.out.println("Like Number is ="+base.text(locate.getLikeNo()));
    		
    	}
    	else {
    		System.out.println("No Like Number is Visible");
    	}
    	
		base.explicityWaitsClick(locate.getLikeSimple(), 20);

    }
    catch(Exception e) {
    	System.out.println(e);
    }
}





@When("Click The Contact Moduke")
public void click_the_contact_moduke() {
	try {
		Thread.sleep(3000);
		base.explicityWaitsClick(locate.getContactModule(), 30);
	}
	catch (Exception e){
		System.out.println(e);
	}
   
}

@Then("Validate Dropdown Data in Contact Module")
public void validate_dropdown_data_in_contact_module() {
try {
	Thread.sleep(3000);
	if(base.display(locate.getLocation())) {
		System.out.println("Location is Visible");
	}
	if(base.display(locate.getChInsuranceContact())) {
		System.out.println("ChInsurance Syracus is Visible");

	}
	
	else {
		System.out.println("Contact dropdown data is Not Visible");
	}
	}
	catch (Exception e){
		System.out.println(e);
	}
    
}

@When("Click CGinsurance Syracus,Ny")
public void click_c_ginsurance_syracus_ny() {
try {
	Thread.sleep(3000);
		base.javaScriptClick(locate.getChInsuranceContact());
	}
	catch (Exception e){
		System.out.println(e);
	}
   
}

@Then("Validate Company Information Page is Navigated")
public void validate_company_information_page_is_navigated() {
try {
		if(base.display(locate.getChInsuranceContactPage())) {
			System.out.println("ChInsuracePage is Navigated");
		}
		else {
			System.out.println("ChInsuracePage is not Navigated");

		}
	}
	catch (Exception e){
		System.out.println(e);
	}
    
}

@When("Click Map and Satellite")
public void click_map_and_satellite() {
try {
		base.frames(locate.getMapFrame1());
		base.explicityWaitsClick(locate.getSatellite(), 30);
		base.explicityWaitsClick(locate.getMap(), 20);

	}
	catch (Exception e){
		System.out.println(e);
	}
   
}

@When("Click Zoom in and Zoom Out")
public void click_zoom_in_and_zoom_out() {
	
try {
		base.explicityWaitsClick(locate.getZoomIn(), 20);
		base.explicityWaitsClick(locate.getZoomOut(), 20);
	}
	catch (Exception e){
		System.out.println(e);
	}

}

@When("Click Road View")
public void click_road_view() {
	
try {
		base.explicityWaitsClick(locate.getScreetView(), 20);
		base.explicityWaitsClick(locate.getScreetView(), 20);

	}
	catch (Exception e){
		System.out.println(e);
	}
    
}

@When("Click Full Screen Mode and Click Exit Full Screen")
public void click_full_screen_mode_and_click_exit_full_screen() {
	
try {
		base.explicityWaitsClick(locate.getFullScreenContact(), 20);
		Thread.sleep(5000);
		base.explicityWaitsClick(locate.getFullScreenContact(), 10);
		Thread.sleep(3000);

		base.explicityWaitsClick(locate.getBackButtonContact(), 20);
	}
	catch (Exception e){
		System.out.println(e);
	}
    
}






@When("Click Client Access Module")
public void click_client_access_module() {
    try {
    	base.explicityWaitsClick(locate.getClientAccessModule(), 30);
    }
    catch(Exception e){
    	System.out.println(e);
    }
}
@When("Click Csr24 Login Portal")
public void click_csr24_login_portal() {
	  try {
	    	base.explicityWaitsClick(locate.getCSR24Login(), 30);
	    }
	    catch(Exception e){
	    	System.out.println(e);
	    }
}
@Then("Validate Login Page Navigate to new Tab")
public void validate_login_page_navigate_to_new_tab() {
	  try {
	    	base.multiWindowHandles(1);
	    	if(base.display(locate.getLoginPageNavigated())) {
	    	System.out.println("Login Page is Navigated in new Tab");
	    }
	  else {
	    	System.out.println("Login Page is not Navigated in new Tab");

	  }
}
	    catch(Exception e){
	    	System.out.println(e);
	    }
}
@When("Enter The UserName {string}")
public void enter_the_user_name(String userName) {
	  try {
		  
	    	base.explicityWaitsSend(userName, locate.getUserNameLogin(), 30);
	    }
	    catch(Exception e){
	    	System.out.println(e);
	    }
}
@When("Enter The Password {string}")
public void enter_the_password(String password) {
	  try {
	    	base.explicityWaitsSend(password, locate.getPasswordLogin(), 30);
	    }
	    catch(Exception e){
	    	System.out.println(e);
	    }
}
@When("Click The Login button")
public void click_the_login_button() {
	  try {
	    	base.explicityWaitsClick(locate.getLoginButton(), 10);
	    }
	    catch(Exception e){
	    	System.out.println(e);
	    }
}
@Then("Validate Invalide Message is Visible after login")
public void validate_invalide_message_is_visible_after_login() {
	 try {
	    	if(base.display(locate.getInValideMessage())) {
	    		System.out.println("Invalid Message is Visible ="+ base.text(locate.getInValideMessage()));
	    	}
	    	else {
	    		System.out.println("Invalide Message is Not Visible");
	    	}
	    }
	    catch(Exception e){
	    	System.out.println(e);
	    }
}






@When("Click Create New Account")
public void click_create_new_account() {
	  try {
		  base.explicityWaitsClick(locate.getCreateNewAccount(), 30);
	    	
	    }
	    catch(Exception e){
	    	System.out.println(e);
	    }
}
@When("Enter The EmailID {string}")
public void enter_the_email_id(String Email) {
	 try {
	    	base.explicityWaitsSend(Email, locate.getEmailIdCreate(), 30);
	    }
	    catch(Exception e){
	    	System.out.println(e);
	    }
}
@When("Enter The PhoneNo {string}")
public void enter_the_phone_no(String PhoneNo) {
	 try {
	    	base.explicityWaitsSend(PhoneNo, locate.getPhoneNoCreate(), 10);
	    }
	    catch(Exception e){
	    	System.out.println(e);
	    }

}
@When("Enter The Policy Number {string}")
public void enter_the_policy_number(String PolicyNo) {
	 try {
		 
		 base.explicityWaitsSend(PolicyNo, locate.getPolicyNoCreate(), 30);
	    	
	    }
	    catch(Exception e){
	    	System.out.println(e);
	    }

}
@When("Click Create Account")
public void click_create_account() {
	 try {
	    	base.explicityWaitsClick(locate.getCreateAccountButton(), 30);
	    }
	    catch(Exception e){
	    	System.out.println(e);
	    }

}
@Then("Validate Invalide Message is Visible after CreateAccount")
public void validate_invalide_message_is_visible_after_create_account() {
	 try {
	    	if(base.display(locate.getInValideMessage())) {
	    		System.out.println(base.text(locate.getInValideMessage()));
	    	}
	    	else {
	    		System.out.println("Invalid Message is Not Visible");
	    	}
	    }
	    catch(Exception e){
	    	System.out.println(e);
	    }
}






}
