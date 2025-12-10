package com.jad.jackytouch.model;

import com.jad.jackytouch.share.ICar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Car implements ICar {
    private String ascii;

    public Car() {
        this.ascii = loadResource("/car_base.txt");
    }

    @Override
    public String getAscii() {
        return ascii;
    }

    @Override
    public String getDescription() {
        return "";
    }

    @Override
    public String getName() {
        return "";
    }

    private String loadResource(String path) {
        StringBuilder content = new StringBuilder();
        try (InputStream is = getClass().getResourceAsStream(path);
             BufferedReader reader = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append('\n');
            }
        } catch (IOException e) {
            throw new RuntimeException("Erreur lors du chargement de " + path, e);
        }
        return content.toString();
    }
}

