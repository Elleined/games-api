package com.elleined.games_api.roullete;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class RoulleteServiceTest {

    @Test
    void roll() {
        // Pre defined values
        RoulleteService roulleteService = new RoulleteService(10, 6);

        // Expected Value

        // Mock data

        // Set up method

        // Stubbing methods

        // Calling the method
        RoulleteDTO roulleteDTO = roulleteService.roll(3);
        System.out.println(roulleteDTO);
        // Behavior Verifications

        // Assertions
    }
}