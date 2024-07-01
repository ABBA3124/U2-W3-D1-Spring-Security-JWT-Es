package davideabbadessa.U2_W3_D1_Spring_Security_JWT_Es.controllers;

import davideabbadessa.U2_W3_D1_Spring_Security_JWT_Es.services.DipendenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {


    @Autowired
    private DipendenteService dipendenteService;

//    @PostMapping("/login")
//    public DipendenteLoginResponseDTO login(@RequestBody DipendenteLoginDTO payload){
//        return new DipendenteLoginResponseDTO()
//    }


}
