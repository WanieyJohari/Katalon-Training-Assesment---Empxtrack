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

WebUI.waitForElementVisible(findTestObject('04.3 - Leave/TC_031-applied_Sick_Leave/Page_Home page/select_Sick Leave_button'), 0)

WebUI.click(findTestObject('04.3 - Leave/TC_031-applied_Sick_Leave/Page_Home page/select_Sick Leave_button'))

WebUI.click(findTestObject('04.3 - Leave/TC_031-applied_Sick_Leave/Page_Home page/a_Apply01'))

WebUI.waitForElementVisible(findTestObject('04.3 - Leave/TC_031-applied_Sick_Leave/Page_Home page/input_Duration_Start Date'), 0)

WebUI.setText(findTestObject('04.3 - Leave/TC_031-applied_Sick_Leave/Page_Home page/input_Duration_Start Date'), GlobalVariable.durationStartDate)

WebUI.waitForElementVisible(findTestObject('04.3 - Leave/TC_031-applied_Sick_Leave/Page_Home page/input_Reason_Leave'), 0)

WebUI.setText(findTestObject('04.3 - Leave/TC_031-applied_Sick_Leave/Page_Home page/input_Reason_Leave'), reasonSickLeave)

WebUI.click(findTestObject('04.3 - Leave/TC_031-applied_Sick_Leave/Page_Home page/a_Apply02'))

WebUI.verifyElementPresent(findTestObject('04.3 - Leave/TC_031-applied_Sick_Leave/Page_Home page/verify_You can not create leave request since you have reached the allowable limit of leave requests for this month'), 
    0)

WebUI.click(findTestObject('04.3 - Leave/TC_031-applied_Sick_Leave/Page_Home page/button_OK'))

