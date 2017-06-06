/**
 * Book class is a definition for BookApp class which only has main method 
 * It helps to instantiate any book object and pricing the book if it is in stock
 * @author Henok Berhe
 *
 */
public class Book {
	
	 private String title;
	 private String author;
	 private double price;
	 private String description;
	 private String isInStock;
	 
	 
	 public Book()
	 { 
		 this.title=null;
		 this.author=null;
		 this.description=null;
		 this.price=0.0;
		 this.isInStock="";
	 }
	 
	public Book(String title, String author, String description,String string) {
		super();
		this.title = title;
		this.author = author;
		this.description = description;
		this.isInStock=string;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getIsInStock() {
		return isInStock;
	}
	public void setIsInStock(String isInStock) {
		this.isInStock = isInStock;
	}
	public String getPrice(int numberOrdered)
	{   String Total="";
		if(this.isInStock.equalsIgnoreCase("instock"))
		{
		double tot=numberOrdered*getPrice();
		 Total = Double.toString(tot);
		}
		else {
			Total= "The book you ordered is out of Stock!";
		}
		return Total;
	}
	public void getDisplayText()
	{ 
	System.out.println("The Book title is:"+" "+getTitle()+"\n"+"The Author is:"+" "+getAuthor()+"\n"
			+"Description:"+" "+getDescription());	
    }

}
