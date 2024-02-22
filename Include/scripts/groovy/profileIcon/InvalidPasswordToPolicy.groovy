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



class InvalidPasswordToPolicy {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User enter (.*) and (.*) in the login page")
	def user_login_page(String username, String password) {

		WebUI.openBrowser('')

		WebUI.maximizeWindow()

		WebUI.navigateToUrl(GlobalVariable.urlAddress)

		WebUI.setText(findTestObject('Object Repository/07 - User Profile Icon (Top Right)/Page_Home page/Page_Home page/Page_Empxtrack logon/input_If checked, login details will not be_5dd927'),
				GlobalVariable.username)

		WebUI.setEncryptedText(findTestObject('Object Repository/07 - User Profile Icon (Top Right)/Page_Home page/Page_Home page/Page_Empxtrack logon/input_If checked, login details will not be_5c5f06'),
				password)

		WebUI.click(findTestObject('Object Repository/07 - User Profile Icon (Top Right)/Page_Home page/Page_Home page/Page_Empxtrack logon/input_If checked, login details will not be_b1d379'))

		WebUI.click(findTestObject('Object Repository/07 - User Profile Icon (Top Right)/Page_Home page/Page_Home page/Page_Empxtrack logon/input_submit'))
		
		WebUI.click(findTestObject('07 - User Profile Icon (Top Right)/Page_Home page/div_emp 05_profile'))
	}

	@When("User click on update password on profile menu")
	def user_click_update() {

		WebUI.click(findTestObject('07 - User Profile Icon (Top Right)/Page_Home page/a_Update password'))

		WebUI.waitForElementVisible(findTestObject('07 - User Profile Icon (Top Right)/Page_Home page (1)/input_Old password_oldPassword'),
				0)
	}

	@And("User enter invalid password to the policy")
	def user_enter_invalid_password_to_policy() {

		WebUI.setEncryptedText(findTestObject('07 - User Profile Icon (Top Right)/Page_Home page (1)/input_Old password_oldPassword'),
				'4JQqRJl2zAuXmLlBSHYn+w==')

		WebUI.setEncryptedText(findTestObject('07 - User Profile Icon (Top Right)/Page_Home page (1)/input_New password_password'),
				'wOHuMRIp7AA=')

		WebUI.setEncryptedText(findTestObject('07 - User Profile Icon (Top Right)/Page_Home page (1)/input_Confirm password_cpassword'),
				'wOHuMRIp7AA=')

		WebUI.click(findTestObject('07 - User Profile Icon (Top Right)/Page_Home page (1)/a_Update'))
	}

	@Then("User received error message")
	def user_received_error_message() {

		WebUI.verifyElementPresent(findTestObject('07 - User Profile Icon (Top Right)/Page_Home page (1)/div_Invalid password. Policy Mix of numeric, lower case and upper case characters'),
				0)

		WebUI.click(findTestObject('07 - User Profile Icon (Top Right)/Page_Home page (1)/button_Ok'))
	}
}