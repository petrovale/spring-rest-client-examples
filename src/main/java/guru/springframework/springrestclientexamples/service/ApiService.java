package guru.springframework.springrestclientexamples.service;

import guru.springframework.api.domain.User;
import java.util.List;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ApiService {

  List<User> getUsers(Integer limit);

  Flux<User> getUsers(Mono<Integer> limit);
}
