package com.stacks.demo;

public class ArrayStack {

	private String[] arr;
	private int length = 0;
	private int maxSize;
	
	public ArrayStack(int size){
		arr = new String[size];
		maxSize = size;
	}
	
	 public String push(String value){
		 if(maxSize <= length){
			 return "Stack is full";
		 }
		 else {
			 arr[length] = value;
			 length++;
			 return "Pushed Successfull";
		 }
	 }
	
	 public String pop(){
		 if(length==0){
			 return "Stack is empty";
		 }
		 else {
			String value = arr[length-1];
			arr[length-1] = null;
			length--;
			return "POP Successfull "+value;
		 }
	 }
	 
	 public String peek(){
		 if(length==0){
			 return "Stack is empty";
		 }
		 else {
			 return arr[length-1];
		 }
	 }
	
	 public int getLength(){
		 return length;
	 }
}
