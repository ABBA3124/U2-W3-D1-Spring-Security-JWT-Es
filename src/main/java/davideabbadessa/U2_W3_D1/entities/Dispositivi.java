package davideabbadessa.U2_W3_D1.entities;


import davideabbadessa.U2_W3_D1.enums.StatoDispositivo;
import davideabbadessa.U2_W3_D1.enums.TipoDispositivo;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.UUID;

@Entity
@Data
@ToString
@NoArgsConstructor
public class Dispositivi {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Enumerated(EnumType.STRING)
    private TipoDispositivo tipo;

    @Enumerated(EnumType.STRING)
    private StatoDispositivo stato;

    @ManyToOne
    @JoinColumn(name = "dipendente_id")
    private Dipendente dipendente;

}