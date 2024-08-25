import java.util.Stack;

public class RemoteContraol {
    private Command[] onCommands;
    private Command[] offCommands;
    private Stack<Command> CommandStack;

    public RemoteContraol(int i) {
        onCommands = new Command[7];
        offCommands = new Command[7];
        CommandStack = new Stack<>();


        Command onCommand = new Command() {
            @Override
            public void execute() {
            }

            @Override
            public void undo() {
            }
        };
    }

    public void setCommand(int index, Command oncommand, Command offcommand) {
        onCommands[index] = oncommand;
        offCommands[index] = offcommand;
    }

    public void onButtonWasPressed(int index) {
        onCommands[index].execute();
        CommandStack.push(onCommands[index]);
    }

    public void offButtonWasPressed(int index) {
        offCommands[index].execute();
        CommandStack.push(offCommands[index]);
    }

    public void undoButtonWasPressed() {
        if (!CommandStack.empty()) {
            CommandStack.pop().undo();
        } else {
            System.out.println("No Commands undo");
        }
    }
}


