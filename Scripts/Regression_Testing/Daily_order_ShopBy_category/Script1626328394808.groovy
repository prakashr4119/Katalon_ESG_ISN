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

WebUI.callTestCase(findTestCase('Regression_Testing/Login_test'), [('url') : '\r\nhttps://test.commercialtireezgarage.com/'
        , ('username') : 'bkirkland@commercialtire.com', ('password') : '541-889-6714'], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Daily_order_pageobjects/Page_Mac EZ Garage  Home/Mouse_over_SHOP BY CATEGORY'))

WebUI.verifyTextPresent('Abrasives', false)

WebUI.click(findTestObject('Daily_order_pageobjects/Page_Mac EZ Garage  Home/span_Abrasives'))

WebUI.verifyTextPresent('MMM7524', false)

WebUI.click(findTestObject('Daily_order_pageobjects/Page_Abrasives - All/div_SKU MMM7524'))

WebUI.setText(findTestObject('Daily_order_pageobjects/Page_2 ROLOC GREEN BRISTLE DISC 50 GRIT 10PK/input__qty_PDP'), '2')

WebUI.click(findTestObject('Daily_order_pageobjects/Page_2 ROLOC GREEN BRISTLE DISC 50 GRIT 10PK/button_Add to Daily Order_PDP'))

if(WebUI.click(findTestObject('Daily_order_pageobjects/Page_Daily Order/span_Daily Order'))) {
	WebUI.verifyTextPresent('This order will automatically process at 03:00 am on Wednesday. This order will be shipped to the default store address. Please contact the store manager for questions about the store order schedule.', false)
}

