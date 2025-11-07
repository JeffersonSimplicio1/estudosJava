package model.exception;
import java.io.Serial;

public class DomainException extends Exception {
    @Serial
    private static final long serialVersionUID = -3391391266137552814L;

    public DomainException (String msg) {
        super(msg);
    }


}
