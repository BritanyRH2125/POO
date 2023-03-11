import java.util.LinkedList;

public class Agrenda extends Main{

    public static void main(String[] args) {
        LinkedList<Contando> list = new LinkedList<Contando>();
        list.add(new Contando(new Persona("Juan", 20), "Calle 1"));//para mandar los tados de la persona
        list.add(new Contando("Maria", 30, "Calle 2"));//otra manera de mandar los datos
    }
    private LinkedList<Contando> laAgenda;
    public Agrenda(){
        this.laAgenda = new LinkedList<Contando>();
    }
    public void agregar(Contando c){
        this.laAgenda.add(c);
    }
    public void imprimir(){
        for (Contando c : this.laAgenda) {
            System.out.println(c);
        }
    }


}
