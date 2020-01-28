package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Checkbox extends Question {

    public Checkbox(String question, ArrayList<AnswerOption> options) {
        super(question, options);
        this.isCorrect = false;
    }

    public void runQuestion() {
        System.out.println("\n" + getQuestion());
        for (AnswerOption option: options
        ) {
            System.out.println(option.getOptionChoice() + ") " + option.getOptionText());
        }
        setIsCorrect(checkAnswer());
        if(isCorrect) {
            System.out.println("Correct!");
        } else {
            System.out.println("Sorry. That is incorrect.");
        }
    }

    public boolean checkAnswer() {
        String userInput = "";
        ArrayList<String> correctAnswers = new ArrayList<>();

        // create a list of only correct options
        for (AnswerOption option: options
             ) {
            if (option.getIsCorrectAnswer()) {
                correctAnswers.add(String.valueOf(option.getOptionChoice()));
            }
        }

        // get input until user enters '0'
        Scanner input = new Scanner(System.in);
        while (correctAnswers.size() != 0) {
            System.out.println("Enter your choice. Prompts will continue until you have chosen all correct answers.");
            userInput = input.next();

            // if the answer they give is on the list, remove that answer from the list
            if (correctAnswers.contains(userInput)) {
                correctAnswers.remove(new String(userInput));
            } else {
                // if any answer is incorrect, the user is automatically kicked out of the question
                return false;
            }
        }

        // if user reaches this point, they have chosen all the correct answers and only the correct answers
        // one error here is that if they select the same correct answer twice, they will be marked wrong
        return true;
    }
}
