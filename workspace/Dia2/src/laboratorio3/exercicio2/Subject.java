package laboratorio3.exercicio2;


public interface Subject {

    void registerObserver(Observer o);
    void notifyObservers(NetflixContent conteudo);

}