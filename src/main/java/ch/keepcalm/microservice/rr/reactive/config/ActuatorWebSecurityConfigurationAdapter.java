//package ch.keepcalm.microservice.rr.reactive.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.annotation.Order;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configuration
//@Order(1)
//public class ActuatorWebSecurityConfigurationAdapter extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
////                .requestMatchers(EndpointRequest.to("info")).permitAll()
////                .requestMatchers(EndpointRequest.toAnyEndpoint()).hasRole("ACTUATOR")
////                .antMatchers("/**").hasRole("USER")
//                .antMatchers("/**").permitAll()
//                .and()
//                .httpBasic();
//    }
//}