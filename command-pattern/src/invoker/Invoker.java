package invoker;

import command.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * Invoker
 *
 * @author YuanJW
 * @date 2023/06/03
 */
public class Invoker {
    private List<Command> commands = new ArrayList<>();

    /**
     * 装载命令
     *
     * @param command
     */
    public void takeCommand(Command command) {
        commands.add(command);
    }

    /**
     * 执行命令
     */
    public void placeCommand() {
        commands.stream().forEach(Command::execute);
        commands.clear();
    }
}
