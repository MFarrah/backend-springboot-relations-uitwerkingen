package mfarr.backendspringbootrelationsuitwerkingen.controllers;

import mfarr.backendspringbootrelationsuitwerkingen.models.TelevisionWallBracketKey;
import mfarr.backendspringbootrelationsuitwerkingen.services.TelevisionWallBracketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class TelevisionWallBracketController {
    private TelevisionWallBracketService televisionWallBracketService;

    public TelevisionWallBracketController(TelevisionWallBracketService televisionWallBracketService) {
        this.televisionWallBracketService = televisionWallBracketService;
    }

    @PostMapping("/{televisionId}/{wallBracketId}")
    public ResponseEntity<TelevisionWallBracketKey> addTelevisionWallBracket(@PathVariable("televisionId") Long televisionId, @PathVariable("wallBracketId") Long wallbracketId) {
        TelevisionWallBracketKey key = televisionWallBracketService.addTelevisionWallBracket(televisionId, wallbracketId);
        return ResponseEntity.created(null).body(key);
    }
}