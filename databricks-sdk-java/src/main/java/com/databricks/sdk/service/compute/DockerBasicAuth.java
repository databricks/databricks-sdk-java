// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>DockerBasicAuth class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class DockerBasicAuth {
  /** */
  @JsonProperty("password")
  private String password;

  /** */
  @JsonProperty("username")
  private String username;

  /**
   * <p>Setter for the field <code>password</code>.</p>
   *
   * @param password a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.DockerBasicAuth} object
   */
  public DockerBasicAuth setPassword(String password) {
    this.password = password;
    return this;
  }

  /**
   * <p>Getter for the field <code>password</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getPassword() {
    return password;
  }

  /**
   * <p>Setter for the field <code>username</code>.</p>
   *
   * @param username a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.DockerBasicAuth} object
   */
  public DockerBasicAuth setUsername(String username) {
    this.username = username;
    return this;
  }

  /**
   * <p>Getter for the field <code>username</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getUsername() {
    return username;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DockerBasicAuth that = (DockerBasicAuth) o;
    return Objects.equals(password, that.password) && Objects.equals(username, that.username);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(password, username);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(DockerBasicAuth.class)
        .add("password", password)
        .add("username", username)
        .toString();
  }
}
