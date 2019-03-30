public class OrderedList_inArraySlots {
    List_inArraySlots list;



    public OrderedList_inArraySlots() {
        list = new List_inArraySlots();
    }


    public int get( int index) {
        return list.get( index);
    }

    public int size() {
        return list.size();
    }

    public String toString() {
        return list.toString();
    }

    public boolean add( int val) {
        int index;
        double counter;
        for(index = (size() / 2) , counter = (((double)size()) / 4); counter < 1 ; counter /= 2) {
            if( val > get( index))
                index += (int)counter;
            else
                index -= (int)counter;
        }
        list.add( index, val);
        return true;
    }

    public boolean remove( int index) {
        list.remove( index);
        return true;
    }
}
