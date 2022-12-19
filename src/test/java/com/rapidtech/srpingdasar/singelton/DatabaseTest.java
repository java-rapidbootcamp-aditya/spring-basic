package com.rapidtech.srpingdasar.singelton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {
    @Test
    void test() {
        Database database1 = Database.getInstance();
        Database database2 = Database.getInstance();
        Assertions.assertSame(database1,database2);
    }
}