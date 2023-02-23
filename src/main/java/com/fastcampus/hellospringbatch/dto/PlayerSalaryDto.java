package com.fastcampus.hellospringbatch.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PlayerSalaryDto {
    private String ID;
    private String lastName;
    private String firstName;
    private String position;
    private int birthYear;
    private int debutYear;
    private int salary;

    public static PlayerSalaryDto of (PlayerDto player, int salary) {
        return PlayerSalaryDto.builder()
                .ID(player.getID())
                .lastName(player.getLastName())
                .firstName(player.getFirstName())
                .position(player.getPosition())
                .birthYear(player.getBirthYear())
                .debutYear(player.getDebutYear())
                .salary(salary)
                .build();
    }
}
