public class Main {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();


        lista.inserePrimeiro(10);
        //lista.insereDepois(10,15);
        //lista.insereDepois(15,5);
        lista.inserePrimeiro(20);
        lista.insereOrdenado(30);
        lista.imprime();
    }
}