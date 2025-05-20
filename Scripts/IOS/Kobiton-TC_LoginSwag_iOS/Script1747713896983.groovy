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
import org.openqa.selenium.remote.DesiredCapabilities as DesiredCapabilities
import com.kms.katalon.core.appium.driver.AppiumDriverManager as AppiumDriverManager
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.mobile.driver.MobileDriverType as MobileDriverType
import com.kms.katalon.core.util.internal.PathUtil as PathUtil

String kobitonServerUrl = 'https://maryocool:0b315a5d-ddc2-4b23-aa36-9daec2881524@api.kobiton.com/wd/hub'

DesiredCapabilities capabilities = new DesiredCapabilities()

capabilities.setCapability('kobiton:sessionName', 'Automation test session')
capabilities.setCapability('kobiton:sessionDescription', '')
capabilities.setCapability('kobiton:deviceOrientation', 'portrait')
capabilities.setCapability('kobiton:captureScreenshots', true)
capabilities.setCapability('browserName', 'safari')
capabilities.setCapability('kobiton:deviceGroup', 'KOBITON')
capabilities.setCapability('appium:deviceName', 'iPhone 12')
capabilities.setCapability('platformVersion', '18.4.1')
capabilities.setCapability('platformName', 'iOS')
capabilities.setCapability('app', 'kobiton-store:651671')

AppiumDriverManager.createMobileDriver(MobileDriverType.IOS_DRIVER, capabilities, new URL(kobitonServerUrl))

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/OR_SWAG_iOS/Tab_OptionMenu'), 0)

Mobile.tap(findTestObject('Object Repository/OR_SWAG_iOS/Menu_Login'), 0)

Mobile.takeScreenshot()

Mobile.setText(findTestObject('Object Repository/OR_SWAG_iOS/Field_Username'), 'bob@example.com', 0)

Mobile.setText(findTestObject('Object Repository/OR_SWAG_iOS/Field_Password'), '10203040', 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/OR_SWAG_iOS/Btn_Login'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot()

