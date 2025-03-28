package com.example.reproducer;

import io.quarkus.runtime.Quarkus;

public class ReproducerApplication {
    /**
     * Entry point for manual start in Java. Delegates to Quarkus.
     * 
     * @param args The command line.
     */
    public static void main(String... args) {
        Quarkus.run(args);
    }
}
