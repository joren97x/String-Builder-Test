public class App {
    public static void main(String[] args) throws Exception {
        StringBuilder hello = new StringBuilder("Hello");
        System.out.println(hello);

        hello.append(" World!");
        System.out.println(hello);

        hello.reverse();
        System.out.println(hello);

        hello.reverse();
        System.out.println(hello);

        hello.delete(6, 12);
        System.out.println(hello);

        hello.insert(6, "Joren!");
        System.out.println(hello);

        hello.insert(6, "world and ");
        System.out.println(hello);

        hello.replace(6, 22, "World!");
        System.out.println(hello);

    }
}
