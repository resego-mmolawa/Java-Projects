/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;

/**
 *
 * @author reseg
 */
public class Log_Levels {

    // public static String message(String errorMessage){
    //     return errorMessage.replaceAll("\\[.*\\]:\\s*", "").trim();
    // }

    // public static String logLevel(String errorMessage){
    //     String specialCharsPattern = "[^a-zA-Z0-9\\s]";
    //     errorMessage = errorMessage.replaceAll(specialCharsPattern, "");

    //     int whitespaceIndex = errorMessage.indexOf(" ");

    //     if (whitespaceIndex == -1){
    //         return errorMessage;
    //     }

    //     // errorMessage = errorMessage.substring(0, whitespaceIndex);

    //     return errorMessage.toLowerCase();
    // }

    // public static String reformat(String errorMessage){
    //     int whitespace = errorMessage.indexOf(" ");
    //     int lastChar = errorMessage.length();

    //     if(whitespace == -1){
    //         return errorMessage;
    //     }

    //     String subErrorMessage = errorMessage.substring(0, whitespace);

    //     String SecErrorMessage = errorMessage.substring(whitespace,lastChar);

    //     String noSqBrackets = subErrorMessage.replaceAll("\\[|\\]:\\s*", "");

    //     errorMessage = noSqBrackets;

    //     return SecErrorMessage + " " + "(" + errorMessage.toLowerCase() + ")";
    // }

    // public static void main(String[] args) {
    //     System.out.println(Log_Levels.reformat("[INFO]: Operation Completed"));
    //     System.out.println(Log_Levels.reformat("[WARNING]: Disk almost full"));
    // }

    public static String message(String errorMessage) {
        // Extract the message from the log line by removing the log level and colon
        return errorMessage.replaceAll("\\[.*\\]:\\s*", "").trim();
    }

    public static String logLevel(String errorMessage) {
        // Extract log level and remove special characters, returning it in lowercase
        String logLevel = errorMessage.substring(errorMessage.indexOf('[') + 1, errorMessage.indexOf(']'));
        return logLevel.toLowerCase();
    }

    public static String reformat(String errorMessage) {
        // Extract the message and log level separately
        String message = message(errorMessage); // Use the message extraction method
        String logLevel = logLevel(errorMessage); // Use the log level extraction method

        // Reformat as required: "message (logLevel)"
        return message + " (" + logLevel + ")";
    }

    public static void main(String[] args) {
        System.out.println(Log_Levels.reformat("[INFO]: Operation completed"));
        // Output: "Operation completed (info)"
        System.out.println(Log_Levels.reformat("[WARNING]: Disk almost full"));
        // Output: "Disk almost full (warning)"
    }
}
