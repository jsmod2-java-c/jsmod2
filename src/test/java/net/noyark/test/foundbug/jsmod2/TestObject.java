package net.noyark.test.foundbug.jsmod2;


public class TestObject {

    public int i = 0;
    public int j = 0;
    public String name = "你好";
    ObjectC c = new ObjectC();

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public ObjectC getC() {
        return c;
    }

    public void setC(ObjectC c) {
        this.c = c;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "TestObject{" +
                "i=" + i +
                ", j=" + j +
                ", name='" + name + '\'' +
                ", c=" + c +
                '}';
    }
}