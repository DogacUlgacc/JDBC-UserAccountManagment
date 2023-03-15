package userAccountManagment;


public class Main {

    public static void main(String[] args) {
    Update upp = new Update();
    upp.list();
        System.out.println("**************************");
    upp.insert(5, "Mustafa", "Kemal");
    upp.list();
        System.out.println("**************************");
        upp.insert2(6,"Ali","Can");
        upp.list();
        System.out.println("**************************");
        upp.delete(5);
        upp.list();
        System.out.println("**************************");
         upp.delete2(6);
        upp.list();

    }
}
