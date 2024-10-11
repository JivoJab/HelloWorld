public class ExplainForLoop {
        public static void main(String[] args) {
            String a = "Umbrella";
            boolean per = false;
            for(int i = 0; i <a.length(); i++) {
                if(a.charAt(i) == 'x') {
                    per = true;
                    break;
                }
            }System.out.println(per);
        }
}
