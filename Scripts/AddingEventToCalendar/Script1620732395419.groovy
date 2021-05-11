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

WebUI.navigateToUrl('https://sucourse.sabanciuniv.edu/plus/')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/AddingEventToCalendar/Page_SUCourse/a_Login'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/AddingEventToCalendar/Page_SUCourse Authentication choice/a_SUNet users (Sabanc University members)'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/AddingEventToCalendar/Page_Login - CAS  Central Authentication Service/input_U_username'), 
    'mohamedkassem')

WebUI.delay(1)

WebUI.setEncryptedText(findTestObject('Object Repository/AddingEventToCalendar/Page_Login - CAS  Central Authentication Service/input_P_password'), 
    'lsh4UT/KYs157Zjg3xgr3w==')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/AddingEventToCalendar/Page_Login - CAS  Central Authentication Service/input_Remember Me_submit'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/AddingEventToCalendar/Page_Dashboard/img_Log out_welcome_userpicture'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/AddingEventToCalendar/Page_Mohamed Emad Mohamed Kassem Public profile/a_May 2021'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/AddingEventToCalendar/Page_SUCourse Calendar Detailed month view _34c8e7/button_New event'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/AddingEventToCalendar/Page_SUCourse Calendar Detailed month view _34c8e7/div_1 1'), 
    '1 <p>1</p>')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/AddingEventToCalendar/Page_SUCourse Calendar Detailed month view _34c8e7/input_Event title_name'), 
    'Mohamed Kassem')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddingEventToCalendar/Page_SUCourse Calendar Detailed month view _34c8e7/select_JanuaryFebruaryMarchAprilMayJuneJuly_566629'), 
    '6', true)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/AddingEventToCalendar/Page_SUCourse Calendar Detailed month view _34c8e7/input_Event title_name'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/AddingEventToCalendar/Page_SUCourse Calendar Detailed month view _34c8e7/button_Save'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/AddingEventToCalendar/Page_SUCourse Calendar Detailed month view _34c8e7/span_June 2021'))

WebUI.delay(1)

WebUI.closeBrowser()

