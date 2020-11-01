package com.company.USBDevice;

public class MemoryStick implements USBDevice {

    private String name;
    private boolean ejected = false;

    public MemoryStick(String name){
        this.name = name;
    }

    @Override
    public boolean connect() {
        System.out.println("Connected memory stick");
        return true;

    }

    @Override
    public boolean disconnect() {
        if(!ejected){
            System.out.println("Please eject memory stick first");
            return false;
        } else {
            System.out.println("Disconnected memory stick");
            return true;
        }
    }

    public void eject() {
        System.out.println("Ejecting memory stick");
        ejected = true;

    }

    @Override
    public String getName() {

        return name;
    }
}
