package za.ac.tut.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;


public class GreetingsGUI extends JFrame{
             
    private final JPanel namePnl;
    private final JPanel surnamePnl;
    private final JPanel nameAndSurnamePnl;
    private final JPanel greetingsAreaPnl;
    private final JPanel btnsPnl;
    private final JPanel mainPnl;
    private final JPanel headingPnl;

    private final JLabel headingLbl;
    private final JLabel nameLbl;
    private final JLabel surnameLbl;
    
    private final JTextField nameTxtFld;
    private final JTextField surnameTxtFld;
    
    private final JTextArea greetingsTxtArea;
    
    private final JButton greetBtn;
    private final JButton clearBtn;
    private final JButton exitBtn;
    
    public GreetingsGUI(){
        
        setLayout(new BorderLayout());
        setTitle("Greetings GUI");
        setSize(300, 350);
        setBackground(Color.yellow);
        
        namePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        surnamePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        nameAndSurnamePnl = new JPanel(new GridLayout(2,1));
        greetingsAreaPnl = new JPanel(new FlowLayout());
        greetingsAreaPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK, 1),"Greetings"));
        
        btnsPnl = new JPanel(new FlowLayout());
        mainPnl = new JPanel(new BorderLayout());
        
        headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        headingPnl .setBorder(new BevelBorder(BevelBorder.RAISED));
        
        headingLbl = new JLabel("Greetings App");
        nameLbl = new JLabel("Name:       ");
        surnameLbl = new JLabel("Surname: ");
        
        nameTxtFld = new JTextField(20);
        surnameTxtFld = new JTextField(20);
        
        greetingsTxtArea = new JTextArea(9,20);
        greetingsTxtArea.setEditable(false);
        greetingsTxtArea.setText("Hello [name] [surname]");
        
        
        greetBtn = new JButton("Greet");
        clearBtn = new JButton("Clear");
        exitBtn = new JButton("Exit");
        
        namePnl.add(nameLbl);
        namePnl.add(nameTxtFld);
        headingPnl.add(headingLbl);
        surnamePnl.add(surnameLbl);
        surnamePnl.add(surnameTxtFld);
        nameAndSurnamePnl.add(headingPnl);
        nameAndSurnamePnl.add(namePnl);
        nameAndSurnamePnl.add(surnamePnl);
        
        
        greetingsAreaPnl.add(greetingsTxtArea);
        
        btnsPnl.add(greetBtn);
        btnsPnl.add(clearBtn);
        btnsPnl.add(exitBtn);
        
        mainPnl.add(nameAndSurnamePnl, BorderLayout.NORTH);
        mainPnl.add(greetingsAreaPnl, BorderLayout.CENTER);
        mainPnl.add(btnsPnl, BorderLayout.SOUTH);
        
        add(headingPnl, BorderLayout.NORTH);
        add(mainPnl, BorderLayout.CENTER);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
    }
}
