package mfarr.backendspringbootrelationsuitwerkingen.repositories;

import mfarr.backendspringbootrelationsuitwerkingen.models.RemoteControl;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RemoteControlRepository extends JpaRepository<RemoteControl, Long> {
}