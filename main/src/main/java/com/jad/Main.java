package com.jad;

import com.jad.jackytouch.controller.Controller;
import com.jad.jackytouch.model.Model;
import com.jad.jackytouch.view.View;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller();
        controller.setModel(model);
        controller.setView(view);
        controller.proceed();

    }
}