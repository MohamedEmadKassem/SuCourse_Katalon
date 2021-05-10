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

WebUI.click(findTestObject('Object Repository/BrowserSessions/Page_SUCourse/a_Login'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/BrowserSessions/Page_SUCourse Authentication choice/a_SUNet users (Sabanc University members)'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/BrowserSessions/Page_Login - CAS  Central Authentication Service/input_U_username'), 
    'mohamedkassem')

WebUI.delay(1)

WebUI.setEncryptedText(findTestObject('Object Repository/BrowserSessions/Page_Login - CAS  Central Authentication Service/input_P_password'), 
    'lsh4UT/KYs157Zjg3xgr3w==')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/BrowserSessions/Page_Login - CAS  Central Authentication Service/input_Remember Me_submit'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/BrowserSessions/Page_Dashboard/span_Mohamed Emad Mohamed Kassem'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/BrowserSessions/Page_Dashboard/span_Profile'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/BrowserSessions/Page_Mohamed Emad Mohamed Kassem Public profile/a_Browser sessions'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/BrowserSessions/Page_Browser sessions/a_156.213.215.40'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/BrowserSessions/Page_IP address lookup 156.213.215.40 - Cai_411c07/img'))

WebUI.delay(3)

WebUI.closeBrowser()
