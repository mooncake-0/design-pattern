package behavioral.iterator.v2;

import behavioral.iterator.MenuItem;

public class DinerMenuV2 extends Menu {

    private static final int MAX_ITEMS = 6;
    private int curNumberOfItems = 0;
    private MenuItem[] menuItems;

    public DinerMenuV2() {
        this.menuItems = new MenuItem[MAX_ITEMS];
        addItem(new MenuItem("Vegeterian BLT", "-", true, 2.99));
        addItem(new MenuItem("Soup", "-", false, 3.29));
    }

    public void addItem(MenuItem menuItem) {
        if (curNumberOfItems >= MAX_ITEMS) {
            System.out.println("더이상 추가할 수 없습니다");
            return;
        }

        this.menuItems[curNumberOfItems] = menuItem;
        curNumberOfItems++;
    }

    public MenuItem[] getMenuItems() {
        return this.menuItems;
    }

    public MyIterator createIterator() {
        return new DinerMenuIterator(this);
    }

}
