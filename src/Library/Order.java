package Library;

public class Order {
	
	private Book book;
	private User user;
	private double price;
	private int quantity;
	
	public Order(Book book, User user, double price, int quantity) {
		this.book = book;
		this.user = user;
		this.price = price;
		this.quantity = quantity;
	}

	public Order() {}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String toString() {
		return "Book name: "+book.getName()+"\n"+
				"Username: "+user.getName()+"\n"+
				"Price: "+String.valueOf(price)+"\n"+
				"Quantity: "+String.valueOf(quantity);
	}
	
	public String toString2() {
		return book.getName()+"<N/>"+user.getName()+"<N/>"+String.valueOf(price)+"<N/>"+
				String.valueOf(quantity);
	}

}
