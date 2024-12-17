package com.epam.mjc.nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


public class FileReader {
    public static void main (String[] args) {
        File file = new File("Profile.txt");
        getDataFromFile(file);
    }

    public static Profile getDataFromFile(File file) {
        Profile profile = new Profile();
        try {
            InputStream input = new FileInputStream(file);
            StringBuilder content = new StringBuilder();

            int i;
            while ((i = input.read()) != -1) {
                content.append((char) i);
            }

            String str = content.toString();
            String[] s = str.split("\\s+");

            profile.setName(s[1]);
            profile.setAge(Integer.valueOf(s[3]));
            profile.setEmail(s[5]);
            profile.setPhone(Long.valueOf(s[7]));

            input.close();
            return profile;
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

        return new Profile();
    }
}
