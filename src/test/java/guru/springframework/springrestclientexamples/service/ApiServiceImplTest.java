package guru.springframework.springrestclientexamples.service;

import static org.junit.Assert.*;

import guru.springframework.api.domain.User;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiServiceImplTest {

  @Autowired
  ApiService apiService;

  @Before
  public void setUp() throws Exception {
  }

  @Test
  public void testGetUsers() {

    List<User> users = apiService.getUsers(2);

    assertEquals(501, users.size());
  }
}