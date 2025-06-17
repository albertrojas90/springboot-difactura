package com.albert.rojas.di.factura.springboot_difactura;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import com.albert.rojas.di.factura.springboot_difactura.models.Item;
import com.albert.rojas.di.factura.springboot_difactura.models.Product;

@Configuration
@PropertySource(value="classpath:data.properties", encoding = "UTF-8")
public class AppConfig {


    @Bean
    List<Item> itemsInvoice(){
        Product p1 = new Product("cama", 800);
        Product p2 = new Product("Bicicleta Trek 29", 900);
        List<Item> items = Arrays.asList(new Item(p1,2), new Item(p2, 4));
        return items;

    }

    @Bean
    @Primary
    List<Item> itemsInvoiceOffice(){
        Product p1 = new Product("Monitor asus 32 pulgadas", 700);
        Product p2 = new Product("Notebook Razer", 1720);
        Product p3 = new Product("Impresora hp", 2320);
        Product p4 = new Product("Escritorio de oficina", 3120);
        List<Item> items = Arrays.asList(new Item(p1,2), new Item(p2, 4),new Item(p3, 4),new Item(p4, 4));
        return items;

    }
    
}
