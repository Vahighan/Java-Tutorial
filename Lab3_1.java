public class ArithmeticMean {
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("Brak argumentów programu.");
        } else if(args.length == 1) {
            System.out.println("Przekazano tylko jedną wartość: " + args[0]);
        } else {
            int sum = 0;
            for(int i=0; i<args.length; i++){
                sum += Integer.parseInt(args[i]);
            }
            int average = sum / args.length;
            int remainder = sum % args.length;
            System.out.print("Średnia arytmetyczna liczb: ");
            for(int i=0; i<args.length-1; i++){
                System.out.print(args[i] + ", ");
            }
            System.out.println(args[args.length-1] + " wynosi " + average + ", reszta: " + remainder);
        }
    }
}
