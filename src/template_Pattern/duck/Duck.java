package template_Pattern.duck;

import java.util.Arrays;

public class Duck implements Comparable<Duck>{
    String name;
    int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + "체중 : " + weight;
    }

    @Override
    public int compareTo(Duck o) {
        if(this.weight < o.weight){
            return -1;
        } else if (this.weight == o.weight) {
            return 0;
        }else{
            return 1;
        }
    }
}

class DuckSortTestDrive{
    public static void main(String[] args){
        Duck[] ducks = {
                new Duck("Deffy",8),
                new Duck("Dewey",2),
                new Duck("Howard",7),
                new Duck("Louie",2),
                new Duck("Donald",10),
                new Duck("Huey",2)
        };

        System.out.println("정렬 전");
        display(ducks);

        //Arrays.sort(ducks);

//        Arrays.sort(ducks, new Comparator<Duck>() {
//            @Override
//            public int compare(Duck o1, Duck o2) {
//                return 0;
//            }
//        });

        Arrays.sort(ducks,(o,o2)-> o.compareTo(o2));

        System.out.println("정렬후 ");
        display(ducks);
    }

    public static void display(Duck[] ducks){
        for(Duck d: ducks){
            System.out.println(d);
        }
    }
}
