package davideabbadessa.U2_W3_D1_Spring_Security_JWT_Es.config;


import com.cloudinary.Cloudinary;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class CloudinaryConfig {

    @Bean
    public Cloudinary uploader
            (@Value("${CLOUDINARY_NAME}") String name,
             @Value("${CLOUDINARY_SECRET}") String secret,
             @Value("${CLOUDINARY_KEY}") String key) {
        Map<String, String> configuration = new HashMap<>();
        configuration.put("cloud_name", name);
        configuration.put("api_key", key);
        configuration.put("api_secret", secret);
        return new Cloudinary(configuration);
    }
}
