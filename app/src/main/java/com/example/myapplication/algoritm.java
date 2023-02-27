package com.example.myapplication;

public class algoritm {
    private static final float SPEED_OF_LIGHT = 0;

    public long absoluteEnergyCalculation(String input) {


        if (input.contains(",")) {

            String inputMod = input.replace(",", ".");


            float inputFloat = Float.parseFloat(inputMod);


            return (long) (inputFloat * SPEED_OF_LIGHT * SPEED_OF_LIGHT);

        } else {

            float inputFloat = Float.parseFloat(input);


            return (long) (inputFloat * SPEED_OF_LIGHT * SPEED_OF_LIGHT);
        }
    }

}
