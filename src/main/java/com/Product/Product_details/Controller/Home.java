package com.Product.Product_details.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

@RequestMapping("/home")
public String Dispay() {
	  return " wol come to sir MKNAYI";
	   }
}
