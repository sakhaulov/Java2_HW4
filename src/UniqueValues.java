import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class UniqueValues {

//    public static HashMap<String, Integer> countUniqueValues(String[] arr) {
//
//        String[] uniqueValues = new HashSet<String>(Arrays.asList(arr)).toArray(new String[0]);
//        HashMap<String, Integer> uniqueCount = new HashMap<>();
//
//        for (String uniqueValue : uniqueValues) {
//            int count = 0;
//            for (String s : arr) {
//                if (uniqueValue.equals(s)) {
//                    count++;
//                }
//                uniqueCount.put(uniqueValue, count);
//            }
//        }
//
//        return uniqueCount;
//    }

    public static HashMap<String, Integer> countUniqueValues(String[] arr) {

        HashMap<String, Integer> uniqueCount = new HashMap<>();

        for (String value : arr) {
            uniqueCount.merge(value, 1, Integer::sum);
        }

        return uniqueCount;
    }

}
