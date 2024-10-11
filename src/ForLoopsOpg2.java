public class ForLoopsOpg2 {
    public static void main(String[] args) {
        // 2 til 12 (stiger med 2)
        for (int i = 2; i <= 12; i += 2) {
            System.out.print(i + " ");
        }System.out.println(" ");

        // 4 til 79 stiger med 15
        for (int i = 4; i <= 79; i += 15) {
            System.out.print(i + " ");
        }System.out.println(" ");

        // 30 til -20 falder med 10
        for (int i = 30; i >= -20; i-=10){
            System.out.print(i + " ");
        }System.out.println(" ");

        // 97 til 82 falder med 3
        for(int i = 97; i >=82; i-=3){
            System.out.print(i + " ");
        }System.out.println(" ");
    }
}