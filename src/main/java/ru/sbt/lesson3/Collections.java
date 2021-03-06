package ru.sbt.lesson3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Yrwing on 18.09.2016.
 */
public class Collections{
    public static void main(String[] args) throws IOException {


        //FileNotFound Exception. Независимо от того, какой путь указан и где лежит файл In.
        File In_1 = new File("C:\\In.txt");
        System.out.println(In_1.getAbsolutePath());
        System.out.println(In_1.canRead());
        System.out.println(In_1.exists());
        BufferedReader in_2 = new BufferedReader(new FileReader("ru/sbt/lesson3/In.txt"));
        //FileReader in_3 = new FileReader("In.txt");
        System.out.println(in_2.readLine());
    }}
/**

        String in = "Hello, I am Yrwing.\nI am 22 years old.\nI study at Sberbank Technologies.";
        String[] strs = in.split("([^a-zA-Z]+)");
        sort(strs);
        System.out.println("_____");
        count(strs);
        System.out.println("_____");
        StringList(in);
        System.out.println("_____");


    }
    static private void sort(String[] strs){
        TreeSet<String> WordSet = new TreeSet<>(new StringComparator());
        for (String word: strs) {

            WordSet.add(word);
        }
        System.out.println(WordSet.size());
        System.out.println("_____");
        for (String word: WordSet) {
            System.out.println(word);
        }
    }
    static void count(String[] s){
        HashMap<String, Integer> Table = new HashMap<>();
        Stream.of(s)
                .forEach(x->{
                    Table.computeIfPresent(x,(str, v)->(v + 1));
                    Table.putIfAbsent(x, 1);
                });
        for (String word: Table.keySet()) {
            System.out.println(word + "..." + Table.get(word));
        }
    }
    static private void StringList(String s){
        Deque<String> strs = new ArrayDeque<>();
        Stream.of(s.split("\\n")).forEach(x -> strs.addFirst(x));
        for (String st: strs) {
            System.out.println(st);
        }
        System.out.println("_____");
        StringArrayList(strs);

    }
    static private void StringArrayList(Deque dq) throws ArrayIndexOutOfBoundsException{
        List<String> strs = new ArrayList<>();
        Iterator<String> it = dq.descendingIterator();
        while(it.hasNext()){
            strs.add(it.next());
        }


        Iterator<String> CustomIt = new ListIt<String>(strs);
        while(CustomIt.hasNext()){
            System.out.println("!!!" + CustomIt.next());
        }


        Scanner s = new Scanner(System.in);
        try {
            for (int i = 0; i < strs.size(); i++) {
                System.out.println(strs.get(s.nextInt() - 1));
            }
        }
        catch ( ArrayIndexOutOfBoundsException e){
            System.out.println("Such String does not exist.");
        }
    }
}
**/