/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wiseoldwill;

import com.nbcc.data.DataAccess;
import com.nbcc.entities.Person;
import com.nbcc.entities.Student;
import com.nbcc.entities.Teacher;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.*;

/**
 *
 * @author billy
 */
public class Main extends javax.swing.JFrame {

    public Student guess;
    public Teacher guess2;

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    private void guessStudent() {
        // TODO add your handling code here:
        //Declaring the guessed person as a student

        guess = new Student();

        // <editor-fold defaultstate="collapsed" desc=" PANELS FOR QUESTIONS ">       
        JPanel questionEyesPanel = new JPanel();
        JPanel questionHairColorPanel = new JPanel();
        JPanel questionHairStylePanel = new JPanel();
        JPanel questionHairLengthPanel = new JPanel();
        JPanel questionHeightPanel = new JPanel();
        JPanel questionAgePanel = new JPanel();
        JPanel questionGenderPanel = new JPanel();
        JPanel questionFreckles = new JPanel();
        JPanel questionClass = new JPanel();

// </editor-fold>
        // <editor-fold defaultstate="collapsed" desc=" JFRAMES FOR QUESTIONS ">
        //Declaring the jframes for questions
        JFrame questions1 = new JFrame("Question 1");
        JFrame questions2 = new JFrame("Question 2");
        JFrame questions3 = new JFrame("Question 3");
        JFrame questions4 = new JFrame("Question 4");
        JFrame questions5 = new JFrame("Question 5");
        JFrame questions6 = new JFrame("Question 6");
        JFrame questions7 = new JFrame("Question 7");
        JFrame questions8 = new JFrame("Question 8");
        JFrame questions9 = new JFrame("Question 9");
        //Setting up start location of jframes
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        questions1.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        questions2.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        questions3.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        questions4.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        questions5.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        questions6.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        questions7.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        questions8.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        questions9.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

        questions1.setUndecorated(true);
        questions2.setUndecorated(true);
        questions3.setUndecorated(true);
        questions4.setUndecorated(true);
        questions5.setUndecorated(true);
        questions6.setUndecorated(true);
        questions7.setUndecorated(true);
        questions8.setUndecorated(true);
        questions9.setUndecorated(true);

// </editor-fold>
        // <editor-fold defaultstate="collapsed" desc=" DECLARING AND SETTING TEXT FOR RADIO BUTTONS ">
        //Eye Color radio Buttons
        JRadioButton eyeBrown, eyeGreen, eyeBlue, eyeDk;

        eyeBrown = new JRadioButton("Brown");
        eyeGreen = new JRadioButton("Green");
        eyeBlue = new JRadioButton("Blue");
        eyeDk = new JRadioButton("I don't know");

        eyeBrown.setSelected(true);

        //Hair Color Radio Buttons
        JRadioButton hairBrown, hairBlonde, hairRed, hairOtherColor;

        hairBrown = new JRadioButton("Brown");
        hairBlonde = new JRadioButton("Blonde");
        hairRed = new JRadioButton("Red");
        hairOtherColor = new JRadioButton("Other");

        hairBrown.setSelected(true);
        //Hair Style Radio Buttons
        JRadioButton hairCurly, hairStraight, hairWavy, hairOtherStyle;

        hairCurly = new JRadioButton("Curly");
        hairStraight = new JRadioButton("Straight");
        hairWavy = new JRadioButton("Wavy");
        hairOtherStyle = new JRadioButton("Other");

        hairCurly.setSelected(true);

        //Height Radio buttons
        JRadioButton heightShorter, heightAverage, heightTall, heightOther;

        heightAverage = new JRadioButton("Average");
        heightOther = new JRadioButton("Other");
        heightShorter = new JRadioButton("Shorter");
        heightTall = new JRadioButton("Tall");

        heightAverage.setSelected(true);

        //Age Text Box
        JTextField age = new JTextField();
        age.setPreferredSize(new Dimension(200, 24));

        //Gender Radio Buttons
        JRadioButton male, female;

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");

        male.setSelected(true);

        //Hair Length Radio Buttons
        JRadioButton shortHair, mediumHair, longHair;

        shortHair = new JRadioButton("Short");
        mediumHair = new JRadioButton("Medium");
        longHair = new JRadioButton("Long");

        shortHair.setSelected(true);

        //Freckles
        JRadioButton frecklesTrue, frecklesFalse;

        frecklesFalse = new JRadioButton("No Freckles");
        frecklesTrue = new JRadioButton("Yes Freckles");

        frecklesFalse.setSelected(true);
        //Class radio buttons
        JRadioButton classA, classB, otherClass;

        classA = new JRadioButton("Class A");
        classB = new JRadioButton("Class B");
        otherClass = new JRadioButton("Other");

        classA.setSelected(true);

// </editor-fold>
        // <editor-fold defaultstate="collapsed" desc=" LABELS FOR QUESTIONS ">
        //Eye color question
        JLabel question1 = new JLabel("What color is this persons eyes?");
        questionEyesPanel.add(question1);

        //Hair color question
        JLabel question2 = new JLabel("What color is this persons hair?");
        questionHairColorPanel.add(question2);

        //Height question
        JLabel question3 = new JLabel("How tall is this person");
        questionHeightPanel.add(question3);

        //Age question
        JLabel question4 = new JLabel("How old is this person?");
        questionAgePanel.add(question4);

        //Gender question
        JLabel question5 = new JLabel("What is this persons gender");
        questionGenderPanel.add(question5);

        //Hair Length question
        JLabel question6 = new JLabel("How long is this persons hair?");
        questionHairLengthPanel.add(question6);

        //Hair Style question
        JLabel question7 = new JLabel("What is this persons hair style?");
        questionHairStylePanel.add(question7);

        //Freckles question
        JLabel question8 = new JLabel("Does this person have freckles");
        questionFreckles.add(question8);

        //Class Question
        JLabel question9 = new JLabel("What class is this person in");
        questionClass.add(question9);

// </editor-fold>
        // <editor-fold defaultstate="collapsed" desc=" BUTTON GROUPS ">
        //Creating the button groups
        ButtonGroup eyeColorGroup = new ButtonGroup();
        ButtonGroup heightButtonGroup = new ButtonGroup();
        ButtonGroup hairColorButtonGroup = new ButtonGroup();
        ButtonGroup genderButtonGroup = new ButtonGroup();
        ButtonGroup hairLengthButtonGroup = new ButtonGroup();
        ButtonGroup hairStyleButtonGroup = new ButtonGroup();
        ButtonGroup frecklesButtonGroup = new ButtonGroup();
        ButtonGroup classbuButtonGroup = new ButtonGroup();

// </editor-fold>
        // <editor-fold defaultstate="collapsed" desc=" ADDING RADIO BUTTONS TO PANELS AND BUTTON GROUPS ">
        //Adding Radio Buttons to the group and panel
        //Eye group
        eyeColorGroup.add(eyeDk);
        questionEyesPanel.add(eyeDk);

        eyeColorGroup.add(eyeGreen);
        questionEyesPanel.add(eyeGreen);

        eyeColorGroup.add(eyeBlue);
        questionEyesPanel.add(eyeBlue);

        eyeColorGroup.add(eyeBrown);
        questionEyesPanel.add(eyeBrown);

        //Hair color group
        hairColorButtonGroup.add(hairBlonde);
        questionHairColorPanel.add(hairBlonde);

        hairColorButtonGroup.add(hairBrown);
        questionHairColorPanel.add(hairBrown);

        hairColorButtonGroup.add(hairRed);
        questionHairColorPanel.add(hairRed);

        hairColorButtonGroup.add(hairOtherColor);
        questionHairColorPanel.add(hairOtherColor);

        //Height Group
        heightButtonGroup.add(heightShorter);
        questionHeightPanel.add(heightShorter);

        heightButtonGroup.add(heightAverage);
        questionHeightPanel.add(heightAverage);

        heightButtonGroup.add(heightTall);
        questionHeightPanel.add(heightTall);

        heightButtonGroup.add(heightOther);
        questionHeightPanel.add(heightOther);

        //Age (Adding it only to the panel because it's not a button)
        questionAgePanel.add(age);

        //Gender group
        genderButtonGroup.add(male);
        questionGenderPanel.add(male);

        genderButtonGroup.add(female);
        questionGenderPanel.add(female);

        //Hair length group
        hairLengthButtonGroup.add(shortHair);
        questionHairLengthPanel.add(shortHair);

        hairLengthButtonGroup.add(mediumHair);
        questionHairLengthPanel.add(mediumHair);

        hairLengthButtonGroup.add(longHair);
        questionHairLengthPanel.add(longHair);

        //Hair Style Group
        hairStyleButtonGroup.add(hairCurly);
        questionHairStylePanel.add(hairCurly);

        hairStyleButtonGroup.add(hairStraight);
        questionHairStylePanel.add(hairStraight);

        hairStyleButtonGroup.add(hairWavy);
        questionHairStylePanel.add(hairWavy);

        hairStyleButtonGroup.add(hairOtherStyle);
        questionHairStylePanel.add(hairOtherStyle);

        //Freckles Group
        frecklesButtonGroup.add(frecklesFalse);
        questionFreckles.add(frecklesFalse);

        frecklesButtonGroup.add(frecklesTrue);
        questionFreckles.add(frecklesTrue);

        //Class Group
        classbuButtonGroup.add(classA);
        questionClass.add(classA);

        classbuButtonGroup.add(classB);
        questionClass.add(classB);

        classbuButtonGroup.add(otherClass);
        questionClass.add(otherClass);

// </editor-fold>
        // <editor-fold defaultstate="collapsed" desc=" CREATING BUTTONS AND ADDING THEM TO RESPECTIVE PANELS ">
        //Creating the button to continue
        //Eye question
        JButton continue1 = new JButton("Next Question");
        continue1.setBounds(300, 100, 2, 2);

        questionEyesPanel.add(continue1);

        //Hair color question
        JButton continue2Button = new JButton("Next Question");
        continue2Button.setBounds(300, 100, 2, 2);

        questionHairColorPanel.add(continue2Button);

        //Height question
        JButton continue3Button = new JButton("Next Question");
        continue3Button.setBounds(300, 100, 2, 2);

        questionHeightPanel.add(continue3Button);

        //Age question
        JButton continue4Button = new JButton("Next Question");
        continue4Button.setBounds(300, 100, 2, 2);

        questionAgePanel.add(continue4Button);

        //Gender question
        JButton continue5Button = new JButton("Next Question");
        continue5Button.setBounds(300, 100, 2, 2);

        questionGenderPanel.add(continue5Button);

        //Hair length question
        JButton continue6Button = new JButton("Next Question");
        continue6Button.setBounds(300, 100, 2, 2);

        questionHairLengthPanel.add(continue6Button);

        //Hair style question
        JButton continue7Button = new JButton("Next Question");
        continue7Button.setBounds(300, 100, 2, 2);

        questionHairStylePanel.add(continue7Button);

        //Freckles question
        JButton continue8Button = new JButton("Next Question");
        continue8Button.setBounds(300, 100, 2, 2);

        questionFreckles.add(continue8Button);

        //Class question
        JButton continue9Button = new JButton("Next Question");
        continue9Button.setBounds(300, 100, 2, 2);

        questionClass.add(continue9Button);

        //These buttons are displayed after the user finishes the quiz
        JButton correctGuess = new JButton("Correct");
        correctGuess.setBounds(300, 100, 2, 2);

        JButton incorrectGuess = new JButton("Incorrect :(");
        incorrectGuess.setBounds(300, 100, 2, 2);

// </editor-fold>
        // <editor-fold defaultstate="collapsed" desc=" ADDING PANELS TO THEIR RESPECTIVE JFRAMES ">
        //Add the panel to the jframe
        questions1.getContentPane().add(questionEyesPanel);
        questions2.getContentPane().add(questionHairColorPanel);
        questions3.getContentPane().add(questionHeightPanel);
        questions4.getContentPane().add(questionAgePanel);
        questions5.getContentPane().add(questionGenderPanel);
        questions6.getContentPane().add(questionHairLengthPanel);
        questions7.getContentPane().add(questionHairStylePanel);
        questions8.getContentPane().add(questionFreckles);
        questions9.getContentPane().add(questionClass);

// </editor-fold>
        // <editor-fold defaultstate="collapsed" desc=" FRAME OPTIONS ">
        //Adjusting frame options
        questions1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        questions1.setSize(400, 200);

        questions2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        questions2.setSize(400, 200);

        questions3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        questions3.setSize(400, 200);

        questions4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        questions4.setSize(400, 200);

        questions5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        questions5.setSize(400, 200);

        questions6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        questions6.setSize(400, 200);

        questions7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        questions7.setSize(400, 200);

        questions8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        questions8.setSize(400, 200);

        questions9.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        questions9.setSize(400, 200);

        //This disables the bar at the top
        questions1.setUndecorated(true);
        questions1.setVisible(true);
// </editor-fold>

/**
 * These button click events go through the choices the user made and add them to the teacher object
 * The last one calls the database function to make a proper guess
 */
        // <editor-fold defaultstate="collapsed" desc=" BUTTON CLICK EVENTS ">
        /**
         * When the continue Button is pressed, display the next question
         */
        continue1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Setting eye color based on the selection
                if (eyeBrown.isSelected()) {
                    guess.setEye_color("Brown");
                } else if (eyeGreen.isSelected()) {
                    guess.setEye_color("Green");
                } else if (eyeBlue.isSelected()) {
                    guess.setEye_color("Blue");
                } else if (eyeDk.isSelected()) {
                    guess.setEye_color("I don't know");
                }
                questions1.setVisible(false);
                questions2.setVisible(true);

            }
        });

        continue2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (hairBlonde.isSelected()) {
                    guess.setHair_color("Blonde");
                } else if (hairBrown.isSelected()) {
                    guess.setHair_color("Brown");
                } else if (hairRed.isSelected()) {
                    guess.setHair_color("Red");
                } else {
                    guess.setHair_color("Other");
                }

                questions2.setVisible(false);
                questions3.setVisible(true);
            }
        });

        continue3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (heightShorter.isSelected()) {
                    guess.setHeight("Shorter");
                } else if (heightAverage.isSelected()) {
                    guess.setHeight("Average");
                } else if (heightTall.isSelected()) {
                    guess.setHeight("Tall");
                } else {
                    guess.setHeight("Other");
                }

                questions3.setVisible(false);
                questions4.setVisible(true);

            }
        });

        continue4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (age.getText().equals("") && !tryParseAge(age.getText())) {
                    JOptionPane.showMessageDialog(questions4, "Please enter an age");
                } else {
                    guess.setAge(Integer.parseInt(age.getText()));
                    questions4.setVisible(false);
                    questions5.setVisible(true);
                }

            }
        });

        continue5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (male.isSelected()) {
                    guess.setGender("Male");
                } else {
                    guess.setGender("Female");
                }

                questions5.setVisible(false);
                questions6.setVisible(true);
            }
        });

        continue6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (shortHair.isSelected()) {
                    guess.setHair_color("Short");
                } else if (mediumHair.isSelected()) {
                    guess.setHair_length("Medium");
                } else if (longHair.isSelected()) {
                    guess.setHair_length("Long");
                }

                questions6.setVisible(false);
                questions7.setVisible(true);
            }
        });

        continue7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (hairCurly.isSelected()) {
                    guess.setHair_style("Curly");
                } else if (hairWavy.isSelected()) {
                    guess.setHair_style("Wavy");
                } else if (hairStraight.isSelected()) {
                    guess.setHair_style("Straight");
                } else if (hairOtherStyle.isSelected()) {
                    guess.setHair_style("Other");
                }

                questions7.setVisible(false);
                questions8.setVisible(true);
            }
        });

        continue8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (frecklesTrue.isSelected()) {
                    guess.setFreckles("Yes");
                } else {
                    guess.setFreckles("No");
                }

                questions8.setVisible(false);
                questions9.setVisible(true);
            }
        });

        continue9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (classA.isSelected()) {
                    guess.setClass_in("A");
                } else if (classB.isSelected()) {
                    guess.setClass_in("B");
                } else {
                    guess.setClass_in("Other");
                }

                DataAccess db = new DataAccess();

                //Setting up the frame
                JFrame frame = new JFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(400, 200);

                //Setting up the label
                JLabel result = new JLabel();
                result.setText(db.findMatchStudent(guess));

                //These buttons are displayed after the user finishes the quiz
                JButton correctGuess = new JButton("Correct");
                correctGuess.setBounds(300, 100, 2, 2);

                JButton incorrectGuess = new JButton("Incorrect :(");
                incorrectGuess.setBounds(300, 100, 2, 2);

                //Setting up the panel
                JPanel resultPanel = new JPanel();
                resultPanel.add(result);
                resultPanel.add(correctGuess);
                resultPanel.add(incorrectGuess);

                frame.add(resultPanel);

                //Creatting new instance of add instructor
                AddStudent newAddStudent = new AddStudent();

                //Action listener for the final result buttons
                correctGuess.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                    }
                });

                incorrectGuess.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        newAddStudent.setVisible(true);
                    }
                });

                frame.add(resultPanel);

                questions9.setVisible(false);
                frame.setVisible(true);

            }
        });

