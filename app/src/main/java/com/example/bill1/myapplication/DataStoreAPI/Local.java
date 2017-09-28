package com.example.bill1.myapplication.DataStoreAPI;

/**
 * Created by bill1 on 2017-09-21.
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.FileNotFoundException;


public class Local implements IDataStore{
    String state = null;
    public void putState(String state) throws FileNotFoundException {
        File file = new File("test.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        FileOutputStream fOut = new FileOutputStream(file);
        OutputStreamWriter myOutWriter = new OutputStreamWriter(fOut);
        try {
            myOutWriter.append(state);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            myOutWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fOut.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String getState()
    {
        String file = "";
        String contents = null;
        File fileR = new File("test.txt");
        if (fileR.exists()) {
            int length = (int) fileR.length();
            byte[] bytes = new byte[length];
            FileInputStream in = null;
            try {
                in = new FileInputStream(fileR);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            try {
                try {
                    in.read(bytes);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } finally {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            contents = new String(bytes);
            }
        return contents;
    }


}
