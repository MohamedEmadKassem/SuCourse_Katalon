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

WebUI.click(findTestObject('Object Repository/AddNewDisccusion/Page_SUCourse/a_Login'))

WebUI.click(findTestObject('Object Repository/AddNewDisccusion/Page_SUCourse Authentication choice/a_SUNet users (Sabanc University members)'))

WebUI.setText(findTestObject('Object Repository/AddNewDisccusion/Page_Login - CAS  Central Authentication Service/input_U_username'), 
    'mohamedkassem')

WebUI.setEncryptedText(findTestObject('Object Repository/AddNewDisccusion/Page_Login - CAS  Central Authentication Service/input_P_password'), 
    'lsh4UT/KYs157Zjg3xgr3w==')

WebUI.click(findTestObject('Object Repository/AddNewDisccusion/Page_Login - CAS  Central Authentication Service/input_Remember Me_submit'))

WebUI.click(findTestObject('Object Repository/AddNewDisccusion/Page_Dashboard/a_CS439-202002'))

WebUI.click(findTestObject('Object Repository/AddNewDisccusion/Page_Course CS439-202002/a_Forums'))

WebUI.click(findTestObject('Object Repository/AddNewDisccusion/Page_CS439-202002 Forums/a_Discussion Board'))

WebUI.click(findTestObject('Object Repository/AddNewDisccusion/Page_Discussion Board/input'))

WebUI.setText(findTestObject('Object Repository/AddNewDisccusion/Page_CS439-202002 Discussion Board Add a ne_224de0/div_1 1'), 
    '1 <p>1</p>')

WebUI.setText(findTestObject('Object Repository/AddNewDisccusion/Page_CS439-202002 Discussion Board Add a ne_224de0/input_Subject_subject'), 
    'Test')

WebUI.setText(findTestObject('Object Repository/AddNewDisccusion/Page_CS439-202002 Discussion Board Add a ne_224de0/div_This for testing, please ignore'), 
    '<p style="">This for testing, please ignore</p>')

WebUI.click(findTestObject('Object Repository/AddNewDisccusion/Page_CS439-202002 Discussion Board Add a ne_224de0/input_No selection_form_autocomplete_input-_0d5ec7'))

WebUI.click(findTestObject('Object Repository/AddNewDisccusion/Page_CS439-202002 Discussion Board Add a ne_224de0/input__submitbutton'))

WebUI.closeBrowser()

