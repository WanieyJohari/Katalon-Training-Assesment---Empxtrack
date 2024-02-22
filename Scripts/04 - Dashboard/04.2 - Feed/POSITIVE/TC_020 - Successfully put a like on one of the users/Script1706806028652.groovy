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

WebUI.click(findTestObject('04 - Dashboard/05 - Feed/05-TC_017-success_Add_Comment/Page_Home page/a_See All'))

WebUI.waitForElementVisible(findTestObject('04 - Dashboard/05 - Feed/05-TC_020_put_Like_On_Users/Page_Home page/click_button_Like_Emp 10'), 2)

WebUI.click(findTestObject('04 - Dashboard/05 - Feed/05-TC_020_put_Like_On_Users/Page_Home page/click_button_Like_Emp 10'))

WebUI.verifyElementPresent(findTestObject('04 - Dashboard/05 - Feed/05-TC_020_put_Like_On_Users/Page_Home page/verify_Emp 05_Like_comment'), 0)

