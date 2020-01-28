package com.company;

/*
This class provides a way of easily adding choices to questions
@ param char optionChoice - a single char which will be verified against user input
@ String optionText - the text of the potential answer
@ boolean isCorrectAnswer - true if this option is correct, false if incorrect
 */
public class AnswerOption {
    private char optionChoice;
    private String optionText;
    private boolean isCorrectAnswer;

    public AnswerOption (char optionChoice, String optionText, boolean isCorrectAnswer) {
        this.optionChoice = optionChoice;
        this.optionText = optionText;
        this.isCorrectAnswer = isCorrectAnswer;
    }

    public char getOptionChoice () {
        return optionChoice;
    }

    public String getOptionText() {
        return optionText;
    }

    public boolean getIsCorrectAnswer() {
        return isCorrectAnswer;
    }
}
