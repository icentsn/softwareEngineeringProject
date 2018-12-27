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
public class Login {
    private String username = "";
    private String password = "";
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public boolean validate() {
        if(username == null || (username.equals(""))) return false;
        if(password == null || (password.equals(""))) return false;
        return true;
    }
    
    public boolean equals(Object obj){
        if (obj == null) return false;
        if (! (obj instanceof Login)) return false;
        Login login = (Login)obj;
        if(username == null || (username.equals(""))) return false;
        if(password == null || (password.equals(""))) return false;
        return true;
    }
}
