package com.samanecorp.soap1Client;

import com.samanecorp.soap1Client.wsdl.CalculatorWebServiceImplService;

import java.net.MalformedURLException;
import java.net.URL;

public class Factory {

    private static final String WSDL_URL = "http://localhost:8080/soap1/calculatorWebService?wsdl";

    public static CalculatorWebServiceImplService getCalculatorWebServiceImplService() throws MalformedURLException {
        URL url = new URL(WSDL_URL);
        return new CalculatorWebServiceImplService(url);
    }
}
