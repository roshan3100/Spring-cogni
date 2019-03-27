/**
 * Classname : InvalidInputException
 * Functionality Description : This class is for user defined exception
 * Known bugs : None
 * Modification Log
 * Date				Author							Description
 * -----------------------------------------------------------------------------
 * Oct 7, 2006		Dhananjay_Singh		Created
 *
 * Release no : 1.0
 */

package com.hcl.exceptions;

/**
 * This class is for user defined exception
 *
 * @author Dhananjay Singh
 * @version 1.0
 */

public class InvalidInputException extends Exception{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     *This method takes input error message and pass it to super. 
     * @param strMessage Error message
     * @return strMessage Error Message to be displayed
     * @throws None  No exception is thrown
     */
    
    public InvalidInputException(String strMessage){
        super(strMessage);
    }

}




