package com.company.class18;

public class Task1 {
    /*
    Создайте метод, который будет принимать массив в качестве
параметры и будет возвращать сумму всех
элементов из этого массива. Метод должен быть
видимым только в пределах одного пакета и
доступен при создании экземпляра
класса.
     */

    double sumArray(double[] array) {
        double sum=0;
        for (double element : array
        ) {
            sum+=element;

        }

        return sum;

    }
}
