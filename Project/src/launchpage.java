import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;



public class launchpage implements ActionListener {
	JFrame f=new JFrame("ATM");
    JButton b1=new JButton("Deposit");
    JButton b2=new JButton("Withdraw");
   JButton b3=new JButton("Change PIN");
   JButton b4=new JButton("Statement");
	
	launchpage(){
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     f.setSize(500,500);
	     f.setLayout(null);
	     f.setVisible(true);
	     f.add(b1);
	     f.add(b2);
	    f.add(b3);
	    f.add(b4);
	   
	     b1.setBounds(30,100,150,40);
	     b1.addActionListener(this);
	     b1.setFont(new Font("Berlin Sans FB",Font.BOLD,20));
	     b1.setForeground(Color.white);
	     b1.setBackground(Color.blue);
	     b1.setFocusable(false);
	     b2.setBounds(230,100,150,40);
	     b2.setFont(new Font("Berlin Sans FB",Font.BOLD,20));
	     b2.setForeground(Color.white);
	     b2.setBackground(Color.blue);
	     b2.setFocusable(false);
	     b2.addActionListener(this);
	    b3.setBounds(30,200,150,40);
	     b3.addActionListener(this);
	     b3.setFont(new Font("Berlin Sans FB",Font.BOLD,15));
	     b3.setForeground(Color.white);
	     b3.setBackground(Color.blue);
	     b3.setFocusable(false);
	      b4.setBounds(230,200,150,40);
	     b4.addActionListener(this);
	     b4.setFont(new Font("Berlin Sans FB",Font.BOLD,20));
	     b4.setForeground(Color.white);
	     b4.setBackground(Color.blue);
	     b4.setFocusable(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1){
	        deposit d_page=new deposit();
	     }
		else if(e.getSource()==b2){
	        withdraw w_page=new withdraw();
	     }
		else if(e.getSource()==b3){
			changepin cp_page=new changepin();
	     }
		else if (e.getSource()==b4){
			statement s_page=new statement();
	     }
		
	   }
	
		
	}


