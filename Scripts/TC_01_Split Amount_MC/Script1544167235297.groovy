import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import java.awt.event.KeyEvent as KeyEvent
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://demo.etplember.local/ibr_demo_web/(S(ev1x3i0anufx4e1hpew5p1ev))/login.aspx')

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Split Amount/Page_Login/input_Welcome_lgMyLoginUserNam'), GlobalVariable.MKUsername)

WebUI.setEncryptedText(findTestObject('Object Repository/Split Amount/Page_Login/input_Welcome_lgMyLoginPasswor'), GlobalVariable.MKPassword)

WebUI.click(findTestObject('Object Repository/Split Amount/Page_Login/input_Welcome_lgMyLoginbtnLogi'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Split Amount/Page_BCCD  Imprest Account Recon/img_BCCD  Imprest Account Reco'))

WebUI.click(findTestObject('Object Repository/Split Amount/Page_/a_Transactions'))

WebUI.click(findTestObject('Object Repository/Split Amount/Page_/a_Split Amount'))

WebUI.delay(3)

WebUI.maximizeWindow()

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Split Amount/Page_/input__ctl00MainContenttxtSyst'), GlobalVariable.CSeqNo)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Split Amount/Page_/input__ctl00MainContentbtnShow'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Split Amount/Page_/input_Amount 1_ctl00MainConten'), '100')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Object Repository/Split Amount/Page_/input_Amount 1_ctl00MainConten'), Keys.chord(Keys.TAB))

WebUI.delay(2)

CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Split Amount/Authorization/Page_/Amount Fields/Page_/input_Amount 1_ctl00MainConten'))

CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Split Amount/Authorization/Page_/Amount Fields/Page_/input_Amount 2_ctl00MainConten'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Split Amount/Page_/input_()-Mandatory Fields_ctl0'))

WebUI.delay(2)

WebUI.acceptAlert()

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Split Amount/Page_/div_CREDITCREDITDEBIT'))

WebUI.click(findTestObject('Object Repository/Split Amount/Page_/li_DEBIT'))

WebUI.setText(findTestObject('Object Repository/Split Amount/Page_/input__ctl00MainContenttxtSyst'), GlobalVariable.DSeqNo)

WebUI.click(findTestObject('Object Repository/Split Amount/Page_/input__ctl00MainContentbtnShow'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Split Amount/Page_/input_Amount 1_ctl00MainConten'), '100')

WebUI.sendKeys(findTestObject('Object Repository/Split Amount/Page_/input_Amount 1_ctl00MainConten'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('Object Repository/Split Amount/Page_/input_()-Mandatory Fields_ctl0'))

WebUI.delay(2)

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Split Amount/Page_/input_()-Mandatory Fields_ctl0_1'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Split Amount/Page_/a_ADMIN'))

WebUI.click(findTestObject('Object Repository/Split Amount/Page_/a_Logout'))

'Authorization Of Split Amount'
WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Split Amount/Page_Login/input_Welcome_lgMyLoginUserNam'), GlobalVariable.CKUsername)

WebUI.setEncryptedText(findTestObject('Object Repository/Split Amount/Page_Login/input_Welcome_lgMyLoginPasswor'), GlobalVariable.CKPassword)

WebUI.click(findTestObject('Object Repository/Split Amount/Page_Login/input_Welcome_lgMyLoginbtnLogi'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Split Amount/Page_BCCD  Imprest Account Recon/img_BCCD  Imprest Account Reco'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Split Amount/Authorization/Page_/a_Authorisation'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Split Amount/Authorization/Page_/a_Split Amount'))

WebUI.click(findTestObject('Object Repository/Split Amount/Authorization/Page_/input_()-Mandatory Fields_ctl0'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Split Amount/Authorization/Page_/iframe_Help_TB_iframeContent'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Split Amount/Authorization/Page_/input_Sys Tran No_GridView1ctl'), GlobalVariable.CSeqNo)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Split Amount/Authorization/Page_/input_Sys Tran No_GridView1ctl_1'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Split Amount/Authorization/Page_/span_18110007537'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Split Amount/Authorization/Page_/input_()-Mandatory Fields_ctl0_1'))

WebUI.delay(2)

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Split Amount/Authorization/Page_/input_()-Mandatory Fields_ctl0'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Split Amount/Authorization/Page_/iframe_Help_TB_iframeContent'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Split Amount/Authorization/Page_/input_Sys Tran No_GridView1ctl'), GlobalVariable.DSeqNo)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Split Amount/Authorization/Page_/input_Sys Tran No_GridView1ctl_2'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Split Amount/Authorization/Page_/span_18110007126'))

WebUI.delay(2)

'Authorize button'
WebUI.click(findTestObject('Object Repository/Split Amount/Authorization/Page_/input_()-Mandatory Fields_ctl0_1'))

/*WebUI.click(findTestObject('Object Repository/Split Amount/Authorization/Page_/input_()-Mandatory Fields_ctl0_2'))
*/
'Reject Button'
WebUI.delay(3)

WebUI.acceptAlert()

