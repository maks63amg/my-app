package com.example.app.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WeaponDTO {
    @JsonProperty("id")
    private Long id;
    @NotNull
    @JsonProperty("name")
    private String name;
    @NotNull
    @JsonProperty("calibre")
    private double calibre;
    @NotNull
    @JsonProperty("countRound")
    private int countRound;
}
