package com.nirvana.calmly.Data;

import com.nirvana.calmly.Audio.Audios;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AudiosRepository extends CrudRepository<Audios,Long> {
    List<Audios>findAll();
}
