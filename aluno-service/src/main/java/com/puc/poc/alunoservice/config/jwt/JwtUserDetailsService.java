package com.puc.poc.alunoservice.config.jwt;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {

        if ("poc-puc".equals(username)) {
            return new User("poc-puc", "$2a$12$NYTOnoZaNZ9gmfU1UiDiDu2YvH0Yqkw9ck7cRs6B9yyk2bt3TNwXy",
                    new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
    }
}
