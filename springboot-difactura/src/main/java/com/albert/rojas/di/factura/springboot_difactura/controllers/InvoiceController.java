package com.albert.rojas.di.factura.springboot_difactura.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.albert.rojas.di.factura.springboot_difactura.models.Invoice;


//la ruta seria http://localhost:8080/invoices/show
@RestController
@RequestMapping("/invoices")
public class InvoiceController {


    @Autowired
    private Invoice invoice;

    @GetMapping("/show")
    public Invoice show(){
        return invoice;
    }
    
}
