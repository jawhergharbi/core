package com.childcore.core.model;

public class DummyDto {
    String name;
    int numberCount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberCount() {
        return numberCount;
    }

    public void setNumberCount(int numberCount) {
        this.numberCount = numberCount;
    }

    public DummyDto(String name, int numberCount) {
        this.name = name;
        this.numberCount = numberCount;
    }
}
