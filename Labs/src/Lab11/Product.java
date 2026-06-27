package Lab11;

public class Product {
    private String name;
    private String category;
    private int stock;

    
	public Product(String name, String category, int stock) {
		super();
		this.name = name;
		this.category = category;
		this.stock = stock;
	}
	


	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
	}



	public int getStock() {
		return stock;
	}



	public void setStock(int stock) {
		this.stock = stock;
	}



	public void displayInfo() {
        System.out.println("Product Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Stock: " + stock);
    }
}
