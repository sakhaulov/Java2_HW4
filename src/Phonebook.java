import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Phonebook {

    private HashMap<Integer, String> phonebook;

    Phonebook() {
        this.phonebook = new HashMap<>();
    }

    public void add(Integer number, String name) {
        phonebook.put(number, name);
    }

    //Рабочий вариант метода через keySet(), возращающий String с номерами
    /*
    public String get(String name) {
        StringBuilder data = new StringBuilder();

        for (Integer key : phonebook.keySet()) {
            if (phonebook.get(key).equals(name)) {
                data.append(key).append("\n");
            }
        }

        if (data.length() == 0) {
            data.append("Пользователей с указанным именем не найдено");
        }

        return data.toString();
    }
     */

    //Аналогичный метод с использованием Map.Entry, возращающий ArrayList с номерами
    public ArrayList<Integer> get(String name) {
        ArrayList<Integer> data = new ArrayList<>();

        for (Map.Entry<Integer, String> mapEntry : phonebook.entrySet()) {
            if (mapEntry.getValue().equals(name)) {
                data.add(mapEntry.getKey());
            }
        }
        return data;
    }

    }
