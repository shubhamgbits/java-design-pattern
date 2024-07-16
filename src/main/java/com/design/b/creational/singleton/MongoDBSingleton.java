package com.design.b.creational.singleton;

public class MongoDBSingleton {
    private static MongoDBSingleton instance = null;
    private final String mongoClient;

    // Private Constructor to prevent direct instantiation outside of the class
    private MongoDBSingleton() {
        mongoClient = "MongoDB Client Initialized";
    }

    public static MongoDBSingleton getInstance() {
        if (instance == null) {
            // Ensuring thread safety while creation
            synchronized (MongoDBSingleton.class) {
                instance = new MongoDBSingleton();
            }
        }
        return instance;
    }

    public String getClient() {
        return mongoClient;
    }
}

