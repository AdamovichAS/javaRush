package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader freader = null;

        String fileName1 = "";
        String filename2 = "";

        try {
            //System.out.println("Enter the first file name: ");
            fileName1 = reader.readLine();
            //System.out.println("Enter the second file name: ");
            filename2 = reader.readLine();

            File file = new File(fileName1);
            freader = new BufferedReader(new FileReader(file));
            String s;
            while ((s = freader.readLine())!= null){
                allLines.add(s);
            }
            File file2 = new File(filename2);
            freader = new BufferedReader(new FileReader(file2));
            while ((s = freader.readLine())!= null){
                forRemoveLines.add(s);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            reader.close();
            freader.close();
        }


        solution.joinData();
        for (String line : allLines) {
            System.out.print(line + " ");
        }
        System.out.println();
        for (String line : forRemoveLines) {
            System.out.print(line + " ");
        }
    }

    public  void joinData() throws  CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)){
            allLines.removeAll(forRemoveLines);

        }else {allLines.clear();
        throw new CorruptedDataException();
    }

    }
}
