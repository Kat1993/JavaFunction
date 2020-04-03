package baisics;

public class Functions {
 public static void main(String[] args) {
	 // call the function
	 sayHi();
	 // call the print the name function
	 printName("Kateryna", "Tsymbal");
	String FullName = combineName("Kateryn","Tsymbal");
	System.out.println(FullName);
	 
	 
 }
 public static void sayHi() {
	 System.out.println("Hi");
 }
 // your name
 public static void printName(String FirstName, String LastName) {
	 System.out.println("First Name " + FirstName);
	 System.out.println("Last Name "+ LastName);
	 
		 
 }
 
 // definr the function for full name
 public static String combineName(String FirstName,String LastName) {
  String combineName = FirstName+ " "+ LastName;
  return combineName;
 }
 
 
}
