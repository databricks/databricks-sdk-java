// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Reference to an entry in a Databricks secret scope. The referenced value is fetched on the Spark
 * cluster at materialization time via dbutils.secrets.get(scope, key).
 */
@Generated
public class SecretScopeReference {
  /** The key within the scope. */
  @JsonProperty("key")
  private String key;

  /** The Databricks secret scope name. */
  @JsonProperty("scope")
  private String scope;

  public SecretScopeReference setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public SecretScopeReference setScope(String scope) {
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
    SecretScopeReference that = (SecretScopeReference) o;
    return Objects.equals(key, that.key) && Objects.equals(scope, that.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, scope);
  }

  @Override
  public String toString() {
    return new ToStringer(SecretScopeReference.class)
        .add("key", key)
        .add("scope", scope)
        .toString();
  }
}
