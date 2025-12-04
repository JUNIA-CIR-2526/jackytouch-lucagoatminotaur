package com.jad.jackytouch.view;
import com.jad.textwindow.TextWindow;
import com.jad.textwindow.TextWindowSettings;
import java.awt.*;
import java.awt.event.KeyEvent;


public class View {
    private final TextWindow textWindow;
    TextWindowSettings settings = new TextWindowSettings();

    public TextWindow getTextWindow() {
        settings.setTitle("Bomboclat");
        settings.addKeyboardListener(KeyEvent.VK_ESCAPE, "exit");
        settings.setScreenHeight(40);
        settings.setScreenWidth(60);
        settings.setBackgroundColor(Color.BLACK);
        settings.setForegroundColor(Color.GREEN);
        settings.setFontSize(24);
        TextWindow textWindow = new TextWindow(settings);
        textWindow.setVisible(true);
        return textWindow;
    }


    public View() {
        this.textWindow = new TextWindow();
        this.textWindow.setVisible(true);
    }
}
