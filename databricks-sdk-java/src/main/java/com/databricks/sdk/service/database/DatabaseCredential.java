// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class DatabaseCredential {
  /** */
  @JsonProperty("expiration_time")
  private String expirationTime;

  /** */
  @JsonProperty("token")
  private String token;

  public DatabaseCredential setExpirationTime(String expirationTime) {
    this.expirationTime = expirationTime;
    return this;
  }

  public String getExpirationTime() {
    return expirationTime;
  }

  public DatabaseCredential setToken(String token) {
    this.token = token;
    return this;
  }

  public String getToken() {
    return token;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DatabaseCredential that = (DatabaseCredential) o;
    return Objects.equals(expirationTime, that.expirationTime) && Objects.equals(token, that.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expirationTime, token);
  }

  @Override
  public String toString() {
    return new ToStringer(DatabaseCredential.class)
        .add("expirationTime", expirationTime)
        .add("token", token)
        .toString();
  }
}
