package vn.smarthomeapiadmin;

import com.cloudinary.Cloudinary;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class SmartHomeApiAdminApplication {



    @Value("${cloudinary.cloud_name}")
    private String cloudName;

    @Value("${cloudinary.api_key}")
    private String apiKey;

    @Value("${cloudinary.api_secret}")
    private String apiSecret;


    public static void main(String[] args) {

        SpringApplication.run(SmartHomeApiAdminApplication.class, args);
        System.out.println("-----------------------------------------------------------");
        System.out.println(" 🚀 Server ready at http://localhost:8084/");
        System.out.println("-----------------------------------------------------------");

        try {
            InetAddress ip = InetAddress.getLocalHost();
            System.out.println("IP Address: " + ip.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }


    @Bean
    public Cloudinary cloudinaryConfig() {
        Cloudinary cloudinary = null;
        Map<String, String> config = new HashMap<String, String>();
        config.put("cloud_name", cloudName);
        config.put("api_key", apiKey);
        config.put("api_secret", apiSecret);
        cloudinary = new Cloudinary(config);
        return cloudinary;
    }
}
