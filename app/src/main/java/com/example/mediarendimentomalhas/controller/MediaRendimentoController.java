package com.example.mediarendimentomalhas.controller;

public class MediaRendimentoController {
    private static final MediaRendimentoController ourInstance = new MediaRendimentoController();

    public static MediaRendimentoController getInstance() {
        return ourInstance;
    }

    private MediaRendimentoController() {
    }
}
