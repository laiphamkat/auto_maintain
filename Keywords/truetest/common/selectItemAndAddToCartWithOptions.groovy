package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class selectItemAndAddToCartWithOptions {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Hover over item object"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_object'))
        
        "Step 2: Click on link Apple -> Navigate to page 'category page#category/*'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_Apple'))
        
        "Step 3: Click on button addToCart (AddToCart2)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_page/button_addToCart"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_page/button_addToCart', ['button_addToCart_class': data['button_addToCart_class'], 'button_addToCart_internalHasText': data['button_addToCart_internalHasText']]))
        
        "Step 4: Click on label colorAndStorageOption (StorageOption1TB)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_page/label_colorAndStorageOption"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_page/label_colorAndStorageOption', ['label_colorAndStorageOption_for': data['label_colorAndStorageOption_for'], 'label_colorAndStorageOption_internalText': data['label_colorAndStorageOption_internalText']]))
        
        "Step 5: Click on label colorAndStorageOption (Color)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category_page/label_colorAndStorageOption"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category_page/label_colorAndStorageOption', ['label_colorAndStorageOption_for': data['label_colorAndStorageOption_for_1'], 'label_colorAndStorageOption_internalText': data['label_colorAndStorageOption_internalText_1']]))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['button_addToCart_class'] = testData.getValue('button_addToCart_class', rowIndex)
        data['button_addToCart_internalHasText'] = testData.getValue('button_addToCart_internalHasText', rowIndex)
        data['label_colorAndStorageOption_for'] = testData.getValue('label_colorAndStorageOption_for', rowIndex)
        data['label_colorAndStorageOption_for_1'] = testData.getValue('label_colorAndStorageOption_for_1', rowIndex)
        data['label_colorAndStorageOption_internalText'] = testData.getValue('label_colorAndStorageOption_internalText', rowIndex)
        data['label_colorAndStorageOption_internalText_1'] = testData.getValue('label_colorAndStorageOption_internalText_1', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['button_addToCart_class'] = 'default_data'
        data['button_addToCart_internalHasText'] = 'default_data'
        data['label_colorAndStorageOption_for'] = 'default_data'
        data['label_colorAndStorageOption_for_1'] = 'default_data'
        data['label_colorAndStorageOption_internalText'] = 'default_data'
        data['label_colorAndStorageOption_internalText_1'] = 'default_data'
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

