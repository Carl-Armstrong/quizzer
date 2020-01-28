package com.company;

import java.util.ArrayList;

public class QuizRunner {
    public static void main (String[] args) {
        AnswerOption first = new AnswerOption('a', "blue", true);
        AnswerOption second = new AnswerOption('b', "green", false);
        AnswerOption third = new AnswerOption('c', "teal", false);
        AnswerOption fourth = new AnswerOption('d', "banana", false);
        ArrayList<AnswerOption> question1Choices = new ArrayList<>();
        question1Choices.add(first);
        question1Choices.add(second);
        question1Choices.add(third);
        question1Choices.add(fourth);

        MultipleChoice question1 = new MultipleChoice("What is your favorite color?", question1Choices);

        AnswerOption q2A1 = new AnswerOption('a', " Over There", false);
        AnswerOption q2A2 = new AnswerOption('b', "Dantooine", true);
        AnswerOption q2A3 = new AnswerOption('c', "Alderan", false);
        AnswerOption q2A4 = new AnswerOption('d', "Uranus", false);
        ArrayList<AnswerOption> question2Choices = new ArrayList<>();
        question2Choices.add(q2A1);
        question2Choices.add(q2A2);
        question2Choices.add(q2A3);
        question2Choices.add(q2A4);


        MultipleChoice question2 = new MultipleChoice("Where is the rebel base?", question2Choices);

        AnswerOption q3A1 = new AnswerOption('a', "Doctor Who", true);
        AnswerOption q3A2 = new AnswerOption('b', "Star Wars", true);
        AnswerOption q3A3 = new AnswerOption('c', "Star Trek", false);
        AnswerOption q3A4 = new AnswerOption('d', "My Little Pony", true);
        ArrayList<AnswerOption> question3Choices = new ArrayList<>();
        question3Choices.add(q3A1);
        question3Choices.add(q3A2);
        question3Choices.add(q3A3);
        question3Choices.add(q3A4);

        Checkbox question3 = new Checkbox("Name some franchises that have gone on too long", question3Choices);

        AnswerOption q4A1 = new AnswerOption('a', "Pepperoni", true);
        AnswerOption q4A2 = new AnswerOption('b', "Bacon", true);
        AnswerOption q4A3 = new AnswerOption('c', "Mushrooms", false);
        AnswerOption q4A4 = new AnswerOption('d', "Spinach", false);
        ArrayList<AnswerOption> question4Choices = new ArrayList<>();
        question4Choices.add(q4A1);
        question4Choices.add(q4A2);
        question4Choices.add(q4A3);
        question4Choices.add(q4A4);

        Checkbox question4 = new Checkbox("Which of the following are good pizza toppings", question4Choices);

        AnswerOption q5True = new AnswerOption('t', "True", true);
        AnswerOption q5False = new AnswerOption('f', "False", false);
        ArrayList<AnswerOption> question5Choices = new ArrayList<>();
        question5Choices.add(q5True);
        question5Choices.add(q5False);

        // I opted not to make a TrueFalse class because the MultipleChoice class handles this case perfectly. It's multiple choice of two potential answers.
        MultipleChoice question5 = new MultipleChoice("True or false: I spent way too much time figuring this studio out", question5Choices);

        AnswerOption q6True = new AnswerOption('t', "True", false);
        AnswerOption q6False = new AnswerOption('f', "False", true);
        ArrayList<AnswerOption> question6Choices = new ArrayList<>();
        question6Choices.add(q6True);
        question6Choices.add(q6False);

        MultipleChoice question6 = new MultipleChoice("True or False: I get enough sleep", question6Choices);

        Quiz test1 = new Quiz();
        test1.addQuestion(question1);
        test1.addQuestion(question2);
        test1.addQuestion(question3);
        test1.addQuestion(question4);
        test1.addQuestion(question5);
        test1.addQuestion(question6);

        test1.runQuiz();
    }
}
