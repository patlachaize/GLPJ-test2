package ch.etml.pl.ecole;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class CoursFrame extends JFrame {

	private EcoleService ecoleService;

	private JTextField tfAbbrev;
	private JButton btCours;

	private JTextArea taDisplay;
	private JTextField tfMessage;


	public CoursFrame(EcoleService ecoleService) {
		this.ecoleService = ecoleService;

		taDisplay=new JTextArea();
		add(taDisplay);
		tfMessage = new JTextField();
		add(tfMessage,BorderLayout.SOUTH);

		Box nord = Box.createVerticalBox();
		add(nord, BorderLayout.NORTH);

		Box bxCours = Box.createHorizontalBox();
		nord.add(bxCours);
		bxCours.add(new JLabel("Cours: "));
		tfAbbrev = new JTextField(2);
		tfAbbrev.setMaximumSize(tfAbbrev.getPreferredSize());
		bxCours.add(tfAbbrev);
		bxCours.add(Box.createHorizontalGlue());
		btCours = new JButton("Liste");
		bxCours.add(btCours);

	}

}
