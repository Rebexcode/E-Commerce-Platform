package org.example;

public class User {
    private long id;
    private String username;
    private String password;
    private ShoppingCart<Product> cart;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.cart = new ShoppingCart<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public ShoppingCart<Product> getCart() {
        return cart;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
