/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.osetskiy.contoroller;

import com.osetskiy.dao.DataDao;
import com.osetskiy.model.Merchandise;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author osetskiy
 */
@Controller
@RequestMapping("/images")
public class ImageConroller {

     @Autowired
     DataDao dataDao;

     @RequestMapping(value = "/display", method = RequestMethod.GET)
     public void showImage(@RequestParam("id") String id, HttpServletResponse response, HttpServletRequest request)
               throws ServletException, IOException {
          Merchandise merchandiseObj = dataDao.getMerchandiseById(id);
          response.setContentType("image/jpeg, image/jpg, image/png, image/gif");
          response.getOutputStream().write(merchandiseObj.getImage());
          response.getOutputStream().close();
     }
}
