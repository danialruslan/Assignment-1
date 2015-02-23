
public class ProductSearch {
	static String[] initProductNames(){
		String products[] = new String[4];
		products[0] = "Food";
		products[1] = "Clothes";
		products[2] = "Stationaries";
		products[3] = "Tablet";
		
		return products;
	}
	
	static boolean isPresent(String[] productNames, String keyword){
		boolean isPresent = false;
		for (String string : productNames){
			if(string.equalsIgnoreCase(keyword))
				isPresent = true;
		}
		return isPresent;
	}
		public static void main(String[] args){
			String products[] = initProductNames();
			boolean isProductAvailable = isPresent(products, "clothes");
			if(isProductAvailable){
				System.out.println("Product is available");
			}
			
			else {
				System.out.println("Product is unavailable");
			}
		}
	}