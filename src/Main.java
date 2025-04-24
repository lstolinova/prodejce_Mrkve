
public class Main {
    public static void main(String[] args) {

        Prodejce prodejce1 =
                new Prodejce("Irena Ondrová",2,"1.9.1986",2.44,false);
        Prodejce prodejce2 =
                new Prodejce("Petr Svoboda",5,"2.4.1962",5.87,true);



        System.out.println(prodejce1.getName()+" prodává "+ prodejce1.getMn_viMrkve()+ " tuny mrkve ročně");
        System.out.println(prodejce2.getName()+" prodává "+ prodejce2.getMn_viMrkve()+ " tuny mrkve ročně ");


    }
}