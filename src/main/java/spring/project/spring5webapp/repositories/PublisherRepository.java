package spring.project.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import spring.project.spring5webapp.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
