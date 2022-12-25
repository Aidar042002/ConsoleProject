package test.current.commands;

public class Exit extends AbstractCommand{
    public Exit() {
        super("exit", "завершить программу (без сохранения в файл)");
    }

    @Override
    public void execute(String argument) {
        System.out.println("Завершение работы");
        System.exit(0);
    }
}
