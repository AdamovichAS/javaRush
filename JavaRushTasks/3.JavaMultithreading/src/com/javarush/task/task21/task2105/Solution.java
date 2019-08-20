package com.javarush.task.task21.task2105;

import java.util.HashSet;
import java.util.Set;

/* 
Исправить ошибку. Сравнение объектов
*/
public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Solution)) return false;

        Solution s = (Solution) o;

        boolean b1 = s.first != null && first != null;
        boolean b2 = s.last != null && last != null;

        boolean b3 = b1 && s.first.equals(first);
        boolean b4 = b2 && s.last.equals(last);

        if (s.first == null && first == null && b4 || s.last == null && last == null && b3) return true;
        if (s.first == null && first == null && s.last == null && last == null) return true;

        return b3 && b4;
    }
    public int hashCode() {
        int f = first != null ? first.hashCode() : 0;
        int l = last != null ? last.hashCode() : 0;
        return 31 * f + l;
    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Mickey", "Mouse"));
        System.out.println(s.contains(new Solution("Mickey", "Mouse")));
    }
}
