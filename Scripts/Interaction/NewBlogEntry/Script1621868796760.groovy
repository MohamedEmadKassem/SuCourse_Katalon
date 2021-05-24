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

WebUI.click(findTestObject('NewBlogEntry/Page_SUCourse/a_Login'))

WebUI.click(findTestObject('NewBlogEntry/Page_SUCourse Authentication choice/a_SUNet users (Sabanc University members)'))

WebUI.setText(findTestObject('NewBlogEntry/Page_Login - CAS  Central Authentication Service/input_U_username'), 'mohamedkassem')

WebUI.setEncryptedText(findTestObject('NewBlogEntry/Page_Login - CAS  Central Authentication Service/input_P_password'), 
    'lsh4UT/KYs157Zjg3xgr3w==')

WebUI.click(findTestObject('NewBlogEntry/Page_Login - CAS  Central Authentication Service/input_Remember Me_submit'))

WebUI.getUrl()

WebUI.click(findTestObject('NewBlogEntry/Page_Dashboard/img_Log out_welcome_userpicture'))

WebUI.scrollToPosition(0, 300)

WebUI.click(findTestObject('NewBlogEntry/Page_Mohamed Emad Mohamed Kassem Public profile/a_Blog entries'))

WebUI.click(findTestObject('NewBlogEntry/Page_SUCourse Mohamed Emad Mohamed Kassem Blog/a_Add a new entry'))

WebUI.scrollToPosition(0, 500)

WebUI.setText(findTestObject('NewBlogEntry/Page_SUCourse Blogs Add a new entry/input_Entry title_subject'), 'The Selenium Test Case')

WebUI.setText(findTestObject('NewBlogEntry/Page_SUCourse Blogs Add a new entry/div_Blog entry body_id_summary_editoreditable'), 
    ' Selenium is a portable framework for testing web applications. Selenium provides a playback tool for authoring functional tests without the need to learn a test scripting language.')

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('NewBlogEntry/Page_SUCourse Blogs Add a new entry/input__submitbutton'))

