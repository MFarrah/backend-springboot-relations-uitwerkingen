package mfarr.backendspringbootrelationsuitwerkingen.repositories;

import mfarr.backendspringbootrelationsuitwerkingen.models.CIModule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CIModuleRepository extends JpaRepository<CIModule, Long> {
}