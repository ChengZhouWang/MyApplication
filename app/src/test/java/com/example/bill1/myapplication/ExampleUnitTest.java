package com.example.bill1.myapplication;

import com.example.bill1.myapplication.DataStoreAPI.DataStorageImp;
import com.example.bill1.myapplication.DataStoreAPI.Local;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void Database ()throws Exception {
        DataStorageImp db = new DataStorageImp();
        db.putState("working");

        assertEquals("working", db.getState());
    }
    @Test
    public void LocalData ()throws Exception {
        Local a = new Local();
        a.putState("working");

        assertEquals("working", a.getState());
    }
}


