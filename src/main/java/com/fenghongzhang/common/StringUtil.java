package com.fenghongzhang.common;

/**
 * String
 * @author fenghongzhang
 *
 */
public class StringUtil {
	
	/**
	 **isEmpty
	 * @param str String
	 * @return boolean
	 */
	public static boolean isEmpty(String str) {
		if(str != null &&str.trim().equals("")) {
			return true;
		}
		return false;
	}
	
	/**
	 * isNotEmpty
	 * @param str String
	 * @return boolean
	 */
	public static boolean isNotEmpty(String str) {
		if(isEmpty(str)) {
			return true;
		}
		return false;
	}
}
