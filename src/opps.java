public class opps {
    String brand;
    double modelNo;
    int cost;


    public opps(String brand){
        this.brand = brand;
    }
    public opps(String brand, double modelNo ){
        this(brand);
        this.modelNo = modelNo;
    }
    public opps(String brand,double modelNo,int cost){
        this(brand,modelNo);
        this.cost = cost;
    }

    public static void main(String [] args){
        opps O = new opps("ambasedar");
        opps O1 = new opps("ambasedar",2021.211,2000000);
        opps O2 = new opps("ambasedar",2000.33333);




        System.out.println(O.brand);
        System.out.println(O2.brand + O2.modelNo);
        System.out.println(O1.brand + O1.modelNo + O1.cost);






    }



}
