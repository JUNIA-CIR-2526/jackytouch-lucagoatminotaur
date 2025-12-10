package com.jad.jackytouch.view;

import com.jad.jackytouch.share.ICar;
import com.jad.jackytouch.share.IView;
import com.jad.textwindow.TextWindow;
import com.jad.textwindow.TextWindowSettings;

import java.awt.event.KeyEvent;


public class View implements IView {
    private static final int SCREEN_HEIGHT = 40;
    private static final int SCREEN_WIDTH = 100;
    private static final int WAITING_TIME = 200;
    private final TextWindow textWindow;


    public View() {
        TextWindowSettings settings = new TextWindowSettings();
        settings.setTitle("BOMBOCLAT");
        settings.setScreenHeight(View.SCREEN_HEIGHT);
        settings.setScreenWidth(View.SCREEN_WIDTH);
        settings.addKeyboardListener(KeyEvent.VK_SPACE, "Proceed");
        this.textWindow = new TextWindow(settings);
        this.textWindow.setTitle("JACKYTOUCH");
        this.textWindow.setVisible(true);
    }


    @SuppressWarnings("StatementWithEmptyBody")
    public void displayCar(final ICar car) {
        // Format: ASCII + effects with ">" + tunings with "|"
        String output = car.getAscii() + "\n"
                + addSymbolAtStart(car.getDescription(), "> ") + "\n"
                + addSymbolAtStart(car.getName(), "| ");

        this.display(output);

        // Wait for "Proceed" action
        while (this.textWindow.isOff("Proceed")) {
        }

        try {
            Thread.sleep(WAITING_TIME);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }


    public void display(final String message) {
        this.textWindow.display(message);
    }

    private String addSymbolAtStart(String text, String prefix) {
        if (text.isEmpty()) return "";

        return prefix + text.replace("\n", "\n" + prefix) + "\n";
    }

}
