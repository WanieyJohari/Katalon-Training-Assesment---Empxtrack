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

WebUI.setText(findTestObject('01 - Login/Page_Empxtrack logon/input_If checked, login details will not be saved as a cookie_empNo'), 
    GlobalVariable.username)

WebUI.setText(findTestObject('01 - Login/Page_Empxtrack logon/input_If checked, login details will not be saved as a cookie_password'), 
    GlobalVariable.password)

WebUI.click(findTestObject('01 - Login/Page_Empxtrack logon/input_If checked, login details will not be saved as a cookie_isPublicComputer'))

WebUI.click(findTestObject('01 - Login/Page_Empxtrack logon/input_submit'))

not_run: WebUI.waitForElementVisible(findTestObject('01 - Login/Page_Home page/span_'), 0)

not_run: WebUI.click(findTestObject('01 - Login/Page_Home page/span_'))

