package eg2;

public class Product {
	
	private int id; // initial variable
	private String name; // initial variable
	private int rating; // initial variable
	private double cost; // initial variable
	private String description; // New variable added
	private String location; // New variable added
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
		
	public Product(int id, String name, int rating, double cost) 
		{
		this.id = id;
		this.name = name;
		this.rating = rating;
		this.cost = cost;
		}

	public Product(int id, String name, int rating, double cost, String description, String location) {
		this(id,name,rating,cost);
		this.description = description;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Product [id = " + id + ", name = " + name + ", rating (1-10) = " + rating + ", cost = " + cost + ", description = "
				+ description + ", location = " + location + "]";

	}
}
