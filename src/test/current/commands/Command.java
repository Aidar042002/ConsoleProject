package test.current.commands;

import java.io.IOException;

public interface Command {
    String getDescription();
    String getName();
    void execute(String argument);
}
