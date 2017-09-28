package com.example.bill1.myapplication.DataStoreAPI;
import com.example.bill1.myapplication.DataStoreAPI.IDataStore;

public class DataStorageImp implements IDataStore
{
    String state = null;
    public void putState(String state)
    {
        this.state = state;
    }
    public String getState()
    {
        return state;
    }
}
