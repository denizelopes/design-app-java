package laboratorio3.exercicio1;

public class ConsoleNintendoSwitchDecorator extends ConsoleDeJogosDecorator {

    public ConsoleNintendoSwitchDecorator(ConsoleDeJogos consoleDeJogos){
        super(consoleDeJogos);
    }

    @Override
    public String describe() {
        return (super.describe() + " Nintendo Switch");
    }
}
