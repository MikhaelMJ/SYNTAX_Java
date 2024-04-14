package com.company.class26.Task2;

public abstract class File {

    abstract void open();
        void edit(){
            System.out.println("Editing the file");
        }

        void close(){
            System.out.println("File closed");
        }

}
class JavaFile extends File{
    @Override
    void open() {
        System.out.println("Use Intellij to open this file");
    }
}
class PDFile extends File implements UpLoad,Download{
    @Override
    void open() {
        System.out.println("USE Adobe");
    }

    @Override
    public void download() {
        System.out.println("bla bla");
    }

    @Override
    public void upload() {
        System.out.println("tra ta ta");
    }
}
class WordFile extends File{
    @Override
    void open() {
        System.out.println("Use MS Word");
    }
}