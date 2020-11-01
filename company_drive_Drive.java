package com.company.drive;


import com.company.files.File;

public interface Drive {
    void addFile (File file);
    void listFiles();
    File findFile(String name);


}
