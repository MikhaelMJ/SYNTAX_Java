package com.company.class27.task;

public interface WebDriver {
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();

}
class ChromeDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("открыть браузер ChromeDriver");
    }

    @Override
    public void closeBrowser() {
        System.out.println("закрыть браузер ChromeDriver");
    }

    @Override
    public void maximizeWindow() {

        System.out.println("расширить окно ChromeDriver");
    }

    @Override
    public void findElement() {
        System.out.println("найти элемент ChromeDriver");
    }
}
class FireFoxDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("открыть браузер FireFoxDriver");
    }

    @Override
    public void closeBrowser() {
        System.out.println("закрыть браузер FireFoxDriver");
    }

    @Override
    public void maximizeWindow() {

        System.out.println("расширить окно FireFoxDriver");
    }

    @Override
    public void findElement() {
        System.out.println("найти элемент FireFoxDriver");
    }
}
