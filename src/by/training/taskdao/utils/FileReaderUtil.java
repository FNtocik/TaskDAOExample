package by.training.taskdao.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReaderUtil {

    private static final String DIRECTORY = "/Users/antonpugacev/IdeaProjects/DAOExample/src/";

    public static String readAllFromFile(String fileName) {
        String data = "";
        try {
            data = new String(Files.readAllBytes(Paths.get(DIRECTORY + fileName)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        data = data.replaceAll("\\s{2,}", "");
        return data;
    }
}
