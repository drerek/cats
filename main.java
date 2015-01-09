/**
 * Created by Артём on 09.01.2015.
 */
import java.io.*;
public class main {
    public static void main(String[] args) {

        String answer = null;
        String name = null;
        String age = null;
        String weight = null;
        String male = null;
        int age_int = 0;
        int weight_int = 0;
        int points1,points2,points3,mark1,mark2,mark3;
        boolean fight;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите имя первого кота");
        try {
            name = br.readLine();
        } catch (Exception e) {
        }
        cat cat1 = new cat();
        cat1.setName(name);

        System.out.println("Введите возраст первого кота");
        try {
            age = br.readLine();
        } catch (Exception e) {
        }
        ;
        age_int = Integer.parseInt(age);
        cat1.setAge(age_int);

        System.out.println("Введите вес первого кота");
        try {
            weight = br.readLine();
        } catch (Exception e) {
        }
        ;
        weight_int = Integer.parseInt(weight);
        cat1.setWeight(weight_int);

        System.out.println("Введите пол первого кота(male/female)");
        try {
            male = br.readLine();
        } catch (Exception e) {
        }
        cat1.setMale(male);

        System.out.println("Введите имя второго кота");
        try {
            name = br.readLine();
        } catch (Exception e) {
        }
        cat cat2 = new cat();
        cat2.setName(name);

        System.out.println("Введите возраст второго кота");
        try {
            age = br.readLine();
        } catch (Exception e) {
        }
        ;
        age_int = Integer.parseInt(age);
        cat2.setAge(age_int);

        System.out.println("Введите вес второго кота");
        try {
            weight = br.readLine();
        } catch (Exception e) {
        }
        ;
        weight_int = Integer.parseInt(weight);
        cat2.setWeight(weight_int);

        System.out.println("Введите пол второго кота(male/female)");
        try {
            male = br.readLine();
        } catch (Exception e) {
        }
        cat2.setMale(male);

        System.out.println("Введите имя третьего кота");
        try {
            name = br.readLine();
        } catch (Exception e) {
        }
        cat cat3 = new cat();
        cat3.setName(name);

        System.out.println("Введите возраст третьего кота");
        try {
            age = br.readLine();
        } catch (Exception e) {
        }
        ;
        age_int = Integer.parseInt(age);
        cat3.setAge(age_int);

        System.out.println("Введите вес третьего кота");
        try {
            weight = br.readLine();
        } catch (Exception e) {
        }
        ;
        weight_int = Integer.parseInt(weight);
        cat3.setWeight(weight_int);

        System.out.println("Введите пол третьего кота(male/female)");
        try {
            male = br.readLine();
        } catch (Exception e) {
        }
        cat3.setMale(male);
        mark1=0;mark2=0;mark3=0;
        points1 = cat1.getAge()+cat1.getWeight();
        points2 = cat2.getAge()+cat2.getWeight();
        points3 = cat3.getAge()+cat3.getWeight();
        fight = cat1.setFight(points1,points2);
        if (fight==true) mark1++; else mark2++;

        fight = cat1.setFight(points2,points3);
        if (fight==true) mark2++; else mark3++;
        fight = cat1.setFight(points1,points3);
        if (fight==true) mark1++; else mark3++;
        if (mark1>mark2 && mark1>mark3) {
            System.out.println("Победа первого");
            cat1.eat();
            System.out.println("Имя победившого "+ cat1.getName());
            System.out.println("Вес победившого "+ cat1.getWeight());
            System.out.println("Пол победившого "+ cat1.getMale());
            System.out.println("Возраст победившого "+ cat1.getAge());
        }

        if (mark2>mark3 && mark2>mark1) {
            System.out.println("Победа второго");
            cat2.eat();
            System.out.println("Имя победившого "+ cat2.getName());
            System.out.println("Вес победившого "+ cat2.getWeight());
            System.out.println("Пол победившого "+ cat2.getMale());
            System.out.println("Возраст победившого "+ cat2.getAge());
        }
        if (mark3>mark1 && mark3>mark2) {
            System.out.println("Победа третьего");
            cat3.eat();
            System.out.println("Имя победившого "+ cat3.getName());
            System.out.println("Вес победившого "+ cat3.getWeight());
            System.out.println("Пол победившого "+ cat3.getMale());
            System.out.println("Возраст победившого "+ cat3.getAge());
        }




    }
}
