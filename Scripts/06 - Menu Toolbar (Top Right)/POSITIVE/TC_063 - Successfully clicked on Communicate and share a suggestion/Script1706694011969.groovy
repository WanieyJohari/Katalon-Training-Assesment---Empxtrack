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

WebUI.callTestCase(findTestCase('01 - Login/POSITIVE/TC_001 - Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('06 - Menu Toolbar (Top Right)/TC_58-click_Communicate_chat_Colleague/Page_Home page/img'))

WebUI.waitForElementVisible(findTestObject('06 - Menu Toolbar (Top Right)/TC_63-share_Suggestion/Page_Home page/a_Open_Suggestion'), 
    0)

WebUI.click(findTestObject('06 - Menu Toolbar (Top Right)/TC_63-share_Suggestion/Page_Home page/a_Open_Suggestion'))

WebUI.setText(findTestObject('06 - Menu Toolbar (Top Right)/TC_63-share_Suggestion/Page_Home page/input_specify_Area'), 
    subject)

WebUI.setText(findTestObject('06 - Menu Toolbar (Top Right)/TC_63-share_Suggestion/Page_Home page/input_Suggestion'), yourDescription)

WebUI.click(findTestObject('06 - Menu Toolbar (Top Right)/TC_63-share_Suggestion/Page_Home page/a_Submit suggestion'))

WebUI.verifyElementPresent(findTestObject('06 - Menu Toolbar (Top Right)/TC_63-share_Suggestion/Page_Home page/div_Thanks for submitting your valuable suggestion'), 
    0)

WebUI.click(findTestObject('06 - Menu Toolbar (Top Right)/TC_63-share_Suggestion/Page_Home page/button_Ok'))

