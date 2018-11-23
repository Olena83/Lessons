package Lesson7.Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;

public class mainmap {
    public static void main(String[] args) {
        Student studentOleg = new Student("Taras", 22);
        Student studentMukola = new Student("Mukola", 17);
        Student studentIra = new Student("Ira", 18);
        Student studentMariya=new Student("Anna",21);

        List<Integer> Olegsocinku = Arrays.asList(10, 20, 60);
        List<Integer> Mukolasocinku = Arrays.asList(15, 26, 100);
        List<Integer> Iraocinku = Arrays.asList(24, 58, 77);
        List<Integer> Mariyaocinku = Arrays.asList(90, 38, 97);

        Map<Student, List<Integer>> hashMap = new HashMap<>();
        hashMap.put(studentOleg, Olegsocinku);
        hashMap.put(studentMukola, Mukolasocinku);
        hashMap.put(studentIra, Iraocinku);
        hashMap.put(studentMariya, Mariyaocinku);

        System.out.println(hashMap);

        TreeMap<Student, List<Integer>> treeMap = new TreeMap<>();
        treeMap.putAll(hashMap);
        System.out.println(treeMap);

    }}