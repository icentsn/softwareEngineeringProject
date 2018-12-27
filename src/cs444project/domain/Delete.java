/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs444project.domain;

/**
 *
 * @author icentsn
 */
public class Delete {
    private String title = "";
    private String category = "";
    private String edition = "";
    private String rating = "";

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
    
    public boolean validate() {
        if(title == null || (title.equals(""))) return false;
        if(category == null || (category.equals(""))) return false;
        if(edition == null || (edition.equals(""))) return false;
        if(rating == null || (rating.equals(""))) return false;
        return true;
    }
}
