package guru.springframework.springrestclientexamples.service;

import guru.springframework.api.domain.User;
import guru.springframework.api.domain.UserData;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiServiceImpl implements ApiService {

  private final RestTemplate restTemplate;

  public ApiServiceImpl(RestTemplate restTemplate) {
    this.restTemplate = restTemplate;
  }

  @Override
  public List<User> getUsers(Integer limit) {
    UserData userData = restTemplate.getForObject("http://apifaketory.com/api/user?limit" + limit, UserData.class);
    return userData.getData();
  }
}
