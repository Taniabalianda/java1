        public class Main {
    public static void main(String args[]) {


        Stadium  Dunamo= new Stadium();
        Stadium Lviv= new Stadium("Arena Lviv", 1000, 500, 300, 50);
        Stadium Start= new Stadium("Yntar", 2000, 400, 200, 40);

        System.out.println(Dunamo.toString());
        System.out.println(Lviv.toString());
        System.out.println(Start.toString());

        Dunamo.resetValues("Yniv", 1500, 450, 200, 60);

        Dunamo.printArena();
        Lviv.printArena();
        Start.printArena();
        Lviv.setArea(60);
        Stadium.printStaticArena();
    }
}