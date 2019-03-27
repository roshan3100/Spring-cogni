package com.hcl.validator;

public class AlphaNumericValidator {
	
	public boolean validateString(String value){
		
		String strInput = value;
		char cValue = 0;
		int iNumericValue = 0;
		int iLength = 0;
		boolean bIsValid = false;
		iLength = strInput.trim().length();

		for (int i = 0; i < iLength; i++) {
			cValue = strInput.charAt(i);
			iNumericValue = cValue;

			/**
			 *ASCII character: 65-90 represent A-Z 97-122 represent a-z 32-
			 * space
			 */

			if (((iNumericValue >= 65 && iNumericValue <= 90)
					|| (iNumericValue >= 97 && iNumericValue <= 122) || iNumericValue == 32)) {
				bIsValid = true;
			} else {
				bIsValid = false;
				break;
			}
		}
		return bIsValid;
		
	}

}
