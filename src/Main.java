
public class Main {
    public static void main(String[] args) {
        ListLinked warteschlange = new ListLinked();
        ListLinked myList = new ListLinked();
        //myList.isEmpty(myList);
        //myList.push("Peter");
        //myList.push("Pan");
        //myList.push("Albert");
        //myList.push("Jörg");
        //myList.push("Heike");
        //myList.reverseString("test");
        //myList.listContent();
        //myList.isPalindrome("Racecar");

        warteschlange.bestellungFür("Peter");
        warteschlange.bestellungFür("Agathe");
        warteschlange.bestellungFür("Hansjörg");
        warteschlange.bestellungFür("Dieter");

        warteschlange.listContent();

    //Sehr schnell wachsende Funktion - zum Testen der Rechnleistung - wann kommt der Rechner an seine Grenzen
        //System.out.println(ackermann(2,2));
        zinsesZins(10000,7);
        //profit(500,3);


        }
    public static Integer ackermann(Integer n, Integer m){
        Integer erg = null;

        if(n==0){
            erg=m+1;
        }
        else if(m==0){
            erg=ackermann(n-1,1);
        }
        else {
            erg=ackermann(n-1,ackermann(n,m-1));
        }
        //System.out.println(erg);
        return erg;

    }

    public static void zinsesZins(Integer startcapital,Integer anlagedauer){
        double p = 5.6;
        double endcapital;
        endcapital = startcapital * Math.pow((1+p/100),anlagedauer);
        System.out.println(endcapital);
        //System.out.println("profit: " + (endcapital-startcapital));
    }

    public static void profit(Integer startcapital,Integer anlagedauer){
        double p = 5.6;
        double endcapital = 1;
        double exp = 1;
        double profit;
        for (int i = 1; i<=anlagedauer;i++){
            exp =  exp * (1+ p / 100);

        }
        endcapital = startcapital * exp;
        profit = endcapital- startcapital;
        System.out.println("profit: " + profit + "€");
    }

    }
