package com.bbq.flashcards;

import javax.swing.*;
import java.awt.*;

public class WelcomeFrame extends TemplateFrame {
    @Override
    protected void addCustomContent(JPanel backgroundPanel) {
        // Create a panel for the logo and welcome text with FlowLayout
        JPanel logoPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 0));
        logoPanel.setOpaque(false); // Make the panel transparent

        // Load logo image
        ImageIcon logoIcon = new ImageIcon("resources/images/logo-80x80.png");
        JLabel logoLabel = new JLabel(logoIcon);

        // Create welcome label
        JLabel welcomeLabel = new JLabel("Willkommen");
        welcomeLabel.setFont(new Font("Arial", Font.PLAIN, 36)); // Set font size to 36
        welcomeLabel.setForeground(Color.WHITE); // Set font color to white
        welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Add logo and welcome label to the logo panel
        logoPanel.add(logoLabel);
        logoPanel.add(welcomeLabel);

        // Create header label for "Flashcards von BBQ"
        JLabel flashcardsHeader = new JLabel("Flashcards von BBQ");
        flashcardsHeader.setFont(new Font("Arial", Font.BOLD, 48)); // Set font size to 48 for header
        flashcardsHeader.setForeground(Color.WHITE); // Set font color to white
        flashcardsHeader.setHorizontalAlignment(SwingConstants.CENTER);

        // Create sub-header label for "Fachinformatiker Anwendungsentwicklung"
        JLabel fachinformatikerLabel = new JLabel("Fachinformatiker Anwendungsentwicklung");
        fachinformatikerLabel.setFont(new Font("Arial", Font.PLAIN, 24)); // Set font size to 24 for sub-header
        fachinformatikerLabel.setForeground(Color.WHITE); // Set font color to white
        fachinformatikerLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Create a panel to center the header and sub-header both horizontally and vertically
        JPanel headerPanel = new JPanel(new GridBagLayout());
        headerPanel.setOpaque(false);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(20, 0, 10, 0); // Add some vertical space around the header
        headerPanel.add(flashcardsHeader, gbc);

        gbc.gridy = 1;
        gbc.insets = new Insets(0, 0, 80, 0); // Add some vertical space below the sub-header
        headerPanel.add(fachinformatikerLabel, gbc);

        // Add the logo panel and header panel to the background panel
        backgroundPanel.add(logoPanel, BorderLayout.NORTH);
        backgroundPanel.add(headerPanel, BorderLayout.CENTER);
    }

    @Override
    protected JFrame createNextPageFrame() {
        return new NextPageFrame();
    }
}
