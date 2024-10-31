/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;

/**
 *
 * @author reseg
 */
public class SqueakyClean {

    public static String clean(String input){
        String oldChar = " ";
        String newChar = "_";
        String noUS = input.replace(oldChar, newChar);
        return noUS;
    }

    public static void main(String[] args) {
        System.out.println(clean("my   Id"));
    }
}
