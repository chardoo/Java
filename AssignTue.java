import java.util.Scanner;

public class AssignTue {

    public void assi(int sales, int advance) {
        double rate;
        double commission;
        if(sales<10000){
           rate = 0.05;
           commission = sales * rate;
            System.out.println("Your rate is " + 5 + "%");
            System.out.println("your commission is :"+commission);
            if(commission > advance){
                System.out.println("your take home salary is " + (commission-advance) );
            }
            else {
                System.out.println("you have to pay: "+ (advance-commission)+" to the company");
             }
        }
        if(sales>=10000 && sales<=14999){
           rate = 0.1;
           commission = sales * rate;
           System.out.println("Your rate is " + 10 + "%");
           System.out.println("your commission is:"+commission);
            if(commission > advance){
                System.out.println("your take home salary is " + (commission-advance) );
            }
            else {
                System.out.println("you have to pay: "+ (advance-commission)+"to the company");
            }

         }
        if(sales>=15000 && sales<=17999){
           rate = 0.12;
           commission= sales * rate;
            System.out.println("Your rate is " + 12 + "%");
            System.out.println("your commission is:"+commission);
            if(commission > advance){
                System.out.println("your take home salary is " + (commission-advance) );
            }
            else {
                System.out.println("you have to pay: "+ (advance-commission)+" to the company");
            }
         }
        if(sales>=18000 && sales<=21999){
          rate = 0.15;
          commission = sales * rate;
          System.out.println("Your rate is " + 15 + "%");
          System.out.println("your commission is:"+ commission);
            if(commission > advance){
                System.out.println("your take home salary is " + (commission-advance) );
            }
            else {
                System.out.println("you have to pay: "+ (advance-commission)+" to the company");
            }
        }
        if(sales>22000){
          rate = 0.16;
          commission  = sales * rate;
          System.out.println("your commission is:"+commission);
          System.out.println("Your rate is: " + 16 + "%");
            if(commission > advance){
                System.out.println("your take home salary: is " + (commission-advance) );
            }
            else {
                System.out.println("you have to pay :"+ (advance-commission)+" to the company");
            }


         }




    }

    public static void main(String[] args) {
        AssignTue assig = new AssignTue();
        int sales;
        int advacedPay;
        Scanner  input = new Scanner(System.in);
        System.out.println("Enter the sale made in a month");
        sales = input.nextInt();
        System.out.println("Enter the advance pay");
        advacedPay = input.nextInt();
        assig.assi(sales,advacedPay);
    }
}

