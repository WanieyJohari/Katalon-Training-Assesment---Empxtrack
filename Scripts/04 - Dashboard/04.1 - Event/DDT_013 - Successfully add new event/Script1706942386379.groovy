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

WebUI.waitForElementVisible(findTestObject('04 - Dashboard/04.1 - Event/TC_013-success_Add_Event/Page_Home page/a_Add New Event'), 
    0)

WebUI.click(findTestObject('04 - Dashboard/04.1 - Event/TC_013-success_Add_Event/Page_Home page/a_Add New Event'))

WebUI.setText(findTestObject('04 - Dashboard/04.1 - Event/TC_013-success_Add_Event/Page_Home page/input_Subject_subject'), 
    subject)

WebUI.setText(findTestObject('04 - Dashboard/04.1 - Event/TC_013-success_Add_Event/Page_Home page/input_Start date_date_selectedStartDate'), 
    selectedStartDate)

WebUI.click(findTestObject('04 - Dashboard/04.1 - Event/TC_013-success_Add_Event/Page_Home page/input_Start time_startTime'))

WebUI.click(findTestObject('04 - Dashboard/04.1 - Event/TC_013-success_Add_Event/Page_Home page/div_1100'))

WebUI.selectOptionByLabel(findTestObject('04 - Dashboard/04.1 - Event/TC_013-success_Add_Event/Page_Home page/select_timeZone'), 
    timeZone, false)

WebUI.click(findTestObject('04 - Dashboard/04.1 - Event/TC_013-success_Add_Event/Page_Home page/a_Save'))

WebUI.verifyElementPresent(findTestObject('04 - Dashboard/04.1 - Event/TC_013-success_Add_Event/Page_Home page/div_Event invitation has been added successfully'), 
    0)

WebUI.click(findTestObject('04 - Dashboard/04.1 - Event/TC_013-success_Add_Event/Page_Home page/button_Ok'))

