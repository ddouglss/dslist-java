package com.devdouglas.dslist.services;

import com.devdouglas.dslist.dto.GameListDTO;
import com.devdouglas.dslist.entities.GameList;
import com.devdouglas.dslist.projections.GameMinProjection;
import com.devdouglas.dslist.repository.GameListRepository;
import com.devdouglas.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//primeiro Cria DTO, Repository, Service e Controller

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
      List<GameList> result = gameListRepository.findAll();
      List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
      return dto;
    }

    @Transactional
    public void move(Long listId, int sourceIndex, int destinationIndex){
        List<GameMinProjection> list = gameRepository.searchByList(listId);

        GameMinProjection obj = list.remove(sourceIndex);
        list.add(destinationIndex, obj);

        int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
        int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;

        for (int i = min; i <= max; i++){
            gameListRepository.updateBelongingPosition(listId, list.get(i).getId(),i);
        }
    }
}
