public class Node<T>
{
    private T _value;
    private Node<T> _next;
    private boolean _is_tail = true;

    Node(){}
    
    public void set(T val)
    {
        _value = val;
        _is_tail = false;
        _next = new Node<T>();
    }
    public T value(){return _value;}
    public Node<T> next(){return _next;}
    public boolean is_tail(){return _is_tail;}
    public void set_as_tail()
    {
        _is_tail = true;
        _next = null;    
    }
}
