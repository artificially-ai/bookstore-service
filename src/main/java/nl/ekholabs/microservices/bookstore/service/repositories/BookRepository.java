package nl.ekholabs.microservices.bookstore.service.repositories;

import nl.ekholabs.microservices.bookstore.service.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "books", collectionResourceRel = "books")
public interface BookRepository extends JpaRepository<Book, String> {
}
