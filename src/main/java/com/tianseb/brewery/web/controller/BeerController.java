package com.tianseb.brewery.web.controller;

import com.tianseb.brewery.services.BeerServiceImpl;
import com.tianseb.brewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Slf4j
@RestController @RequestMapping("api/v1/beer")
public class BeerController {
    private final BeerServiceImpl beerServiceImpl;

    public BeerController(BeerServiceImpl beerServiceImpl) {
        this.beerServiceImpl = beerServiceImpl;
    }

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId")UUID beerId) {
        return new ResponseEntity<>(beerServiceImpl.getBeerById(beerId), HttpStatus.OK);
    }
}
