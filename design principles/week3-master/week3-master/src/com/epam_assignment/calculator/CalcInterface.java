package com.epam_assignment.calculator;

import java.util.Scanner;

public class CalcInterface {
int resultant;
private Scanner s;
CalcInterface(){
	this.resultant=0;
}

public void runInterface() {
	s = new Scanner(System.in);
	int input,choice;
	CalcFunctionalities cf=new CalcFunctionalities();
	System.out.println("Menu\n1:Add\n2:Subtract\n3:Multiply\n4:Floor Divide\n5:Reset\n.......6 to exit");
	System.out.println("Result:"+this.resultant);
	System.out.println("Enter your choice");
	choice=s.nextInt();
	while(choice!=6) {
		System.out.println("Enter the second operand!");
		input=s.nextInt();
		switch(choice) {
		case 1:this.resultant=Integer.parseInt(cf.add_nos(this.resultant,input));
			System.out.println("Result:"+this.resultant);
		       break;
		       
		case 2:this.resultant=Integer.parseInt(cf.sub_nos(this.resultant,input));
			System.out.println("Result:"+this.resultant);
	       break;
		
		case 3:this.resultant=Integer.parseInt(cf.multiply_nos(this.resultant,input));
			System.out.println("Result:"+this.resultant);
	       break;
	       
		case 4:this.resultant=Integer.parseInt(cf.divide_nos(this.resultant,input));
			System.out.println("Result:"+this.resultant);
	       break;   
	    
		case 5:this.resultant=0;
		System.out.println("Result:"+this.resultant);
	       break;   
		
	      }
		System.out.println("Enter your choice");
		choice=s.nextInt();
		}
System.out.println("Calculator app exited");
}


}
