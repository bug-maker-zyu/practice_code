package com.wzy.view;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class addDialog extends JDialog {
	
	TestDialog dialog;
	
	JLabel numLabel = new JLabel("编号");
	JLabel nameLabel = new JLabel("姓名");
	JLabel symLabel = new JLabel("症状");
	
	JTextField numField = new JTextField();
	JTextField nameField = new JTextField();
	JTextField symField = new JTextField();
	
	JButton okButton = new JButton("确定");
	JButton cancelButton = new JButton("取消");
	
	public addDialog(TestDialog dialog) {
		
		this.dialog = dialog;
		
		super.setSize(400, 300);
		super.setLocationRelativeTo(null);
		
		Container container = super.getContentPane();
		container.setLayout(null);
		
		numLabel.setBounds(50, 50, 50, 30);
		nameLabel.setBounds(50, 100, 50, 30);
		symLabel.setBounds(50, 150, 50, 30);
		
		numField.setBounds(120, 50, 230, 30);
		nameField.setBounds(120, 100, 230, 30);
		symField.setBounds(120, 150, 230, 30);
		
		okButton.setBounds(50, 200, 120, 30);
		cancelButton.setBounds(200, 200, 120, 30);	
		
		okButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dialog.list.add(new Patient(numField.getText(), nameField.getText(), symField.getText()));
				dispose();
			}
		});
		
		cancelButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
				dialog.updateDatas();
				dialog.repaint();
			}
		});
		
		container.add(numLabel);
		container.add(nameLabel);
		container.add(symLabel);
		container.add(numField);
		container.add(nameField);
		container.add(symField);
		container.add(okButton);
		container.add(cancelButton);
		
		super.setVisible(true);
	}
	
	
}
