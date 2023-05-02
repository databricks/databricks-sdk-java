// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class DockerBasicAuth {
  /** */
  @JsonProperty("password")
  private String password;

  /** */
  @JsonProperty("username")
  private String username;

  public DockerBasicAuth setPassword(String password) {
    this.password = password;
    return this;
  }

  public String getPassword() {
    return password;
  }

  public DockerBasicAuth setUsername(String username) {
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
    DockerBasicAuth that = (DockerBasicAuth) o;
    return Objects.equals(password, that.password) && Objects.equals(username, that.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, username);
  }

  @Override
  public String toString() {
    return new ToStringer(DockerBasicAuth.class)
        .add("password", password)
        .add("username", username)
        .toString();
  }
}
