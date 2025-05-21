package com.devdouglas.dslist.services;

import com.devdouglas.dslist.dto.GameListDTO;
import com.devdouglas.dslist.entities.GameList;
import com.devdouglas.dslist.repository.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//primeiro Cria DTO, Repository, Service e Controller

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
      List<GameList> result = gameListRepository.findAll();
      List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
      return dto;

    }
}
