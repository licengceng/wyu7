package com.homework;

/**
 * @author LWQ
 * @title: Phone
 * @projectName Sep14_homework
 * @description: TODO
 * @date 2020/9/1611:36
 */
public class Phone {
    private int screenSize;
    private String brand;
    private  double cpu;
    private int memory;

    @Override
    public String toString() {
        return "Phone{" +
                "screenSize=" + screenSize +
                ", brand='" + brand + '\'' +
                ", cpu=" + cpu +
                ", memory=" + memory +
                '}';
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
}