// </editor-fold>
    }

    private void guessTeacher() {
        // TODO add your handling code here:
        //Declaring the guessed person as a student

        guess2 = new Teacher();

        // <editor-fold defaultstate="collapsed" desc=" PANELS FOR QUESTIONS ">       
        JPanel questionEyesPanel = new JPanel();
        JPanel questionHairColorPanel = new JPanel();
        JPanel questionHairStylePanel = new JPanel();
        JPanel questionHairLengthPanel = new JPanel();
        JPanel questionHeightPanel = new JPanel();
        JPanel questionAgePanel = new JPanel();
        JPanel questionGenderPanel = new JPanel();
        JPanel questionFreckles = new JPanel();
        JPanel questionInstuition = new JPanel();
        JPanel questionRole = new JPanel();

// </editor-fold>
        // <editor-fold defaultstate="collapsed" desc=" JFRAMES FOR QUESTIONS ">
        //Declaring the jframes for questions
        JFrame questions1 = new JFrame("Question 1");
        JFrame questions2 = new JFrame("Question 2");
        JFrame questions3 = new JFrame("Question 3");
        JFrame questions4 = new JFrame("Question 4");
        JFrame questions5 = new JFrame("Question 5");
        JFrame questions6 = new JFrame("Question 6");
        JFrame questions7 = new JFrame("Question 7");
        JFrame questions8 = new JFrame("Question 8");
        JFrame questions9 = new JFrame("Question 9");
        JFrame questions10 = new JFrame("Question 10");

        questions1.setUndecorated(true);
        questions2.setUndecorated(true);
        questions3.setUndecorated(true);
        questions4.setUndecorated(true);
        questions5.setUndecorated(true);
        questions6.setUndecorated(true);
        questions7.setUndecorated(true);
        questions8.setUndecorated(true);
        questions9.setUndecorated(true);
        questions10.setUndecorated(true);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        questions1.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        questions2.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        questions3.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        questions4.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        questions5.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        questions6.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        questions7.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        questions8.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        questions9.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        questions10.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

// </editor-fold>
        // <editor-fold defaultstate="collapsed" desc=" DECLARING AND SETTING TEXT FOR RADIO BUTTONS ">
        //Eye Color radio Buttons
        JRadioButton eyeBrown, eyeGreen, eyeBlue, eyeDk;

        eyeBrown = new JRadioButton("Brown");
        eyeGreen = new JRadioButton("Green");
        eyeBlue = new JRadioButton("Blue");
        eyeDk = new JRadioButton("I don't know");

        eyeBrown.setSelected(true);

        //Hair Color Radio Buttons
        JRadioButton hairBrown, hairBlonde, hairRed, hairOtherColor;

        hairBrown = new JRadioButton("Brown");
        hairBlonde = new JRadioButton("Blonde");
        hairRed = new JRadioButton("Red");
        hairOtherColor = new JRadioButton("Other");

        hairBrown.setSelected(true);

        //Hair Style Radio Buttons
        JRadioButton hairCurly, hairStraight, hairWavy, hairOtherStyle;

        hairCurly = new JRadioButton("Curly");
        hairStraight = new JRadioButton("Straight");
        hairWavy = new JRadioButton("Wavy");
        hairOtherStyle = new JRadioButton("Other");

        hairCurly.setSelected(true);

        //Height Radio buttons
        JRadioButton heightShorter, heightAverage, heightTall, heightOther;

        heightAverage = new JRadioButton("Average");
        heightOther = new JRadioButton("Other");
        heightShorter = new JRadioButton("Shorter");
        heightTall = new JRadioButton("Tall");

        heightAverage.setSelected(true);

        //Age Text Box
        JTextField age = new JTextField();
        age.setPreferredSize(new Dimension(200, 24));

        //Gender Radio Buttons
        JRadioButton male, female;

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");

        male.setSelected(true);

        //Hair Length Radio Buttons
        JRadioButton shortHair, mediumHair, longHair;

        shortHair = new JRadioButton("Short");
        mediumHair = new JRadioButton("Medium");
        longHair = new JRadioButton("Long");

        shortHair.setSelected(true);

        //Freckles
        JRadioButton frecklesTrue, frecklesFalse;

        frecklesFalse = new JRadioButton("No Freckles");
        frecklesTrue = new JRadioButton("Yes Freckles");

        frecklesFalse.setSelected(true);

        //Instution
        JRadioButton nbccButton, otherButton;

        nbccButton = new JRadioButton("NBCC");
        otherButton = new JRadioButton("Other");

        nbccButton.setSelected(true);

        //Role
        JRadioButton instructorButton, educationalAssistantButton, departmentHeadButton;

        instructorButton = new JRadioButton("Instructor");
        educationalAssistantButton = new JRadioButton("Educational Assistant");
        departmentHeadButton = new JRadioButton("Department Head");

        instructorButton.setSelected(true);

// </editor-fold>
        // <editor-fold defaultstate="collapsed" desc=" LABELS FOR QUESTIONS ">
        //Eye color question
        JLabel question1 = new JLabel("What color is this persons eyes?");
        questionEyesPanel.add(question1);

        //Hair color question
        JLabel question2 = new JLabel("What color is this persons hair?");
        questionHairColorPanel.add(question2);

        //Height question
        JLabel question3 = new JLabel("How tall is this person");
        questionHeightPanel.add(question3);

        //Age question
        JLabel question4 = new JLabel("How old is this person?");
        questionAgePanel.add(question4);

        //Gender question
        JLabel question5 = new JLabel("What is this persons gender");
        questionGenderPanel.add(question5);

        //Hair Length question
        JLabel question6 = new JLabel("How long is this persons hair?");
        questionHairLengthPanel.add(question6);

        //Hair Style question
        JLabel question7 = new JLabel("What is this persons hair style?");
        questionHairStylePanel.add(question7);

        //Freckles question
        JLabel question8 = new JLabel("Does this person have freckles");
        questionFreckles.add(question8);

        //Instituition 
        JLabel question9 = new JLabel("What is this persons institiution?");
        questionInstuition.add(question9);

        //Role
        JLabel question10 = new JLabel("What is this persons role at their institiution?");
        questions10.add(question10);

// </editor-fold>
        // <editor-fold defaultstate="collapsed" desc=" BUTTON GROUPS ">
        //Creating the button groups
        ButtonGroup eyeColorGroup = new ButtonGroup();
        ButtonGroup heightButtonGroup = new ButtonGroup();
        ButtonGroup hairColorButtonGroup = new ButtonGroup();
        ButtonGroup genderButtonGroup = new ButtonGroup();
        ButtonGroup hairLengthButtonGroup = new ButtonGroup();
        ButtonGroup hairStyleButtonGroup = new ButtonGroup();
        ButtonGroup frecklesButtonGroup = new ButtonGroup();
        ButtonGroup instituitionButtonGroup = new ButtonGroup();
        ButtonGroup roleButtonGroup = new ButtonGroup();

// </editor-fold>
        // <editor-fold defaultstate="collapsed" desc=" ADDING RADIO BUTTONS TO PANELS AND BUTTON GROUPS ">
        //Adding Radio Buttons to the group and panel
        //Eye group
        eyeColorGroup.add(eyeDk);
        questionEyesPanel.add(eyeDk);

        eyeColorGroup.add(eyeGreen);
        questionEyesPanel.add(eyeGreen);

        eyeColorGroup.add(eyeBlue);
        questionEyesPanel.add(eyeBlue);

        eyeColorGroup.add(eyeBrown);
        questionEyesPanel.add(eyeBrown);

        //Hair color group
        hairColorButtonGroup.add(hairBlonde);
        questionHairColorPanel.add(hairBlonde);

        hairColorButtonGroup.add(hairBrown);
        questionHairColorPanel.add(hairBrown);

        hairColorButtonGroup.add(hairRed);
        questionHairColorPanel.add(hairRed);

        hairColorButtonGroup.add(hairOtherColor);
        questionHairColorPanel.add(hairOtherColor);

        //Height Group
        heightButtonGroup.add(heightShorter);
        questionHeightPanel.add(heightShorter);

        heightButtonGroup.add(heightAverage);
        questionHeightPanel.add(heightAverage);

        heightButtonGroup.add(heightTall);
        questionHeightPanel.add(heightTall);

        heightButtonGroup.add(heightOther);
        questionHeightPanel.add(heightOther);

        //Age (Adding it only to the panel because it's not a button)
        questionAgePanel.add(age);

        //Gender group
        genderButtonGroup.add(male);
        questionGenderPanel.add(male);

        genderButtonGroup.add(female);
        questionGenderPanel.add(female);

        //Hair length group
        hairLengthButtonGroup.add(shortHair);
        questionHairLengthPanel.add(shortHair);

        hairLengthButtonGroup.add(mediumHair);
        questionHairLengthPanel.add(mediumHair);

        hairLengthButtonGroup.add(longHair);
        questionHairLengthPanel.add(longHair);

        //Hair Style Group
        hairStyleButtonGroup.add(hairCurly);
        questionHairStylePanel.add(hairCurly);

        hairStyleButtonGroup.add(hairStraight);
        questionHairStylePanel.add(hairStraight);

        hairStyleButtonGroup.add(hairWavy);
        questionHairStylePanel.add(hairWavy);

        hairStyleButtonGroup.add(hairOtherStyle);
        questionHairStylePanel.add(hairOtherStyle);

        //Freckles Group
        frecklesButtonGroup.add(frecklesFalse);
        questionFreckles.add(frecklesFalse);

        frecklesButtonGroup.add(frecklesTrue);
        questionFreckles.add(frecklesTrue);

        //Instituition group
        instituitionButtonGroup.add(nbccButton);
        questionInstuition.add(nbccButton);

        instituitionButtonGroup.add(otherButton);
        questionInstuition.add(otherButton);

        //Role group
        roleButtonGroup.add(instructorButton);
        questionRole.add(instructorButton);

        roleButtonGroup.add(educationalAssistantButton);
        questionRole.add(educationalAssistantButton);

        roleButtonGroup.add(departmentHeadButton);
        questionRole.add(departmentHeadButton);

// </editor-fold>
        // <editor-fold defaultstate="collapsed" desc=" CREATING BUTTONS AND ADDING THEM TO RESPECTIVE PANELS ">
        //Creating the button to continue
        //Eye question
        JButton continue1 = new JButton("Next Question");
        continue1.setBounds(300, 100, 2, 2);

        questionEyesPanel.add(continue1);

        //Hair color question
        JButton continue2Button = new JButton("Next Question");
        continue2Button.setBounds(300, 100, 2, 2);

        questionHairColorPanel.add(continue2Button);

        //Height question
        JButton continue3Button = new JButton("Next Question");
        continue3Button.setBounds(300, 100, 2, 2);

        questionHeightPanel.add(continue3Button);

        //Age question
        JButton continue4Button = new JButton("Next Question");
        continue4Button.setBounds(300, 100, 2, 2);

        questionAgePanel.add(continue4Button);

        //Gender question
        JButton continue5Button = new JButton("Next Question");
        continue5Button.setBounds(300, 100, 2, 2);

        questionGenderPanel.add(continue5Button);

        //Hair length question
        JButton continue6Button = new JButton("Next Question");
        continue6Button.setBounds(300, 100, 2, 2);

        questionHairLengthPanel.add(continue6Button);

        //Hair style question
        JButton continue7Button = new JButton("Next Question");
        continue7Button.setBounds(300, 100, 2, 2);

        questionHairStylePanel.add(continue7Button);

        //Freckles question
        JButton continue8Button = new JButton("Next Question");
        continue8Button.setBounds(300, 100, 2, 2);

        questionFreckles.add(continue8Button);

        //Instituition question
        JButton continue9Button = new JButton("Next Question");
        continue9Button.setBounds(300, 100, 2, 2);

        questionInstuition.add(continue9Button);

        //Role question
        JButton continue10Button = new JButton("Next Question");
        continue10Button.setBounds(300, 100, 2, 2);

        questionRole.add(continue10Button);

// </editor-fold>
        // <editor-fold defaultstate="collapsed" desc=" ADDING PANELS TO THEIR RESPECTIVE JFRAMES ">
        //Add the panel to the jframe
        questions1.getContentPane().add(questionEyesPanel);
        questions2.getContentPane().add(questionHairColorPanel);
        questions3.getContentPane().add(questionHeightPanel);
        questions4.getContentPane().add(questionAgePanel);
        questions5.getContentPane().add(questionGenderPanel);
        questions6.getContentPane().add(questionHairLengthPanel);
        questions7.getContentPane().add(questionHairStylePanel);
        questions8.getContentPane().add(questionFreckles);
        questions9.getContentPane().add(questionInstuition);
        questions10.getContentPane().add(questionRole);

        //Why did it take so long
// </editor-fold>
        // <editor-fold defaultstate="collapsed" desc=" FRAME OPTIONS ">
        //Adjusting frame options
        questions1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        questions1.setSize(400, 200);

        questions2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        questions2.setSize(400, 200);

        questions3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        questions3.setSize(400, 200);

        questions4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        questions4.setSize(400, 200);

        questions5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        questions5.setSize(400, 200);

        questions6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        questions6.setSize(400, 200);

        questions7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        questions7.setSize(400, 200);

        questions8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        questions8.setSize(400, 200);

        questions9.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        questions9.setSize(400, 200);

        questions10.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        questions10.setSize(400, 200);

        //This disables the bar at the top
        questions1.setUndecorated(true);
        questions1.setVisible(true);
// </editor-fold>

/**
 * These button click events go through the choices the user made and add them to the teacher object
 * The last one calls the database function to make a proper guess
 */
        // <editor-fold defaultstate="collapsed" desc=" BUTTON CLICK EVENTS ">
        /**
         * When the continue Button is pressed, display the next question
         */
        continue1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Setting eye color based on the selection
                if (eyeBrown.isSelected()) {
                    guess2.setEye_color("Brown");
                } else if (eyeGreen.isSelected()) {
                    guess2.setEye_color("Green");
                } else if (eyeBlue.isSelected()) {
                    guess2.setEye_color("Blue");
                } else if (eyeDk.isSelected()) {
                    guess2.setEye_color("I don't know");
                }
                questions1.setVisible(false);
                questions2.setVisible(true);
            }
        });

        continue2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (hairBlonde.isSelected()) {
                    guess2.setHair_color("Blonde");
                } else if (hairBrown.isSelected()) {
                    guess2.setHair_color("Brown");
                } else if (hairRed.isSelected()) {
                    guess2.setHair_color("Red");
                } else {
                    guess2.setHair_color("Other");
                }

                questions2.setVisible(false);
                questions3.setVisible(true);
            }
        });

        continue3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (heightShorter.isSelected()) {
                    guess2.setHeight("Shorter");
                } else if (heightAverage.isSelected()) {
                    guess2.setHeight("Average");
                } else if (heightTall.isSelected()) {
                    guess2.setHeight("Tall");
                } else {
                    guess2.setHeight("Other");
                }

                questions3.setVisible(false);
                questions4.setVisible(true);
            }
        });

        continue4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (age.getText().equals("")) {
                    JOptionPane.showMessageDialog(questions4, "Please enter an age");
                } else {
                    guess2.setAge(Integer.parseInt(age.getText()));
                }

                questions4.setVisible(false);
                questions5.setVisible(true);
            }
        });

        continue5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (male.isSelected()) {
                    guess2.setGender("Male");
                } else {
                    guess2.setGender("Female");
                }

                questions5.setVisible(false);
                questions6.setVisible(true);
            }
        });

        continue6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (shortHair.isSelected()) {
                    guess2.setHair_color("Short");
                } else if (mediumHair.isSelected()) {
                    guess2.setHair_length("Medium");
                } else if (longHair.isSelected()) {
                    guess2.setHair_length("Long");
                }

                questions6.setVisible(false);
                questions7.setVisible(true);
            }
        });

        continue7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (hairCurly.isSelected()) {
                    guess2.setHair_style("Curly");
                } else if (hairWavy.isSelected()) {
                    guess.setHair_style("Wavy");
                } else if (hairStraight.isSelected()) {
                    guess2.setHair_style("Straight");
                } else if (hairOtherStyle.isSelected()) {
                    guess2.setHair_style("Other");
                }

                questions7.setVisible(false);
                questions8.setVisible(true);
            }
        });

        continue8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (frecklesTrue.isSelected()) {
                    guess2.setFreckles("Yes");
                } else {
                    guess2.setFreckles("No");
                }

                questions8.setVisible(false);
                questions9.setVisible(true);
            }
        });

        continue9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (nbccButton.isSelected()) {
                    guess2.setInstitution("NBCC");
                } else if (otherButton.isSelected()) {
                    guess.setClass_in("Other");
                }

                questions9.setVisible(false);
                questions10.setVisible(true);
            }
        });

        continue10Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (instructorButton.isSelected()) {
                    guess2.setRole("Instructor");
                } else if (departmentHeadButton.isSelected()) {
                    guess2.setRole("Department head");
                } else if (educationalAssistantButton.isSelected()) {
                    guess2.setRole("educational assistant");
                }

                DataAccess db = new DataAccess();

                JFrame frame = new JFrame();

                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(400, 200);

                JLabel result = new JLabel();
                result.setText(db.findTeacher(guess2));

                //These buttons are displayed after the user finishes the quiz
                JButton correctGuess = new JButton("Correct");
                correctGuess.setBounds(300, 100, 2, 2);

                JButton incorrectGuess = new JButton("Incorrect :(");
                incorrectGuess.setBounds(300, 100, 2, 2);

                //Setting up the panel
                JPanel resultPanel = new JPanel();
                resultPanel.add(result);
                resultPanel.add(correctGuess);
                resultPanel.add(incorrectGuess);

                frame.add(resultPanel);

                //Creatting new instance of add instructor
                AddInstructor newAddInstructor = new AddInstructor();

                //Action listener for the final result buttons
                correctGuess.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                    }
                });

                incorrectGuess.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        newAddInstructor.setVisible(true);
                    }
                });

                questions10.setVisible(false);
                frame.setVisible(true);

            }
        });

