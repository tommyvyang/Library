/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package library;

/**
 *
 * @author Tommy Yang
 */
public class LibraryMaterial {
    
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
     * 
     * @param author The author of the library item
     * @param title The title of the library item
     * @param price The price of the library item
     * @param year The year of publication of the library item
     */
    public LibraryMaterial(String author, String title, double price, int year) {
        author = bookAuthor;
        title = bookTitle;
        price = bookPrice;
        year = publicationYear;
    }
    
    /**
     * 
     * @return Author of the library item
     */
    public String getAuthor() {
        return bookAuthor;
    }
    
    /**
     * 
     * @return Title of library item
     */
    public String getTitle() {
        return bookTitle;
    }
    
    /**
     * 
     * @return Price of library item
     */
    public double getPrice() {
        return bookPrice;
    }
    
    /**
     * 
     * @return Publication Year of library item
     */
    public int getYear() {
        return publicationYear;
    }
    
    public void displayInfo() {
        
    }
    
}
