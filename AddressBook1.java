package AddressBook;

import java.util.Scanner;
class AddressBook1{
    Scanner s = new Scanner(System.in);
   
    class Entry{
        private String first;
        private String last;
        private String address;
        private String email;
        Entry(String first, String last, String address, String email){
            this.first = first;
            this.last = last;
            this.address = address;
            this.email = email;
       }
   
        Entry(){
            first = "";
            last = "";
            address = "";
            email = "";
        }
    }}