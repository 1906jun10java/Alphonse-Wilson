package com.revature.triangles;


class TriangleSubstringMethods {

	public boolean Sub(String str, String sub) {
		char[] stringArray = str.toCharArray();
		char[] subArray = sub.toCharArray();
		int value = 0;
		for (int i = 0; i < stringArray.length; i++) {
			for (int j = 0; j < subArray.length;) {
				if (subArray[j] == stringArray[i]) {
					
					if (j == subArray.length-1) {
						value = 1;
						
					}
					
				}
				else {
					i = i-j;
					j =  subArray.length;
					break;
				}
				i++;
				j++;
			}
		}
		if (value == 1) {
			return true;
		} else {
			return false;
		}
	}

	public int Triangle(int base) {
		if (base == 0) {
			return base;
		} else {
			return base + Triangle(base - 1);
		}
	}
}
