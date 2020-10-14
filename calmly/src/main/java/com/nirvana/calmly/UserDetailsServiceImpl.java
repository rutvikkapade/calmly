package com.nirvana.calmly;

import com.nirvana.calmly.Data.UserRepository;
import com.nirvana.calmly.Users.MyUserDetails;
import com.nirvana.calmly.Users.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {
        User user = userRepository.findByUserName(username);
System.out.println(username);
        if (user == null) {
            throw new UsernameNotFoundException("Could not find user");

        }

        return new MyUserDetails(user);
    }
}
