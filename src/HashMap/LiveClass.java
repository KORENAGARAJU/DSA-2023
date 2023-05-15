package HashMap;
import java.util.* ;
public class LiveClass{
    public static void main(String[] args) {
        HashMap map = new HashMap() ;

        //insertiom
        map.put("1" ,"raju") ;
        map.put("2" , "utrash") ;
        map.put("3" , "umanand") ;

        System.out.println(map.toString());
        System.out.println("__________________________********___________________");

        //searching in hashmap ;

        System.out.println(map.get("1") + ":value of key" );
        System.out.println(map.get("3") + ":value of key" );
        //remove from map

        map.remove("2") ;

        System.out.println(map.toString());

        System.out.println(map.keySet()) ;
    }

}
