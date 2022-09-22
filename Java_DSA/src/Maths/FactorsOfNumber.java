package Maths;

import java.util.ArrayList;

public class FactorsOfNumber {
	public static void main(String[] args) {
		int fact = 20;
		factors(fact);
	}
	
	public static void factors(int fact){
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=1; i<=Math.sqrt(fact); i++) {
			if(fact % i ==0) {
				if(fact / i == i) {
					System.out.print(i+" ");
				}
				else {
					System.out.print(i+" ");
					list.add(fact/i);
				}
			}
		}
		for(int i=list.size()-1; i>=0; i--) {
			System.out.print(list.get(i)+" ");
		}
	}
}
