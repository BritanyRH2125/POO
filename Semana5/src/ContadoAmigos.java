import java.util.LinkedList;

public class ContadoAmigos {
    private LinkedList<Contando> laAgenda;

    public ContadoAmigos(LinkedList<Contando> laAgenda) {
        this.laAgenda = laAgenda;
    }

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
