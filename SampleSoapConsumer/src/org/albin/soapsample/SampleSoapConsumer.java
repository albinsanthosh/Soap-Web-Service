package org.albin.soapsample;

import java.math.BigInteger;

import com.dataaccess.webservicesserver.NumberConversion;
import com.dataaccess.webservicesserver.NumberConversionSoapType;

public class SampleSoapConsumer {

	public static void main(String[] args) {
		// need to check the input argument
		if(args.length!=1) {
			System.out.println("You need to pass one number");
		}
		else {
			
			Long long1 = (long) Integer.parseInt(args[0]);  
			BigInteger num = BigInteger.valueOf(long1);
			
			// service.getNumberToWords(num) 
			// stub.getNumberToWords(num) i.e. need service endpoint interface
			
			NumberConversion theNumberConversion = new NumberConversion();
			NumberConversionSoapType theNumberConversionSoapType = theNumberConversion.getNumberConversionSoap();
			
			// theNumberConversionSoapType is the stub
			String theNumberToWords = theNumberConversionSoapType.numberToWords(num);
			
			System.out.println(theNumberToWords);
		}

	}

}
