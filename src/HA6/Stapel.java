package HA6;

public class Stapel {
    private StapelElement head;

    // Zuerst leer Stapel bilden
    public Stapel() {
        this.head = null;
    }

    public void fuegeElementHinzu(String s) {
        //leer Stapel; s als neue head
        if(this.head == null) {
            this.head = new StapelElement(s, null);
        } else {
            // neue element bilden; s ist value, next ist die derzeitige element
            StapelElement stapel = new StapelElement(s, this.head);
            // diese neue Element als head zeichnen
            this.head = stapel;
        }

    }

    public String entferneOberstesElement() {
        if(this.head == null) {
            return null;
        } else {
            // oberste Element speichern
            String current = this.head.getEntry();
            // oberste Element mit dem next ersetzen
            this.head = this.head.getNext();
            return current;
        }
    }

    public String liefereOberstesElement() {
        if(this.head == null) {
            return null;
        } else {
            return this.head.getEntry();
        }
    }

    public long liefereGroesse() {
        int count = 0;
        StapelElement current = this.head;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }

    public boolean istLeer() {
        return this.head == null;
    }

    //  private A head;
    //    private long size;
    //
    //    public TEST() {
    //        this.head = null;
    //    }
    //
    //    public void fuegeElementHinzu(String s) {
    //            A newA = new A(this.head, s);
    //            this.head = newA;
    //            size++;
    //    }
    //
    //    public String entferneOberstesElement() {
    //        if(this.head == null) {
    //            return null;
    //        }
    //        String oberste = liefereObersteElement();
    //        this.head = head.getNext();
    //        size--;
    //        return oberste;
    //    }
    //
    //    public String liefereObersteElement() {
    //        return this.head.getEntry();
    //    }
    //
    //    public long liefereGroesse() {
    //        return this.size;
    //    }
    //
    //    public boolean istLeer() {
    //        if (this.head == null) {
    //            return true;
    //        }
    //        return false;
    //    }
}

class StapelElement {
    private String entry;
    private StapelElement next;

    public StapelElement(String value, StapelElement nextNode) {
        this.entry = value;
        this.next = nextNode;
    }

    public String getEntry() {
        return entry;
    }

    public StapelElement getNext() {
        return next;
    }

    public void setNext(StapelElement next) {
        this.next = next;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }
}






























