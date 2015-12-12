package dataStacture;

import java.util.Stack;
public class UseStack {

    public static void main(String[] args) {

        Stack<String> list = new Stack<String>();


        list.push("LA");
        list.push("New York");
        list.push("Nigeria");

        for (int i = 0; i <= list.size() + 1; i++) {

            System.out.println (list.pop());

        }


    }

}
