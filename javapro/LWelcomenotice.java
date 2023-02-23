package javapro;

import java.util.Scanner;

public class LWelcomenotice {//inheritance
    //L login management  - 
	//L books catalog management - 
	//L books availability management - 
	//L facilities management - 
	//L books borrowing management - 
	//L fee management - 
	//L records management - 
	//L return time date and fine management - 
	//L reports management - managed by alan = 
	//super constructor
	 LWelcomenotice(){
		 int i=0;
		 while(i==0) {
		System.out.println("happy friday");
		System.out.println("welcome to library");
		i++;
	 }
	 }
	public static void main(String[] args) {
	/*	// TODO Auto-generated method stub
		//L login management
		LloginManagement first = new LloginManagement("no");
		
		//L books catalog management
		LBooksCatalogManagement bc = new  LBooksCatalogManagement("yes");
		bc.booksSection();
		//L books availability management
		LBooksAvailabilityManagement ba = new LBooksAvailabilityManagement("yes");
		 ba.booksavailability("senthil","suresh","ashok", "rajesh","arun","seventh");
		//L facilities management
		 LFacilitiesManagement FM = new  LFacilitiesManagement("yes");
	        System.out.println("**choose what facilities do you want**");
	        Scanner obj = new Scanner(System.in);
	        String fm = obj.nextLine();
	        switch(fm) {
	        case "accessfacilities":
	         FM.Lfacilities("open access for all_facilities");
	         break;
	        case "booksfacilities":
	        case "placefacilities":
	        FM.Lfacilities("books_facilities","place_facilities");
	        break;
	        case "multimediafacilities":
	        case "lockerfacilities":
	        case "internetfacilities":
	        case "cafefacilities":
	        case "restingfacilities":
	        FM.Lfacilities("multimedia_facilities","locker_facilities","internet_facilities","cafe_facilities");
	        break;
		    default:
		    	System.out.println("This facilities are not available in library");
	        }
		//L books borrowing management
		LBooksBorrowingManagement BO = new LBooksBorrowingManagement("yes");
		BO.LBooksBorrowingoptions("Rent","mortgage","reserve","permanent buying");
		BO.setRentbooks("books rent has successful","yes");
		BO.setMortgagebooks("books exchange has successful","yes");
		BO.setReservebooks("books reserve has successful","no");
		BO.setPermanentbuying("books has successful","no");
		System.out.println("name:"+BO.getRentbooks());
		System.out.println("name:"+BO.getMortgagebooks());
		System.out.println("name:"+BO.getReservebooks());
		System.out.println("name:"+BO.getPermanentbuying());
		//L fee management
		 Lfeemanagement obj0 = new Lfeemanagement();
		 Lfeemanagement obj1 = new  Lfeemanagement("hello","everyone");
		 Lfeemanagement obj2 = new Lfeemanagement(obj1);
		//L return time date and fine management
		 LReturnTimeDateAndFineManagement obj11 = new  LReturnTimeDateAndFineManagement();
		 //L records management 
		 LRecordsManagement obj12 = new  LRecordsManagement();
		 obj12.userrecords1();
		 obj12.userrecords2();
		 //L reports management
		  LReportsManagement ob = new LReportsManagement();
		*/
	}
}
