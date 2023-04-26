// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>DeleteScope class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class DeleteScope {
  /** Name of the scope to delete. */
  @JsonProperty("scope")
  private String scope;

  /**
   * <p>Setter for the field <code>scope</code>.</p>
   *
   * @param scope a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.workspace.DeleteScope} object
   */
  public DeleteScope setScope(String scope) {
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
    DeleteScope that = (DeleteScope) o;
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
    return new ToStringer(DeleteScope.class).add("scope", scope).toString();
  }
}
