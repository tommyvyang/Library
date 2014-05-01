/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package library;

import javax.swing.Icon;

/**
 *
 * @author Tenzin Dhargye
 * Concept #8: Polymorphism
 * Concept #3: Inheritance
 * Concept #1: Encapsulation/Data hiding
 */
public class Book extends LibraryMaterial{
    private String bookType;
    private int printEdit;
    private String printEdition;
    private int numPage;
    private Icon bookCover;
    
    
    /**
     * Default constructor
     * Concept#2 Default constructor
     */
    public Book(){
    }
    
    /**
     * Non default constructor
     * Concept #5: Super reference
     * 
     * @param author Author
     * @param title Title
     * @param price Price
     * @param year Year published
     * @param bType Book type
     * @param pEdit Print edition
     * @param nPage Number of pages
     */
    public Book(String author, String title, double price, int year, String bType, int pEdit, int nPage)
    {
        
        super (author, title, price, year);
        bookType = bType;
        numPage = nPage;
        printEdit = pEdit;
    }
    
    /**
     * first Edition book constructor
     * @param author
     * @param title
     * @param price
     * @param year
     * @param firstEdit 
     */
    public Book(String author, String title, double price, int year, int firstEdit)
    {
        super (author, title, price, year);
        printEdit = firstEdit;
    }

    /**
     * Gets book type
     * @return bookType
     */
        public String getbkType()
    {
        return bookType;
    }
    
    /**
     * Sets book type
     * @param bkType 
     */
        public void setbkType(String bkType)
    {
        bookType = bkType;
    }
    
    /**
     * Gets book edition
     * @return printEdit
     */
        public int getbkEdition()
    {
        return printEdit;
        
    }
    
    /**
     * Sets book edition as an int
     * @param bkEdition 
     */
        public void setbkEdition(int bkEdition)
    {
        printEdit = bkEdition;
    }
        
     /**
     * Sets book edition as a string
     * Concept #7: Method Overloading
     * 
     * @param bkEdition 
     */
        public void setbkEdition(String bkEdition)
    {
        printEdition = bkEdition;
    }
    
    /**
     * Gets book page number
     * @return numPage
     */
        public int getbkPage()
    {
        return numPage;
    }
    
    /**
     * Sets book page number
     * @param bkPage 
     */
        public void setbkPage(int bkPage)
    {
        numPage = bkPage;
    }
        
     /**
     * Displays cover. 
     * @return image of the cover
     */
    public Icon displayCover ()
    {
        return bookCover;
    }
    
    /**
     * Sets the cover image
     * @param cover the cover image
     */
    public void setCover (Icon cover)
    {
        bookCover = cover;
    }
    
    /**
     * 
     * Concept #6 Method Override
     * @return String for results
     */
    @Override
    public String displayInfo() {
        return ("Title: " + getTitle() + "\n\nAuthor: " + getAuthor() + "\n\nYear: " +  getYear() + "\n\nBook Edition: " + getbkEdition() + "\n\nBook Type: " + getbkType()+
                "\n\nPages: "+ getbkPage() +"\n\nPrice: " + getPrice());
    }
}

