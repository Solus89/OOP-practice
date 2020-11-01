package com.company;
import com.company.drive.Drive;
import com.company.drive.HDDDrive;
import com.company.files.File;
import com.company.files.imagefile.GIFImageFile;
import com.company.files.imagefile.JPGImageFIle;
import com.company.files.musicfile.MP3MusicFile;

public class Main {

    public static void main(String[] args) {
        GIFImageFile gif1 = new GIFImageFile("nazwa1.gif", 100);
        JPGImageFIle jpg1 = new JPGImageFIle("nazwa1.jpg", 200, 80 );

        MP3MusicFile mp3File = new MP3MusicFile("plik.mp3", 4000, "Abba", "Mamma mia", 100);

        Drive drive = new HDDDrive();
        drive.addFile(gif1);
        drive.addFile(jpg1);
        drive.addFile(mp3File);

        drive.listFiles();
        File file = drive.findFile("plik.mp3");
        System.out.println(file.getSize());


    }
}
