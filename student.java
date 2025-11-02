import java.util.*;
public class student {
String studentName;
String regNum;
book borrowedBooks[]=new book[3];
public int booksCount=0;
Scanner input=new Scanner(System.in);
public student() {
	System.out.println("Enter student name:");
	this.studentName=input.nextLine();
	System.out.println("Enter registration number:");
	this.regNum=input.nextLine();
}
}
