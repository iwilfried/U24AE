package com.bbq.flashcards;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.json.JSONArray;
import org.json.JSONObject;

public class NextPageFrame extends TemplateFrame {
    private JLabel questionLabel;

    public NextPageFrame() {
        super();
        loadQuestion();
    }

    @Override
    protected void addCustomContent(JPanel backgroundPanel) {
        // Create a panel for the question text
        JPanel questionPanel = new JPanel(new BorderLayout());
        questionPanel.setOpaque(false);

        questionLabel = new JLabel("Loading question...");
        questionLabel.setFont(new Font("Arial", Font.PLAIN, 24));
        questionLabel.setForeground(Color.WHITE);
        questionLabel.setHorizontalAlignment(SwingConstants.CENTER);

        questionPanel.add(questionLabel, BorderLayout.CENTER);

        backgroundPanel.add(questionPanel, BorderLayout.CENTER);
    }

    @Override
    protected JFrame createNextPageFrame() {
        return null;
    }

    private void loadQuestion() {
        try {
            String content = new String(Files.readAllBytes(Paths.get("resources/questions.json")), "UTF-8");
            JSONArray questionsArray = new JSONArray(content);
            if (questionsArray.length() > 0) {
                JSONObject firstQuestion = questionsArray.getJSONObject(0);
                questionLabel.setText(firstQuestion.getString("question"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



