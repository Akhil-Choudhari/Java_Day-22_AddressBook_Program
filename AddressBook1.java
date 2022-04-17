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
        public void readEntry(){
            System.out.println("First Name:"+first );
            System.out.println("Last Name:"+last );
            System.out.println("Address:"+address );
            System.out.println("Email:"+email );
        }
    }

    private int entries = 0;
    Entry[] contents;
    public void initEntries(int e){
        contents = new Entry[e];
        for (int i = 0;i<contents.length;i++){ 
            contents[i] = new Entry();
        }
    }
    
    
    }