import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class deposit implements ActionListener {
	 JFrame fd=new JFrame("DEPOSIT");
     JLabel ld=new JLabel("Amount");
     JTextField td =new JTextField(6);
     JButton bd=new JButton("Inserted");

    deposit(){
            fd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fd.setSize(420,420);
    fd.setLayout(null);
    fd.setVisible(true);
     ld.setBounds(10,50,100,50);
     td.setBounds(90,60,100,50);
     bd.setBounds(100,200,150,50);
     bd.setForeground(Color.white);
     bd.setBackground(Color.DARK_GRAY);
     bd.setFont(new Font("Berlin Sans FB",Font.BOLD,20));
     fd.add(ld);
      fd.add(td);
      fd.add(bd);
      bd.addActionListener(this);
}

	@Override
	public void actionPerformed(ActionEvent e) {
		String d_amt=td.getText();
		if(d_amt.isEmpty()) {
			JOptionPane.showMessageDialog(bd, "Enter the amount to be deposited", d_amt, 0);
		}
		
		else if (e.getSource()==bd){
	        JOptionPane.showMessageDialog(bd, "Money has been Deposited", null, JOptionPane.INFORMATION_MESSAGE);
	     }
		
		

		
	}

}
