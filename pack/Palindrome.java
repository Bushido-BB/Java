package pack;
public class Palindrome{
public boolean palindrome(String str){
	String rev="";
	for(int i=str.length()-1;i>=0;i--){
		rev+=str.charAt(i);
	}
	System.out.println(str+"  |  "+rev);
	return (str.equalsIgnoreCase(rev));
}
}