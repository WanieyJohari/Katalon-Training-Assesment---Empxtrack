package profileIcon
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class UpdateBlankPassword {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User navigate to login page;(.*),(.*)")
	def user_navigate_to_login_page(String username, String password) {
		
		WebUI.openBrowser('')
		
		WebUI.navigateToUrl(GlobalVariable.urlAddress)
		
		WebUI.setText(findTestObject('Object Repository/07 - User Profile Icon (Top Right)/Page_Home page/Page_Home page/Page_Empxtrack logon/input_If checked, login details will not be_5dd927'),
			GlobalVariable.username)
		
		WebUI.setEncryptedText(findTestObject('Object Repository/07 - User Profile Icon (Top Right)/Page_Home page/Page_Home page/Page_Empxtrack logon/input_If checked, login details will not be_5c5f06'),
			password)
		
		WebUI.click(findTestObject('Object Repository/07 - User Profile Icon (Top Right)/Page_Home page/Page_Home page/Page_Empxtrack logon/input_If checked, login details will not be_b1d379'))
		
		WebUI.click(findTestObject('Object Repository/07 - User Profile Icon (Top Right)/Page_Home page/Page_Home page/Page_Empxtrack logon/input_submit'))
		
		WebUI.waitForElementVisible(findTestObject('07 - User Profile Icon (Top Right)/Page_Home page/Page_Home page/Page_Home page/span_'),
			0)
		
		WebUI.click(findTestObject('Object Repository/07 - User Profile Icon (Top Right)/Page_Home page/Page_Home page/Page_Home page/div_e'))
		
		WebUI.waitForElementVisible(findTestObject('Object Repository/07 - User Profile Icon (Top Right)/Page_Home page/Page_Home page/Page_Home page/div_e'),
			0)
	}

	@When("User click on update password in user profile icon")
	def user_click_on_update_password_in_user_profile_icon() {
		
		WebUI.click(findTestObject('Object Repository/07 - User Profile Icon (Top Right)/Page_Home page/Page_Home page/Page_Home page/a_Update password'))
		
		WebUI.waitForElementVisible(findTestObject('Object Repository/07 - User Profile Icon (Top Right)/Page_Home page/Page_Home page/Page_Home page/a_Update'),
			0)
	}

	@And ("User left blank for password and click update")
	def user_left_blank_for_password_click_update() {
	
		WebUI.click(findTestObject('Object Repository/07 - User Profile Icon (Top Right)/Page_Home page/Page_Home page/Page_Home page/a_Update'))
	}
	@Then("User verify that there is an error message pop up")
	def user_verify_error_message_popup() {
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/07 - User Profile Icon (Top Right)/Page_Home page/Page_Home page/Page_Home page/div_Please specify the old password'),
			0)
		
		WebUI.click(findTestObject('Object Repository/07 - User Profile Icon (Top Right)/Page_Home page/Page_Home page/Page_Home page/button_OK'))
	}
}