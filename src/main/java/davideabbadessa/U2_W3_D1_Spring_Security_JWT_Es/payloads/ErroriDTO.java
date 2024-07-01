package davideabbadessa.U2_W3_D1_Spring_Security_JWT_Es.payloads;


import java.time.LocalDateTime;

public record ErroriDTO(String message, LocalDateTime time) {
}
