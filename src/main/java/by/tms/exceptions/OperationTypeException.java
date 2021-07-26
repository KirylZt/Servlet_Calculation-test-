package by.tms.exceptions;

public class OperationTypeException extends Exception{
    private int type;

    public OperationTypeException(int type) {
        this.type = type;
    }

    @Override
    public String getMessage() {
        return String.format("Operation with type %s dont exist", type);
    }
}
