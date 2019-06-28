package com.revature.mutationChallenge;

import java.lang.Math;

public class MinimumMutations {

	public static void main(String[] args) {

		Play();
	}

	public static void Play() {
		String dnaStart = "AACCGGTT";
		String dnaEnd = "AACAGGTA";
		
		String [] Bank = {"AACCGGTA", "AACAGGTT"};
		
		char[] dnaStartSplit = dnaStart.toCharArray();
		char[] dnaEndSplit = dnaEnd.toCharArray();
		
		int match = 0;
		while(match == 0) {
			System.out.println(dnaStartSplit);
			if(Mutate(dnaStartSplit).equalsIgnoreCase(dnaEnd) ) {
				match = 1;
				System.out.println();
			}
			
		
		}

	}

	public static String Mutate(char [] dnaStartSplit) {
		for(int i = 0; i < dnaStartSplit.length; i++) {
			int mutation = (int)( Math.random()*100)+1;
			if(mutation >95) {
				int nucleotideMutate  = (int)( Math.random()*4)+1;
				char nucleotide = 0;
				switch (nucleotideMutate) {
					case 1:  nucleotide = 'A';
							break;
					case 2:  nucleotide = 'C';
							break;
					case 3:  nucleotide = 'T';
							break;
					case 4:  nucleotide = 'G';
							break;
				}
			dnaStartSplit[i] = nucleotide;
			}
			
		}
		String dnaNewString = new String(dnaStartSplit);
		
		//System.out.print(dnaNewString);
		return dnaNewString;
	}

}