package CollectionFramework.project;

import java.util.Scanner;

public class ShirtDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Service s = new Service();
		s.loads();
		System.out.println("Welcom to Shirt Project");
		
		
		String str;
		do {
			System.out.println("Press 1 ==> To add Shirt "
					+ "\nPress 2 ==> Access All Shirts "
					+ "\nPress 3 ==> Access Shirts on brands "
					+ "\nPress 4 ==> Access all shirts by brand and size "
					+ "\nPress 5 ==> Access all shirts in a price range "
					+ "\nPress 6 ==> Access all shirts by size and price range "
					+ "\nPress 7 ==> Sort all shirts on size low to high "
					+ "\nPress 8 ==> Sort all shirts on size high to low "
					+ "\nPress 9 ==> Sort all shirts on price low to high "
					+ "\nPress 10 ==> Sort all shirts on price high to low "
					+ "\nPress 11 ==> Sort all shirts on brands on ascending order of alphabets "
					+ "\nPress 12 ==> Sort all shirts on brands on descending order of alphabets "
					+ "\nPress 13 ==> Sort all shirts on price low to high, if price is same then sort on size low to high "
					+ "\nPress 14 ==> Sort all shirts on price low to high, if price is same then sort on brand in ascending order of alphabets "
					+ "\nPress 15 ==> Sort all shirts on brands on ascending order of alphabets, if brands are same then sort on price low to high "
					+ "\nPress 16 ==> Sort all shirts on brands on descending order, if brands are same then sort on price high to low "
					+ "\nPress 17 ==> List all the brands available "
					+ "\nPress 18 ==> List all the size available "
					+ "\nPress 19 ==> List all the colour available "
					+ "\nPress 20 ==> Count the number of shirts available for a particular brand as per user input "
					+ "\nPress 21 ==> Count the number of shirts available for a particular colour "
					+ "\nPress 22 ==> Count the number of shirts available for a particular size "
					+ "\nPress 23 ==> Count the number of shirts available in each brand "
					+ "\nPress 24 ==> Count the number of shirts available in each size "
					+ "\nPress 25 ==> Count the number of shirts available in each colour "
					+ "\nPress 26 ==> remove shirts by brand and size "
					+ "\nPress 27 ==> find the costliest and cheapest shirt "
					+ "\nPress 28 ==> group shirts by brand using Map "
					+ "\nPress 29 ==> check if two shirts are equal (override equals & hashCode) "
					+ "\nPress 30 ==> return immutable list of shirts to caller "
					+ "\nPress 0 ==> To exit project");
			int choice = Integer.parseInt(sc.nextLine());
			
			switch(choice) {
				case 1:
					s.AddShirt();
					break;
					
				case 2:
					s.AccessShirt();
					break;
					
				case 3:
					s.AccessShirtByBrand();
					break;
					
				case 4:
					s.AccessShirtByBrandAndSize();
					break;
					
				case 5:
					s.AccessByPrice();
					break;
					
				case 6:
					s.AccessBySizeAndPrice();
					break;
					
				case 7:
					s.SortSizeLowToHigh();
					break;
					
				case 8:
					s.SortSizeHighToLow();
					break;
					
				case 9:
					s.SortPriceLowToHigh();
					break;
					
				case 10:
					s.SortPriceHighToLow();
					break;
					
				case 11:
					s.SortBrandsAscendingAlphabetically();
					break;
					
				case 12:
					s.SortBrandsDescendingAlphabetically();
					break;
					
				case 13:
					s.SortPriceLowtoHighThenSortSizeLowToHigh();
					break;
					
				case 14:
					s.SortPriceLowtoHighThenSortBrandsAscendingAlphabetically();
					break;
					
				case 15:
					s.SortBrandsAscendingAlphabeticallyThenSortPriceLowtoHigh();
					break;
					
				case 16:
					s.SortBrandsDescendingAlphabeticallyThenSortPriceHighToLow();
					break;
					
				case 17:
					s.ListAllBrands();
					break;
					
				case 18:
					s.ListAllSize();
					break;
					
				case 19:
					s.ListAllColour();
					break;
					
				case 20:
					s.CountShirtBrandPerUserInput();
					break;
					
				case 21:
					s.CountShirtColour();
					break;
					
				case 22:
					s.CountShirtSize();
					break;
					
				case 23:
					s.CountShirtEachBrand();
					break;
					
				case 24:
					s.CountShirtEachSize();
					break;
					
				case 25:
					s.CountShirtEachColour();
					break;
					
				case 26:
					s.RemoveShirtByBrandAndSize();
					break;
					
				case 27:
					s.FindCostliestAndCheapestShirt();
					break;
					
				case 28:
					s.GroupByBrandUsingMap();
					break;
					
				case 29:
					s.CheckIfTwoShirtsEqual();
					break;
				
					
				case 0:
					System.out.println("Your Shirts Program terminated");
					System.exit(0);
					
				default:
					System.out.println("Invalid choice Entered, Please try again!");
					main(null);
			}
		System.out.println("Do you want to continue, Press yes");
		str = sc.nextLine();
		}while(str.equalsIgnoreCase("yes"));
	}
}
