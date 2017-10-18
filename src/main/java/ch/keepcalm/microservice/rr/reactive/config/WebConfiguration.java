package ch.keepcalm.microservice.rr.reactive.config;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Collections;


/**
 * Created by marcelwidmer on 21/03/16.
 */
@Configuration
public class WebConfiguration implements WebMvcConfigurer {

    /**
     * Global CORS configuration.
     * <p>
     * Cross-origin resource sharing (CORS) is a mechanism that allows restricted resource (e.g. fonts)
     * on a web page to be requested from another domain outside the domain from which the resource originated.
     *
     * @param registry
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**");
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public Mapper dozerBeanMapper() {
        DozerBeanMapper beanMapper = new DozerBeanMapper();
        beanMapper.setMappingFiles(Collections.singletonList("dozerJdk8Converters.xml"));
        return beanMapper;
    }

}