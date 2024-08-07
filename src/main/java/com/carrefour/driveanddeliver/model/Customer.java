package com.carrefour.driveanddeliver.model;

import com.carrefour.driveanddeliver.enums.DeliveryMethod;
import com.carrefour.driveanddeliver.enums.TimeSlot;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {
    private Long customerId;
    private DeliveryMethod deliveryMethod;
    private TimeSlot timeSlot;

}