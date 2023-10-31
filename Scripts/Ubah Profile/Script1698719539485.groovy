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

WebUI.navigateToUrl('https://staging-m.skorpoints.com/login')

WebUI.setText(findTestObject('Login Page/Username'), 'surya.putra@skorpoints.com')

WebUI.setText(findTestObject('Login Page/Password'), 'Skor1234')

WebUI.click(findTestObject('Login Page/Terms Conditions'))

WebUI.click(findTestObject('Login Page/Login Button'))

WebUI.click(findTestObject('Login Page/Button Sukses Login'))

WebUI.verifyElementVisible(findTestObject('Home/Home Logo'))

WebUI.click(findTestObject('Home/Account'))

WebUI.click(findTestObject('Account/Setting'))

WebUI.waitForPageLoad(0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Setting/Edit Profile'))

WebUI.setText(findTestObject('Edit Profile/First Name'), 'surya ganteng')

WebUI.enableSmartWait()

WebUI.click(findTestObject('Edit Profile/Button Save'))

WebUI.click(findTestObject('Edit Profile/Button Save'))

WebUI.enableSmartWait()

WebUI.click(findTestObject('Edit Profile/Button Sukses Edit'))

WebUI.closeBrowser()

