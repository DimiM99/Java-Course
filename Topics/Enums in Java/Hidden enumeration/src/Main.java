public class Main {

    public static void main(String[] args) {
        int i = 0;
        for (Secret thing : Secret.values()) {
            if (thing.name().contains("STAR")) {
                i++;
            }
        }
        System.out.println(i);
    }


}

/* enum Secret {
    STAR, CRASH, START, // ...
}
 */