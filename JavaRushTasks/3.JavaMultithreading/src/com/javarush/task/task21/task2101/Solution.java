package com.javarush.task.task21.task2101;

/* 
Определяем адрес сети
*/
public class Solution {
    public static void main(String[] args) {
        byte[] ip = new byte[]{(byte) 192, (byte) 168, 1, 2};
        byte[] mask = new byte[]{(byte) 255, (byte) 255, (byte) 254, 0};
        byte[] netAddress = getNetAddress(ip, mask);
        print(ip);          //11000000 10101000 00000001 00000010
        print(mask);        //11111111 11111111 11111110 00000000
        print(netAddress);  //11000000 10101000 00000000 00000000
    }

    public static byte[] getNetAddress(byte[] ip, byte[] mask) {
        byte[] netAddress = new byte[ip.length];
        for (int i = 0; i < netAddress.length; i++) {
            netAddress[i] = (byte) (ip[i] & mask[i]);
        }
        //создаем заполняем байтовый массив нет адрес

        return netAddress;
    }

    public static void print(byte[] bytes) {
        for (int i = 0; i < bytes.length; i++) {
            int f = (int) bytes[i]; // получаем значение и приводим его к интегер
            if(f < 0) f += 256;  //!!!для чего эта строка скажите пожалуйста????!!!
            String str = Integer.toBinaryString(f); // преобразовываем к двоичному коду
            System.out.printf("%08d", Integer.parseInt(str));
            if (i < bytes.length - 1) System.out.print(" ");
        }
        System.out.println();
    }
}
