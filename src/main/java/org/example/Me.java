package org.example;

public class Me {
    private static final Me me = new Me();
    private String name;
    private String lastName;
    private Me(){
        this.name = "Artem";
        this.lastName = "Poliakov";
    }
    public static Me getInstance(){
        return me;
    }
}
