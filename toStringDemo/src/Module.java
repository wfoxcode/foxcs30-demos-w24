public class Module {
    private int num;

    public void set(int a) {
        num = a;
    }
    public void calc() {
        num = num * 28;
    }

    // A special method that turns your class object reference into a string representation
    // This means instead of calling object.print() or object.result() with a special method
    // You can instead just call object in your runner and it will return the toString() result.
    // e.g. System.out.print(object); vs System.out.print(object.result());
    public String toString() {

        return "The answer is this number!!!! " + num;

    }
}
