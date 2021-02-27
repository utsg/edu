package kyu5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Int32toIPv4Test {
    @Test
    public void sampleTest() {
        assertEquals("128.114.17.104", Int32toIPv4.longToIP(2154959208L));
        assertEquals("0.0.0.0", Int32toIPv4.longToIP(0));
        assertEquals("128.32.10.1", Int32toIPv4.longToIP(2149583361L));
    }
}