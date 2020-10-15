package com.nirvana.calmly.Controller;

import com.nirvana.calmly.Audio.Audios;
import com.nirvana.calmly.Data.AudiosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AudiosController {
    @Autowired
    private AudiosRepository audiosRepository;
    @GetMapping("/music")
    public ResponseEntity<List<Audios>>transmit(){
    List<Audios> audios=audiosRepository.findAll();
    return new ResponseEntity<List<Audios>>(audios, HttpStatus.OK);
}

}
