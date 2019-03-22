package com.zipcodewilmington.preassessment2;

public enum AliceBobEnum {
    ALICE,
    BOB;

    private String catchPhrase = "Hi, my name is " + name() + ".";

    public String getCatchPhrase(){
        return this.catchPhrase;
    }

    public boolean isBob(){
        return this.equals(BOB);
    }

    public boolean isAlice(){
        return this.equals(ALICE);
    }
}
