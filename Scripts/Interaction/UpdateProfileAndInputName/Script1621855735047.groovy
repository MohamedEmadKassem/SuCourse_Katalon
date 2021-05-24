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

WebUI.click(findTestObject('UpfateProfileAndInputName/Page_SUCourse Authentication choice/a_SUNet users (Sabanc University members)'))

WebUI.setText(findTestObject('UpfateProfileAndInputName/Page_Login - CAS  Central Authentication Service/input_U_username'), 
    'mohamedkassem')

WebUI.setEncryptedText(findTestObject('UpfateProfileAndInputName/Page_Login - CAS  Central Authentication Service/input_P_password'), 
    'lsh4UT/KYs157Zjg3xgr3w==')

WebUI.click(findTestObject('UpfateProfileAndInputName/Page_Login - CAS  Central Authentication Service/input_Remember Me_submit'))

WebUI.getUrl()

WebUI.click(findTestObject('UpfateProfileAndInputName/Page_Dashboard/img_Log out_welcome_userpicture'))

WebUI.scrollToPosition(0, 300)

WebUI.click(findTestObject('UpfateProfileAndInputName/Page_Mohamed Emad Mohamed Kassem Public profile/a_Edit profile'))

WebUI.scrollToPosition(300, 700)

WebUI.click(findTestObject('UpfateProfileAndInputName/Page_SUCourse Edit profile/a_Additional names'))

WebUI.delay(2)

WebUI.setText(findTestObject('UpfateProfileAndInputName/Page_SUCourse Edit profile/input_First name - phonetic_firstnamephonetic'), 
    'Mohamed Kassem')

WebUI.click(findTestObject('UpfateProfileAndInputName/Page_SUCourse Edit profile/input_Address_submitbutton'))

WebUI.delay(2)

