package com.elleined.games_api.roullete;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class RoulleteDTO {
    private final int noOfModels;
    private final int noOfWheels;
    private final int modelToBeGuessed;

    private final List<Integer> combination;
    private final int matchCount;
}
