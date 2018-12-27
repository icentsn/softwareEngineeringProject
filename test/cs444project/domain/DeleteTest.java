/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs444project.domain;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author icentsn
 */
public class DeleteTest {
    
    public DeleteTest() {
    }

    @Test
    public void testValidate() {
        Delete book = new Delete();
        boolean result = book.validate();
        assertFalse(result);
        book.setTitle("Effective Java");
        result = book.validate();
        assertFalse(result);
        book.setCategory("Doe");
        result = book.validate();
        assertFalse(result);
        book.setEdition("Third Edition");
        result = book.validate();
        assertFalse(result);
        book.setRating("4");
        result = book.validate();
        assertTrue(result);
    }
}
