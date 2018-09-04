package se.abalon.relevate.generic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GenericServiceTemplateApplication {


    public static void main(String[] args) {
        SpringApplication.run(GenericServiceTemplateApplication.class, args);
    }
/*
    @Bean
    @LoadBalanced
    public OAuth2RestTemplate restTemplate(OAuth2ProtectedResourceDetails details, OAuth2ClientContext clientContext) {
        return new OAuth2RestTemplate(details, clientContext);
    }

    @Autowired
    @SuppressWarnings("SpringJavaAutowiringInspection")
    public void setJwtAccessTokenConverter(JwtAccessTokenConverter jwtAccessTokenConverter) {
        jwtAccessTokenConverter.setAccessTokenConverter(new RelevateAccessTokenConverter());
    }
*/
}
