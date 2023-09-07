public class Main {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        lista.inserePrimeiro(1);//OK
        lista.imprime();

        lista.insereUltimo(10);
        lista.insereUltimo(30);
        lista.insereUltimo(50);
        lista.imprime();

        lista.insereOrdenado(20);
        lista.imprime();

        lista.insereUltimo(40);
        lista.insereUltimo(12);
        lista.imprime();

        lista.insereOrdenado(15);
        lista.imprime();

        lista.removeUltimo();//OK
        lista.imprime();

        lista.removePrimeiro();//OK
        lista.imprime();

        Node node = lista.getNode(40);
        lista.remove(node);//OK
        lista.imprime();

        Node node1 = lista.getNode(30);
        lista.insereDepois(node1,45);//OK
        lista.imprime();

        lista.insereOrdenado(40);
        lista.imprime();

        lista.inserePrimeiro(1);
        lista.insereOrdenado(12);
        lista.imprime();

    }
}