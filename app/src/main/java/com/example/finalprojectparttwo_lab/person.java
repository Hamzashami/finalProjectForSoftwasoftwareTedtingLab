package com.example.finalprojectparttwo_lab;

class person {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImag() {
        return imag;
    }

    public void setImag(int imag) {
        this.imag = imag;
    }

    public person(String name, int imag) {
        this.name = name;
        this.imag = imag;
    }

    private String name;
    private int imag;
}
