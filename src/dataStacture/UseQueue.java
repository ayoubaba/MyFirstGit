package dataStacture;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {
    public static void main(String[] args) {


        Queue<String> line = new LinkedList<String>();
        line.add("New York");
        line.add("Denver");
        line.add("New jersey");

        Iterator let = line.iterator();

        while (let.hasNext()) {
            System.out.println(let.next());
        }
        //System.out.print(line.peek());

    }

}



