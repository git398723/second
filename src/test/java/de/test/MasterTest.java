package de.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class MasterTest {

    @Test
    public void testInit() {
        Master m = new Master();
        m.init();
    }

    @Test
    public void testSubinit() {
        Master m = new Master();
        m.subinit(1);
        m.subinit(2);
        m.subinit(3);
    }

}
