package ch.traal.demo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
  
  
  /* methods */
  public String getUser() {
    return "Tom";
  }
}