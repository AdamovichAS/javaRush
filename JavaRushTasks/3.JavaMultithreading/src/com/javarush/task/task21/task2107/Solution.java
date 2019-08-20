package com.javarush.task.task21.task2107;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* 
Глубокое клонирование карты
*/
public class Solution implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Solution solution = new Solution();
        solution.users = new LinkedHashMap<>(this.users);

        return solution;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.users.put("Hubert", new User(172, "Hubert"));
        solution.users.put("Zapp", new User(41, "Zapp"));
        Solution clone = null;
        try {
            clone = (Solution)solution.clone();
            System.out.println(solution);
            System.out.println(clone);

            System.out.println(solution.users);
            System.out.println(clone.users);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace(System.err);
        }
    }

    protected Map<String, User> users = new LinkedHashMap();

    public static class User implements Cloneable{
        int age;
        String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            User user = new User(this.age,this.name);
            return user;
        }

        @Override
        public int hashCode() {
            return 31*(age + name.hashCode());
        }

        @Override
        public boolean equals(Object obj) {
            if(obj == this){
                return true;
            }
            if(!(obj instanceof User)){
                return false;
            }
            User user = (User)obj;
            if(age != user.age) return false;
            if(!Objects.equals(name, user.name)) return false;
            return true;

        }
    }
}
