package spring.project.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import spring.project.spring5webapp.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
