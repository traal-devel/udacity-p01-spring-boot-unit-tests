package ch.traal.demo.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ch.traal.demo.dao.UserDao;

@Service
public class UserService {
  
  
  /* member variables */
  @Resource
  private UserDao userDao;

  
  /* constructors */
  
  
  /* methods */
  public String getUser() {
    return userDao.getUser();
  }
  
}