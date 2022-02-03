package com.example.app.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarDTO {
    @JsonProperty("id")
    private Long id;
    @NotNull
    @JsonProperty("name")
    private String name;
    @NotNull
    @JsonProperty("fuelConsumption")
    private int fuelConsumption;
    @NotNull
    @JsonProperty("isWorking")
    private boolean isWorking;
}
