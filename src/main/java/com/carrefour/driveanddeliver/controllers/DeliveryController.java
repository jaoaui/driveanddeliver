package com.carrefour.driveanddeliver.controllers;

import com.carrefour.driveanddeliver.enums.DeliveryMethod;
import com.carrefour.driveanddeliver.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/delivery")
public class DeliveryController {

    private final DeliveryService deliveryService;

    @Autowired
    public DeliveryController(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    @GetMapping("/methods")
    public List<DeliveryMethod> getDeliveryMethods() {
        return deliveryService.getDeliveryMethods();
    }

     @PostMapping("/choose")
     public DeliveryMethod chooseDeliveryMethod(@RequestBody DeliveryMethod deliveryMethod) {
         return deliveryService.chooseDeliveryMethod(deliveryMethod);
     }

}