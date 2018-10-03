package com.atmecs.factoryMethod;

/*
 * If any new OS will come into the market we have to just make the changes here rather making changes
 * into the client application.  
 */
public class Factory_of_OS {
	public static Phone getPhone(PhoneType type) {
		
		switch(type) {
		case Android:
			return new AndroidPhone();
		
		case IOS:
			return new IOS();
			
		case Windows:
			return new Windows();
			
		default:
			return null;
		}
	}

}
