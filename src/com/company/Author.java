package com.company;

public class Author {
 String name = null;
 String email = null;
 char gender ;

 public Author(String name, String email, char gender) {
  this.name = name;
  this.email = email;
  this.gender = gender;
 }

 @Override
 public String toString() {
  return "Author[" +
          "name=" + name +
          ", email=" + email +
          ", gender=" + gender +
          ']';
 }
}

