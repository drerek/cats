/**
 * Created by Артём on 09.01.2015.
 */
public class cat {
    int age;
    int weight;
    String name;
    String male;
    private boolean fight;
    cat(String name,int age,int weight,String male){
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.male=male;
    }
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
