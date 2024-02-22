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

WebUI.waitForElementVisible(findTestObject('04.3 - Leave/TC_026_success_Apply_Casual Leave (1)/Page_Home page (1)/i_Casual Leave_fas fa-ellipsis-h'), 
    0)

WebUI.click(findTestObject('Object Repository/04.3 - Leave/TC_026_success_Apply_Casual Leave (1)/Page_Home page (1)/i_Casual Leave_fas fa-ellipsis-h'))

WebUI.click(findTestObject('Object Repository/04.3 - Leave/TC_026_success_Apply_Casual Leave (1)/Page_Home page (1)/a_Apply'))

WebUI.waitForElementVisible(findTestObject('04 - Dashboard/04.3 - Leave/TC_026_success_Apply_Casual Leave/Page_Home page/input_Duration_Start Date'), 
    0)

WebUI.setText(findTestObject('04 - Dashboard/04.3 - Leave/TC_026_success_Apply_Casual Leave/Page_Home page/input_Duration_Start Date'), GlobalVariable.durationStartDate)

WebUI.sendKeys(findTestObject('04 - Dashboard/04.3 - Leave/TC_026_success_Apply_Casual Leave/Page_Home page/input_Duration_End Date'), Keys.chord(
        Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('04 - Dashboard/04.3 - Leave/TC_026_success_Apply_Casual Leave/Page_Home page/input_Duration_End Date'), Keys.chord(
        Keys.BACK_SPACE))

WebUI.setText(findTestObject('04 - Dashboard/04.3 - Leave/TC_026_success_Apply_Casual Leave/Page_Home page/input_Duration_End Date'), GlobalVariable.durationEndDate)

WebUI.click(findTestObject('04.3 - Leave/TC_029-click_First Half_Second Half_same_time/Page_Home page/input_Starts from second-half of 3101_dataObject.firstHalf'))

WebUI.click(findTestObject('04.3 - Leave/TC_029-click_First Half_Second Half_same_time/Page_Home page/input_End on first-half of 3101_dataObject.secondHalf'))

WebUI.waitForElementVisible(findTestObject('04.3 - Leave/TC_029-click_First Half_Second Half_same_time/Page_Home page/verify_You cannot select both partial days option on the same day of leave'), 
    0)

WebUI.verifyElementPresent(findTestObject('04.3 - Leave/TC_029-click_First Half_Second Half_same_time/Page_Home page/verify_You cannot select both partial days option on the same day of leave'), 
    0)

WebUI.click(findTestObject('04.3 - Leave/TC_029-click_First Half_Second Half_same_time/Page_Home page/button_OK'))

