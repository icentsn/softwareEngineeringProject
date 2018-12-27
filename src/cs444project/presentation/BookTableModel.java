/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs444project.presentation;

import cs444project.domain.*;
import java.util.*;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author icentsn
 */
public class BookTableModel extends AbstractTableModel {
    
    private String [] columnNames = {"Title", "Category", "Edition", "Rating"};
    private List<Book> books = new LinkedList<Book>();
    
    public void setBooks(List<Book> books) {
        this.books = books;
    }
    
    public int getRowCount() {
        return books.size();
    }
    
    public int getColumnCount() {
        return columnNames.length;
    }
    
    public Object getValueAt(int row, int column) {
        Book book = books.get(row);
        switch(column) {
            case 0:
                return book.getTitle();
            case 1:
                return book.getCategory();
            case 2:
                return book.getEdition();
            case 3:
                return book.getRating();
        }
        return "";
    }
      
    public String getColumnName(int column){
        return columnNames[column];
    }
    
}
