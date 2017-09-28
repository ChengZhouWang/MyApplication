package com.example.bill1.myapplication.DataStoreAPI;

import java.io.FileNotFoundException;

/**
 * Created by bill1 on 2017-09-21.
 */

public interface IDataStore {
    String getState();
    void putState(String state) throws FileNotFoundException;
}
