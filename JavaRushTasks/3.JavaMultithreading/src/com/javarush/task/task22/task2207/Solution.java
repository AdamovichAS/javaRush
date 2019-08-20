package com.javarush.task.task22.task2207;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* 
Обращенные слова
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();
    public static Map<String,String> map = new LinkedHashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        reader.close();
        BufferedReader reader1 = new BufferedReader(new FileReader(file));
        String line;
        StringBuilder sb = new StringBuilder();

        while ((line = reader1.readLine())!=null){
            sb.append(line).append("\n");
        }
        String[] splitOriginal = sb.toString().split("[ \\n]");
        sb.delete(0,sb.length());
        for (int i = 0; i < splitOriginal.length; i++) {
            String word = splitOriginal[i];
            for (int j = i+1; j < splitOriginal.length; j++) {
                sb.delete(0,sb.length());
                if(word.equals(sb.append(splitOriginal[j]).reverse().toString())){
                    Pair pair = new Pair();
                    pair.first = word;
                    pair.second = splitOriginal[j];

                    if(!result.contains(pair)){
                        result.add(pair);
                    }
                }
            }
        }
        for (Pair pair : result) {
            System.out.println(pair);
        }
        
        
    }

    public static class Pair {
        String first;
        String second;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                        first == null ? second :
                            second == null ? first :
                                first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
