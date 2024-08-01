package com.carrefour.driveanddeliver.service.impl;

import com.carrefour.driveanddeliver.enums.DeliveryMethod;
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
        DeliveryMethod method = deliveryService.chooseDeliveryMethod(DeliveryMethod.DRIVE);
        assertNotNull(method);
        assertEquals(DeliveryMethod.DRIVE, method);
    }

}