package javaExamples;

public class StringReverseusingCharArray {

	public static void main(String[] args) {
		String given="Deepa";
		char[] characterArray=given.toCharArray();
		String reversed="";
		for(int i =characterArray.length-1; i>=0;i--) {
			reversed=reversed+characterArray[i];
		}
			System.out.println(reversed);
		
	}

}
