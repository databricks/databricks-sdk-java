// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>ListScopesResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListScopesResponse {
  /** The available secret scopes. */
  @JsonProperty("scopes")
  private Collection<SecretScope> scopes;

  /**
   * <p>Setter for the field <code>scopes</code>.</p>
   *
   * @param scopes a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.workspace.ListScopesResponse} object
   */
  public ListScopesResponse setScopes(Collection<SecretScope> scopes) {
    this.scopes = scopes;
    return this;
  }

  /**
   * <p>Getter for the field <code>scopes</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<SecretScope> getScopes() {
    return scopes;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListScopesResponse that = (ListScopesResponse) o;
    return Objects.equals(scopes, that.scopes);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(scopes);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListScopesResponse.class).add("scopes", scopes).toString();
  }
}
