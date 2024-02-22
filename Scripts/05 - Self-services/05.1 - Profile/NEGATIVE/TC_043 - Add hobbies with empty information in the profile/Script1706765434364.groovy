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

WebUI.waitForElementVisible(findTestObject('05 -Self-services/TC_40-self-service_view_profile/Page_Home page/div_Self services'), 
    0)

WebUI.click(findTestObject('05 -Self-services/TC_40-self-service_view_profile/Page_Home page/div_Self services'))

WebUI.waitForElementVisible(findTestObject('05 -Self-services/TC_40-self-service_view_profile/Page_Home page/verify_My profile'), 
    0)

WebUI.verifyElementPresent(findTestObject('05 -Self-services/TC_40-self-service_view_profile/Page_Home page/verify_My profile'), 
    0)

WebUI.scrollToElement(findTestObject('05 -Self-services/TC_40-self-service_view_profile/Page_Home page/Page_Home page/a_View or Edit Profile'), 
    0)

WebUI.click(findTestObject('05 -Self-services/TC_40-self-service_view_profile/Page_Home page/Page_Home page/a_View or Edit Profile'))

WebUI.scrollToElement(findTestObject('05 -Self-services/TC_42-add_Hobbies/Page_Home page/a_Hobbies'), 0)

WebUI.click(findTestObject('05 -Self-services/TC_42-add_Hobbies/Page_Home page/a_Hobbies'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('05 -Self-services/TC_42-add_Hobbies/Page_Home page/a_Add_Hobbies'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('05 -Self-services/TC_42-add_Hobbies/Page_Home page/input_Hobbies'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('05 -Self-services/TC_42-add_Hobbies/Page_Home page/btn_Save_Hobbies'))

WebUI.verifyElementPresent(findTestObject('05 -Self-services/TC_43-add_Hobbies_Empty_Information/Page_Home page/div_Please enter valid text'), 
    0)

WebUI.click(findTestObject('05 -Self-services/TC_43-add_Hobbies_Empty_Information/Page_Home page/button_OK'))

