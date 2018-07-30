public class Main {
    public static void main(String[] args) {
        AbstracttDisplay d1 = new CharDisplay('H');
        AbstracttDisplay d2 = new StringDisplay("hello world");
        AbstracttDisplay d3 = new StringDisplay("你好，煞笔");
        d1.display();
        d2.display();
        d3.display();
    }
}
