public class Main {

    public static void main(String[] args) {

        //Первое задание
        String[] arr = {"раз", "два", "три", "два", "три", "три", "четыре", "пять", "шесть", "семь"};
        System.out.println("Считаем уникальные значения: \n" + UniqueValues.countUniqueValues(arr)+"\n");


        //Второе задание
        Phonebook phonebook = new Phonebook();

        phonebook.add(123, "Тимур");
        phonebook.add(124, "Артём");
        phonebook.add(125, "Антон");
        phonebook.add(126, "Антон");

        System.out.println("Номера пользователей по имени 'Антон':\n" + phonebook.get("Антон"));
        System.out.println("Номера пользователей по имени 'Тимур':\n" + phonebook.get("Тимур"));
        System.out.println("Номера пользователей по имени 'Артём':\n" + phonebook.get("Артём"));
        System.out.println("Номера пользователей по имени 'Егор':\n" + phonebook.get("Егор"));
    }
}
