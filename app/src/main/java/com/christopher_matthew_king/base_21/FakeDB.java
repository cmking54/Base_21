package com.christopher_matthew_king.base_21;

public class FakeDB {

    public static final FakeDB[] rows = new FakeDB[]{
            new FakeDB("Choice 1", "It's The One!"),
            new FakeDB("Choice 2", "This One Too!"),
            new FakeDB("Choice 3", "Not me! I have a family!")
    };

    private String name, description;

    public FakeDB(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
