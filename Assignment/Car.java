
class RR {

    String model;
    int year;

    
        RR(String m, int y)
        {
            model = m;
            year = y;
        }

        public class car
        {
            public static void main(String[] args)
            {
                RR c1 = new RR("Rolls Royce Phantom", 1925);

                System.out.println("The Model is :" + c1.model);
                System.out.println("The Presented year is : " + c1.year);

            }

        }
}