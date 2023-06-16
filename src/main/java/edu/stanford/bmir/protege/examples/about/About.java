package edu.stanford.bmir.protege.examples.about;

import edu.enspy.gi.ontology.algorithm.matcher.MatchingEngine;
import edu.enspy.gi.ontology.algorithm.merger.holisticMerge.HolisticMerger;
import org.protege.editor.owl.ui.action.ProtegeOWLAction;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;


public class About extends ProtegeOWLAction {

	private static final long serialVersionUID = 1L;

	private final JDialog aboutDialog = new JDialog();

	private JLabel authorLabel;
	private JLabel authorValueLabel;
	private JButton closeButton;
	private JEditorPane licenseEditorPane;
	private JPanel licensePanel;
	private JScrollPane licenseScrollPane;
	private JPanel mainPanel;
	private JLabel titleLabel;
	private JLabel versionLabel;
	private JLabel versionValueLabel;



	public void initialise() throws Exception {

		GridBagConstraints gridBagConstraints;

		mainPanel = new javax.swing.JPanel();
		titleLabel = new javax.swing.JLabel();
		authorLabel = new javax.swing.JLabel();
		authorValueLabel = new javax.swing.JLabel();
		versionLabel = new javax.swing.JLabel();
		versionValueLabel = new javax.swing.JLabel();
		licensePanel = new javax.swing.JPanel();
		licenseScrollPane = new JScrollPane();
		licenseEditorPane = new JEditorPane();
		licenseEditorPane.setContentType("text/html");
		closeButton = new JButton();


		aboutDialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		aboutDialog.setTitle("About ENSPY Ontology Merger");
		aboutDialog.setModal(true);

		mainPanel.setLayout(new GridBagLayout());

		mainPanel.setPreferredSize(new java.awt.Dimension(400, 400));
		titleLabel.setText("ENSPY Ontology Merger");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
		gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 5);
		mainPanel.add(titleLabel, gridBagConstraints);

		authorLabel.setText("Authors:");
		gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.anchor = GridBagConstraints.LINE_START;
		gridBagConstraints.insets = new Insets(5, 5, 0, 0);
		mainPanel.add(authorLabel, gridBagConstraints);

		authorValueLabel.setText("ENSPY (National Advanced School Of Engineering)");
		gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.anchor = GridBagConstraints.LINE_START;
		gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 5);
		mainPanel.add(authorValueLabel, gridBagConstraints);

		versionLabel.setText("Revision:");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 3;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
		gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 0);
		mainPanel.add(versionLabel, gridBagConstraints);

		versionValueLabel.setText("V01");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 3;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
		gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
		mainPanel.add(versionValueLabel, gridBagConstraints);

		licensePanel.setLayout(new java.awt.GridBagLayout());

		licensePanel.setBorder(new javax.swing.border.TitledBorder("License"));
		licenseEditorPane.setEditable(false);

		licenseScrollPane.setViewportView(licenseEditorPane);

		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		gridBagConstraints.weightx = 1.0;
		gridBagConstraints.weighty = 1.0;
		gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
		licensePanel.add(licenseScrollPane, gridBagConstraints);

		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 4;
		gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		gridBagConstraints.weightx = 1.0;
		gridBagConstraints.weighty = 1.0;
		mainPanel.add(licensePanel, gridBagConstraints);

		closeButton.setText("Close");
		closeButton.addActionListener(this::closeButtonActionPerformed);


		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
		gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
		mainPanel.add(closeButton, gridBagConstraints);

		aboutDialog.getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);
		aboutDialog.pack();
	}

	public void dispose() throws Exception {
		aboutDialog.dispose();
	}

	public void actionPerformed(ActionEvent arg0) {
		setVisible(true);
	}


	public void setVisible(boolean b) {
		if (b) {
			licenseScrollPane.getHorizontalScrollBar().setValue(0);
			licenseScrollPane.getVerticalScrollBar().setValue(0);
		}
		aboutDialog.setVisible(b);
	}

	private void closeButtonActionPerformed(ActionEvent evt) {
		aboutDialog.dispose();
	}

}
