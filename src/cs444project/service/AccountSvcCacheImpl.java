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
public class AccountSvcCacheImpl implements IAccountSvc {

    
    private static AccountSvcCacheImpl accountImpl;
    
    private List<Account> cache = new ArrayList<Account>();
    private int nextId = 0;
    
    public static synchronized AccountSvcCacheImpl getInstance() {
        if(accountImpl == null){
            accountImpl = new AccountSvcCacheImpl();
        }
        return accountImpl;
    }
    
    public Account create(Account account){
        account.setId(++nextId);
        cache.add(account);
        return account;
    }
    public Account retrieve(int id){
        Account account = new Account();
        if (id == account.getId()){
            System.out.println(account.toString());
        }
        return account;
        
    }
    public List<Account> retrieveAll(){
        return cache;
    }
    
    public Account update(Account account) {
        for(int i = 0; i < cache.size(); i++) {
            Account next = cache.get(i);
            if (next.getId() == account.getId()) {
                cache.set(i, account);
                break;
            }
        }
        return account;
    }
    
    public Account delete(Account account) {
        for (int i = 0; i <cache.size(); i++) {
            Account next = cache.get(i);
            if (next.getId() == account.getId()) {
                cache.remove(i);
                break;
            }
                    
        }
        return account;
    }
    
    public Account authenticate(Login login){
        Account account = null;
        for(int i=0; i<cache.size(); i++){
            account = cache.get(i);
            Login accountLogin = account.getLogin();
            if(login.equals(accountLogin)) return account;
        }
        return null;
    }
}
