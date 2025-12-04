package com.jad;

import com.jad.textwindow.TextWindow;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        final TextWindow textWindow;

        textWindow = new TextWindow();
        textWindow.setVisible(true);
        String resourcePath = "/car_base.txt";
        InputStream inputStream = Main.class.getResourceAsStream(resourcePath);
        if (inputStream == null) {
            throw new IllegalArgumentException("File not found: " + resourcePath);
        }
        try {
            String content = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
            textWindow.display(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}