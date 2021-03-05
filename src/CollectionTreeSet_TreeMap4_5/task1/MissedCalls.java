package CollectionTreeSet_TreeMap4_5.task1;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.TreeMap;

public class MissedCalls {
    private Map<LocalDateTime, String> map = new TreeMap<>();


    public void addMissed(String phone) {
        this.map.put(LocalDateTime.now(), phone);
    }

    public void toMissed(Contacts contacts) {
        for (Map.Entry<LocalDateTime, String> entry : this.map.entrySet()) {
            String val = entry.getValue();
            if (contacts.getStorage().containsKey(val)) {
                System.out.println("Вам звонил " + contacts.getStorage().get(val).getName()
                        + " в " + entry.getKey());
            } else {
                System.out.println("Вам звонил " + entry.getValue()
                        + " в " + entry.getKey());
            }
        }
    }

    public void clear() {
        this.map.clear();
        System.out.println("Пропущеные вызовы очищены");
    }
}
