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

WebUI.openBrowser('https://sucourse.sabanciuniv.edu/plus/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('GuestUser/Page_SUCourse/a_Login'))

WebUI.click(findTestObject('GuestUser/Page_SUCourse Authentication choice/a_Guest users'))

WebUI.setText(findTestObject('GuestUser/Page_SUCourse Log in to the site/input_Username_username'), 'mohamedkassem')

WebUI.setEncryptedText(findTestObject('GuestUser/Page_SUCourse Log in to the site/input_Password_password'), 'lsh4UT/KYs157Zjg3xgr3w==')

WebUI.click(findTestObject('GuestUser/Page_SUCourse Log in to the site/input_Password_loginbtn'))

WebUI.verifyTextPresent('Invalid login', false)

