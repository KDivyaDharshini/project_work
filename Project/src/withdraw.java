import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class withdraw implements ActionListener {
	JFrame fw=new JFrame("Withdraw");
    JLabel lw=new JLabel("Amount");
    JTextField tw =new JTextField(6);
    JButton bw=new JButton("Withdraw");

withdraw(){
       fw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      fw.setSize(420,420);
fw.setLayout(null);
fw.setVisible(true);
lw.setBounds(10,50,100,50);
tw.setBounds(70,70,100,50);
bw.setBounds(140,200,160,50);
bw.setForeground(Color.white);
bw.setBackground(Color.DARK_GRAY);
bw.setFont(new Font("Berlin Sans FB",Font.BOLD,20));
fw.add(lw);
 fw.add(tw);
 fw.add(bw);
 bw.addActionListener(this);
}

@Override
public void actionPerformed(ActionEvent e) {
	String w_amt=tw.getText();
	if(w_amt.isEmpty()) {
		JOptionPane.showMessageDialog(bw, "Enter the amount to  withdraw", w_amt,JOptionPane.ERROR_MESSAGE);
	}
	else if(e.getSource()==bw){
        JOptionPane.showMessageDialog(bw, "You have recieved the money", null, JOptionPane.INFORMATION_MESSAGE);
     }
	

	
}

}
