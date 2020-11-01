package com.company.files.imagefile;

import com.company.files.AbstractFile;
import com.company.files.FileType;

public abstract class AbstractImageFile extends AbstractFile {

    protected AbstractImageFile (String name, int size) {
        super(name, size);

    }

    @Override
    public FileType getType() {
        return FileType.IMAGE;
    }
}
