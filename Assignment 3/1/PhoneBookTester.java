import java.util.Scanner;

class PhoneEntry {
	String name; // name of a person
	String phone; // their phone number
	String address; // their address
	String city; // their city
	String province; //their province
	String postalCode; //their postal code (zip code)
	
	PhoneEntry(String n, String p, String ad, String c, String pr, String po) {	//temperary variables that will be assigned a value later
		name = n;
		phone = p;
		address = ad;
		city = c;
		province = pr;
		postalCode = po;
	}
}

class PhoneBook {
	PhoneEntry[] phoneBook;

	PhoneBook() // constructor
	{
		phoneBook = new PhoneEntry[5];	//
		phoneBook[0] = new PhoneEntry("James Barclay", "(418)665-1223", "81643 east road", "Seattle", "Nova Scotia", "T6Y 7b3");
		phoneBook[1] = new PhoneEntry("Grace Dunbar", "(860)399-3044", "9475 Chocolate Ave","Crazy Town","America","891 5YR");
		phoneBook[2] = new PhoneEntry("Paul Kratides", "(815)439-9271", "89678 test road","Quebec","Quebec","J9L 5J3");
		phoneBook[3] = new PhoneEntry("Violet Smith", "(312)223-1937","7426 Rick","Asley","Never Gonna", "Give you up");
		phoneBook[4] = new PhoneEntry("John Wood", "(913)883-2874","671897 that road", "Victoria", "London","681 UJK");
	}

	PhoneEntry searchName(String targetName) {	//when searchName is called this function is used to find certain name an phoneentry
		for (int j = 0; j < phoneBook.length; j++) {	//loop until finds value or loop is complete and null is returned
			if (phoneBook[j].name.equals(targetName))
				return phoneBook[j];
		}
		return null;
	}
	PhoneEntry searchPhone(String targetPhone)	{	//targetPhone is a placeholder for the value of search
		for (int i = 0; i < phoneBook.length; i++)	{
			if(phoneBook[i].phone.equals(targetPhone))
				return phoneBook[i];
		} 
		return null;
	}
	PhoneEntry searchAddress(String targetAddress)	{
		for (int i = 0; i < phoneBook.length; i++)	{
			if(phoneBook[i].address.equals(targetAddress))
				return phoneBook[i];
		} 
		return null;
	}
	PhoneEntry searchCity(String targetCity)	{
		for (int i = 0; i < phoneBook.length; i++)	{
			if(phoneBook[i].city.equals(targetCity))
				return phoneBook[i];
		} 
		return null;
	}
	PhoneEntry searchProvince(String targetProvince)	{
		for (int i = 0; i < phoneBook.length; i++)	{
			if(phoneBook[i].province.equals(targetProvince))
				return phoneBook[i];
		} 
		return null;
	}
	PhoneEntry searchPostalCode(String targetPostalCode)	{
		for (int i = 0; i < phoneBook.length; i++)	{
			if(phoneBook[i].postalCode.equals(targetPostalCode))
				return phoneBook[i];
		} 
		return null;
	}
}

class PhoneBookTester {
	public static void main(String[] args) {
		while (true)	{
	
			PhoneBook pb = new PhoneBook();	
			PhoneEntry entry;
			
			Scanner scan = new Scanner(System.in);
			System.out.println("\nWhat search Type? 0: Exit Program, 1: Name, 2: Phone Number, 3: Address, 4: City, 5: Province, 6: ZIP Code");
			int searchType = scan.nextInt();
			scan.nextLine();
			String search;

			
			switch (searchType)	{
				case 0:
					System.out.println("\nExiting program");	//if no search paramaters were entered; exit program
					System.exit(0);
					
					System.exit(0);
				case 1:
					System.out.println("\nEnter their Name");	
					search = scan.nextLine();
					entry = pb.searchName(search);	//calls searchName function and inputs search as the value for targetName
					
					break;
				case 2:
					System.out.println("\nEnter their phone number");
					search = scan.nextLine();
					entry = pb.searchPhone(search);	
					break;
				case 3:
					System.out.println("\nEnter their address");
					search = scan.nextLine();
					entry = pb.searchAddress(search);
					//do something
					break;
				case 4:
					System.out.println("\nEnter their city");
					search = scan.nextLine();
					entry = pb.searchCity(search);
					break;
				case 5:
					System.out.println("\nEnter their province");
					search = scan.nextLine();
					entry = pb.searchProvince(search);
					break;
				case 6:
					System.out.println("\nEnter their postal code");
					search = scan.nextLine();
					entry = pb.searchPostalCode(search);
					break;
				default:
					entry = null;
					
			}	
			
		

			if (entry != null)	{
				System.out.println(entry.name + "; " + entry.phone + "; " + entry.address + "; " + entry.city + "; " + entry.province + "; " + entry.postalCode);
			}
			else {
				System.out.println("Failed to enter a recognized value");
			}
			System.out.println();
		}	
		
	}
}
