package com.albert.rojas.di.factura.springboot_difactura.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;


@Component
public class Invoice {


    @Autowired
    private Client client;

    @Value("${invoice.description.office}")
    private String description;

    @Autowired
    private List<Item> items;

    


    public Invoice() {
        System.out.println("creando componente factura");
        System.out.println(client);
        System.out.println(description);
    }

    @PostConstruct
    public void init(){
        System.out.println("Creando el componente de la factura");
        System.out.println(client);
        System.out.println(description);
        client.setName(client.getName().concat("albert"));
        description = description.concat("del cliente").concat(client.getName()).concat(" ").concat(client.getLastname());
    }



    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public List<Item> getItems() {
        return items;
    }
    public void setItems(List<Item> items) {
        this.items = items;
    }

    public int getTotal(){
        int total = items.stream().map(item -> item.getImporte()).reduce(0, (sum, importe) -> sum + importe);
        return total;
    }
    
    
}
