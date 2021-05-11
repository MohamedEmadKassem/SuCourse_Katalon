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

WebUI.click(findTestObject('Object Repository/ExportCalendar(FromUpcomingEvents)/Page_SUCourse/a_Login'))

WebUI.click(findTestObject('Object Repository/ExportCalendar(FromUpcomingEvents)/Page_SUCourse Authentication choice/a_SUNet users (Sabanc University members)'))

WebUI.setText(findTestObject('Object Repository/ExportCalendar(FromUpcomingEvents)/Page_Login - CAS  Central Authentication Service/input_U_username'), 
    'mohamedkassem')

WebUI.setEncryptedText(findTestObject('Object Repository/ExportCalendar(FromUpcomingEvents)/Page_Login - CAS  Central Authentication Service/input_P_password'), 
    'lsh4UT/KYs157Zjg3xgr3w==')

WebUI.click(findTestObject('Object Repository/ExportCalendar(FromUpcomingEvents)/Page_Login - CAS  Central Authentication Service/input_Remember Me_submit'))

WebUI.click(findTestObject('Object Repository/ExportCalendar(FromUpcomingEvents)/Page_Dashboard/a_Go to calendar'))

WebUI.click(findTestObject('Object Repository/ExportCalendar(FromUpcomingEvents)/Page_SUCourse Calendar Upcoming events/button_Export calendar'))

WebUI.click(findTestObject('Object Repository/ExportCalendar(FromUpcomingEvents)/Page_SUCourse Calendar Export/input_Events to export_eventsexportevents'))

WebUI.click(findTestObject('Object Repository/ExportCalendar(FromUpcomingEvents)/Page_SUCourse Calendar Export/input_This month_periodtimeperiod'))

WebUI.click(findTestObject('Object Repository/ExportCalendar(FromUpcomingEvents)/Page_SUCourse Calendar Export/input_Custom range (60521 - 110522)_export'))

WebUI.closeBrowser()

