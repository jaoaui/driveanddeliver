package com.carrefour.driveanddeliver.service;

import com.carrefour.driveanddeliver.enums.DeliveryMethod;
import com.carrefour.driveanddeliver.enums.TimeSlot;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface DeliveryService {

    List<DeliveryMethod> getDeliveryMethods();

    // choose delivery method
    DeliveryMethod chooseDeliveryMethod(Long customerId, DeliveryMethod deliveryMethod);

    // choose time slot
    TimeSlot chooseTimeSlot(Long customerId, TimeSlot timeSlot);

}

