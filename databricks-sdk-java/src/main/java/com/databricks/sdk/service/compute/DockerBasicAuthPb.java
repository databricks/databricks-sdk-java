// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class DockerBasicAuthPb {
  @JsonProperty("password")
  private String password;

  @JsonProperty("username")
  private String username;

  public DockerBasicAuthPb setPassword(String password) {
    this.password = password;
    return this;
  }

  public String getPassword() {
    return password;
  }

  public DockerBasicAuthPb setUsername(String username) {
    this.username = username;
    return this;
  }

  public String getUsername() {
    return username;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DockerBasicAuthPb that = (DockerBasicAuthPb) o;
    return Objects.equals(password, that.password) && Objects.equals(username, that.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, username);
  }

  @Override
  public String toString() {
    return new ToStringer(DockerBasicAuthPb.class)
        .add("password", password)
        .add("username", username)
        .toString();
  }
}
