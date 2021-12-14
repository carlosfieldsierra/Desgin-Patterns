public class Singleton {
    private static Singleton myInstance;
    private static int numConnections = 0;

    public static Singleton getInstance() {
        if (myInstance == null) {
            myInstance = new Singleton();
            numConnections += 1;
            System.out.println(numConnections);
        }
        return myInstance;

    }
}
