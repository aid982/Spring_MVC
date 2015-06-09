/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.osetskiy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Osetskiy
 */
@Entity
@Table(name="_InfoRg262")
public class Merchandise {
     @Id 
     @Column (name="_Fld269")
     private String id;
     @Column (name="_Fld264")
     private String Name;
     @Column (name="_Fld266")
     private int price;
     @Column (name="_Fld265")
     private byte[] image;

     public byte[] getImage() {
          return image;
     }

     public void setImage(byte[] image) {
          this.image = image;
     }

     public String getId() {
          return id;
     }

     public void setId(String id) {
          this.id = id;
     }

     

     public String getName() {
          return Name;
     }

     public void setName(String Name) {
          this.Name = Name;
     }

     public int getPrice() {
          return price;
     }

     public void setPrice(int price) {
          this.price = price;
     }
     
     
}
