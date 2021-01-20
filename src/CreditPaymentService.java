public class CreditPaymentService {


    public int calculate(double sum, double procent, double period){
        double an_procent=procent/100/12;
        int payment = (int)Math.round(sum*((an_procent*Math.pow((1+an_procent),period))/((Math.pow((1+an_procent),period))-1)));
        return payment ;
    }

}
