package com.fastcampus.hellospringbatch.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PlayerDto {
    private String ID;
    private String lastName;
    private String firstName;
    private String position;
    private int birthYear;
    private int debutYear;
}
