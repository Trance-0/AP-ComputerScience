package Chapter2;

public class BookLibrary {

	private String name;
	private String author;
	private double price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BookLibrary() {
		this.name = "Unknown";
		this.author = "Unknown";
		this.price = 0.00;
	}

	public BookLibrary(String name, String author, double price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public String toString() {
		return "Book [name=" + name + ", author=" + author + ",price=" + price + "]";

	}

}
