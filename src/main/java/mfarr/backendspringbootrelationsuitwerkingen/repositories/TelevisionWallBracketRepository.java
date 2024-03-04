package mfarr.backendspringbootrelationsuitwerkingen.repositories;

import mfarr.backendspringbootrelationsuitwerkingen.models.TelevisionWallBracket;
import mfarr.backendspringbootrelationsuitwerkingen.models.TelevisionWallBracketKey;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;

public interface TelevisionWallBracketRepository extends JpaRepository<TelevisionWallBracket, TelevisionWallBracketKey> {

    List<TelevisionWallBracket> findAllByTelevisionId(Long televisionId);

    List<TelevisionWallBracket> findAllByWallBracketId(Long wallBracketId);
}
