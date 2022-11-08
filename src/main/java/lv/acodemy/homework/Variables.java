package lv.acodemy.homework;

public class Variables {
    public static void main(String[] args) {
        /*
        Home work.
        First 10 variables for data type - byte
         */
        byte byteVariable = 99;
        System.out.println(byteVariable);
        byte minByteValue = Byte.MIN_VALUE;
        System.out.println(minByteValue);
        byte maxByteValue = Byte.MAX_VALUE;
        System.out.println(maxByteValue);
        byte defaultValue = 0;
        System.out.println(defaultValue);
        byte age = 23;
        System.out.println(age);
        byte floor = 2;
        System.out.println(floor);
        byte classmates = 25;
        System.out.println(classmates);
        byte a = 11;
        System.out.println(a);
        byte b = 88;
        System.out.println(b);
        byte variablesQuantity = 10;
        System.out.println(variablesQuantity);

        //Second 10 variables for data type - short

        short salary = 999;
        System.out.println(salary);
        short length = 180;
        System.out.println(length);
        short minShortValue = Short.MIN_VALUE;
        System.out.println(minShortValue);
        short maxShortValue = Short.MAX_VALUE;
        System.out.println(maxShortValue);
        short distanceToWarsaw = 24000;
        System.out.println(distanceToWarsaw);
        short youtubeSubscribers = 10000;
        System.out.println(youtubeSubscribers);
        short memoryInMegabytes = 32000;
        System.out.println(memoryInMegabytes);
        short mortgage = 15000;
        System.out.println(mortgage);
        short customersPerDay = 20000;
        System.out.println(customersPerDay);
        short debt = -14000;
        System.out.println(debt);

        //Third 10 variables for data type - char

        char firstLetter = 'H';
        System.out.println(firstLetter);
        char secondLetter = 'E';
        char thirdLetter = 'L';
        char fourthLetter = 'L';
        char fifthLetter = 'O';
        char myLetter = 'A';
        char surnameFirstLetter = 'P';
        char letterC = 'C';
        char letterD = 'D';
        System.out.println(letterD);

        //Fourth 10 variables for data type - int

        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;
        int youtubeViewsOnLastVideo = 1800456;
        int secondsInWeek = 604800;
        int populationInIceland = 303000;
        int populationInRiga = 700000;
        int newUsersPerDay = 197000;
        int populationIn = 82604;
        int populationInMunich = 753056;
        int quatorLength = 24000;
        System.out.println(quatorLength);

        //Fifth 10 variables for data type - float
        float gamePrice = 29.99f;
        System.out.println(gamePrice);
        float normalBodyTemperature = 36.6f;
        System.out.println(normalBodyTemperature);
        float x = 1.23f;
        float y = -3.21f;
        System.out.println(y);
        float z = 5.12f;
        System.out.println(z);
        float batteryCharge = 99.99f;
        System.out.println(batteryCharge);
        float stockPrice = 49.48f;
        System.out.println(stockPrice);
        float bridgeLength = 12.5f;
        float bridgeHeight = 3.5f;
        float bridgeWidth = 2.10f;

        //Sixth 10 variables for data type - long;
        long minLongValue = Long.MIN_VALUE;
        System.out.println(minLongValue);
        long maxLongValue = Long.MAX_VALUE;
        System.out.println(maxLongValue);
        long coronavirusCases = 9999888777L;
        System.out.println(coronavirusCases);
        long countryBudget2022InEur = 43000000L;
        System.out.println(countryBudget2022InEur);
        long appleProfit = 100000000L;
        System.out.println(appleProfit);
        long microsoftLosses = 59657831L;
        System.out.println(microsoftLosses);
        long earthAge = 4000000000L;
        System.out.println(earthAge);
        long distanceToMarsInKm = 900000890L;
        System.out.println(distanceToMarsInKm);
        long earthPopulation = 8000999L;
        System.out.println(earthPopulation);
        long grossNationalProduct = 967412340L;
        System.out.println(grossNationalProduct);

        //Seventh 10 variables for data type - double;

        double telegramSubscriptionPriceInEur = 4.99999999;
        System.out.println(telegramSubscriptionPriceInEur);
        double waterMeterIndicationCold = 76954.729;
        System.out.println(waterMeterIndicationCold);
        double waterMeterIndicationHot = 36783.003;
        System.out.println(waterMeterIndicationHot);
        double calculationError = 1.00000000001;
        System.out.println(calculationError);
        double gasMeterIndication = 6734508.635111;
        System.out.println(gasMeterIndication);
        double electricityMeterIndication = 100.87651;
        System.out.println(electricityMeterIndication);
        double o2MollarMass = 32.0007361111;
        System.out.println(o2MollarMass);
        double dieselPrice = 1.890001234;
        System.out.println(dieselPrice);
        double minDoubleValue = Double.MIN_VALUE;
        System.out.println(minDoubleValue);
        double maxDoubleValue = Double.MAX_VALUE;
        System.out.println(maxDoubleValue);

        //Eight 10 variables for data type - boolean with prefix is or has
        boolean isSummer = false;
        boolean isFall = true;
        boolean isDay = false;
        boolean isHungry = false;
        boolean isMorning = true;
        boolean isEvening = false;
        boolean is2022 = true;
        boolean isRain = true;
        boolean isSunny = false;
        boolean isSnow = false;


        //Second task

        byte brakeTime = 1;
        byte workingTime = 7;
        byte result1 = (byte) (brakeTime + workingTime);
        System.out.println(result1);

        byte pensionAge = 64;
        byte myAge = 23;
        byte yearsUntilPension = (byte) (pensionAge - myAge);
        System.out.println(yearsUntilPension);

        byte workingHours = 8;
        byte workingDays = 5;
        byte workingHoursPerMonth = (byte) (workingHours * workingDays);
        System.out.println(workingHoursPerMonth);

        byte piecesOfCake = 6;
        byte guests = 3;
        byte result2 = (byte) (piecesOfCake / guests);
        System.out.println(result2);

        byte books = 21;
        byte students = 10;
        byte result3 = (byte) (books % students);
        System.out.println(result3);

        short salary1 = 2000;
        short premium = 200;
        short result4 = (short) (salary1 + premium);
        System.out.println(result4);

        short waterMeterIndicatorJanuary = 4738;
        short waterMeterIndicatorFebruary =4730;
        short consumption = (short) (waterMeterIndicatorJanuary - waterMeterIndicatorFebruary);
        System.out.println(consumption);

        short length1 = 1123;
        short width1 = 2;
        short figureArea = (short) (length1 * width1);
        System.out.println(figureArea);

        short cardsForOnePlayer = 6;
        short cardsInDeck = 64;
        short result5 = (short) (cardsInDeck / cardsInDeck);
        System.out.println(result5);

        short channels = 863;
        short viewers = 531;
        short result6 = (short) (channels % viewers);
        System.out.println(result6);


       int monthSalary = 2500;
       int vacationMoney = 2100;
       int result10 = monthSalary + vacationMoney;
       System.out.println(result10);

       int studentsInUniversity = 15000;
       int graduates = 3000;
       int result11 = studentsInUniversity - graduates;
        System.out.println(result11);

        int flatOnFloor = 79;
        int floorsInBuilding = 103;
        int flatInBuilding = flatOnFloor * floorsInBuilding;
        System.out.println(flatInBuilding);

        int distanceToHome = 7631;
        int timeMIn = 36;
        int speed = distanceToHome / timeMIn;
        System.out.println(speed);

        int dogsParksInRiga = 9;
        int dogsInRiga = 14000;
        int result12 = dogsParksInRiga % dogsInRiga;


        float populationInSouthAmerica = 288000.633f;
        float populationInNorthAmerica = 500111.1f;
        float result13 = (float) (populationInNorthAmerica + populationInSouthAmerica);
        System.out.println(result13);

        float earthPopulation1 = 8000006.87f;
        float coronavirusCases1 = 2000075.56f;
        float result14 = (float) (earthPopulation + coronavirusCases);
        System.out.println(result14);

        float figureSides = 17f;
        float oneSideAreaInM = 99.343f;
        float figureArea1 = (float) (figureSides * oneSideAreaInM);
        System.out.println(figureSides);

        float iceCreamQuantity = 104f;
        float kidsInClass = 25f;
        float result15 = (float) (iceCreamQuantity / kidsInClass);
        System.out.println(result15);

        float placesOnParking = 2500f;
        float parkingCustomersPerDay = 8900f;
        float result16 = (float) (placesOnParking % parkingCustomersPerDay);
        System.out.println(result16);


        long moneyFromTwitterStock = 55000000L;
        long moneyFromTeslaStock = 6542000L;
        long monthProfit = (long) (moneyFromTeslaStock + moneyFromTwitterStock);
        System.out.println(monthProfit);



    }
}