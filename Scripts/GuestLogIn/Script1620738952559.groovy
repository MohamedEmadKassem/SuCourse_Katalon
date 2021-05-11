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

WebUI.click(findTestObject('Object Repository/GuestLogIn/Page_SUCourse/a_Login'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/GuestLogIn/Page_SUCourse Authentication choice/a_Guest users'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/GuestLogIn/Page_SUCourse Log in to the site/input'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/GuestLogIn/Page_SUCourse/button_invalidparameter_yui_3_17_2_1_162073_c0fa87'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/GuestLogIn/Page_SUCourse/div_Login'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/GuestLogIn/Page_SUCourse/a_Login'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/GuestLogIn/Page_SUCourse Authentication choice/a_Guest users'))

WebUI.delay(1)

WebUI.closeBrowser()

