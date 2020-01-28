package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class MultipleChoice extends Question {


    public MultipleChoice(String question, ArrayList<AnswerOption> options) {
        super(question, options);
        this.isCorrect = false;
    }

    public void runQuestion() {
        // print question and choices
        System.out.println("\n" + getQuestion());
        for (AnswerOption option: options
             ) {
            System.out.println(option.getOptionChoice() + ") " + option.getOptionText());
        }
        // check answer
        setIsCorrect(checkAnswer());
        if(isCorrect) {
            System.out.println("Correct!");
        } else {
            System.out.println("Sorry. That is incorrect.");
        }
    }

    public boolean checkAnswer() {
        char correctAnswer = ' ';
        char userInput;

        // finds the correct answer in the ArrayList
        // known flaw: does not verify that only one option is marked true. If multiple, only the last true option is correct
        for (AnswerOption option: options
             ) {
            if (option.getIsCorrectAnswer()) {
                correctAnswer = option.getOptionChoice();
            }
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your choice:");
        userInput = input.next().charAt(0);

        return (userInput == correctAnswer);
    }
}
