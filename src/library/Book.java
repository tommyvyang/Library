/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package library;

/**
 *
 * @author Tenzin Dhargye
 * Concept#3 Inheritance
 * Concept#1 Encapsulation/Data hiding
 */
public class Book extends LibraryMaterial{
    private String bookType;
    private int printEdit;
    private int numPage;
    
    
    /**
     * Default constructor
     * Concept#2 Default constructor
     */
    public Book(){
    }
    
    /**
     * Non default constructor
     * @param bType
     * @param pEdit
     * @param nPage 
     */
    public Book(String bType, int pEdit, int nPage)
    {
        bookType = bType;
        numPage = nPage;
        printEdit = pEdit;
    }
    
    /**
     * first Edition book constructor
     * @param firstEdit 
     */
    public Book(int firstEdit)
    {
        
    }

    /**
     * Gets book type
     * @return bookType
     * Concept#6 Method overriding
     */
    @Override
    public String getbkType()
    {
        return bookType;
    }
    
    /**
     * Sets book type
     * @param bkType 
     * Concept#6 Method overriding
     */
    @Override
    public void setbkType(String bkType)
    {
        bookType = bkType;
    }
    
    /**
     * Gets book edition
     * @return printEdit
     * Concept#6 Method overriding
     */
    @Override
    public int getbkEdition()
    {
        return printEdit;
        
    }
    
    /**
     * Sets book edition
     * @param bkEdition 
     * Concept#6 Method overriding
     */
    @Override
    public void setbkEdition(int bkEdition)
    {
        printEdit = bkEdition;
    }
    
    /**
     * Gets book page number
     * @return numPage
     * Concept#6 Method overriding
     */
    @Override
    public int getbkPage()
    {
        return numPage;
    }
    
    /**
     * Sets book page number
     * @param bkPage 
     * Concept#6 Method overriding
     */
    @Override
    public void setbkPage(int bkPage)
    {
        numPage = bkPage;
    }
}

