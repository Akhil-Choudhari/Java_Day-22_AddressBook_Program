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
	        for (int i=0;i<library.length;i++){


	            library[i] = new AddressBook1(); 

	            while(true){
	                System.out.print("How many entries in book "+i+"? ");
	                howManyEntries = s.nextInt();
	                if (howManyEntries>0) {
	                    library[i].initEntries(howManyEntries);                
	                    break;
	                }
	                else System.out.println("You must create at least 1 Entry.");
	                }
	        }
	        boolean done = false;
	        int selectedBook = 0;
	        int selection;
	        while (done==false){
	            System.out.println("Book "+selectedBook+" is currently selected.");
	
	        }
	       }}
