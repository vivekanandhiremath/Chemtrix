package com.chemtrix.qa.stepdefinitions.prospectEntry;

import com.chemtrix.qa.factory.WebdriverManager;
import com.chemtrix.qa.utils.ConfigReader;
import org.openqa.selenium.WebDriver;

import com.chemtrix.qa.pageObj.HomePage;
import com.chemtrix.qa.pageObj.LoginPage;
import com.chemtrix.qa.pageObj.ProspectEntryPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.Properties;

public class ProspcetEntry {
	WebDriver driver;

	private LoginPage loginPage;
	private HomePage homePage;
	private ProspectEntryPage prospectEntry;

	@Given("^User logs in wth valid email (.+) and password (.+)$")
	public void user_logs_in_wth_valid_email_and_password(String username, String passwod) throws Throwable {
		Properties prop = new ConfigReader().intializeProperties();
		driver = WebdriverManager.getInstance(prop.getProperty("browser")).getDriver();
		loginPage = new LoginPage(driver);

		loginPage.loginWithValidCredential(username, passwod);
		homePage = loginPage.clickOnLoginButton();
	}

	@Then("^User Clicks on Prospect Entry Icon$")
	public void user_clicks_on_prospect_entry_icon() throws Throwable {
		homePage = new HomePage(driver);
		prospectEntry = homePage.clickOnProspectEntryIcon();
	}

	@And("^User Clicks on Create Collection Entry button$")
	public void user_clicks_on_create_collection_entry_button() throws Throwable {
		prospectEntry.ClickCreatProspectEntry();
	}

	@And("^User Enters company Name as (.*)$")
	public void user_enters_company_name_as(String companyname) throws Throwable {
		prospectEntry.Enter_Company_Name(companyname);
	}

	@And("^User Enters contact person Name as (.*)$")
	public void user_enters_contact_person_name_as(String contactpersonname) throws Throwable {
		prospectEntry.Enter_Contact_Person_Name(contactpersonname);
	}

	@And("^User Enters mobile number as (.*)$")
	public void user_enters_mobile_number_as(String mobilenumber) throws Throwable {
		prospectEntry.Enter_Mobile_Number(mobilenumber);
	}

	@And("^User Enters address1 as (.*)$")
	public void userEntersAddressAs(String address1) {
		prospectEntry.Enter_Address1(address1);
	}

	@And("^User Enters address2 as (.*)$")
	public void user_enters_address2_as(String address2) throws Throwable {
		prospectEntry.enterAddress2(address2);
	}

	@And("^User Enters address3 as (.*)$")
	public void user_enters_address3_as(String address3) throws Throwable {
		prospectEntry.enterAddress3(address3);
	}

	@And("^User Enters city as (.*)$")
	public void user_enters_City_as(String city) throws Throwable {
		prospectEntry.enterCity(city);
	}

	@And("^User selects industry as (.*)$")
	public void user_selects_industry_as(String industry) throws Throwable {
		prospectEntry.Select_Industry_DropDown(industry);
	}

	@And("^User enters email address as (.*)$")
	public void user_enters_email_address_as(String emailaddress) throws Throwable {
		prospectEntry.Enter_Email_Address(emailaddress);
	}

	@And("^User enters remarks as (.*)$")
	public void user_enters_remarks_as(String remarks) throws Throwable {
		prospectEntry.Enter_Remarks(remarks);
	}

	@And("^User Uploads photo document as (.*)$")
	public void user_uploads_photo_document_as(String photo) throws Throwable {
		prospectEntry.Enter_Photo_Document_Attachment(photo);
	}

	@And("^User enters monthly potential quantity as (.*)$")
	public void user_enters_monthly_potential_quantity_as(String monthlypotentialquantity) throws Throwable {
		prospectEntry.Enter_Monthly_Potential_Quantity(monthlypotentialquantity);
	}

	@And("^User enters overall potential quantity as (.*)$")
	public void user_enters_overall_potential_quantity_as(String overallpotentialquantity) throws Throwable {
		prospectEntry.Enter_Overall_Potential_Quantity(overallpotentialquantity);
	}

	@And("^User selects uom as (.*)$")
	public void user_enters_uom_as(String uom) throws Throwable {
		prospectEntry.SelectUom(uom);
	}

	@And("^User enters competitor name as (.*)$")
	public void user_enters_competitor_name_as(String competitorname) throws Throwable {
		prospectEntry.Enter_Competitor_Name(competitorname);
	}

	@And("^User enters gst number as (.*)$")
	public void user_enters_gst_number_as(String gstnumber) throws Throwable {
		prospectEntry.Enter_GST_number(gstnumber);
	}

	@And("^User enters pan number as (.*)$")
	public void user_enters_pan_number_as(String pannumber) throws Throwable {
		prospectEntry.Enter_PAN_number(pannumber);
	}

	@And("^User selects state as (.*)$")
	public void user_selects_state_as(String state) throws Throwable {
		prospectEntry.Select_State_DropDown(state);
	}

	@Then("^User Clicks on Create Button$")
	public void user_clicks_on_create_button() throws Throwable {
		prospectEntry.Click_Create();

	}

	@Then("^User Clicks on PopUp$")
	public void user_clicks_on_PopUp() throws Throwable {

		prospectEntry.Click_PropsPopup();

	}

	@Then("^user click EditIcon$")
	public void user_click_EditIcon() {
		prospectEntry.Click_EditIcon();
	}

	@And("^user click Update$")
	public void user_click_update() {
		prospectEntry.Click_Update();
	}

}
