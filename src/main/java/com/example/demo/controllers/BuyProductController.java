package com.example.demo.controllers;

import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.service.PartService;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BuyProductController {

    @Autowired
    private ApplicationContext context;

    @GetMapping("/buyProduct")
    public String buyProduct(@RequestParam("productID") int theId, Model theModel) {
        ProductService productService = context.getBean(ProductServiceImpl.class);
        Product product2 = productService.findById(theId);
        theModel.addAttribute("product", product2.getName());
        int startInv = product2.getInv();

        if (product2.getInv() <= 0) {
            return "zeroerror";
        }
        else {
            product2.setInv(product2.getInv() - 1);
            productService.save(product2);
        }

        if (product2.getInv() == startInv - 1) {
            return "confirmationpurchaseproduct";
        }
        else {
            return "purchaseerror";
        }
    }

}
