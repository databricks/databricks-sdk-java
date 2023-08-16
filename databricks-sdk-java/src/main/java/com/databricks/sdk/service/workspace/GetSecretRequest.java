// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Get a secret */
@Generated
public class GetSecretRequest {
  /** The key to fetch secret for. */
  @QueryParam("key")
  private String key;

  /** The name of the scope to fetch secret information from. */
  @QueryParam("scope")
  private String scope;

  public GetSecretRequest setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public GetSecretRequest setScope(String scope) {
    this.scope = scope;
    return this;
  }

  public String getScope() {
    return scope;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetSecretRequest that = (GetSecretRequest) o;
    return Objects.equals(key, that.key) && Objects.equals(scope, that.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, scope);
  }

  @Override
  public String toString() {
    return new ToStringer(GetSecretRequest.class).add("key", key).add("scope", scope).toString();
  }
}
