public class A {
        private String entry;
        private A next;


    public A(A next, String entry) {
        this.entry = entry;
        this.next = next;
    }

    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }

    public A getNext() {
        return next;
    }

    public void setNext(A next) {
        this.next = next;
    }
}
