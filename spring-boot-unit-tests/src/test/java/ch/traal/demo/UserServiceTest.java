package ch.traal.demo;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ch.traal.demo.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class) // @RunWith: integrate spring with junit
@SpringBootTest(classes = {SpringBootUnitTestsApplication.class}) // @SpringBootTest: this class is spring boot test.
public class UserServiceTest {
  
  
  /* member variables */
  @Resource
  private UserService userService;

  
  /* constructors */
  
  
  /* methods */
  @Test
  public void testGetUser() {
    Assert.assertEquals(userService.getUser(), "Tom");
  }
}
