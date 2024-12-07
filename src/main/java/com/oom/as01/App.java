package com.oom.as01;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

public class App {

	JFrame mainFrame;
	JPanel upperPanel;
	JPanel mainTextArea;
	JPanel mainBtnGroup;
	JPanel scrollable;
	List<JPanel> userPanels;

	public App() {
		mainUi();
	}
	
	
	public void mainUi() {
	
        mainFrame = new JFrame("Social Media Application");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(1400, 800);
        mainFrame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        userPanels = new ArrayList<>();

       
        upperPanel = new JPanel();
        upperPanel.setLayout(new BorderLayout());
        JScrollPane scrollPane = new JScrollPane();
        scrollable = new JPanel();
        scrollable.setLayout(new GridBagLayout());
        scrollPane.setViewportView(scrollable);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        upperPanel.add(scrollPane, BorderLayout.CENTER);

       
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 0.75;
        gbc.fill = GridBagConstraints.BOTH;
        mainFrame.add(upperPanel, gbc);

      
        JPanel panelB = new JPanel();
        panelB.setLayout(new GridBagLayout());

        mainTextArea = new JPanel();
        mainTextArea.setLayout(new GridBagLayout());
        scrollable = new JPanel();
        scrollable.setLayout(new GridBagLayout());
        JTextArea textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setDocument(new javax.swing.text.PlainDocument() {
            @Override
            public void insertString(int offs, String str, javax.swing.text.AttributeSet a) throws javax.swing.text.BadLocationException {
                if (getLength() + str.length() <= 250) {
                    super.insertString(offs, str, a);
                }
            }
        });

        textArea.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        JScrollPane textAreaScrollPane = new JScrollPane(textArea);

        GridBagConstraints textAreaConstraints = new GridBagConstraints();
        textAreaConstraints.gridx = 0;
        textAreaConstraints.gridy = 0;
        textAreaConstraints.weightx = 1.0;
        textAreaConstraints.weighty = 1.0;
        textAreaConstraints.insets = new Insets(10, 10, 10, 10);
        textAreaConstraints.fill = GridBagConstraints.BOTH;

        mainTextArea.add(textAreaScrollPane, textAreaConstraints);

        mainBtnGroup = new JPanel();
        mainBtnGroup.setLayout(new GridBagLayout());
        JButton publishButton = new JButton("Publish");
        JButton newUserButton = new JButton("New User");

        GridBagConstraints b2Constraints = new GridBagConstraints();
        b2Constraints.gridx = 0;
        b2Constraints.gridy = 0;
        b2Constraints.weightx = 1.0;
        b2Constraints.weighty = 0.5;
        b2Constraints.fill = GridBagConstraints.BOTH;
        mainBtnGroup.add(publishButton, b2Constraints);

        b2Constraints.gridy = 1;
        mainBtnGroup.add(newUserButton, b2Constraints);

        GridBagConstraints bConstraints = new GridBagConstraints();
        bConstraints.weightx = 0.5;
        bConstraints.weighty = 1.0;
        bConstraints.fill = GridBagConstraints.BOTH;

        bConstraints.gridx = 0;
        panelB.add(mainTextArea, bConstraints);

        bConstraints.gridx = 1;
        panelB.add(mainBtnGroup, bConstraints);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 0.25;
        gbc.fill = GridBagConstraints.BOTH;
        mainFrame.add(panelB, gbc);


        mainFrame.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(App::new);
	}
}
