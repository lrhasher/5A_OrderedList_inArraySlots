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
        return size() + "   " + list.toString();
    }

    public boolean add( int val) {
        int index;
        double counter;
        // // binary method: in development
        // for(index = (size() / 2) , counter = (((double)size()) / 4); counter < 1 ; counter /= 2) {
        //     if( val > get( index))
        //         index += (int)counter;
        //     else if(val != get( index))
        //         index -= (int)counter;
        // }
        // // linear method: slow but functional
        for (index = 0; index < list.size() && list.get(index) < val; index++) {}
        list.add( index, val);
        return true;
    }

    public boolean remove( int index) {
        list.remove( index);
        return true;
    }
}
