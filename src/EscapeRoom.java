import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class EscapeRoom {
    static double usersAnswer, correctAnswer;
    static String displayProblem = "";

    JPanel panel;
    JButton checkAnswer;
    JLabel showProblem;
    JTextField answerInput;
    JRadioButton ranchOnPizza, ranchNotOnPizza;
    ButtonGroup radios = new ButtonGroup();


    public static void main(String[] args){


    }
    public EscapeRoom(){

        JFrame frame = new JFrame("Escape Room");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLocationRelativeTo(null);

        panel = new JPanel();

        ranchOnPizza = new JRadioButton("RanchOnPizza");
        ranchNotOnPizza = new JRadioButton("RanchNotOnPizza");
        showProblem = new JLabel("Place Holder");
        answerInput = new JTextField(10);
        checkAnswer = new JButton("Check Answer");

        ranchOnPizza.setBounds(100,25,200,25);
        ranchNotOnPizza.setBounds(100,50,200,25);

        radios.add(ranchNotOnPizza);
        radios.add(ranchOnPizza);

        panel.setLayout(null);
        panel.add(ranchNotOnPizza);
        panel.add(ranchOnPizza);

        frame.add(panel);
        frame.setVisible(true);

    }
    public static void checkAnswer(){
        if(usersAnswer == correctAnswer){
            JOptionPane.showMessageDialog(null, "You are correct");
        }else{
            JOptionPane.showMessageDialog(null,"YES RANCH BELONGS ON PIZZA !!!");
        }
    }
    public static void getUserAnswer(){

      
    }
}
