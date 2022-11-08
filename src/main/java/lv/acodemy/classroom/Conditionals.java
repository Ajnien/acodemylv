package lv.acodemy.classroom;

public class Conditionals {
    public static void main(String[] args) {
        //Operator : IF
        //boolean : true/false
        //5>2 (true)
        //10<1 (false)

        if (10 < 1) {
            System.out.println("Yes 10 < 1");
        }
        //boolean
        boolean isNikitaToxic = false;
        if(isNikitaToxic) {
            System.out.println("Spank him!");
        }
        //String example
        //Меняем Ригу на Прагу

        String myCity = "Prague";
        if (myCity.equals("Riga")){
            System.out.println("Yes, city is Riga!");
            //call methods
            //create variables
            //create new objects
        }
        //найдет по буквам
        if(myCity.contains("iga")){
            System.out.println("Yes, city is Riga!");
        }
        String name = "John";
        if (!name.equals("Alise")){
            System.out.println(name + "is not Alise, so it can be registered!");
    }
        //if-else
        //меняе на 20
        int age = 20;
        if(age < 18){
            System.out.println("Please come later!");
        } else {
            System.out.println("You can buy everything you want!");
        }
        //<= less or equals
        //=> more or equals

        //if-els-if-else
        //currentTime <= 11 || currentTime > 6 -> good morning!
        //currentTime > 17 || currrentTime ..
        //else -> goodnight!

        int currentTime = 20;
        if(currentTime <= 11 || currentTime > 6){
            System.out.println("Good morning!");
        } else if(currentTime > 11 || currentTime < 17) {
            System.out.println("Good day!");
        } else if (currentTime > 17 || currentTime < 24) {
            System.out.println("Good evening!");
        } else if (currentTime >= 0 || currentTime < 6){
            System.out.println("Good night!");
        } else {
            System.out.println("Current time is not correct!" + currentTime);
        }

        }


}