package davideabbadessa.U2_W3_D1.payloads;

import jakarta.validation.constraints.NotEmpty;

import java.util.UUID;

public record DispositivoDTO(

        @NotEmpty(message = "Tipo dispositivo è richiesto!")
        String tipo,

        @NotEmpty(message = "Stato dispositivo è richiesto!")
        String stato,

        UUID dipendenteId
) {
}
