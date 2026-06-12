package CollectionFramework.project;

public class Shirt {

		String brand;
		String color;
		double price;
		int size;
		
		Shirt(){
			
		}
		
		Shirt(String brand, String color, double price, int size){
			this.brand=brand;
			this.color=color;
			this.price=price;
			this.size=size;
		}
		
		public String toString() {
			return "Brand: "+this.brand+"\tColor:"+this.color+"\tPrice: "+this.price+"\tSize: "+this.size;
		}
}
