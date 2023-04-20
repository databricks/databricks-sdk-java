// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class ListScopesResponse {
  /** The available secret scopes. */
  @JsonProperty("scopes")
  private Collection<SecretScope> scopes;

  public ListScopesResponse setScopes(Collection<SecretScope> scopes) {
    this.scopes = scopes;
    return this;
  }

  public Collection<SecretScope> getScopes() {
    return scopes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListScopesResponse that = (ListScopesResponse) o;
    return Objects.equals(scopes, that.scopes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scopes);
  }

  @Override
  public String toString() {
    return new ToStringer(ListScopesResponse.class).add("scopes", scopes).toString();
  }
}
