package com.example.app.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonDTO {
    @JsonProperty("id")
    private Long id;
    @NotNull
    @JsonProperty("name")
    private String name;
    @NotNull
    @JsonProperty("lastName")
    private String lastName;
    @NotNull
    @JsonProperty("secondName")
    private String secondName;
    @NotNull
    @JsonProperty("militaryRank")
    private String militaryRank;
    @NotNull
    @JsonProperty("position")
    private String position;
}
