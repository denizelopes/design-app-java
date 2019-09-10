package laboratorio3.exercicio1;

public class ConsolePSPDecorator extends ConsoleDeJogosDecorator {

    public ConsolePSPDecorator(ConsoleDeJogos consoleDeJogos){
        super(consoleDeJogos);
    }

    @Override
    public String describe() {
        return (super.describe() + " PSP");
    }
}