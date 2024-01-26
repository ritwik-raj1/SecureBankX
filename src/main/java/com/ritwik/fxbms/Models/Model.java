package com.ritwik.fxbms.Models;

import com.ritwik.fxbms.Views.ViewFactory;

public class Model {
    private static Model model;
    private final ViewFactory viewFactory;

    private Model() {
        this.viewFactory = new ViewFactory();
    }
    public static synchronized Model getInstance() {
        if(model == null) {
            model = new Model();
        }
        return model;
    }
    public ViewFactory getViewFactory() {
        return viewFactory;
    }

//    public String setCurrentUserAccount(String pin) {
//        return pin;
//    }
}
