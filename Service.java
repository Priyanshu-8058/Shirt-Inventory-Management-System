package CollectionFramework.project;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Service {

	Scanner sc = new Scanner(System.in);
	List<Shirt> shirts = new ArrayList<>();
	
		
		// load shirts
		public void loads() {
			shirts.add(new Shirt("Arrow", "Red", 2500.25, 32));
			shirts.add(new Shirt("Polo", "blue", 2700.34, 36));
			shirts.add(new Shirt("Arrow", "Red", 2500.25, 32));
			shirts.add(new Shirt("Polo", "blue", 2200.34, 34));
			shirts.add(new Shirt("Arrow", "Red", 2500.25, 34));
			shirts.add(new Shirt("Raymond", "blue", 2700.34, 34));
			shirts.add(new Shirt("Bers", "Brown", 2800.0, 48));
			shirts.add(new Shirt("Arrow", "Teal", 2200.34, 42));
			shirts.add(new Shirt("Arrow", "green", 2000.25, 30));
			shirts.add(new Shirt("Raymond", "blue", 2200.34, 34));
			shirts.add(new Shirt("Bers", "Brown", 2800.0, 48));
			shirts.add(new Shirt("Bers", "Teal", 3000.34, 42));
		}
		
		
		
		void AddShirt() {
			
			try {
				System.out.println("Enter brand : ");
				String brand = sc.nextLine();
				System.out.println("Enter Color : ");
				String color = sc.nextLine();
				System.out.println("Enter Price : ");
				double price = Double.parseDouble(sc.nextLine());
				System.out.println("Enter Size : ");
				int size = Integer.parseInt(sc.nextLine());
				
				Shirt sh = new Shirt(brand, color, price, size);
				shirts.add(sh);
				
				System.out.println("Shirt data is Added");
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		void AccessShirt() {
			if(shirts.isEmpty()) {
				System.out.println("Shirt is not available");
			}
			for(Shirt s: shirts) {
				System.out.println(s);
			}
		}
		
		void AccessShirtByBrand() {
			System.out.println("Enter brand whom you want to access Shirt:");
			String brand=sc.nextLine();
			int x=0;
			for(Shirt s:shirts) {
				if(s.brand.equalsIgnoreCase(brand)) {
					System.out.println(s);
					x=1;
				}
			}
			if(x==0) {
				System.out.println("No Shirts are available "+brand+" brand.");
			}else {
				System.out.println("All Shirts are accessed "+brand+" brand.");
			}			
		}
		
		void AccessShirtByBrandAndSize() {
			System.out.println("Enter Brand : ");
			String brand = sc.nextLine();
			System.out.println("Enter Size : ");
			int size = Integer.parseInt(sc.nextLine());
			boolean found=false;
			for(Shirt s:shirts) {
				if(s.brand.equalsIgnoreCase(brand) && s.size==size) {
					System.out.println(s);
					found=true;
				}
			}
			if(found) {
				System.out.println("All Shirts are accessed "+brand+" brand and "+size+" cm");
			}
			else {
				System.out.println("No Shirts are available "+brand+" brand and "+size+" cm");
			}
		}
		
		public void AccessByPrice() {
			System.out.println("Enter the minimum price: ");
			double min = Double.parseDouble(sc.nextLine());
			System.out.println("Enter the maximum size: ");
			double max = Double.parseDouble(sc.nextLine());
			boolean found=false;
			for(Shirt s:shirts) {
				if(s.price>=min && s.price<=max) {
					System.out.println(s);
					found=true;
				}
			}
			if(found) {
				System.out.println("All Shirts are accessed "+min+" price and "+max+" price");
			}
			else {
				System.out.println("No Shirts are available "+min+" price and "+max+" price");
			}
		}



		public void AccessBySizeAndPrice() {
			System.out.println("Enter Size: ");
			int size=Integer.parseInt(sc.nextLine());
			System.out.println("Enter the minimum price: ");
			double min = Double.parseDouble(sc.nextLine());
			System.out.println("Enter the maximum size: ");
			double max = Double.parseDouble(sc.nextLine());
			boolean found=false;
			for(Shirt s:shirts) {
				if(s.size==size && s.price>=min && s.price<=max) {
					System.out.println(s);
					found=true;
				}
			}
			if(found) {
				System.out.println("All Shirts are accessed with size " +size+" cm  "+min+" price and "+max+" price");
			}
			else {
				System.out.println("No Shirts are available with size \" +size+\" cm "+min+" price and "+max+" price");
			}
		}
		
		void SortSizeLowToHigh() {
			List<Shirt> temp = new ArrayList<>(shirts);
			temp.sort(Comparator.comparingInt(s -> s.size));
			for(Shirt s:temp) {
				System.out.println(s);
			}
			System.out.println("Shirts sorted by size from low to high successfully.");
		}
		
		void SortSizeHighToLow() {
			List<Shirt> temp = new ArrayList<>(shirts);
			temp.sort(Comparator.comparingInt((Shirt s )-> s.size).reversed());
			for(Shirt s:temp) {
				System.out.println(s);
			}
			System.out.println("Shirts sorted by size from High to low successfully.");
		}



		void SortPriceLowToHigh() {
			List<Shirt> temp = new ArrayList<>(shirts);
			temp.sort(Comparator.comparingDouble(s -> s.price));
			for(Shirt s:temp) {
				System.out.println(s);
			}
			System.out.println("Shirts sorted by price from low to high successfully.");
		}
		
		public void SortPriceHighToLow() {
			List<Shirt> temp = new ArrayList<>(shirts);
			temp.sort(Comparator.comparingDouble((Shirt s) -> s.price).reversed());
			for(Shirt s:temp) {
				System.out.println(s);
			}
			System.out.println("Shirts sorted by price from high to low successfully.");
		}
		
		void SortBrandsAscendingAlphabetically() {
			List<Shirt> temp = new ArrayList<>(shirts);
			temp.sort(Comparator.comparing(s -> s.brand));
			for(Shirt s: temp) {
				System.out.println(s);
			}
			System.out.println("Shirts sorted by brands on ascending order of alphabets successfully.");
		}
		
		void SortBrandsDescendingAlphabetically() {
			List<Shirt> temp = new ArrayList<>(shirts);
			temp.sort(Comparator.comparing((Shirt s) -> s.brand).reversed());
			for(Shirt s: temp) {
				System.out.println(s);
			}
			System.out.println("Shirts sorted by brands on descending order of alphabets successfully.");
		}
		
		void SortPriceLowtoHighThenSortSizeLowToHigh() {
			List<Shirt> temp = new ArrayList<>(shirts);
			temp.sort(Comparator.comparingDouble((Shirt s) -> s.price).thenComparingInt(s -> s.size));
			for(Shirt s:temp) {
				System.out.println(s);
			}
			System.out.println("Shirts sorted by Price, if price is same then sort on size low to high successfully.");
		}
		
		void SortPriceLowtoHighThenSortBrandsAscendingAlphabetically() {
			List<Shirt> temp = new ArrayList<>(shirts);
			temp.sort(Comparator.comparingDouble((Shirt s) -> s.price).thenComparing(s -> s.brand));
			for(Shirt s:temp) {
				System.out.println(s);
			}
			System.out.println("Shirts sorted by Price, if price is same then sort on brand in ascending order of alphabets successfully. ");
		}
		
		void SortBrandsAscendingAlphabeticallyThenSortPriceLowtoHigh() {
			List<Shirt> temp = new ArrayList<>(shirts);
			temp.sort(Comparator.comparing((Shirt s) -> s.brand).thenComparingDouble(s -> s.price));
			for(Shirt s:temp) {
				System.out.println(s);
			}
			System.out.println("Shirts sorted by by brands on descending order of alphabets, if brands are same then sort on price low to high successfully. ");
		}
		
		void SortBrandsDescendingAlphabeticallyThenSortPriceHighToLow() {
			List<Shirt> temp = new ArrayList<>(shirts);
			temp.sort(Comparator.comparing((Shirt s) -> s.brand).thenComparingDouble(s -> s.price).reversed());
			for(Shirt s:temp) {
				System.out.println(s);
			}
			System.out.println("Shirts sorted by brands on descending order, if brands are same then sort on price high to low successfully.");
		}
		
		void ListAllBrands() {
			HashSet<String> brands = new HashSet<>();
			for(Shirt s:shirts ) {
				brands.add(s.brand);
			}
			System.out.println("All brands are: "+ brands);
		}
		
		void ListAllSize() {
			HashSet<Integer> size = new HashSet<>();
			for(Shirt s:shirts) {
				size.add(s.size);
			}
			System.out.println("All brands are: "+ size);
		}
		
		void ListAllColour() {
			HashSet<String> colour = new HashSet<>();
			for(Shirt s:shirts) {
				colour.add(s.color);
			}
			System.out.println("All brands are: "+ colour);
		}
		
		void CountShirtBrandPerUserInput() {
			System.out.println("Enter Brand:");
			String brand= sc.nextLine();
			Map<String, Integer> m = new HashMap<>();
			for(Shirt s:shirts) {
				if(brand.equalsIgnoreCase(brand)) {
					m.compute(s.brand, (k, v) -> v==null?1:v+1);
				}
			}
			System.out.println("All brands Shirts and their counts are: "+m );
		}
		
		void CountShirtColour() {
			System.out.println("Enter Color");
			String color=sc.nextLine();
			Map<String, Integer> m = new HashMap<>();
			for(Shirt s:shirts) {
				if(s.color.equalsIgnoreCase(color))
					m.compute(s.color, (k,v) -> v==null?1:v+1);
			}
			System.out.println("All Color Shirts and their counts are: "+m);
		}
		
		void CountShirtSize() {
			System.out.println("Enter Size");
			int size=sc.nextInt();
			Map<Integer, Integer> m = new HashMap<>();
			for(Shirt s:shirts) {
				if(s.size==size)
					m.compute(s.size, (k,v) -> v==null?1:v+1);
			}
			System.out.println("All size of Shirts and their counts are: "+m);
		}
		
		void CountShirtEachBrand() {
			Map<String, Integer> m = new HashMap<>();
			for(Shirt s:shirts) {
				m.compute(s.brand, (k,v)-> v==null?1:v+1);
			}
			System.out.println("Each Shirts brand and their counts are: "+m);
		}
		
		void CountShirtEachSize() {
			Map<Integer, Integer> m = new HashMap<>();
			for(Shirt s:shirts) {
				m.compute(s.size, (k,v)-> v==null?1:v+1);
			}
			System.out.println("Each Shirts size and their counts are: "+m);
		}
		
		void CountShirtEachColour() {
			Map<String, Integer> m = new HashMap<>();
			for(Shirt s:shirts) {
				m.compute(s.color, (k,v)-> v==null?1:v+1);
			}
			System.out.println("Each Shirts color and their counts are: "+m);
		}
		
		void RemoveShirtByBrandAndSize() {
			List<Shirt> temp = new ArrayList<>(shirts);
			System.out.println("Enter Brand:");
			String brand=sc.nextLine();
			System.out.println("Enter Size: ");
			int size=Integer.parseInt(sc.nextLine());
			boolean remove= shirts.removeIf(s-> s.brand.equalsIgnoreCase(brand) && s.size==size);
			
			if (remove) {
		        System.out.println("Shirt(s) removed successfully!");
		    } else {
		        System.out.println("No matching shirt found.");
		    }
//				
		}
		
		void FindCostliestAndCheapestShirt() {

		    if(shirts.isEmpty()) {
		        System.out.println("No shirts available");
		        return;
		    }

		    Shirt costliest = shirts.get(0);
		    Shirt cheapest = shirts.get(0);

		    for(Shirt s : shirts) {

		        if(s.price > costliest.price) {
		            costliest = s;
		        }

		        if(s.price < cheapest.price) {
		            cheapest = s;
		        }
		    }

		    System.out.println("Costliest Shirt:");
		    System.out.println(costliest);

		    System.out.println("\nCheapest Shirt:");
		    System.out.println(cheapest);
		}
		
		void GroupByBrandUsingMap() {

		    if(shirts.isEmpty()) {
		        System.out.println("No shirts available");
		        return;
		    }

		    Map<String, List<Shirt>> map = new HashMap<>();

		    for(Shirt s : shirts) {

		        if(!map.containsKey(s.brand)) {
		            map.put(s.brand, new ArrayList<>());
		        }

		        map.get(s.brand).add(s);
		    }

		    for(String brand : map.keySet()) {

		        System.out.println("\nBrand: " + brand);

		        for(Shirt shirt : map.get(brand)) {
		            System.out.println(shirt);
		        }
		    }
		}
		
		void CheckIfTwoShirtsEqual() {
			List<Shirt> temp = new ArrayList<>(shirts);
			for(int i =0;i<temp.size();i++) {
				System.out.println();
			}
		}
		
		
}
