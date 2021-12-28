package co.com.sofka.TallerReactiveTest.repository;

import co.com.sofka.TallerReactiveTest.entity.Person;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface PersonRepository extends ReactiveMongoRepository<Person, String> {

    Mono<Person> findByName(String name);
}
