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

        System.out.println("Введите возраст первого кота");
        try {
            age = br.readLine();
        } catch (Exception e) {
        }
        ;
        age_int = Integer.parseInt(age);

        System.out.println("Введите вес первого кота");
        try {
            weight = br.readLine();
        } catch (Exception e) {
        }
        ;
        weight_int = Integer.parseInt(weight);

        System.out.println("Введите пол первого кота(male/female)");
        try {
            male = br.readLine();
        } catch (Exception e) {
        }
        cat cat1 = new cat(name,age_int,weight_int,male);

        System.out.println("Введите имя второго кота");
        try {
            name = br.readLine();
        } catch (Exception e) {
        }

        System.out.println("Введите возраст второго кота");
        try {
            age = br.readLine();
        } catch (Exception e) {
        }
        age_int = Integer.parseInt(age);

        System.out.println("Введите вес второго кота");
        try {
            weight = br.readLine();
        } catch (Exception e) {
        }
        weight_int = Integer.parseInt(weight);

        System.out.println("Введите пол второго кота(male/female)");
        try {
            male = br.readLine();
        } catch (Exception e) {
        }
        cat cat2 = new cat(name,age_int,weight_int,male);


        System.out.println("Введите имя третьего кота");
        try {
            name = br.readLine();
        } catch (Exception e) {
        }

        System.out.println("Введите возраст третьего кота");
        try {
            age = br.readLine();
        } catch (Exception e) {
        }
        ;
        age_int = Integer.parseInt(age);

        System.out.println("Введите вес третьего кота");
        try {
            weight = br.readLine();
        } catch (Exception e) {
        }
        weight_int = Integer.parseInt(weight);

        System.out.println("Введите пол третьего кота(male/female)");
        try {
            male = br.readLine();
        } catch (Exception e) {
        }
        cat cat3 = new cat(name,age_int,weight_int,male);

        mark1=0;mark2=0;mark3=0;
        points1 = cat1.age+cat1.weight;
        points2 = cat2.age+cat2.age;
        points3 = cat3.age+cat3.weight;
        fight = cat1.setFight(points1,points2);

        if (fight==true) mark1++; else mark2++;
        fight = cat1.setFight(points2,points3);
        if (fight==true) mark2++; else mark3++;
        fight = cat1.setFight(points1,points3);
        if (fight==true) mark1++; else mark3++;
        if (mark1>mark2 && mark1>mark3) {
            System.out.println("Победа первого");
            cat1.eat();
            System.out.println("Имя победившого "+ cat1.name);
            System.out.println("Вес победившого "+ cat1.weight);
            System.out.println("Пол победившого "+ cat1.male);
            System.out.println("Возраст победившого "+ cat1.age);
        }
        if (mark2>mark3 && mark2>mark1) {
            System.out.println("Победа второго");
            cat2.eat();
            System.out.println("Имя победившого "+ cat2.name);
            System.out.println("Вес победившого "+ cat2.weight);
            System.out.println("Пол победившого "+ cat2.male);
            System.out.println("Возраст победившого "+ cat2.age);
        }
        if (mark3>mark1 && mark3>mark2) {
            System.out.println("Победа третьего");
            cat3.eat();
            System.out.println("Имя победившого "+ cat3.name);
            System.out.println("Вес победившого "+ cat3.weight);
            System.out.println("Пол победившого "+ cat3.male);
            System.out.println("Возраст победившого "+ cat3.age);
        }
    }
}
