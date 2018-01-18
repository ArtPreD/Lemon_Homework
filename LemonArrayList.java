class LemonArrayList<E>{

    private Object[] array;

    private int size;

    public LemonArrayList(){
        array = new Object[20];
    }

    public void add(E e){
        array[size]  = e;
        size++;
    }

    public void set(E e){

    }
    public void remove(E e){

    }

    public int size(){
        return size;
    }

    public E get(int index){
        return (E) array[index];
    }
}