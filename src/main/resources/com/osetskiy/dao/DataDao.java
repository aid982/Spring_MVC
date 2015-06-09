/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.osetskiy.dao;

import com.osetskiy.model.Merchandise;
import java.util.List;

/**
 *
 * @author Osetskiy
 */
public interface DataDao {
     public List<Merchandise> getList();
     public Merchandise getMerchandiseById(String id);  
     public byte[] getImage(String id);
     
}
