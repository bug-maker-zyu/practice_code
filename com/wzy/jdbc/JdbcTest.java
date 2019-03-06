package com.wzy.jdbc;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.wzy.view.MainFrame;

public class JdbcTest extends JFrame{
	
	JButton loginButton = new JButton("登录");
    JButton cancelButton = new JButton("取消");
    JLabel label1 = new JLabel("用户名");
    JLabel label2 = new JLabel("密码");
    JTextField userNameTF = new JTextField();
    JPasswordField pswTF = new JPasswordField();
	
	public JdbcTest() {
		super.setSize(400, 300);
        super.setTitle("用户登录");

        Container container = super.getContentPane();

        container.setLayout(null);

        loginButton.setBounds(40, 150, 120, 40);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ServiceTest.login(userNameTF.getText(), pswTF.getText())) {
                    JOptionPane.showMessageDialog(null, "登录成功");
                } else {
                    JOptionPane.showMessageDialog(null, "error!!");
                }
            }
        });

        container.add(loginButton);

        cancelButton.setBounds(190, 150, 120, 40);
        cancelButton.addActionListener(e -> System.exit(0));
        container.add(cancelButton);

        label1.setBounds(40, 30, 80, 40);
        container.add(label1);

        label2.setBounds(40, 80, 80, 40);
        container.add(label2);

        userNameTF.setBounds(120, 30, 220, 40);
        container.add(userNameTF);

        pswTF.setBounds(120, 80, 220, 40);
        container.add(pswTF);

        super.setVisible(true);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new JdbcTest();
	}
	
}
