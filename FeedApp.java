package lesson8;

public class FeedApp {

    public static void main(String[] args) {

        Plate plate = new Plate(50);
        Cat cats [] = new Cat[10];  // создать массив


        for (int i = 0; i< cats.length; i++){  // заполнить котами
            cats[i] = new Cat();

        }


        cats[0].setCat(30,"Васька");
        cats[1].setCat(10,"Петька");
        for (int i = 0; i< cats.length; i++){
            plate.eat(cats[i]);
            cats[i].info();

        }
        plate.fullPlate(20);




    }




}
