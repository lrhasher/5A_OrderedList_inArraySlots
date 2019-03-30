public class UserOfOrderedList {
    public static void main(String[] args) {

        OrderedList_inArraySlots list = new OrderedList_inArraySlots();

        for( int i = 0; i < 10 ; i++)
            list.add(i * 10);
        System.out.println( list);

        list.add(-1);
        list.add(5);
        list.add(100);
        System.out.println( list);

        for( int i = 0; i < list.size(); i += 3) {
            System.out.println( list.get(i));
            list.remove(i);
        }
        System.out.println( list);
    }
}
