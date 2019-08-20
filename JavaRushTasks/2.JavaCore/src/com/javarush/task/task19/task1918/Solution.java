package com.javarush.task.task19.task1918;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Знакомство с тегами
*/
public class Solution {
    static String text = new String();
    public static void main(String[] args) throws IOException {
        List<Item> list = new ArrayList<>();
        String tag;
        tag = args[0];
//        tag = "t";

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(reader.readLine());
        reader.close();
        StringBuilder stringBuilder = new StringBuilder();
        while (fileReader.ready()) {
            stringBuilder.append((char)fileReader.read());
        }
        text = stringBuilder.toString();
        fileReader.close();

//        text = "<t><t> </t>\n" +
//                "<t gdfg>  <t> <tag> </tag> </t></t>  <t> </t> <tag> </tag><t> </t>\n" +
//                "<t gdfg>  <t> <tag> </tag> </t></t>  <t> </t> <tag> </tag></t>\n" +
//                "<t> </t>\n" +
//                "<t gdfg>  <t> <tag> </tag> </t></t>  <t> </t> <tag> </tag>";
        Pattern pattern= Pattern.compile("<" + tag + "[^>]*?>");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            list.add(new Item(true, matcher.start()));
        }
        pattern = Pattern.compile("</" + tag + ">");
        matcher = pattern.matcher(text);
        while (matcher.find()) {
            list.add(new Item(false, matcher.end() - 1));
        }
        Collections.sort(list, Comparator.comparing(Item::getIndex));
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i).open + " " + list.get(i).index);
//        }

        recurs(list);

    }

    private static void recurs(List<Item> list) {
        int count = 0;
        int index = 0;
        int listIndex = 0;
        for (int i = 0; i < list.size(); i++) {
            Item item = list.get(i);
            if (item.open) {
                if (count == 0){
                    index = item.index;
                    listIndex = i;
                }
                count++;
            } else {
                count--;
                if (count == 0) {
                    System.out.println(text.substring(index, item.index + 1));
                    recurs(list.subList(listIndex + 1, i));
                }
            }
        }
    }

    public static class Item {
        private boolean open;
        private int index;

        public int getIndex() {
            return index;
        }

        public Item(boolean open, int index) {
            this.index = index;
            this.open = open;
        }
    }
}
