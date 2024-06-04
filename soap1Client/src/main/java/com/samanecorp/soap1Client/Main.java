package com.samanecorp.soap1Client;

public class Main {

	public static void main(String[] args) {
		try {
			int  sumNumber = Factory.getCalculatorWebServiceImplService().getCalculatorWebServiceImplPort().add(1, 45);
			System.out.println(sumNumber);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
