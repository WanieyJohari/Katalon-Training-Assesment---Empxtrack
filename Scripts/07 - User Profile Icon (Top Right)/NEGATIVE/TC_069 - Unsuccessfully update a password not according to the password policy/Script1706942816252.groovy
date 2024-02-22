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

WebUI.click(findTestObject('07 - User Profile Icon (Top Right)/Page_Home page/a_Update password'))

WebUI.waitForElementVisible(findTestObject('07 - User Profile Icon (Top Right)/Page_Home page (1)/input_Old password_oldPassword'), 
    0)

WebUI.setEncryptedText(findTestObject('07 - User Profile Icon (Top Right)/Page_Home page (1)/input_Old password_oldPassword'), 
    '4JQqRJl2zAuXmLlBSHYn+w==')

WebUI.setEncryptedText(findTestObject('07 - User Profile Icon (Top Right)/Page_Home page (1)/input_New password_password'), 
    'wOHuMRIp7AA=')

WebUI.setEncryptedText(findTestObject('07 - User Profile Icon (Top Right)/Page_Home page (1)/input_Confirm password_cpassword'), 
    'wOHuMRIp7AA=')

WebUI.click(findTestObject('07 - User Profile Icon (Top Right)/Page_Home page (1)/a_Update'))

WebUI.verifyElementPresent(findTestObject('07 - User Profile Icon (Top Right)/Page_Home page (1)/div_Invalid password. Policy Mix of numeric, lower case and upper case characters'), 
    0)

WebUI.click(findTestObject('07 - User Profile Icon (Top Right)/Page_Home page (1)/button_Ok'))

