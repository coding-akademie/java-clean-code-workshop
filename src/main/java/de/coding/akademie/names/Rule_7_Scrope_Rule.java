package de.coding.akademie.names;

import org.w3c.dom.Document;

import java.util.List;

public class Rule_7_Scrope_Rule {

    Document d;  //bad
   List<ITestResult> m_configIssues;
   List<ITestResult> iTestResults;
    Element rootElement;

    Document document;
    Document doc;


    // Nach 20 Zeilen...
    public void createDOM(){
        for(ITestResult iTestResult : m_configIssues){
            Element element = createElement(d, iTestResult);
            rootElement.append(element);
        }
    }

    public void createDocumentObjectModelTree(){
        for(ITestResult tr : iTestResults){
            Element e = createElement(document, tr);
            rootElement.append(e);
        }
    }

    private Element createElement(Document d, ITestResult iTestResult) {
        return null;
    }

}
