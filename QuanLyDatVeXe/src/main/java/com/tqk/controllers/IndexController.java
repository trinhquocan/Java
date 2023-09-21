/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tqk.controllers;



import com.tqk.service.ChuyenxeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ADMIN
 */
@Controller
public class IndexController {
    @Autowired
    private ChuyenxeService ChuyenxeService;
    
    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("Chuyenxe", this.ChuyenxeService.getCX());
        return "index";
    }
}
