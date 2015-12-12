package dataStacture;


import java.util.HashMap;
import java.util.Map;
public class UseMap {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String,String>();

        map.put("Australia", "Sydney");
        map.put("France", "Paris");
        map.put("Italy", "Rome");
        map.put("UK", "London");

    for(Map.Entry<String,String> st:map.entrySet()){
            System.out.println(st.getKey()+"***************"+ st.getValue());
        }

    }
}
