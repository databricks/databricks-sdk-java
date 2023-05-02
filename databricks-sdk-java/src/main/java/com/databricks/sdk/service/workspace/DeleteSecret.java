// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class DeleteSecret {
  /** Name of the secret to delete. */
  @JsonProperty("key")
  private String key;

  /** The name of the scope that contains the secret to delete. */
  @JsonProperty("scope")
  private String scope;

  public DeleteSecret setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public DeleteSecret setScope(String scope) {
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
    DeleteSecret that = (DeleteSecret) o;
    return Objects.equals(key, that.key) && Objects.equals(scope, that.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, scope);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteSecret.class).add("key", key).add("scope", scope).toString();
  }
}
