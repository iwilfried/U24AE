package com.bbq.flashcards;

public class Main {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                WelcomeFrame welcomeFrame = new WelcomeFrame();
                welcomeFrame.setVisible(true);
            }
        });
    }
}


