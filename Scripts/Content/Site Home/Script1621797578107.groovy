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

WebUI.click(findTestObject('SiteHome/Page_SUCourse/a_Login'))

WebUI.click(findTestObject('SiteHome/Page_SUCourse Authentication choice/a_SUNet users (Sabanc University members)'))

WebUI.setText(findTestObject('SiteHome/Page_Login - CAS  Central Authentication Service/input_U_username'), 'mohamedkassem')

WebUI.setEncryptedText(findTestObject('SiteHome/Page_Login - CAS  Central Authentication Service/input_P_password'), 'lsh4UT/KYs157Zjg3xgr3w==')

WebUI.click(findTestObject('SearchByBox/Page_Login - CAS  Central Authentication Service/input_Remember Me_submit'))

WebUI.getUrl()

WebUI.click(findTestObject('SiteHome/Page_Dashboard/div_Courses_sidebar-btn'))

WebUI.click(findTestObject('SiteHome/Page_Dashboard/span_Site home'))

WebUI.click(findTestObject('SiteHome/Page_SUCourse/button_invalidparameter_yui_3_17_2_1_1621884106061_214'))

WebUI.verifyTextPresent('Welcome', false)

WebUI.verifyTextPresent('Course Management System', false)

