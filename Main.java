package task1_hm;
// Создаем класс Main, где создадим несколько объектов типа Person и
// вызовем метод introduce() для каждого из них.
public class Main extends Person {
    public static void main(String[] args) {
            Person person = new Person("Alex", 22, 191);
            person.introduce();

            person.setName("Ivan");
            person.setAge(30);
            person.setHeight(178);
            person.introduce();


            person.setName("Petr");
            person.setAge(18);
            person.setHeight(184);
            person.introduce();

        }

   }



