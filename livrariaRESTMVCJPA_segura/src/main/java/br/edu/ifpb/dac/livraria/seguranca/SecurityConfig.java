package br.edu.ifpb.dac.livraria.seguranca;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationConverter;
import org.springframework.security.oauth2.server.resource.authentication.JwtGrantedAuthoritiesConverter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
    protected void configure(HttpSecurity http) throws Exception {
        http.cors()
        .and()
        	.authorizeRequests()
        	.antMatchers(HttpMethod.GET,"/livros").hasAuthority("USUARIO")
        	.antMatchers(HttpMethod.POST,"/livros").hasAuthority("ADMIN")
        	.anyRequest().authenticated()
            .and()
            .oauth2ResourceServer()
            .jwt()
            .jwtAuthenticationConverter(getJwtAuthoritiesConverter());
    }

	private JwtAuthenticationConverter getJwtAuthoritiesConverter() {
		JwtGrantedAuthoritiesConverter jwac = new JwtGrantedAuthoritiesConverter();
		jwac.setAuthoritiesClaimName("authorities");
		jwac.setAuthorityPrefix("");
		JwtAuthenticationConverter converter = new JwtAuthenticationConverter();
		converter.setJwtGrantedAuthoritiesConverter(jwac);
		return converter;
	}

}
