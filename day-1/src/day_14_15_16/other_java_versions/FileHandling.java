package day_14_15_16.other_java_versions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class FileHandling {
    static String path = "/Users/preethir/Downloads/jfsd-we-26/day-1/demo.txt";
    static Path _path = Paths.get(path);

    public static void main(String[] args) {
//        createFile("/Users/preethir/Downloads/jfsd-we-26/day-1/demo.txt");

//        AutoCloseable autoCloseable = () -> System.out.println("file closed");
//        try (autoCloseable) {
//
//        } catch (Exception e) {
//
//        }

//        createFileWithResource("/Users/preethir/Downloads/jfsd-we-26/day-1/demo.txt");
//        _createFile();
//        readFile();
        deleteFile();
    }

    public static void createFile(String path) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(path);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("hello world");

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void createFileWithResource(String path) {
        try (FileWriter fileWriter = new FileWriter(path); BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write("hello world from try with resource");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void _createFile() {
        try {
            Files.writeString(_path, "new content", StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readFile() {
        try {
            List<String> lines = Files.readAllLines(_path);
            System.out.println(lines);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void deleteFile() {
        try {
            Files.delete(_path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
