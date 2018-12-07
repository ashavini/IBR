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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://demo.etplember.local/ibr_demo_web/(S(ev1x3i0anufx4e1hpew5p1ev))/login.aspx')

WebUI.delay(3)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Split Amount/Page_Login/input_Welcome_lgMyLoginUserNam'), GlobalVariable.MKUsername)

WebUI.setEncryptedText(findTestObject('Object Repository/Split Amount/Page_Login/input_Welcome_lgMyLoginPasswor'), GlobalVariable.MKPassword)

WebUI.click(findTestObject('Object Repository/Split Amount/Page_Login/input_Welcome_lgMyLoginbtnLogi'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Split Amount/Page_BCCD  Imprest Account Recon/img_BCCD  Imprest Account Reco'))


WebUI.click(findTestObject('Object Repository/Manual Match/Maker/Page_/a_Matching'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Manual Match/Maker/Page_/a_Manual Match'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Manual Match/Maker/Page_/input__ctl00MainContenttxtDebi'), GlobalVariable.MM_Debit)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Manual Match/Maker/Page_/input__ctl00MainContentbtnAddV'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Manual Match/Maker/Page_/input__ctl00MainContenttxtCred'), GlobalVariable.MM_Credit)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Manual Match/Maker/Page_/input__ctl00MainContentbtnAddV_1'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Manual Match/Maker/Page_/textarea__ctl00MainContenttxtR'), 'remark entered by maker to match split records manually')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Manual Match/Maker/Page_/input_( )-Mandatory Fields()-'))

WebUI.delay(2)

WebUI.acceptAlert()

WebUI.delay(2)

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Manual Match/Maker/Page_/input_( )-Mandatory Fields()- _1'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Split Amount/Page_/a_ADMIN'))

WebUI.click(findTestObject('Object Repository/Split Amount/Page_/a_Logout'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Split Amount/Page_Login/input_Welcome_lgMyLoginUserNam'), GlobalVariable.CKUsername)

WebUI.setEncryptedText(findTestObject('Object Repository/Split Amount/Page_Login/input_Welcome_lgMyLoginPasswor'), GlobalVariable.CKPassword)

WebUI.click(findTestObject('Object Repository/Split Amount/Page_Login/input_Welcome_lgMyLoginbtnLogi'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Split Amount/Page_BCCD  Imprest Account Recon/img_BCCD  Imprest Account Reco'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Split Amount/Authorization/Page_/a_Authorisation'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Manual Match/Checker/Page_/a_Manual Match'))

WebUI.click(findTestObject('Object Repository/Manual Match/Checker/Page_/input_Remarks_ctl00MainContent'))

WebUI.delay(1)

WebUI.mouseOver(findTestObject('Manual Match/Checker/Page_/iframe_Help_TB_iframeContent'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Manual Match/Checker/Page_/input_Lot no_GridView1ctl01txt'), '18120000078')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Manual Match/Checker/Page_/input_Lot no_GridView1ctl01btn'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Manual Match/Checker/Page_/td_18120000076'))

WebUI.delay(1)

'Authorize Action'
WebUI.click(findTestObject('Manual Match/Checker/Page_/Page_/New Folder/Page_/input_Remarks_ctl00MainContent'))

WebUI.delay(1)

WebUI.acceptAlert()

WebUI.delay(3)

WebUI.acceptAlert()

'Reject Action'
/*WebUI.click(findTestObject('Manual Match/Checker/Page_/Page_/input_Remarks_ctl00MainContent'))
*/
WebUI.delay(2)



