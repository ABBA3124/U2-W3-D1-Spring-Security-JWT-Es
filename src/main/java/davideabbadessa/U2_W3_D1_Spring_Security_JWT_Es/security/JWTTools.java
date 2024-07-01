package davideabbadessa.U2_W3_D1_Spring_Security_JWT_Es.security;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JWTTools {

    @Value("${jwt.secret}")
    private String secret;


}
