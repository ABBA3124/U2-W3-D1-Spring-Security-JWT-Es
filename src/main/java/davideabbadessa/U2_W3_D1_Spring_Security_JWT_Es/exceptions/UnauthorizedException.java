package davideabbadessa.U2_W3_D1_Spring_Security_JWT_Es.exceptions;

public class UnauthorizedException extends RuntimeException {
    public UnauthorizedException(String message) {
        super(message);
    }
}