// </editor-fold>
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnStart = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnStart.setText("Start");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Welcome stranger, I will read your mind, but first, think of a name. Someone \nin this class, or class A (The less cool class). With just a few questions I will\nbe able to tell you who you're thinking of!");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(451, 451, 451)
                        .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(255, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 232, Short.MAX_VALUE)
                .addComponent(btnStart)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        //Creating Panel
        JPanel questionTypePanel = new JPanel();

        //Creating Frame
        JFrame personTypeFrame = new JFrame();

        //Creating radio buttons
        JRadioButton student, teacher;

        student = new JRadioButton("Student");
        teacher = new JRadioButton("Teacher");
        
        student.setSelected(true);

        //Adding the question to a panel
        JLabel question1 = new JLabel("Is this person a student or a instructor?");
        questionTypePanel.add(question1);

        //Button groups
        ButtonGroup groupType = new ButtonGroup();

        groupType.add(student);
        groupType.add(teacher);

        //Adding buttons to panel
        questionTypePanel.add(student);
        questionTypePanel.add(teacher);

        //Button to confirm selection
        JButton continueButton = new JButton("Confirm");

        //Adding the button to the panel
        questionTypePanel.add(continueButton);

        //Adding the panel to the jframe
        personTypeFrame.add(questionTypePanel);

        //Making the jframe visible
        personTypeFrame.setVisible(true);
        personTypeFrame.pack();

        /**
         * When the user clicks continue call a method based off their decision
         */
        continueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (student.isSelected()) {
                    guessStudent();
                    personTypeFrame.setVisible(false);
                } else {
                    guessTeacher();
                    personTypeFrame.setVisible(false);
                }
            }
        });

    }//GEN-LAST:event_btnStartActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

        this.setUndecorated(true);
    }//GEN-LAST:event_formWindowOpened

    boolean tryParseAge(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStart;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
