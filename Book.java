import java.util.*;
public class book {
 public int sNo;
 public String bookName;
 public String authorName;
 public int bookQty;
 public int bookQtyCopy;
 Scanner input=new Scanner(System.in);
 public book() {
	 System.out.println("Enter Serial No of Book:");
	 this.sNo=input.nextInt();
	 input.nextLine();
	 System.out.println("Enter book name:");
	 this.bookName=input.nextLine();
	 System.out.println("Enter Author name:");
	 this.authorName=input.nextLine();
	 System.out.println("Enter quantity of Books:");
	 this.bookQty=input.nextInt();
	 bookQtyCopy=this.bookQty;
 }
}
