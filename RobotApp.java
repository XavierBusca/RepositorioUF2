import javax.swing.*;
import java.awt.*;
import java.io.*;

public class RobotApp extends JFrame {
    private JButton EndevantButton, EnrereButton, IzquierdaButton, DretaButton, GuardarEstatButton, CarregarEstatButton ;
    private JTextArea consoleOutput;
    private Robot robot;
}

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