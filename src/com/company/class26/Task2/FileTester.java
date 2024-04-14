package com.company.class26.Task2;

public class FileTester {
    public static void main(String[] args) {
        File file = new PDFile();
        file.open();
        file.edit();
        file.close();

        File[] files = {new PDFile(), new JavaFile(), new WordFile()};
        for (int i = 0; i < files.length; i++) {
            file.open();
            file.edit();
            file.close();
        }

    }
}
