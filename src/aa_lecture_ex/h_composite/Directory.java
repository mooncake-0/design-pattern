package aa_lecture_ex.h_composite;
import java.util.Iterator;
import java.util.ArrayList;

public class Directory extends Entry {
    private String name;                            // Directory Name
    private ArrayList directory = new ArrayList();      // List of Directory Entries
    public Directory(String name) {                  // Constructor
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getSize() {
        int size = 0;
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            size += entry.getSize();
        }
        return size;
    }
    public Entry add(Entry entry) {
        directory.add(entry);
        return this;
    }
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            entry.printList(prefix + "/" + name);
        }
    }
}
