import java.util.HashMap;

public class Phonebook {

    private HashMap<Integer, String> phonebook;

    Phonebook() {
        this.phonebook = new HashMap<>();
    }

    public void add(Integer number, String name) {
        phonebook.put(number, name);
    }

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


    }
