package behavioral.iterator.v2;

import behavioral.iterator.MenuItem;

public class DinerMenuIterator implements MyIterator{

    private DinerMenuV2 dinerMenu;
    private int position = 0;

    public DinerMenuIterator(DinerMenuV2 dinerMenu) {
        this.dinerMenu = dinerMenu;
    }

    @Override
    public boolean hasNext() {
        if (this.position >= this.dinerMenu.getMenuItems().length) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        MenuItem menuItem = this.dinerMenu.getMenuItems()[position];
        position ++;
        return menuItem;
    }
}
