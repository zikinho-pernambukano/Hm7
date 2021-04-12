package lesson8;

public class Cat {

    public String name = "Дворовый кот";  // Дефолтный кот

    public int apettite = 5;             // Дефолтный кот будет съедать по 5
    public boolean fill = false;

    public Cat(){

    }

    public Cat(int apettite , String name) {
        this.name=name;
        this.apettite = apettite;

    }
    public String getName() {
        return this.name;
    }

    public int getAppetite() {
        return apettite;
    }

    public void setCat(int apettite, String name) {
        this.name=name;
        this.apettite = apettite;

    }

    public void info(){
        System.out.println(name + " сыт : " + fill );
    }

}
