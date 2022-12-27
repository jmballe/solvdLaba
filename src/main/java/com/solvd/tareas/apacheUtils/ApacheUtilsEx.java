package com.solvd.tareas.apacheUtils;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class ApacheUtilsEx {
    public static void main(String[] args) throws IOException{
            FileUtils.forceDelete(new File(System.getProperty("user.dir") +
                    "\\src\\main\\java\\com\\solvd\\tareas\\apacheUtils\\salida")); //Erase file if already exists since if file exists it appends words count again.

            String text = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "\\src\\main\\resources\\text.txt"),
                    "UTF-8");


            Map<String, Long> wordCounts = Arrays.stream((StringUtils.split(text)))
                    .map(String::toLowerCase).map(w -> StringUtils.strip(w, ".,\"*-+[]{}()<>$%#@_¡!?¿/;:"))
                    .collect(Collectors.groupingBy(w -> w, Collectors.counting()));

//            for (String word : StringUtils.split(text)) {
//                word = StringUtils.strip(word.toLowerCase(), ".,\"*-+[]{}()<>$%#@_¡!?¿/;:");
//                wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
//            }
            for (Map.Entry<String, Long> entry : wordCounts.entrySet()) {
                FileUtils.writeStringToFile(new File(System.getProperty("user.dir") +
                                "\\src\\main\\java\\com\\solvd\\tareas\\apacheUtils\\salida"),
                        entry.getKey() + ": " + entry.getValue() + "\n", "UTF-8", true);
            }
    }
}
