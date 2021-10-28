public class Bell {



        Boolean ding = true;

    public static void main(String[] args) {

    }
        void sound () {

            // Метод
            if (ding) {
                System.out.println("ding");
            } else {
                System.out.println("dong");
            }
            ding = !ding;

        }
    }




