public class Stos<T>
{
    private Node<T> _stos_head;
    
    Stos()
    {
        _stos_head = new Node<T>();
    }

    public void push(T val)
    {   
        Node<T> current = _stos_head;

        while(!current.is_tail())
        {
            current = current.next();
        }
        
        current.set(val);
       
    }
    
    public T pop()
    {   
        if(_stos_head.is_tail())
        {
            System.out.println("Stos jest pusty!");
            return null; 
        }
        else
        {
            Node<T> current = _stos_head;

            while(!current.next().is_tail())
            {
                current = current.next();
            }
            
            current.set_as_tail();
            return current.value();
        }
    }
    
    public String toString()
    {   
        if(_stos_head.is_tail())
        {
            return "Stos jest pusty!";
        }
        else
        {
            Node<T> current = _stos_head;
            String out_String = "";
            while(!current.is_tail())
            {   
                out_String += "{" + current.value() + "}" + " ";
                current = current.next();
            }
            //String(current.value())
            return out_String;
        }
    }
}
