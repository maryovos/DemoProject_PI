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

Mobile.startApplication('C:\\Users\\1556\\Documents\\APK\\SwagAppAPK.apk', true)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/OR_SWAG_Android/btn_OpenMenu'), 0)

Mobile.tap(findTestObject('Object Repository/OR_SWAG_Android/menu_Login'), 0)

Mobile.takeScreenshotAsCheckpoint('1', FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/OR_SWAG_Android/field_Username'), 'bob@example.com', 0)

Mobile.setText(findTestObject('Object Repository/OR_SWAG_Android/field_Password'), '10203040', 0)

Mobile.takeScreenshotAsCheckpoint('2', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/OR_SWAG_Android/btn_Login'), 0)

Mobile.verifyElementVisible(findTestObject('OR_SWAG_Android/verify_LoginSuccess'), 5)

Mobile.takeScreenshotAsCheckpoint('3', FailureHandling.STOP_ON_FAILURE)

