package com.solvd.tareas.apacheUtils;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApacheUtilsEx {
    public static void main(String[] args) {
        try {
            String exitFile = System.getProperty("user.dir") + "\\src\\main\\java\\com\\solvd\\tareas\\apacheUtils\\salida";
            FileUtils.forceDelete(new File(exitFile)); //Erase file if already exists since if file exists it appends words count again.

            String text = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "\\src\\main\\resources\\text.txt"),
                    "UTF-8");

            Map<String, Integer> wordCounts = new HashMap<>();

            for (String word : StringUtils.split(text)) {
                word = StringUtils.strip(word.toLowerCase(), ".");
                wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
            }
            for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
                FileUtils.writeStringToFile(new File(exitFile), entry.getKey() + ": " + entry.getValue() + "\n", "UTF-8", true);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
