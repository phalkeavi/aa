package com.company;

import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
        System.out.println("Welcome to the Customer Support Chatbot!");

        // Initialize the scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Start the conversation
        System.out.println("How can I assist you today?");

        // Chatbot loop
        while (true) {
            String userInput = scanner.nextLine();

            // Check user input and provide appropriate response
            String response = getResponse(userInput);
            System.out.println(response);

            // Check if the conversation is over
            if (isConversationOver(userInput)) {
                break;
            }
        }

        // Close the scanner
        scanner.close();
    }

    private static String getResponse(String userInput) {
        String response;

        // Process user input and generate response
        if (userInput.contains("order")) {
            response = "Please provide your order number so that we can assist you further.";
        } else if (userInput.contains("refund")) {
            response = "To request a refund, please visit our website and fill out the refund form.";
        } else if (userInput.contains("shipping")) {
            response = "Our standard shipping time is 3-5 business days.";
        } else if (userInput.contains("discount")) {
            response = "We have ongoing discounts on selected items. Please check our website for more details.";
        } else {
            response = "I'm sorry, I didn't understand. Could you please rephrase your question?";
        }

        return response;
    }

    private static boolean isConversationOver(String userInput) {
        // Check if the user wants to end the conversation
        return userInput.equalsIgnoreCase("bye") || userInput.equalsIgnoreCase("goodbye");
    }
}
