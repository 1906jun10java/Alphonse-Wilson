package com.revature.triangles;



public class TriangleSubstringMain {

	public static void main(String[] args) {
		
		Substring("iiiyyi","yod");
		Triangle(0);
		
		

	}
	public static void Substring(String mainString, String subString) {
		TriangleSubstringMethods mainsSubs = new TriangleSubstringMethods();
		System.out.println(mainsSubs.Sub(mainString, subString));
	}
	
	public static void Triangle(int TriangleBase) {
		TriangleSubstringMethods mainsSubs = new TriangleSubstringMethods();
		System.out.println(mainsSubs.Triangle(TriangleBase));
	}
	
	

}