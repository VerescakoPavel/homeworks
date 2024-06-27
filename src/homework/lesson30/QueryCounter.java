package homework.lesson30;

import java.util.HashMap;
import java.util.Map;

public class QueryCounter {
    private static final int COUNTER_LIMIT = 100;
    private Map<String, Integer> queryMap = new HashMap<>();


    public int queryCounter(String input) {

        if (queryMap.containsKey(input)) {
            int valueCounter = queryMap.get(input);
            if (valueCounter >= COUNTER_LIMIT) {
                return COUNTER_LIMIT;
            } else {
                valueCounter++;
                queryMap.put(input, valueCounter);
                return valueCounter;
            }
        } else queryMap.put(input, 1);

        return 1;


    }
}
