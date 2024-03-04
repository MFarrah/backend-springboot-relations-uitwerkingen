package mfarr.backendspringbootrelationsuitwerkingen.repositories;

import mfarr.backendspringbootrelationsuitwerkingen.models.TelevisionWallBracket;
import mfarr.backendspringbootrelationsuitwerkingen.models.TelevisionWallBracketKey;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;

public interface TelevisionWallBracketRepository extends JpaRepository<TelevisionWallBracket, TelevisionWallBracketKey> {
    // custom query om alle TelevisionWallBrackets te vinden die bij een bepaalde tv horen
    List<TelevisionWallBracket> findAllByTelevisionId(Long televisionId);
    // custom query om alle TelevisionWallBrackets te vinden die bij een bepaalde wallbracket horen
    List<TelevisionWallBracket> findAllByWallBracketId(Long wallBracketId);
}
