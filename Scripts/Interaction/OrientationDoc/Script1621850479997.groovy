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

WebUI.click(findTestObject('OrientationDoc/Page_SUCourse/a_Login'))

WebUI.click(findTestObject('OrientationDoc/Page_SUCourse Authentication choice/a_SUNet users (Sabanc University members)'))

WebUI.setText(findTestObject('OrientationDoc/Page_Login - CAS  Central Authentication Service/input_U_username'), 'mohamedkassem')

WebUI.setEncryptedText(findTestObject('OrientationDoc/Page_Login - CAS  Central Authentication Service/input_P_password'), 
    'lsh4UT/KYs157Zjg3xgr3w==')

WebUI.click(findTestObject('OrientationDoc/Page_Login - CAS  Central Authentication Service/input_Remember Me_submit'))

WebUI.getUrl()

WebUI.scrollToPosition(0, 1000)

WebUI.click(findTestObject('OrientationDoc/Page_Dashboard/a_SUCourse Tutorials'))

WebUI.navigateToUrl('https://sucourse.sabanciuniv.edu/plus/course/view.php?id=901&section=0')

WebUI.mouseOver(findTestObject('OrientationDoc/SuOrientation/div_SU Orientation'))

WebUI.click(findTestObject('OrientationDoc/SuOrientation/div_SU Orientation'))

WebUI.click(findTestObject('OrientationDoc/Page_Course SUCourse Tutorials, Topic SU Orientation/a_into this google doc'))

WebUI.getUrl()

WebUI.verifyLinksAccessible(['https://docs.google.com/spreadsheets/d/1xbrhGNpHPBziX3dJ2sQ2h53VBy1cMLFJKaXTYDrFivo/edit#gid=0'])

