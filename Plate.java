package lesson8;

public class Plate {

    private int Foodcount;


    public Plate(int foodcount) {
        Foodcount = foodcount;
    }

    public int getFoodcount() {
        return Foodcount;
    }

    public void setFoodcount(int foodcount) {
        Foodcount = foodcount;
    }

    public void eat(Cat cat){
        if(Foodcount >= cat.getAppetite()){
            setFoodcount(getFoodcount()- cat.getAppetite());
            System.out.println(cat.name+" съедает "+cat.getAppetite()+". В тарелке осталось:" + Foodcount);
            cat.fill = true;
        }else {
            System.out.println(cat.name +"не хватило еды");
        }




    }

    public void fullPlate( int count){
        Foodcount = Foodcount + count;
        System.out.println(" Пополнение тарелки на " + count + " стало еды в тарелке : " + Foodcount);



    }
}
