package AddressBook;
import java.util.*;
public class AddressBook2 {

	
	    public static void main(String[] args){
	        Scanner s = new Scanner(System.in);
	        System.out.print("How many books do you want to create? ");
	        int howManyBooks;
	        int howManyEntries;

	        AddressBook1[] library = new AddressBook1[0];


	        while(true){
	            howManyBooks = s.nextInt();
	            if (howManyBooks>0){
	                library = new AddressBook1[howManyBooks];                 
	                break;
	            }
	            else System.out.print("You must create at least 1 book.");
	            }
}}
