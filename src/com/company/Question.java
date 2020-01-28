package com.company;

import java.util.ArrayList;

/*
Encompasses all question types.
@ param String question - The text of the question being asked
@ param boolean isCorrect - True if the user answers correctly. Defaults to false
@ param ArrayList<AnswerOption> options - Each of these objects contains a char for the input choice, a string with an
    answer, and a boolean which is true if it is the correct answer

If I were to spend more time on this, I'd move the runQuestion method to this class (it is identical in all classes) and
    I would include an addOption method to more easily add choices to the questions
 */
public abstract class Question {
    private String question;
    public boolean isCorrect;
    public ArrayList<AnswerOption> options;

    public Question (String question, ArrayList<AnswerOption> options) {
        this.question = question;
        this.isCorrect = false;
        this.options = options;
    }

    public String getQuestion () {
        return question;
    }

    public boolean getIsCorrect () {
        return isCorrect;
    }

    public ArrayList<AnswerOption> getOptions() {
        return options;
    }

    public void setIsCorrect (boolean isCorrect) {
        this.isCorrect = isCorrect;
    }

    // All subclasses have a method for asking the user for input, and verifying answer
    public abstract boolean checkAnswer ();

    // Displays the question and choices, then runs checkAnswer. If answer is correct, sets isCorrect to true
    public abstract void runQuestion();
}
