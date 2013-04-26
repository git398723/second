package de.test;

public class Master {

    private Secondary _s;

    /**
     * @param args
     */
    public static void main(String[] args) {
        new Master().init();
    }

    public void init() {
        subinit(1);
        subinit(2);
        _s = new Secondary();
    }

    public void subinit(int i) {
        switch (i) {
        case 1:
            System.out.println("first case");
            break;
        case 2:
            System.out.println("second case");
            break;
        case 3:
            _s.checkme();
            break;
        default:
            System.out.println("default case");
        }

    }

}
