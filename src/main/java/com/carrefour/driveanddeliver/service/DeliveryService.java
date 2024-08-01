package com.carrefour.driveanddeliver.service;

import com.carrefour.driveanddeliver.enums.DeliveryMethod;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface DeliveryService {

    List<DeliveryMethod> getDeliveryMethods();

    // choose delivery method
    DeliveryMethod chooseDeliveryMethod(DeliveryMethod deliveryMethod);

}

