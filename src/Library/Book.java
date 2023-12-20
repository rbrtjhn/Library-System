package Library;

public class Book {
	
	private String name;		//title
	private String author;		//author
	private String publisher;	//publisher
	private String status;		//Borrowing Status
	private int quantity;		//Copies for sale
	private double price;		//Price
	private int brwcopies;		//Copies for borrowing
	
	public Book() {};
	
	public Book(String name, String author, String publisher,
			, int qty, double price, int brwcopies) {
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
		this.price = price;
		this.brwcopies = brwcopies;
	}
	
	public String toString() {
		String text = "Book Name: " + name+"\n"+
				"Book Author: " + author+"\n"+
				"Book Publisher: " + publisher+"\n"+
				"Qty: " + String.valueOf(quantity)+"\n"+
				"Price: " + String.valueOf(price)+"\n"+
				"Borrowing Copies: " + String.valueOf(brwcopies);
		return text;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity= quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getBrwcopies() {
		return brwcopies;
	}

	public void setBrwcopies(int brwcopies) {
		this.brwcopies = brwcopies;
	}
	
	public String toString2() {
		String text = name+"<N/>"+author+"<N/>"+publisher+"<N/>"+"<N/>"+String.valueOf(quantity)+
				"<N/>"+String.valueOf(price)+"<N/>"+String.valueOf(brwcopies);
		return text;
	}

}
