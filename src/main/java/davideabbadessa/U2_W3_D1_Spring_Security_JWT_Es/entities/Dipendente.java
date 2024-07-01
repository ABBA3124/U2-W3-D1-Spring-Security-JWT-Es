package davideabbadessa.U2_W3_D1_Spring_Security_JWT_Es.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.UUID;

@Entity
@Data
@ToString
@NoArgsConstructor
public class Dipendente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;


    private String username;
    private String nome;
    private String cognome;
    private String email;
    private String avatar;
}
