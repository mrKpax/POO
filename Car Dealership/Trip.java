import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Trip extends JFrame implements ActionListener
{
	JCheckBox check;
	JCheckBox check2;
	JButton b;
	JRadioButton radio;
	JRadioButton radio2;
	JRadioButton radio3;
	JComboBox combo;
	
	Trip()
	{
		setLayout(new FlowLayout());
		setTitle("Prenota la tua auto");
		setVisible(true);
		setSize(500,500);
	
		check = new JCheckBox();
		check.setText("Computer di bordo");
		check.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	
		check2 = new JCheckBox();
		check2.setText("Meccanica Sport");
		check2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		ButtonGroup group = new ButtonGroup();
		radio = new JRadioButton("Auto nuova");
		radio2 = new JRadioButton("Auto seminuova");
		radio3 = new JRadioButton("Auto usata");
		group.add(radio);
		group.add(radio2);
		group.add(radio3);
		
		String models[] = {"Jaguar F-Pace", "Jaguar SportBrake", "Jaguar XE", "Jaguar XF", "Jaguar K-Edition"};
		combo = new JComboBox(models);
	
		b = new JButton();
		b.addActionListener(this);
		b.setText("Conferma");
		b.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	
		this.add(combo);
		this.add(check);
		this.add(check2);
		this.add(radio);
		this.add(radio2);
		this.add(radio3);
		this.add(b);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == b)
		{
			
			String optional = "";
			String status = "";
			String models = "";
			
			if(radio.isSelected())
				status = "Stato auto: nuova.";
			else if(radio2.isSelected())
				status = "Stato auto: seminuova.";
			else if(radio3.isSelected())
				status = "Stato auto: usata.";
			
			if (check.isSelected() && check2.isSelected())
				optional = "Computer di bordo e meccanica Sport selezionati.";
			else if (check.isSelected() && !check2.isSelected())
				optional = "Computer di bordo selezionato.";
			else if (!check.isSelected() && check2.isSelected())
				optional = "Meccanica Sport selezionata.";
			else if (!check.isSelected() && !check2.isSelected())
				optional = "Nessun optional selezionato.";
			
			models = (String) combo.getSelectedItem();
			
			JOptionPane.showMessageDialog(null, models + " prenotata con successo.\n" + status + "\n" + optional);
			
		}
	}

}
