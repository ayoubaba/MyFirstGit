package dataStacture;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
public class IntegratedMap {

    public static void main(String[] args){
        List<String> cityNameOfUSA = new ArrayList<String>();
        cityNameOfUSA.add("NY");
        cityNameOfUSA.add("Boston");
        cityNameOfUSA.add("Buffalo");
        cityNameOfUSA.add("New Hampshire");

        List<String> cityNameOfBangladesh = new ArrayList<String>();
        cityNameOfBangladesh.add("Dhaka");
        cityNameOfBangladesh.add("Comilla");
        cityNameOfBangladesh.add("Sylhet");
        cityNameOfBangladesh.add("Feni");

        Map<String, List<String>> map = new HashMap<String, List<String>>();
        map.put("USA", cityNameOfUSA);
        map.put("Bangladesh", cityNameOfBangladesh);

        for(Map.Entry<String, List<String>> city: map.entrySet()){
            System.out.println(city.getKey()+ " " +"*****************"+ city.getValue());
        }

    }

}
