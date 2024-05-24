import javax.swing.*;
import java.awt.*;
import java.io.*;

public class RobotApp extends JFrame {
    private JButton AdelanteButton, AtrasButton, GirarEButton, GirarDButton, GuardarEstatButton, CarregarEstatButton;
    private JTextArea consoleOutput;
    private JScrollPane scrollPane;
    private Robot robot;

    public RobotApp() {
        setTitle("Control de Robot");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        robot = new Robot();

        JPanel controlPanel = new JPanel();
        AdelanteButton = new JButton("Moure Endevant");
        AtrasButton = new JButton("Moure Enrere");
        GirarEButton = new JButton("Girar Esquerra");
        GirarDButton = new JButton("Girar Dreta");
        controlPanel.add(AdelanteButton);
        controlPanel.add(AtrasButton);
        controlPanel.add(GirarEButton);
        controlPanel.add(GirarDButton);

        consoleOutput = new JTextArea(10, 30);
        consoleOutput.setEditable(false);
        scrollPane = new JScrollPane(consoleOutput);

        add(controlPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        AdelanteButton.addActionListener(e -> {
            robot.AdelanteButton();
            consoleOutput.append("Robot s'ha mogut endavant.\n");
        });

        AtrasButton.addActionListener(e -> {
            robot.AtrasButton();
            consoleOutput.append("Robot s'ha mogut enrere.\n");
        });

        GirarEButton.addActionListener(e -> {
            robot.GirarEButton();
            consoleOutput.append("Robot ha girat a l'esquerra.\n");
        });

        GirarDButton.addActionListener(e -> {
            robot.GirarDButton();
            consoleOutput.append("Robot ha girat a la dreta.\n");
        });

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(RobotApp::new);
    }

    private class Robot {
        public void AdelanteButton() {
        }

        public void AtrasButton() {
        }

        public void GirarEButton() {
        }

        public void GirarDButton() {
        }

    }
}