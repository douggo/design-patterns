package br.com.douggo.prototype.animation.model;

public class Person implements Cloneable {

    private String line1;
    private String line2;
    private String line3;
    private String line4;

    public Person(String line1, String line2, String line3, String line4) {
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
        this.line4 = line4;
    }

    public void draw() {
        System.out.println();
        System.out.println(this.line1);
        System.out.println(this.line2);
        System.out.println(this.line3);
        System.out.println(this.line4);
    }

    public void walkLeft() throws CloneNotSupportedException {
        this.line1 = this.line1.substring(1);
        this.line2 = this.line2.substring(1);
        this.line3 = this.line3.substring(1);
        this.line4 = this.line4.substring(1);
    }

    public void walkRight() {
        String space = " ";
        this.line1 = space.concat(this.line1);
        this.line2 = space.concat(this.line2);
        this.line3 = space.concat(this.line3);
        this.line4 = "_".concat(this.line4);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
