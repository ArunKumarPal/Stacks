package com.stacks.demo;

public class LinkedListStack {

	private Node top;
	private Node bottom;
	private int length;

	public LinkedListStack() {
		this.top = null;
		this.bottom = null;
		this.length = 0;
	}

	public void push(String value) {
		Node newNode = new Node(value);
		if (top == null) {
			top = newNode;
			bottom = newNode;
		} else {
			newNode.next = top;
			top = newNode;
		}
		length++;
		return;
	}

	public String pop() {
		if (top == null) {
			return "Stack is empty";
		} else {
			String value = top.value;
			top = top.next;
			if (top == null) {
				bottom = null;
			}
			length--;
			return value;
		}
	}

	public String peek() {
		if (top == null) {
			return "Stack is empty";
		} else {
			return top.value;
		}
	}

	public String lastElement() {
		if (top == null) {
			return "Stack is empty";
		} else {
			return this.bottom.value;
		}
	}

	public int getLength() {
		return length;
	}

}
