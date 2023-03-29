public class FloatArithmeticMean {
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("Brak argumentów programu.");
        } else {
            float sum = 0;
            for(int i=0; i<args.length; i++){
                sum += Float.parseFloat(args[i]);
            }
            float average = sum / args.length;
            System.out.println();
            for(int i=0; i<args.length; i++){
                System.out.printf("%8.3f%n", Float.parseFloat(args[i]));
            }
            System.out.println("----------");
            System.out.printf("%8.3f%n", sum);
            System.out.printf("%8.4f%n", average);
        }
    }
}
