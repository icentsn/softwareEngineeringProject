/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs444project.service;

import cs444project.domain.*;
import java.util.*;

/**
 *
 * @author icentsn
 */
public interface IAccountSvc {
    public Account create(Account account);
    public Account retrieve(int id);
    public List<Account> retrieveAll();
    public Account update(Account account);
    public Account delete(Account acccount);
    public Account authenticate(Login login);
    
}
