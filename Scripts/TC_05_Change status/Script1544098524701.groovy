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

WebUI.click(findTestObject('Object Repository/change status/Page_/span_Matching'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/change status/Page_/a_Change Status'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/change status/Page_/input__ctl00MainContenttxtSysT'), GlobalVariable.ChangeStatus_CSeqNo)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/change status/Page_/input__ctl00MainContentimgbtnS'))

'Withheld Outstandng Report Status'
WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/change status/Page_/textarea__ctl00MainContenttxtR'), 'status changed to withheld -o/s report')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/change status/Page_/input_()-Mandatory Fields_ctl0'))

WebUI.delay(2)

WebUI.acceptAlert()

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/change status/Page_/div_CREDITCREDITDEBIT'))

WebUI.click(findTestObject('Object Repository/change status/Page_/li_DEBIT'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/change status/Page_/input__ctl00MainContenttxtSysT'), GlobalVariable.ChangeStatus_DSeqNo)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/change status/Page_/input__ctl00MainContentimgbtnS'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/change status/Page_/div_WITHHELD-OS REPORTUNMATCHE'))

WebUI.delay(2)

'Withheld Matching Status'
WebUI.click(findTestObject('Object Repository/change status/Page_/li_WITHHELD-MATCHING'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/change status/Page_/textarea__ctl00MainContenttxtR'), 'status changed to withheld-matching')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/change status/Page_/input_()-Mandatory Fields_ctl0'))

WebUI.delay(2)

WebUI.acceptAlert()

WebUI.delay(2)

//To check Staus value get updaed or not 
WebUI.setText(findTestObject('Object Repository/change status/Page_/input__ctl00MainContenttxtSysT'), GlobalVariable.ChangeStatus_CSeqNo)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/change status/Page_/input__ctl00MainContentimgbtnS'))

WebUI.delay(3)

'To highlight the field values'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('change status/Page_/div_UNMATCHEDUNMATCHEDWITHHELD'))

WebUI.delay(3)

WebUI.getText(findTestObject('change status/Page_/div_UNMATCHEDUNMATCHEDWITHHELD'))

WebUI.takeScreenshot('C:\\Users\\ashavini\\Desktop\\Dena Bank\\Automation\\Change Status\\Status1.png')

WebUI.click(findTestObject('change status/Clear button/Page_/input_()-Mandatory Fields_ctl0'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/change status/Page_/div_CREDITCREDITDEBIT'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/change status/Page_/li_DEBIT'))

WebUI.delay(2)

'To highlight the field values'
WebUI.setText(findTestObject('Object Repository/change status/Page_/input__ctl00MainContenttxtSysT'), GlobalVariable.ChangeStatus_DSeqNo)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/change status/Page_/input__ctl00MainContentimgbtnS'))

WebUI.delay(2)

CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('change status/Page_/div_UNMATCHEDUNMATCHEDWITHHELD'))

WebUI.delay(3)

WebUI.getText(findTestObject('change status/Page_/div_UNMATCHEDUNMATCHEDWITHHELD'))


WebUI.takeScreenshot('C:\\Users\\ashavini\\Desktop\\Dena Bank\\Automation\\Change Status\\Status2.png')

WebUI.click(findTestObject('change status/Clear button/Page_/input_()-Mandatory Fields_ctl0'))

