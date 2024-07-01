package davideabbadessa.U2_W3_D1_Spring_Security_JWT_Es.controllers;

import davideabbadessa.U2_W3_D1_Spring_Security_JWT_Es.payloads.DipendenteLoginDTO;
import davideabbadessa.U2_W3_D1_Spring_Security_JWT_Es.payloads.DipendenteLoginResponseDTO;
import davideabbadessa.U2_W3_D1_Spring_Security_JWT_Es.services.AuthService;
import davideabbadessa.U2_W3_D1_Spring_Security_JWT_Es.services.DipendenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {


    @Autowired
    private DipendenteService dipendenteService;

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public DipendenteLoginResponseDTO login(@RequestBody DipendenteLoginDTO payload) {
        return new DipendenteLoginResponseDTO(authService.authDipendenteAndGenerateToken(payload));
    }


}
