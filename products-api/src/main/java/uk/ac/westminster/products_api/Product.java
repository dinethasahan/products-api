package uk.ac.westminster.products_api;

public class Product {
    private Long id;
    private String name;
    private double price;

    public Product() {}

    public Product(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public Long getId() { return id; }

    public String getName() { return name; }

    // Jackson uses public getter methods to access private fields when converting an object into JSON.
    // If getName() is missing, the name field will not appear in the JSON response, even though the program
    // compiles and runs without any errors.

    public double getPrice() { return price; }
}
