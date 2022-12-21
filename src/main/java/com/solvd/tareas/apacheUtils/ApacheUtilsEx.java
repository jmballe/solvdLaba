package com.solvd.tareas.apacheUtils;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class ApacheUtilsEx {
    public static void main(String[] args) {
        File file = new File("text.txt");
        String text = null;
        try {
            text = FileUtils.readFileToString(file);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
