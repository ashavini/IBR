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

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/change status/Page_/span_Matching'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Unmatch Batch/Maker/Page_/a_Unmatch Batch'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Unmatch Batch/Maker/Page_/input__ctl00MainContenttxtSyst'),GlobalVariable.UB_CSeqNo)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Unmatch Batch/Maker/Page_/input__ctl00MainContentbtnShow'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Unmatch Batch/Maker/Page_/input_Batch No._ctl00MainConte'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Unmatch Batch/Maker/Page_/input_()-Mandatory Fields_ctl0'))

WebUI.delay(2)

WebUI.acceptAlert()

WebUI.delay(2)

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Unmatch Batch/Maker/Page_/span_CREDIT'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Unmatch Batch/Maker/Page_/li_DEBIT'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Unmatch Batch/Maker/Page_/input__ctl00MainContenttxtSyst'),GlobalVariable.UB_DSeqNo)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Unmatch Batch/Maker/Page_/input__ctl00MainContentbtnShow'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Unmatch Batch/Maker/Page_/input_Batch No._ctl00MainConte'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Unmatch Batch/Maker/Page_/input_()-Mandatory Fields_ctl0'))

WebUI.delay(2)

WebUI.acceptAlert()

WebUI.delay(2)

WebUI.acceptAlert()

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Unmatch Batch/Maker/Page_/input_()-Mandatory Fields_ctl0_1'))

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

WebUI.click(findTestObject('Object Repository/Unmatch Batch/Checker/Page_/a_Unmatch Batch'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Unmatch Batch/Checker/Page_/input_Remarks_ctl00MainContent'))

WebUI.delay(3)

WebUI.mouseOver(findTestObject('Unmatch Batch/Checker/Page_/iframe_Help_TB_iframeContent'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Unmatch Batch/Checker/Page_/td_18120000082'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Unmatch Batch/Checker/Page_/input_UNMATCH-MATCHED BATCH_ct'))

WebUI.delay(3)

WebUI.acceptAlert()

WebUI.delay(2)

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Unmatch Batch/Checker/Page_/input_Remarks_ctl00MainContent'))

WebUI.delay(3)

WebUI.mouseOver(findTestObject('Unmatch Batch/Checker/Page_/iframe_Help_TB_iframeContent'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Unmatch Batch/Checker/Page_/span_18120000083'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Unmatch Batch/Checker/Page_/input_UNMATCH-MATCHED BATCH_ct_1'))

WebUI.delay(3)

WebUI.acceptAlert()


