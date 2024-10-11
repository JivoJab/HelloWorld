public class PrintLoops {
    //Excercise PRINT!
    // Hello World 3 gange
    public static void main(String[] args) {
        for(int i = 0; i < 3; i++){
            System.out.println("Hello World");
        }System.out.println(" ");

     // Print from 1 - 10.
        for(int i = 0; i <= 10; i++){
            System.out.print(i + " ");
        }System.out.println(" ");

        // Printe * 10 gange
        for(int i = 0; i <= 10; i++) {
            System.out.print("*" + " ");
        }System.out.println(" ");

        // Programmet kører fra 5 til -5
        int i = 5;
        while(i >= -5) {
            System.out.print(i + " ");
            i--;
        }System.out.println(" ");

        // Print hver 3.tal fra 5 til 30
        int j = 5;
        while(j <=30) {
            System.out.print( j + " ");
            j+=3;

        }System.out.println(" ");

            // Excercise: I'm printing this for the
        for(int h = 1; h <= 10; h++){
            System.out.println("I am now printing this for the " + h + "th time");
        }System.out.println(" ");

        int table = 3;
        while( table <= 30) {
            System.out.print(table + " ");
            table+=3;
        }System.out.println(" ");

        //LifeSimulatorBot

        int count = 0;
        while(count <= 99) {
            System.out.println(count + " ");
            count++;
            if(count == 6) {
                System.out.println("Du starter i skole");
            }
            if(count == 18) {
                System.out.println("Du er voksen");
            }

        }
    }
}
