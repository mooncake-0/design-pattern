package behavioral.iterator.v1;

import behavioral.iterator.MenuItem;

import java.util.ArrayList;

// PancakeHouse 식당의 MenuItem 은 ArrayList 자료구조에 담겨 있다
public class PancakeHouseMenuV1 {

    private ArrayList<MenuItem> menuItems;

    public PancakeHouseMenuV1(){

        this.menuItems = new ArrayList<>();
        addItem(new MenuItem("Pancake", "-", false, 2.99));
        addItem(new MenuItem("Blueberry Pancake", "-", true, 3.49));

    }


    public void addItem(MenuItem menuItem){
        this.menuItems.add(menuItem);
    }


    public ArrayList<MenuItem> getMenuItems(){
        return this.menuItems;
    }
}
