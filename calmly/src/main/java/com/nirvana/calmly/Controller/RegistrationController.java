package com.nirvana.calmly.Controller;

import com.nirvana.calmly.Audio.Audios;
import com.nirvana.calmly.Data.AudiosRepository;
import com.nirvana.calmly.Data.UserRepository;
import com.nirvana.calmly.Users.MyUserDetails;
import com.nirvana.calmly.Users.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;

@Controller
public class RegistrationController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AudiosRepository audiosRepository;
    @GetMapping("/login")
    public String login(){
        return "test";
    }
    @GetMapping("/home")
    public String home(@AuthenticationPrincipal MyUserDetails userDetails){
        return "home";
    }
    @PostMapping("/signUp")
    public ResponseEntity<String>signUp(@RequestParam("username") String username, @RequestParam("date")Date date,@RequestParam("email") String email,@RequestParam("password") String password){
        if(userRepository.findByEmail(email)!=null){
            return new ResponseEntity<String>("EXISTS",HttpStatus.OK);
        }
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String pass=passwordEncoder.encode(password);
        User user = new User(username,email,pass,date,1);
        userRepository.save(user);
        return new ResponseEntity<String>("OK",HttpStatus.OK);
    }
}