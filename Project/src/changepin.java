import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class changepin implements ActionListener {
	JFrame fc=new JFrame("Change PIN");
    JLabel lco=new JLabel("Old PIN");
    JTextField tco =new JTextField(4);
    JLabel lcn=new JLabel("New PIN");
    JTextField tcn =new JTextField(4);
    JButton bc=new JButton("Done!!!");

changepin(){
       fc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      fc.setSize(420,420);
fc.setLayout(null);
fc.setVisible(true);
lco.setBounds(30,50,90,50);
tco.setBounds(100,70,100,30);
lcn.setBounds(30,100,90,50);
tcn.setBounds(100,120,100,30);
bc.setBounds(160,230,140,80);
bc.setForeground(Color.white);
bc.setBackground(Color.green);
bc.setFont(new Font("Berlin Sans FB",Font.BOLD,20));
fc.add(lco);
 fc.add(tco);
 fc.add(lcn);
 fc.add(tcn);
 fc.add(bc);
 bc.addActionListener(this);
}

@Override
public void actionPerformed(ActionEvent e) {
	String old_pin=tco.getText();
	if(old_pin.isEmpty()) {
		JOptionPane.showMessageDialog(bc, "Enter the Old PIN", old_pin, 0);
	}
	else if(e.getSource()==bc){
        JOptionPane.showMessageDialog(bc, "PIN has been changed", null, JOptionPane.INFORMATION_MESSAGE);
     }
	

	
}
}
