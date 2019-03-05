package com.wzy.view;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * LoginFrame
 */
public class LoginFrame extends JFrame {

    private static final long serialVersionUID = 1L;

    JButton loginButton = new JButton("登录");
    JButton cancelButton = new JButton("取消");
    JLabel label1 = new JLabel("用户名");
    JLabel label2 = new JLabel("密码");
    JTextField userNameTF = new JTextField("Admin");
    JPasswordField pswTF = new JPasswordField("123456");

    public LoginFrame() {
        super.setSize(400, 300);
        super.setTitle("用户登录");

        Container container = super.getContentPane();

        container.setLayout(null);

        loginButton.setBounds(40, 150, 120, 40);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ("Admin".equals(userNameTF.getText()) && "123456".equals(pswTF.getText())) {
                    dispose();
                    new MainFrame();
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

}
