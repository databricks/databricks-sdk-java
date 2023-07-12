// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;



@Generated
public class User {
  /**
   
   */
  @JsonProperty("email")
  private String email;
  
  /**
   
   */
  @JsonProperty("id")
  private Long id;
  
  /**
   
   */
  @JsonProperty("name")
  private String name;
  
  public User setEmail(String email) {
    this.email = email;
    return this;
  }

  public String getEmail() {
    return email;
  }
  
  public User setId(Long id) {
    this.id = id;
    return this;
  }

  public Long getId() {
    return id;
  }
  
  public User setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }
  

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    User that = (User) o;
    return Objects.equals(email, that.email)
    && Objects.equals(id, that.id)
    && Objects.equals(name, that.name)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, id, name);
  }

  @Override
  public String toString() {
    return new ToStringer(User.class)
      .add("email", email)
      .add("id", id)
      .add("name", name).toString();
  }
}
