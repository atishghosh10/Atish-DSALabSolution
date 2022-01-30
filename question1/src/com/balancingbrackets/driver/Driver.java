package com.balancingbrackets.driver;
import com.balancingbrackets.service.BalancingBrackets;
public class Driver {

	public static void main(String[] args) {
		BalancingBrackets obj = new BalancingBrackets();
		String bracketExpression = "([[{}]])";
		boolean result;
		result = obj.checkingBracketsBalanced(bracketExpression);
		if(result) {
			System.out.println("The entered String has Balanced Brackets");
		}
		else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
	}

}
