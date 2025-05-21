package com.devdouglas.dslist.services;

import com.devdouglas.dslist.dto.GameDTO;
import com.devdouglas.dslist.dto.GameMinDTO;
import com.devdouglas.dslist.entities.Game;
import com.devdouglas.dslist.exceptions.ResourceNotFoundException;
import com.devdouglas.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//primeiro Cria DTO, Repository, Service e Controller

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Game game = gameRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Game with ID " + id + " not found"));
        return new GameDTO(game);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
      List<Game> result = gameRepository.findAll();
      List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
      return dto;

    }
}
