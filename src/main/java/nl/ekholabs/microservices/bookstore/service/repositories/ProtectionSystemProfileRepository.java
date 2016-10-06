package nl.ekholabs.microservices.bookstore.service.repositories;

import nl.ekholabs.microservices.bookstore.service.model.ProtectionSystemProfile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "protectionSystems", collectionResourceRel = "protectionSystems")
public interface ProtectionSystemProfileRepository extends JpaRepository<ProtectionSystemProfile,
    String> {
}
