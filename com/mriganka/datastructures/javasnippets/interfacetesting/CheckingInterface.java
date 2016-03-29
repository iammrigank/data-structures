package com.mriganka.datastructures.javasnippets.interfacetesting;

public class CheckingInterface implements Interface1, Interface2 {
    @Override
    public String showName() {
        return "Mriganka";
    }

    @Override
    public int showAge() {
        return 24;
    }
}
