import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.regex.Pattern;

class Codechef
{
 
	static String reverseWords(String str)
	{

		Pattern pattern = Pattern.compile("\\s");

		String[] temp = pattern.split(str);
		String result = "";
		for (int i = 0; i < temp.length; i++) {
			if (i == temp.length - 1){
			    temp[i] = temp[i].substring(0, 1).toUpperCase() + temp[i].substring(1);
			    result = temp[i] + result;
			}
			else
				result = " " + temp[i].toLowerCase() + result;
		}
		return result;
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		String s1 = "Welcome to geeksforgeeks";
		System.out.println(reverseWords(s1));

		String s2 = "I love Java Programming";
		System.out.println(reverseWords(s2));
	}

}