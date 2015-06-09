package com.osetskiy.contoroller;

import com.osetskiy.dao.DataDao;
import com.osetskiy.model.Merchandise;
import com.sun.org.apache.xerces.internal.util.HTTPInputSource;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class DataController {
     @Autowired
     DataDao dataDao;
     @RequestMapping("/start")
     public ModelAndView Start() {                                    
          System.out.println("sdfsd");
          List merchandisesList = dataDao.getList();          
          ModelAndView modelandview = new ModelAndView("list", "merchList",merchandisesList);          
          return modelandview;
     }
     
     @RequestMapping("/edit.html")
     public ModelAndView Edit(@RequestParam String id) {    
          
                    
          Merchandise merchandiseObj = dataDao.getMerchandiseById(id);          
          
          ModelAndView modelandview = new ModelAndView("edit", "merchandise",merchandiseObj);                    
          return modelandview;
     }
     
     @RequestMapping("/save.html")
     public void  Save() {           
          
          
     }

}
