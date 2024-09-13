/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;

/**
 *
 * @author reseg
 */
public class Lasagna {

    //TODO: define the 'expectedMinutesInOven()' method

    public int expectedMinutesInOven(){
        int min = 40;

        return min;
    }
    //TODO: define the 'remainingMinutesInOven()' method
    
    public int remainingMinutesInOven(int actualMin){
        int min = 40;
        int minRemaining = min - actualMin;

        return minRemaining;
    }

    //TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers){
        int layerMinutes = 2;
        int minSpent = layers * layerMinutes;

        return minSpent;
    }

    //TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int actualMin){
        int layerMinutes = 2;
        int totalMins =  (layers * layerMinutes) + actualMin;

        return totalMins;
    }

    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();

        System.out.println("Time in oven: " + lasagna.expectedMinutesInOven());
        System.out.println("Remaining time: " + lasagna.remainingMinutesInOven(30));
        System.out.println("Preparation time: " + lasagna.preparationTimeInMinutes(2));
        System.out.println("Total time in oven: " + lasagna.totalTimeInMinutes(3, 20));
    }
}
