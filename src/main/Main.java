package main;

public class Main {
    public static void main(String[] args) {

        MyArrayList employers = new MyArrayList();
        employers.add("Nicita");
        employers.add("Igor");
        employers.add("Olga");
        employers.add("Cristina");
        employers.add("Vitaliy");
        employers.add("Bogdan");
        employers.add("Alexey");

        employers.remove("nicilay");


        for (int i = 0; i < employers.getSize(); i++) {
            System.out.println(employers.get(i));
        }


    }

}
