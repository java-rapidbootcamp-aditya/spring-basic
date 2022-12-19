package com.rapidtech.srpingdasar.cyclic;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class CyclicB {
    private CyclicC CyclicC;

}
