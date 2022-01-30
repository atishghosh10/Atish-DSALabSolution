package com.balancingbrackets.service;

import java.util.Stack;

public class BalancingBrackets {
	public boolean checkingBracketBalanced(String bracketExpression) {
		Stack<Character> = new Stack<Character>();
		
		for(int i=0; i<bracketExpression.length(); i++) {
			char character = bracketExpression.charAt(i);
			
			if(character=='(' || character=='[' || character=='{') {
				Stack.push(character);
				continue;
			}
			if(Stack.isEmpty()){
				return false;
			}
			char c;
			switch(character) {
			case'}':
				c=Stack.pop();
				if(c=='(' || c=='[') {
					return false;
				}
				break;
			case')':
				c=Stack.pop();
				if(c=='{' || c=='[') {
					return false;
				}
				break;
			case']':
				c=Stack.pop();
				if(c=='{' || c=='(') {
					return false;
				}
				break;	
			}
		}
		return Stack.isEmpty();
	}
}
