package behavioral.iterator;

import behavioral.iterator.v1.DinerMenuV1;
import behavioral.iterator.v1.PancakeHouseMenuV1;
import behavioral.iterator.v2.DinerMenuV2;
import behavioral.iterator.v2.MyIterator;

import java.util.ArrayList;

public class IteratorTest {

    public static void main(String[] args) {
        // 선언된채로 메뉴판에 MenuItem 이 들어가 있다
        PancakeHouseMenuV1 pancakeHouseMenuV1 = new PancakeHouseMenuV1();
        ArrayList<MenuItem> pancakeMenuItems = pancakeHouseMenuV1.getMenuItems();

        DinerMenuV1 dinerMenuV1 = new DinerMenuV1();
        MenuItem[] dinerMenuItems = dinerMenuV1.getMenuItems();

        // 둘은 자료구조가 다르기 때문에 접근해서 내부 Elements 를 가져와야 하는 방법이 다름
        for (int i = 0; i < pancakeMenuItems.size(); i++) {
            MenuItem menuItem = pancakeMenuItems.get(i);
            System.out.println(menuItem.getName());
        }


        for (int i = 0; i < dinerMenuItems.length; i++) {
            MenuItem menuItem = dinerMenuItems[i];
            System.out.println(menuItem.getName());
        }

        DinerMenuV2 dinerMenuV2 = new DinerMenuV2();
        MyIterator iterator = dinerMenuV2.createIterator();
        printAllMenu(iterator);
    }

    private static void printAllMenu(MyIterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println("menuName = " + menuItem.getName());
        }
    }
}
