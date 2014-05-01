/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package library;


/**
 * Super class used to store information on library materials
 * Concept #1: Enscapulation/Data Hiding
 * @author Tommy Yang
 */
public abstract class LibraryMaterial {
    
    private String bookAuthor;
    private String bookTitle;
    private double bookPrice;
    private int publicationYear;
    
    /**
     * Default Constructor
     */
    public LibraryMaterial() {
    }
    
    /**
     * Concept #2: Non-Default Constructor
     * 
     * @param author The author of the library item
     * @param title The title of the library item
     * @param price The price of the library item
     * @param year The year of publication of the library item
     */
    public LibraryMaterial(String author, String title, double price, int year) {
        bookAuthor = author;
        bookTitle = title;
        bookPrice = price;
        publicationYear = year;
    }
    
    /**
     * Gets the author of the item
     * @return Author of the library item
     */
    public String getAuthor() {
        return bookAuthor;
    }
    
    /**
     * Gets the title of the item
     * @return Title of library item
     */
    public String getTitle() {
        return bookTitle;
    }
    
    /**
     * Gets the price of the item
     * @return Price of library item
     */
    public double getPrice() {
        return bookPrice;
    }
    
    /**
     * Gets the year released/published
     * @return Publication Year of library item
     */
    public int getYear() {
        return publicationYear;
    }
    
    /**
     * Sets the author/artist/studio
     * @param author
     */
    public void setAuthor(String author) {
        bookAuthor = author;
    }
    
    /**
     * Sets the title of the item
     * @param title
     */
    public void setTitle(String title) {
        bookTitle = title;
    }
    
    /**
     * Sets the year published/released of item
     * @param year
     */
    public void setYear(int year) {
        publicationYear = year;
    }
    
    /**
     * Sets price of item
     * @param price
     */
    public void setPrice(double price) {
        bookPrice = price;
    }
    
    /**
     * Abstract method for String of displayed information overridden by subclasses
     * @return String of information
     */
    public abstract String displayInfo();
    
}
