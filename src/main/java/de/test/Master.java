package de.test;

public class Master {

    /**
     * @param args
     */
    public static void main(String[] args) {
        new Master().init();
    }

    public void init() {
        subinit(1);
        subinit(2);
    }

    public void subinit(int i) {
        switch (i) {
        case 1:
            System.out.println("first case");
            break;
        case 2:
            System.out.println("second case");
            break;
        default:
            System.out.println("default case");
        }

    }

}
