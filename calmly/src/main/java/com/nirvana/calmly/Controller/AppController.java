package com.nirvana.calmly.Controller;

import com.nirvana.calmly.Data.UserRepository;
import com.nirvana.calmly.Users.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AppController {
    @Autowired
    private UserRepository userRepository;
    @PostMapping("/questions")
    public ResponseEntity<Integer>question(@AuthenticationPrincipal UserDetails userDetails){
        String username=userDetails.getUsername();
        User user = userRepository.findByUserName(username);
        return new ResponseEntity<Integer>(user.getFirst(), HttpStatus.OK);
    }
}
