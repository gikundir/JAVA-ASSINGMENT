package com.test;
	import java.awt.Color;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.util.Arrays;
	import javax.swing.*;
	public class registrationform implements ActionListener {
	    JFrame frame;
	    JLabel nameLabel = new JLabel("Names");
	    JLabel userLabel = new JLabel("UserName");
	    JLabel passLabel = new JLabel("Password");
	    JTextField nameField = new JTextField();
	    JTextField userField = new JTextField();
	    JPasswordField passField = new JPasswordField();
	    JButton registerBtn = new JButton("Register");
	    JButton resetBtn = new JButton("Reset");
	    public registrationform() {
	        createWindow();
	        setLocationAndSize();
	        addComponentsToFrame();
	        addActionEvent();
	    }
	    private void createWindow() {
	        frame = new JFrame();
	        frame.setTitle("Registration Form");
	        frame.setBounds(100, 100, 500, 350);
	        frame.getContentPane().setBackground(new Color(79, 149, 209));
	        frame.getContentPane().setLayout(null);
	        frame.setVisible(true);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setResizable(false);
	    }
	    private void setLocationAndSize() {
	        nameLabel.setBounds(50, 40, 150, 40);
	        nameField.setBounds(220, 40, 200, 40);

	        userLabel.setBounds(50, 100, 150, 40);
	        userField.setBounds(220, 100, 200, 40);

	        passLabel.setBounds(50, 160, 150, 40);
	        passField.setBounds(220, 160, 200, 40);

	        registerBtn.setBounds(70, 230, 170, 40);
	        resetBtn.setBounds(260, 230, 170, 40);
	    }
	    private void addComponentsToFrame() {
	        frame.add(nameLabel);
	        frame.add(nameField);
	        frame.add(userLabel);
	        frame.add(userField);
	        frame.add(passLabel);
	        frame.add(passField);
	        frame.add(registerBtn);
	        frame.add(resetBtn);
	    }
	    private void addActionEvent() {
	        registerBtn.addActionListener(this);
	        resetBtn.addActionListener(this);
	    }
	    public static void main(String[] args) {
	        new registrationform();
	    }
	    public void actionPerformed(ActionEvent arg0) {
	        if (arg0.getSource() == registerBtn) {
	            String names = nameField.getText();
	            String username = userField.getText();
	            char[] passChars = passField.getPassword();
	            String password = new String(passChars); 
	            Arrays.fill(passChars, '\0'); 
	            JOptionPane.showMessageDialog(frame,
	                    "Registered:\nNames: " + names + "\nUserName: " + username);
	        } else if (arg0.getSource() == resetBtn) {
	            nameField.setText("");
	            userField.setText("");
	            passField.setText("");
	        }
	    }
	}


