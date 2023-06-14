package org.example;


import java.util.HashMap;
import java.util.Map;
//hw_2
public class Main {
    public static void main(String[] args) {
        Map<String, String> params = new HashMap<String, String>();
        params.put("name", "Ivanov");
        params.put("country", "Russia");
        params.put("city", "Moscow");
        params.put("age", null);
        System.out.println("select * from students where " + getQuery(params));
    }

    public static String getQuery(Map<String, String> param) {
        StringBuilder s = new StringBuilder();
        for (Map.Entry<String, String> pair: param.entrySet())
        {
            if(pair.getValue() != null)
            {
                s.append(pair.getKey() + " = " + pair.getValue() + " and ");
            }
        }
        s.delete(s.toString().length()-5,s.toString().length());
        return s.toString();



    }
}