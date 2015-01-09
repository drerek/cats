/**
 * Created by Артём on 09.01.2015.
 */
public class cat {
    private int age;
    private int weight;
    private String name;
    private String male;
    private boolean fight;
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    };
    public void setName(String name){
        this.name = name;
    };
    public String getName(){
        return name;
    };
    public void setWeight(int weight){
        this.weight = weight;
    };
    public int getWeight(){
        return weight;
    };
    public void setMale(String male){
        this.male = male;
    };
    public String getMale(){
        return male;
    };
    public boolean setFight(int points1,int points2){
    if (points1>points2) {
        return true;
    }
        return false;
    }
    public void eat(){
        weight=weight+2;
    }
}
