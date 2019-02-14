      public class Stadium {
        private String name = "Arena Lviv";
        private int numberOfViews;
        private int lightPower;
        private int parkingCars;

        private static  int areaField;

        public static int totalarea = 0;

        public Stadium(){
            this(null, 0, 0);
        }
        public Stadium(String name, int numberOfViews, int lightPower){
            this(name, numberOfViews, lightPower, 0, 0);
        }



        public Stadium(String name, int numberOfViews, int lightPower, int parkingCars, int areaField){
            setName(name);
            setNumber(numberOfViews);
            setLight(lightPower);
            setParking(parkingCars);
            setArea(areaField);
        }

        private void setName(String name) {
        }


        @Override
        public String toString() {
            return "Stadium{" +
                    "name=" + name +
                    ", numberOfViews=" + numberOfViews +
                    ", lightPower=" + lightPower +
                    ", parking_cars=" + parkingCars +
                    '}';
        }

        static void printStaticArena() {
            System.out.println ("Field  area is " + areaField + " square meters ");
        }

        public void printArena(){
            System.out.println("Field  area is " + areaField + " square meters, stadium area is  "+ totalarea+".");
        }
        public void resetValues( String name , int numberOfViews, int lightPower, int parkingCars, int areaField) {
            setName(name);
            setNumber(numberOfViews);
            setLight(lightPower);
            setParking(parkingCars);
            setArea (areaField);
        }

        public void setArea (int areaField ){
            this.areaField = areaField;
        }
        public String getName () {
            return name;
        }

        public void settNumber (int numberOfViews) {
            this.numberOfViews = numberOfViews;
        }

        public double getTotalarea (){
            return totalarea;
        }

        public void setTotalarena (double totalarea){
            totalarea -= this.totalarea;
            this.totalarea = areaField;
            totalarea += this.areaField;
        }
        public int getNumber(){
            return numberOfViews;
        }
        public void setNumber (int numberOfNiews){
            this.numberOfViews = numberOfViews;
        }
        public  double areaField () {
            return areaField;
        }
        public int getLight () {
            return lightPower;
        }
        public void setLight(int lightPower){
            this.lightPower = lightPower;

        }

        public int getParking (){
            return parkingCars;
        }

        public void setParking(int parkingCars){
            this.parkingCars = parkingCars;

        }
    }

