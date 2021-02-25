package com.stacks.demo;

public class Test {

	public static void main(String[] args) {
		LinkedListStack stack = new LinkedListStack();
		stack.push("Google");
		stack.push("Amazon");
		stack.push("NetFlix");
		System.out.println("remove the top item in stack is " + stack.pop());
		System.out.println("remove the top item in stack is " + stack.pop());
		stack.push("YouTube");
		System.out.println("remove the top item in stack is " + stack.pop());
		
		ArrayStack stack2 = new ArrayStack(2);
		System.out.println(stack2.push("Google"));
		System.out.println(stack2.push("Amazon"));
		System.out.println(stack2.push("NetFlix"));
		System.out.println(stack2.pop());
		System.out.println(stack2.pop());
		System.out.println(stack2.push("YouTube"));
		System.out.println(stack2.pop());
	}
}
