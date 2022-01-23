public class DataStructure {
    static class MyListItem{
        private MyListItem prev;
        private MyListItem next;

        public MyListItem getPrev() {
            return prev;
        }

        public MyListItem(MyListItem prev, MyListItem next, int value) {
            this.prev = prev;
            this.next = next;
            this.value = value;
        }

        public void setPrev(MyListItem prev) {
            this.prev = prev;
        }

        public MyListItem getNext() {
            return next;
        }

        public void setNext(MyListItem next) {
            this.next = next;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        private int value;
    }
    static class MyList{
        private MyListItem current, last, first;
        public int get(){
            return current.getValue();
        }
        public MyList() {
            current = null;
            last = null;
            first = null;
        }

        public void add(int value){
            MyListItem item = new MyListItem(last, null, value);
            if (last != null){
                last.setNext(item);
            } else {
                first = item;
            }
            last = item;
        }
        void delete() {
            if (current == null) {
                System.out.println("ERROR");
                return;
            }
            MyListItem prev = current.getPrev();
            if (prev != null) {
                prev.setNext(current.getNext());
                if (current == last) {
                    last = prev;
                }
                current = prev.getNext();
            } else {
                current = null;
                first = null;
                last = null;
            }
        }
        boolean moveNext(){
            if (current == null && first != null){
                current = first;
                return true;
            } if(current != null){
                current = current.getNext();
                return current != null;
            }
            return false;
        }
        void moveFirst(){
            current = null;
        }
    }
    public static void main(String [] args){
        MyList x = new MyList();
        x.add(1);
        x.add(2);
        x.add(3);
        x.add(4);
        x.add(5);
        while (x.moveNext()){
            System.out.println(x.get());
        }
        x.moveFirst();
        x.moveNext();
        x.moveNext();
        x.delete();
        x.moveFirst();
        while (x.moveNext()){
            System.out.println(x.get());
        }
    }
}
