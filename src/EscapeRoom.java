import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class EscapeRoom {

    JPanel panel;
    JButton ranchOnPizza, ranchNotOnPizza, checkAnswer;
    JLabel showProblem;
    JTextField answerInput;
    

    public static void main(String[] args){


    }
    public EscapeRoom(){

        JFrame frame = new JFrame("Escape Room");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLocationRelativeTo(null);

        panel = new JPanel();

        ranchOnPizza = new JButton("RanchOnPizza");
        ranchNotOnPizza = new JButton("RanchNotOnPizza");
        showProblem = new JLabel("Place Holder");
        answerInput = new JTextField(10);
        checkAnswer = new JButton("Check Answer");

        frame.add(panel);
        frame.setVisible(true);

    }
}
