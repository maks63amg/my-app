package com.example.app.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoundDTO {
    @JsonProperty("id")
    private Long id;
    @NotNull
    @JsonProperty("calibre")
    private double calibre;
    @NotNull
    @JsonProperty("count")
    private int count;
}
