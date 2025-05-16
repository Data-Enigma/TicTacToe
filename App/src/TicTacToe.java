import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TicTacToe {
    int boardWidth = 600;
    int boardHeight = 650;
    int boxWidth = 50;//50px for text textPanel on top
    int boxHeight = 50;

    JFrame frame = new JFrame();
    JLabel textLabel = new JLabel();
    JPanel textPanel = new JPanel();

    TicTacToe() {
        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        textLabel.setBackground(Color.lightGray);
        textLabel.setForeground(Color.BLACK);
        textLabel.setFont(new Font("Arial", Font.BOLD, 50));
        textLabel.setHorizontalAlignment(JLabel.CENTER);
        textLabel.setText("Tic-Tac-Toe");
        textLabel.setOpaque(true);

        textPanel.setLayout(new BorderLayout());
        textPanel.add(textLabel);
        frame.add(textPanel);
    }
}
