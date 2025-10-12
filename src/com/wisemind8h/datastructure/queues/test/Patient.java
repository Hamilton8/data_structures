package com.wisemind8h.datastructure.queues.test;

public class Patient implements Comparable<Patient>{
    private String name;
    private int prior;

    public Patient(){}

    public Patient(String name, int prior) {
        this.name = name;
        this.prior = prior;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrior() {
        return prior;
    }

    public void setPrior(int prior) {
        this.prior = prior;
    }

    @Override
    public int compareTo(Patient p) {
        if (this.prior > p.getPrior()){
            return 1;
        } else if (this.prior<p.getPrior()) {
            return  -1;
        }
        return 0;
    }
}
