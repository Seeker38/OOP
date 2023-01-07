//package test.bai3;
//
//public class MyArray implements MyIterable {
//    private static final int MAX_ITEMS = 6;
//    private int numberOfItems;
//    private String[] menuItems;
//
//    public MyArray() {
//        numberOfItems = 0;
//        menuItems = new String[MAX_ITEMS];
//    }
//
//    public void addItem(String name) {
//        if (menuItems == null) {
//            menuItems[0] = name;
//        }
//        if (menuItems.length == MAX_ITEMS) {
//            System.out.println("Loi");
//        } else
//            for (int i = 0; i < MAX_ITEMS; i++) {
//                if (menuItems[i] == null) {
//                    menuItems[i] = name;
//                    break;
//                }
//            }
//    }
//
//    public String[] getMenuItems() {
//        return menuItems;
//    }
//
//    public Iterator createIterator() {
//        return new
//    }
//
//    public String toString() {
//        return "My Array Structure";
//    }
//}
