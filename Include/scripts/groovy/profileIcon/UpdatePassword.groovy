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



class UpdatePassword {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User navigate to login page")
	def user_navigate_to_login_page() {

		WebUI.callTestCase(findTestCase('07 - User Profile Icon (Top Right)/POSITIVE/TC_066 - Successfully clicked on user profile icon to open menu'),
				[:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User click on update password in user profile icon menu")
	def user_click_on_update_password_in_user_profile_icon_menu() {

		WebUI.click(findTestObject('07 - User Profile Icon (Top Right)/Page_Home page/a_Update password'))

		WebUI.waitForElementVisible(findTestObject('07 - User Profile Icon (Top Right)/Page_Home page/input_Old password_oldPassword'),
				0)
	}

	@And("User managed to change current password to a new one; (.*), (.*), (.*)")
	def user_change_current_password_to_new_one(String password, String newPassword, String confirmPassword) {

		WebUI.setEncryptedText(findTestObject('07 - User Profile Icon (Top Right)/Page_Home page/input_Old password_oldPassword'),
				password)

		WebUI.setEncryptedText(findTestObject('07 - User Profile Icon (Top Right)/Page_Home page/input_New password_password'),
				newPassword)

		WebUI.setEncryptedText(findTestObject('07 - User Profile Icon (Top Right)/Page_Home page/input_Confirm password_cpassword'),
				confirmPassword)

		WebUI.click(findTestObject('07 - User Profile Icon (Top Right)/Page_Home page/a_Update'))
	}

	@Then("User verify that the password has been successfully updated")
	def user_verify_password_successfully_update() {

		WebUI.verifyElementPresent(findTestObject('07 - User Profile Icon (Top Right)/Page_Home page/div_Password updated successfully'),
				0)

		WebUI.click(findTestObject('07 - User Profile Icon (Top Right)/Page_Home page/button_Ok'))
	}
}