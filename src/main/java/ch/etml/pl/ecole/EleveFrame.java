package ch.etml.pl.ecole;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class EleveFrame extends JFrame {

	private EcoleService ecoleService;

	private JTextField tfPrenom;
	private JTextField tfPassword;
	private JButton btLogin;

	private JButton btInscrire;
	private JTextField tfCours;
	private JButton btRetirer;

	private JTextArea taDisplay;
	private JTextField tfMessage;


	public EleveFrame(EcoleService ecoleService) {
		this.ecoleService = ecoleService;
		taDisplay=new JTextArea();
		add(taDisplay);
		Box nord = Box.createVerticalBox();
		add(nord, BorderLayout.NORTH);

		Box bxLogin = Box.createHorizontalBox();
		nord.add(bxLogin);
		bxLogin.add(new JLabel("Prenom: "));
		tfPrenom = new JTextField(10);
		bxLogin.add(tfPrenom);
		bxLogin.add(new JLabel("Mot de passe: "));
		tfPassword = new JPasswordField(4);
		bxLogin.add(tfPassword);
		btLogin = new JButton("Login");
		bxLogin.add(btLogin);

		Box bxInscrire = Box.createHorizontalBox();
		nord.add(bxInscrire);
		btInscrire = new JButton("Inscrire");
		bxInscrire.add(btInscrire);

		tfCours = new JTextField(2);
		bxInscrire.add(tfCours);

		btRetirer = new JButton("Retirer");
		bxInscrire.add(btRetirer);

		tfMessage = new JTextField();
		add(tfMessage,BorderLayout.SOUTH);

	}


}
