package com.company.files.imagefile;

public class GIFImageFile extends AbstractImageFile {

    public GIFImageFile (String name, int size) {
        super(name,size);

    }

    public void showAnimation(){
        System.out.println("Funny GIF meme xD");

    }
}
