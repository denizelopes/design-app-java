package laboratorio3.exercicio1;

public abstract class ConsoleDeJogosDecorator  implements ConsoleDeJogos{

    protected ConsoleDeJogos consoleDeJogos;

    public ConsoleDeJogosDecorator(ConsoleDeJogos consoleDeJogos){
        this.consoleDeJogos = consoleDeJogos;
    }

    @Override
    public String describe() {
        return consoleDeJogos.describe();
    }
}

