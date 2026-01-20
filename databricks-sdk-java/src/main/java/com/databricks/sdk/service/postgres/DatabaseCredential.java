// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Objects;

@Generated
public class DatabaseCredential {
  /** Timestamp in UTC of when this credential expires. */
  @JsonProperty("expire_time")
  private Timestamp expireTime;

  /** The OAuth token that can be used as a password when connecting to a database. */
  @JsonProperty("token")
  private String token;

  public DatabaseCredential setExpireTime(Timestamp expireTime) {
    this.expireTime = expireTime;
    return this;
  }

  public Timestamp getExpireTime() {
    return expireTime;
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
    return Objects.equals(expireTime, that.expireTime) && Objects.equals(token, that.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expireTime, token);
  }

  @Override
  public String toString() {
    return new ToStringer(DatabaseCredential.class)
        .add("expireTime", expireTime)
        .add("token", token)
        .toString();
  }
}
