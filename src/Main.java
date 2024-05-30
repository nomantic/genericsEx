public class Main {
    public static void main(String[] args) {

        //a generic object with String type
        Generics<String> g = new Generics<>();
        g.add("Dua");
        g.add("Lipa");

        String s = g.get(1);
        System.out.println(s);

        //a generic object with Integer type
        Generics<Integer> i = new Generics<>();
        i.add(25);
        i.add(30);
        i.add(33);
        i.add(45);

        Integer f = i.get(3);
        System.out.println(f);


    }
}