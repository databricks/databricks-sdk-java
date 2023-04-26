// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * List secret keys
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListSecretsRequest {
  /** The name of the scope to list secrets within. */
  @QueryParam("scope")
  private String scope;

  /**
   * <p>Setter for the field <code>scope</code>.</p>
   *
   * @param scope a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.workspace.ListSecretsRequest} object
   */
  public ListSecretsRequest setScope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * <p>Getter for the field <code>scope</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getScope() {
    return scope;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListSecretsRequest that = (ListSecretsRequest) o;
    return Objects.equals(scope, that.scope);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(scope);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListSecretsRequest.class).add("scope", scope).toString();
  }
}
