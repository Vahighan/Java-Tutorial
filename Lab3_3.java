import java.util.Date;

public class TestClass {

    private static int numberOfObjects = 0;
    private final int objectNumber;
    private final long creationTime;

    public TestClass() {
        this.objectNumber = ++numberOfObjects;
        this.creationTime = System.currentTimeMillis();
        System.out.println(this);
    }

    @Override
    public String toString() {
        return objectNumber + ". [" + creationTime + "]";
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Brak argumentów programu.");
            return;
        }

        int n = Integer.parseInt(args[0]);
        for (int i = 0; i < n; i++) {
            new TestClass();
        }
        System.out.println("Liczba obiektów: " + numberOfObjects);
    }
}
