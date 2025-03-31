package task1_hm;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;
// Выведем на UI данные всех созданных объектов.
public class PersonGUI extends JFrame {
    public static void main(String[] args) {
        // Создание экземпляра окна
        PersonGUI persongui = new PersonGUI();

        persongui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        persongui.pack();
        persongui.setVisible(true);
    }

    private List<Person> persons;

    public PersonGUI() {
        super("Просмотр данных");
        setSize(500, 400);

        // Создание панели для вывода данных
        JPanel panel = new JPanel(new GridLayout(0, 1));
        getContentPane().add(panel, BorderLayout.CENTER);

        // Создание списка объектов
        persons = new ArrayList<>();
        persons.add(new Person("Ivan", 30, 178));
        persons.add(new Person("Petr", 18, 184));
        persons.add(new Person("Alex", 22, 191));


        // Добавление данных каждого объекта на панель
        for (Person person : persons) {
            JLabel label = new JLabel(person.toString());
            panel.add(label);
        }


    }
}
