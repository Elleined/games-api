package com.elleined.games_api.roullete;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Getter
public class RoulleteService {
    private final int noOfModels;
    private final int noOfWheels;

    private final SecureRandom secureRandom = new SecureRandom();

    public RoulleteService(final int noOfModels,
                           final int noOfWheels) {

        this.noOfModels = noOfModels;
        this.noOfWheels = noOfWheels;
    }

    public RoulleteDTO roll(final int modelToBeGuessed) {
        final List<Integer> combination = new ArrayList<>();
        for (int i = 0; i < noOfWheels; i++) {
            int generatedNumber = secureRandom.nextInt(1, noOfModels);
            combination.add(generatedNumber);
        }
        int matchCount = this.getTotalMatches(combination, modelToBeGuessed);

        log.debug("Roll combination {}", combination);
        log.debug("There are {} match count for model to be guessed which is {}", matchCount, modelToBeGuessed);

        return RoulleteDTO.builder()
                .noOfModels(noOfModels)
                .noOfWheels(noOfWheels)
                .modelToBeGuessed(modelToBeGuessed)
                .combination(combination)
                .matchCount(matchCount)
                .build();
    }

    private int getTotalMatches(final List<Integer> combination, final int modelToBeGuessed) {
        return (int) combination.stream()
                .filter(generatedNumber -> generatedNumber == modelToBeGuessed)
                .count();
    }
}
