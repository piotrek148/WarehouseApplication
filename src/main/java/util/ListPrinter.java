package util;

import java.util.List;

public class ListPrinter {

    public void printList(List list){

        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i).toString());
        }

    }

}
