package com.nirvana.calmly;

import com.nirvana.calmly.Audio.Audios;
import com.nirvana.calmly.Data.AudiosRepository;
import com.nirvana.calmly.Data.UserRepository;
import com.nirvana.calmly.Users.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.Date;
import java.util.Calendar;

@SpringBootApplication
public class CalmlyApplication {

	public static void main(String[] args) { SpringApplication.run(CalmlyApplication.class, args); }


}
