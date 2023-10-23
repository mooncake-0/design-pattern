package behavioral.iterator.v1;

import behavioral.iterator.MenuItem;

// Diner Restaurant 는 MenuItem 객체를 array 에 담고 있다
// V1 에서는 서로 다른 자료구조에 담고 있기 때문에 다른 방식으로 내부 객체들에게 접근해야 한다
public class DinerMenuV1 {

    private static final int MAX_ITEMS = 6;
    private int curNumberOfItems = 0;
    private MenuItem[] menuItems;

    public DinerMenuV1() {
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
}
