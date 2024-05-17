import javax.swing.*;

class Finestra{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Finestra d'exemple");
        JButton button = new JButton("Clic aqui");
    
        frame.add(button);
        frame.setSize(300, 200);
    }
}