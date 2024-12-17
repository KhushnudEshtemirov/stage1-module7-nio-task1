package com.epam.mjc.nio;

import java.io.IOException;

public class CustomExeption extends RuntimeException {
    public CustomExeption(IOException message) {
        super(message);
    }
}
