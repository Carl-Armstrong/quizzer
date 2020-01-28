package com.company;

import java.util.ArrayList;

/*
This class holds a list of question object in a single object and hold a method for iterating through all the questions
@ param ArrayList<Questions> questions - a list of all question objects in the quiz
 */
public class Quiz {
    private ArrayList<Question> questions;

    public Quiz () {
        questions = new ArrayList<Question>();
    }

    // a method for adding questions to the quiz
    public void addQuestion (Question newQuestion) {
        questions.add(newQuestion);
    }

    // a method for iterating through all question in the quiz
    public void runQuiz() {
        for (Question question: questions
             ) {
            question.runQuestion();
        }
        System.out.println("\nYou got " + getScore() + " out of " + questions.size() +
        "\n score: " + ((getScore()/questions.size()) * 100) + "%");
    }

    // a method for giving the overall score to the user
    public double getScore() {
        double totalCorrectQuestion = 0;
        for (Question question: questions
             ) {
            if (question.getIsCorrect()) {
                totalCorrectQuestion++;
            }
        }
        return totalCorrectQuestion;
    }
}
