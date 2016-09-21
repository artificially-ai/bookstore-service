package com.irdeto.rrm.ls.repositories;

import com.irdeto.rrm.ls.model.ProtectionSystemProfile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "protectionSystems", collectionResourceRel = "protectionSystems")
public interface ProtectionSystemProfileRepository extends JpaRepository<ProtectionSystemProfile,
    String> {
}
