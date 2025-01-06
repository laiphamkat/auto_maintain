package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class fillShippingDetailsAndCompleteOrder {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Hover over div object"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_info/div_object'))
        
        "Step 2: Click on input Email"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_Email'))
        
        "Step 3: Enter input value in input Email2"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_Email'), data['input_Email2'])
        
        "Step 4: Click on button ContinueToShipping -> Navigate to page 'checkout page#checkout/shipping-address'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_ContinueToShipping'))
        
        "Step 5: Hover over div object"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_page/div_object'))
        
        "Step 6: Click on input FirstName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_page/input_FirstName'))
        
        "Step 7: Hover over div object2"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_page/div_object2'))
        
        "Step 8: Enter input value in input FirstName2"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_page/input_FirstName'), data['input_FirstName2'])
        
        "Step 9: Click on input LastName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_page/input_LastName'))
        
        "Step 10: Hover over div object3"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_page/div_object3'))
        
        "Step 11: Enter input value in input LastName2"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_page/input_LastName'), data['input_LastName2'])
        
        "Step 12: Click on input Address"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_page/input_Address'))
        
        "Step 13: Hover over div object4"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_page/div_object4'))
        
        "Step 14: Enter input value in input Address2"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_page/input_Address'), data['input_Address2'])
        
        "Step 15: Click on input ZipCode"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_page/input_ZipCode'))
        
        "Step 16: Hover over div object5"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_page/div_object5'))
        
        "Step 17: Enter input value in input ZipCode2"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_page/input_ZipCode'), data['input_ZipCode2'])
        
        "Step 18: Click on input City"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_page/input_City'))
        
        "Step 19: Hover over div object6"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_page/div_object6'))
        
        "Step 20: Enter input value in input City2"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_page/input_City'), data['input_City2'])
        
        "Step 21: Click on input ShippingState"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_page/input_ShippingState'))
        
        "Step 22: Hover over div object7"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_page/div_object7'))
        
        "Step 23: Enter input value in input State"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_page/input_ShippingState'), data['input_State'])
        
        "Step 24: Click on input Phone"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_page/input_Phone'))
        
        "Step 25: Enter input value in input Phone2"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_page/input_Phone'), data['input_Phone2'])
        
        "Step 26: Click on button ContinueToPayment -> Navigate to page 'checkout page#checkout/payment'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_page/button_ContinueToPayment'))
        
        "Step 27: Click on button CompleteOrder"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_page/button_CompleteOrder'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_Address2'] = testData.getValue('input_Address2', rowIndex)
        data['input_City2'] = testData.getValue('input_City2', rowIndex)
        data['input_Email2'] = testData.getValue('input_Email2', rowIndex)
        data['input_FirstName2'] = testData.getValue('input_FirstName2', rowIndex)
        data['input_LastName2'] = testData.getValue('input_LastName2', rowIndex)
        data['input_Phone2'] = testData.getValue('input_Phone2', rowIndex)
        data['input_State'] = testData.getValue('input_State', rowIndex)
        data['input_ZipCode2'] = testData.getValue('input_ZipCode2', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_Address2'] = 'default_data'
        data['input_City2'] = 'default_data'
        data['input_Email2'] = 'default_data'
        data['input_FirstName2'] = 'default_data'
        data['input_LastName2'] = 'default_data'
        data['input_Phone2'] = 'default_data'
        data['input_State'] = 'default_data'
        data['input_ZipCode2'] = 'default_data'
        execute_functional_method(data)
    }
    
    public static def execute(String datasource = null, int rowIndex = 1) {
        if (datasource != null) {
            execute_with_data_source(datasource, rowIndex)
        } else {
            execute_without_data_source()
        }
    }
}

