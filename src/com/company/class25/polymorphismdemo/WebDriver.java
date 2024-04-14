package com.company.class25.polymorphismdemo;

public class WebDriver {
    void  openBrowser(){
        System.out.println("Открыть браузер");
    }
    void loadWebsite(String website){System.out.println("Открыть сайт");}
    void Test1(){System.out.println("Введи логин");}
    void Test2(){System.out.println("нажми на кнопку войти");}
    void TestFileDownload(){System.out.println("тестируем загрузку файлов");}
    void closeBrowser(){System.out.println("Close browser");}
    }
class GoogleChrome extends WebDriver{
    void loadWebsite(String website){System.out.println("Открыть сайт в GoogleChrome");}
    void Test1(){System.out.println("Введи логин в GoogleChrome");}
    void Test2(){System.out.println("нажми на кнопку войти в GoogleChrome");}
    void TestFileDownload(){System.out.println("тестируем загрузку файлов в GoogleChrome");}
    void closeBrowser(){System.out.println("Закрыть браузер в GoogleChrome");}
}

class FireFox extends WebDriver{
    void loadWebsite(String website){System.out.println("Открыть сайт в FireFox");}
    void Test1(){System.out.println("Введи логин в FireFox");}
    void Test2(){System.out.println("нажми на кнопку войти в FireFox");}
    void TestFileDownload(){System.out.println("тестируем загрузку файлов в FireFox");}
    void closeBrowser(){System.out.println("Закрыть браузер в FireFox");}
}
class Safari extends WebDriver{
    void loadWebsite(String website){System.out.println("Открыть сайт в Safari");}
    void Test1(){System.out.println("Введи логин в Safari");}
    void Test2(){System.out.println("нажми на кнопку войти в Safari");}
    void TestFileDownload(){System.out.println("тестируем загрузку файлов в Safari");}
    void closeBrowser(){System.out.println("Закрыть браузер в Safari");}
}
class IE extends WebDriver{
    void loadWebsite(String website){System.out.println("Открыть сайт в IE");}
    void Test1(){System.out.println("Введи логин в IE");}
    void Test2(){System.out.println("нажми на кнопку войти в IE");}
    void TestFileDownload(){System.out.println("тестируем загрузку файлов в IE");}
    void closeBrowser(){System.out.println("Закрыть браузер в IE");}
}
