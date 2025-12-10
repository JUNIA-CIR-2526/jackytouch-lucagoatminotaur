package com.jad.jackytouch.model;

import com.jad.jackytouch.share.IBehavior;
import com.jad.jackytouch.share.ICar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public abstract class AbstractCarDecorator implements ICar {
    protected ICar car;
    protected IBehavior behavior;
    protected String overlay;

    protected AbstractCarDecorator(ICar car, IBehavior behavior, String resourcePath) {
        this.car = car;
        this.behavior = behavior;
        this.overlay = loadResource(resourcePath);
    }

    @Override
    public String getAscii() {
        return merge(car.getAscii(), overlay);
    }

    @Override
    public String getDescription() {
        String baseDesc = car.getDescription();
        String currentEffect = behavior.getDescription();

        if (baseDesc.isEmpty()) {
            return currentEffect;
        }
        return baseDesc + "\n" + currentEffect;
    }

    @Override
    public String getName() {
        String baseName = car.getName();
        String tuningLine = getTuningName() + " " + behavior.getName();

        if (baseName.isEmpty()) {
            return tuningLine;
        }
        return baseName + "\n" + tuningLine;
    }


    private String merge(String base, String overlay) {
        String[] baseLines = base.split("\n", -1);
        String[] overlayLines = overlay.split("\n", -1);

        StringBuilder result = new StringBuilder();
        int lines = Math.max(baseLines.length, overlayLines.length);

        for (int i = 0; i < lines; i++) {
            String baseLine = "";
            if (i < baseLines.length) {
                baseLine = baseLines[i];
            }

            String overlayLine = "";
            if (i < overlayLines.length) {
                overlayLine = overlayLines[i];
            }

            int width = Math.max(baseLine.length(), overlayLine.length());

            for (int j = 0; j < width; j++) {
                char baseChar = ' ';
                if (j < baseLine.length()) {
                    baseChar = baseLine.charAt(j);
                }

                char overlayChar = '.';
                if (j < overlayLine.length()) {
                    overlayChar = overlayLine.charAt(j);
                }

                if (overlayChar == '.') {
                    result.append(baseChar);
                } else {
                    result.append(overlayChar);
                }
            }

            if (i < lines - 1) {
                result.append('\n');
            }
        }

        return result.toString();
    }

    protected abstract String getTuningName();

    private String loadResource(String path) {
        StringBuilder content = new StringBuilder();
        try (InputStream is = getClass().getResourceAsStream(path);
             BufferedReader reader = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append('\n');
            }
        } catch (IOException e) {
            throw new RuntimeException("Error loading " + path, e);
        }
        return content.toString();
    }
}