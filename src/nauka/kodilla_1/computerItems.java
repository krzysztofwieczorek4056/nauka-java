package nauka.kodilla_1;

import java.util.ArrayList;

public class computerItems {
    ArrayList<String> list = new ArrayList<String>();

    public computerItems() {
        list.add("test");
        list.add("computer");
        list.add("mouse");
        list.add("keyboard");
    }
public void displayItems(){
    String element = list.get(3);
        for(
    int i = 0; i<list.size();i++){
        element = list.get(i);
        if (element.length() > 5) {
            System.out.println(element);
        }
    }}
}
