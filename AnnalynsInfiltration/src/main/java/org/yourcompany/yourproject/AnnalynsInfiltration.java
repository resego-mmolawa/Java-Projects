/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;

/**
 *
 * @author reseg
 */
public class AnnalynsInfiltration {

    public static boolean canFastAttack(boolean knightIsAwake){
        if(!knightIsAwake){
            return true;
        } else {
            return false;
        }
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake){
        if (knightIsAwake || archerIsAwake || prisonerIsAwake){
            return true;
        } else {
            return false;
        }
    }

    public static boolean canSignalPrisoner(boolean prisonerIsAwake, boolean archerIsAwake){
        if (prisonerIsAwake && !archerIsAwake){
            return true;
        } else if (!prisonerIsAwake && !archerIsAwake){
            return false;
        } else if (!prisonerIsAwake && archerIsAwake){
            return  false;
        } else {
            return false;
        }
    }

    public static boolean canFreePrisoner(boolean prisonerIsAwake, boolean archerIsAwake, boolean knightIsAwake, boolean dogIsPresent){
        return (dogIsPresent && !archerIsAwake) || (prisonerIsAwake && !knightIsAwake && !archerIsAwake);
    }

    public static void main(String[] args) {
        boolean knightIsAwake = true;
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = false;
        boolean dogIsPresent = true;

        System.out.println("Can spy: " + AnnalynsInfiltration.canFreePrisoner(prisonerIsAwake, archerIsAwake, knightIsAwake, dogIsPresent));
    }
}
