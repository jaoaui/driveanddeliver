package com.carrefour.driveanddeliver.service.impl;

import com.carrefour.driveanddeliver.enums.DeliveryMethod;
import com.carrefour.driveanddeliver.enums.TimeSlot;
import com.carrefour.driveanddeliver.service.DeliveryService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class DeliveryServiceImpl implements DeliveryService {

    @Override
    public List<DeliveryMethod> getDeliveryMethods() {
        return Arrays.asList(DeliveryMethod.values());
    }

    // choose delivery method
    @Override
    public DeliveryMethod chooseDeliveryMethod(Long customerId, DeliveryMethod deliveryMethod) {
        // call service to choose delivery method

        return deliveryMethod;
    }

    // choose time slot
    @Override
    public TimeSlot chooseTimeSlot(Long customerId, TimeSlot timeSlot) {
        // call service to choose time slot

        return timeSlot;
    }


}