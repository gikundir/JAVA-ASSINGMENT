
	package com.form;
	import java.awt.Color;
	import java.awt.Font;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import javax.swing.*;
	import java.text.DecimalFormat;
	import java.text.DecimalFormatSymbols;
	public class looncalculator implements ActionListener {
	    JFrame frame;
	    JLabel amountLabel = new JLabel("Amount requested");
	    JLabel durationLabel = new JLabel("Duration(year)");
	    JLabel totalLabel = new JLabel("Total to return");
	    JTextField amountField = new JTextField();
	    JTextField durationField = new JTextField();
	    JTextField totalField = new JTextField();
	    JButton calculateBtn = new JButton("Calculate");
	    final double INTEREST_RATE = 0.006;
	    public looncalculator() {
	        createWindow();
	        setLocationAndSize();
	        addComponentsToFrame();
	        addActionEvent();
	    }
	    private void addActionEvent() {
	        calculateBtn.addActionListener(this);
	    }
	    private void addComponentsToFrame() {
	        frame.add(amountLabel);
	        frame.add(amountField);
	        frame.add(durationLabel);
	        frame.add(durationField);
	        frame.add(totalLabel);
	        frame.add(totalField);
	        frame.add(calculateBtn);
	    }
	    private void setLocationAndSize() {
	        amountLabel.setBounds(40, 50, 150, 40);
	        amountField.setBounds(220, 50, 200, 40);
	        durationLabel.setBounds(40, 110, 150, 40);
	        durationField.setBounds(220, 110, 200, 40);
	        totalLabel.setBounds(40, 170, 150, 40);
	        totalField.setBounds(220, 170, 200, 40);
	        calculateBtn.setBounds(120, 230, 250, 40);
	        totalField.setEditable(false);
	        totalField.setFont(new Font("Arial", Font.BOLD, 18));
	    }
	    private void createWindow() {
	        frame = new JFrame();
	        frame.setTitle("Loan Calculator");
	        frame.setBounds(100, 100, 500, 350);
	        frame.getContentPane().setBackground(new Color(79, 149, 209));
	        frame.getContentPane().setLayout(null);
	        frame.setVisible(true);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setResizable(false);
	    }
	    public static void main(String[] args) {
	        new looncalculator();
	    }
	    public void actionPerformed(ActionEvent e) {
	        try {
	            double amount = Double.parseDouble(amountField.getText().trim());
	            int years = Integer.parseInt(durationField.getText().trim());
	            double total = amount + (amount * INTEREST_RATE * years);
	            DecimalFormatSymbols symbols = new DecimalFormatSymbols();
	            symbols.setGroupingSeparator(' ');
	            DecimalFormat df = new DecimalFormat("#,##0");
	            df.setDecimalFormatSymbols(symbols);
	            df.setGroupingUsed(true);
	            totalField.setText(df.format(total));
	        } catch (NumberFormatException ex) {
	            JOptionPane.showMessageDialog(frame, "Please enter valid numeric values.");
	        }
	    }
	}

