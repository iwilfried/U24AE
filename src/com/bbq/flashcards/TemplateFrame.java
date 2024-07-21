package com.bbq.flashcards;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public abstract class TemplateFrame extends JFrame {
    public TemplateFrame() {
        // Remove the title bar
        setUndecorated(true);

        // Set window properties
        setSize(960, 600); // Set the window size to 960x600 (16:10 aspect ratio)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create a menu bar
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(new Color(45, 45, 45)); // Set background color to dark grey

        // Create the menu button using PNG
        JButton menuButton = createPngButton("resources/images/icons8-menu.png", 30, 30);
        menuButton.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0)); // Add left margin
        menuButton.setContentAreaFilled(false);
        menuButton.setFocusPainted(false);
        menuButton.setOpaque(false);

        // Create a popup menu
        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem impressumItem = new JMenuItem("Impressum");
        JMenuItem infoItem = new JMenuItem("Info");
        popupMenu.add(impressumItem);
        popupMenu.add(infoItem);

        // Add action listener to show the popup menu
        menuButton.addActionListener(e -> popupMenu.show(menuButton, menuButton.getWidth() / 2, menuButton.getHeight() / 2));

        // Add the menu button to the menu bar
        menuBar.add(menuButton);

        // Create a close button using PNG
        JButton closeButton = createPngButton("resources/images/icons8-close-32.png", 32, 32);
        closeButton.addActionListener(e -> System.exit(0)); // Add action to exit the application

        // Create a panel to hold the close button and add it to the right side of the menu bar
        JPanel closeButtonPanel = new JPanel(new BorderLayout());
        closeButtonPanel.setOpaque(false);
        closeButtonPanel.add(closeButton, BorderLayout.EAST);

        // Add the close button panel to the menu bar
        menuBar.add(Box.createHorizontalGlue());
        menuBar.add(closeButtonPanel);

        // Set the menu bar for the frame
        setJMenuBar(menuBar);

        // Create a background panel
        JPanel backgroundPanel = new JPanel() {
            private Image backgroundImage = new ImageIcon("resources/images/background.png").getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        };
        backgroundPanel.setLayout(new BorderLayout());
        backgroundPanel.setPreferredSize(new Dimension(960, 600)); // Ensure background panel size

        // Add custom content
        addCustomContent(backgroundPanel);

        // Create a black footer bar with white line and text
        JPanel footerBar = new JPanel(new BorderLayout());
        footerBar.setBackground(new Color(45, 45, 45)); // Set background color to dark grey
        footerBar.setPreferredSize(new Dimension(960, 60)); // Set height for the footer bar

        // Create a thin white line
        JSeparator whiteLine = new JSeparator(SwingConstants.HORIZONTAL);
        whiteLine.setForeground(Color.WHITE);
        whiteLine.setPreferredSize(new Dimension(960, 1));

        // Create footer text label
        JLabel footerTextLabel = new JLabel("Projektarbeit Sommer 24");
        footerTextLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        footerTextLabel.setForeground(Color.WHITE);
        footerTextLabel.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 0)); // Add left margin

        // Create the next page button using PNG
        JButton nextPageButton = createPngButton("resources/images/icons8-next-page-48.png", 48, 48);
        nextPageButton.addActionListener(e -> {
            // Create and show the next frame (this could be customized as well)
            JFrame nextFrame = createNextPageFrame();
            nextFrame.setVisible(true);
            // Dispose the current frame
            dispose();
        });

        // Create a panel to hold the next page button and add it to the right side of the footer bar
        JPanel nextButtonPanel = new JPanel(new BorderLayout());
        nextButtonPanel.setOpaque(false);
        nextButtonPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 20)); // Adjust the border for positioning
        nextButtonPanel.add(nextPageButton, BorderLayout.EAST);

        // Add components to the footer bar
        footerBar.add(whiteLine, BorderLayout.NORTH);
        footerBar.add(footerTextLabel, BorderLayout.WEST);
        footerBar.add(nextButtonPanel, BorderLayout.EAST);

        // Add the components to the background panel
        backgroundPanel.add(footerBar, BorderLayout.SOUTH);

        // Add background panel to the frame
        add(backgroundPanel, BorderLayout.CENTER);

        // Pack the frame to respect the preferred size of its components
        pack();
    }

    protected abstract void addCustomContent(JPanel backgroundPanel);

    protected abstract JFrame createNextPageFrame();

    private JButton createPngButton(String filePath, int width, int height) {
        JButton button = new JButton();
        try {
            Image img = ImageIO.read(new File(filePath));
            ImageIcon icon = new ImageIcon(img.getScaledInstance(width, height, Image.SCALE_SMOOTH));
            button.setIcon(icon);
        } catch (IOException e) {
            e.printStackTrace();
        }
        button.setBorderPainted(false);
        button.setContentAreaFilled(false);
        button.setFocusPainted(false);
        button.setOpaque(false);
        return button;
    }
}


