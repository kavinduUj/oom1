package com.oom.as01;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

public class App {

	JFrame mainFrame;
	JPanel upperPanel;
	JPanel mainTextAreaPanel;
	JPanel mainBtnGroupPanel;
	JPanel scrollablePanel;
	List<JPanel> userPanels;

	public App() {

		mainFrame = new JFrame("Social App");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(1400, 800);
		mainFrame.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		userPanels = new ArrayList<>();

		upperPanel = new JPanel();
		upperPanel.setLayout(new BorderLayout());
		JScrollPane scrollPane = new JScrollPane();
		scrollablePanel = new JPanel();
		scrollablePanel.setLayout(new GridBagLayout());
		scrollPane.setViewportView(scrollablePanel);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		upperPanel.add(scrollPane, BorderLayout.CENTER);

		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 1.0;
		gbc.weighty = 0.75;
		gbc.fill = GridBagConstraints.BOTH;
		mainFrame.add(upperPanel, gbc);
		mainFrame.setVisible(true);

	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(App::new);
	}
}
