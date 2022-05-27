import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.cert.CRLReason;


public class Frame extends JPanel implements ActionListener {
    private JButton Calcola;
    private JButton Prevedi;
    private JLabel media_Ponderata;
    private JLabel media_Aritmetica;
    private JTextArea media_A;
    private JTextArea media_P;
    private JPanel bottom_buttons;
    private JPanel Input;
    private JPanel Check;
    private JCheckBox crediti180;
    private JCheckBox crediti120;
    public static void main(String args[]){
        new Frame();
        return;
    }

    public Frame(){
        JFrame frame = new JFrame("Calcola la tua Media");
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(BorderLayout.PAGE_END,bottons());
        panel.add(BorderLayout.NORTH,Input());
        panel.add(BorderLayout.CENTER,Check());

        frame.add(panel);
        // Create frame and set it visible;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(600,650);
        frame.setResizable(true);

    }

    private JPanel Check() {
        Check = new JPanel(new GridLayout(1,2,10,10));
        crediti120 = new JCheckBox("Laurea Magistrale (120 CFU)");
        Check.add(crediti120);
        crediti180 = new JCheckBox("Laurea Triennale (180 CFU)");
        Check.add(Box.createHorizontalGlue());
        Check.add(crediti180);

        return Check;
    }

    private JPanel Input(){
        Input = new JPanel(new GridLayout(2,4,20,20));
        media_Aritmetica = new JLabel("inserisci media aritmetica");
        Input.add(media_Aritmetica);

        media_Ponderata = new JLabel("Inserisci media ponderata qui");
        Input.add(media_Ponderata);
        media_A = new JTextArea();
        Input.add(media_A);
        media_P = new JTextArea();
        Input.add(media_P);

        return Input;
    }
    private JPanel bottons(){

        Calcola = new JButton("Calcola");
        Calcola.addActionListener(this::actionPerformed);
        Prevedi = new JButton("Prevedi Voti");
        Prevedi.addActionListener(this::actionPerformed);
        bottom_buttons = new JPanel();
        bottom_buttons.setLayout(new BoxLayout(bottom_buttons,BoxLayout.LINE_AXIS));
        bottom_buttons.add(Prevedi);
        bottom_buttons.add(Box.createHorizontalGlue());
        bottom_buttons.add(Calcola);
        return  bottom_buttons;
        }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
