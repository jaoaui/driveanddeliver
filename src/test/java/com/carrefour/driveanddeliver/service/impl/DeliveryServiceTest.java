package com.carrefour.driveanddeliver.service.impl;

import com.carrefour.driveanddeliver.enums.DeliveryMethod;
import com.carrefour.driveanddeliver.enums.TimeSlot;
import com.carrefour.driveanddeliver.service.DeliveryService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DeliveryServiceTest {

    private DeliveryService deliveryService;

    @BeforeEach
    public void setUp() {
        deliveryService = new DeliveryServiceImpl();
    }

    @Test
    public void testGetDeliveryMethods() {
        List<DeliveryMethod> methods = deliveryService.getDeliveryMethods();
        assertNotNull(methods);
        assertTrue(methods.contains(DeliveryMethod.DRIVE));
        assertTrue(methods.contains(DeliveryMethod.DELIVERY));
        assertTrue(methods.contains(DeliveryMethod.DELIVERY_TODAY));
        assertTrue(methods.contains(DeliveryMethod.DELIVERY_ASAP));
    }

    @Test
    public void testChooseDeliveryMethod() {
        Long customerId = 1L;
        DeliveryMethod chosenMethod = deliveryService.chooseDeliveryMethod(customerId, DeliveryMethod.DELIVERY);
        assertNotNull(chosenMethod);
        assertEquals(DeliveryMethod.DELIVERY, chosenMethod);
    }

    @Test
    public void testChooseTimeSlot() {
        Long customerId = 1L;
        TimeSlot chosenTimeSlot = deliveryService.chooseTimeSlot(customerId, TimeSlot.NINE_AM);
        assertNotNull(chosenTimeSlot);
        assertEquals(TimeSlot.NINE_AM, chosenTimeSlot);
    }
}