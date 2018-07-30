package com.example.xiti;

import java.io.IOException;

public interface FileIO {
    void readFromFile(String filename) throws IOException;

    void writeToFile(String filenme) throws IOException;

    void setValue(String key, String value);

    void getValue(String key);
}
