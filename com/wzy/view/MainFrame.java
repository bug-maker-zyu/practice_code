package com.wzy.view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * MainFrame
 */
public class MainFrame extends JFrame {

    private static final long serialVersionUID = 1L;

    JButton jb1 = new JButton("按钮1");
    JButton jb2 = new JButton("按钮2");
    JButton jb3 = new JButton("按钮3");

    public MainFrame() {
		
		setExtendedState(MAXIMIZED_BOTH);
		Container container = super.getContentPane();
		JPanel jpNorth = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		jb1.addActionListener(e -> new TestDialog());
		
		jpNorth.add(jb1);
		jpNorth.add(jb2);
		jpNorth.add(jb3);
		
		container.add(jpNorth, BorderLayout.NORTH);
			
		
		super.setVisible(true);
    }
    
}