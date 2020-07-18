package com.epam_assignment.calculator;

public class CalcFunctionalities {

	public String add_nos(int resultant, int input) {
		
		return String.valueOf(resultant+input);
	}

	public String sub_nos(int resultant, int input) {
		
		return String.valueOf(resultant-input);
	}

	public String multiply_nos(int resultant, int input) {
		
		return String.valueOf(resultant*input);
	}

	public String divide_nos(int resultant, int input) {
int s=0;
try {
s=resultant/input;
}catch(Exception e) {
//do nothing	
}
		return String.valueOf(s);
	}


}
