import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Finestra{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Finestra d'exemple");
        JButton button = new JButton("Clic aqui");
        JTextField pantallita = new JTextField();
        JButton[] numberButtons = new JButton[10];

        pantallita.setEditable(false);
        frame.add(pantallita);
        for (JButton jButton : numberButtons) {
            frame.add(jButton);
            frame.setLayout(new GridLayout(4,3));
        }
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}