import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('07 - User Profile Icon (Top Right)/POSITIVE/TC_066 - Successfully clicked on user profile icon to open menu'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('07 - User Profile Icon (Top Right)/Page_Home page/a_Update password'))

WebUI.waitForElementVisible(findTestObject('07 - User Profile Icon (Top Right)/Page_Home page/input_Old password_oldPassword'), 
    0)

WebUI.setEncryptedText(findTestObject('07 - User Profile Icon (Top Right)/Page_Home page/input_Old password_oldPassword'), 
    password)

WebUI.setEncryptedText(findTestObject('07 - User Profile Icon (Top Right)/Page_Home page/input_New password_password'), 
    newPassword)

WebUI.setEncryptedText(findTestObject('07 - User Profile Icon (Top Right)/Page_Home page/input_Confirm password_cpassword'), 
    confirmPassword)

WebUI.click(findTestObject('07 - User Profile Icon (Top Right)/Page_Home page/a_Update'))

WebUI.verifyElementPresent(findTestObject('07 - User Profile Icon (Top Right)/Page_Home page/div_Password updated successfully'), 
    0)

WebUI.click(findTestObject('07 - User Profile Icon (Top Right)/Page_Home page/button_Ok'))

