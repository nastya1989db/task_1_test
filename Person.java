package task1_hm;
// Создаем класс `Person` с полями name, age и height. Поля должны быть приватными,
// доступ к ним осуществляется через геттеры и сеттеры.
public class Person {
    private String name;
    private int age;
    private double height;

    //Реализуем конструктор класса, который принимает параметры (name, age, height).
    public Person() {}
    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    //Геттеры
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    //Сеттеры

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Добавляем метод introduce(), который выводит на экран строку формата:
    // "Меня зовут {имя}, мне {возраст} лет, мой рост {рост} см."
    public void introduce() {
      System.out.println("My name is " + name + ", I am " + age + " years old, my height is " + height + " sm.");
    }


        @Override
        public String toString() {
            return "Name: " + name + ", age: " + age + ", height: " + height +" sm.";
        }
    }




