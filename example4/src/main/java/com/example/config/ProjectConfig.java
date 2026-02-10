package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {
    @Bean("ferarriVehicle")
    Vehicle vehicle1() {
        var veh = new Vehicle();
        veh.setName("Ferarri");
        return veh;
    }

    @Bean("kiaVehicle")
    Vehicle vehicle2() {
        var veh = new Vehicle();
        veh.setName("Kia");
        return veh;
    }

    @Primary
    @Bean("audiVehicle")
    Vehicle vehicle3() {
        var veh = new Vehicle();
        veh.setName("Audi");
        return veh;
    }
}
