import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class statement implements ActionListener {
	JFrame fs=new JFrame("Statement Print");
    JLabel ls=new JLabel("Account No.");
    JTextField ts =new JTextField(8);
    JButton bs=new JButton("Printing..");

   statement(){
           fs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   fs.setSize(420,420);
   fs.setLayout(null);
   fs.setVisible(true);
    ls.setBounds(10,50,100,50);
    ts.setBounds(90,70,90,40);
    bs.setBounds(150,170,140,50);
    bs.setForeground(Color.white);
    bs.setBackground(Color.cyan);
    bs.setFont(new Font("Berlin Sans FB",Font.BOLD,20));
    fs.add(ls);
     fs.add(ts);
     fs.add(bs);
     bs.addActionListener(this);
}

@Override
public void actionPerformed(ActionEvent e) {
    String st=ts.getText();
    if(st.isEmpty()) {
    	JOptionPane.showMessageDialog(bs, "Enter the Account number correctly", st, JOptionPane.ERROR_MESSAGE);
    }
	
	else if(e.getSource()==bs){
        JOptionPane.showMessageDialog(bs, "Statement has been printed", null, JOptionPane.INFORMATION_MESSAGE);
     }
	
	
}

}
