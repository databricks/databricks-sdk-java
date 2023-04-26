// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * List all tokens
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListTokenManagementRequest {
  /** User ID of the user that created the token. */
  @QueryParam("created_by_id")
  private String createdById;

  /** Username of the user that created the token. */
  @QueryParam("created_by_username")
  private String createdByUsername;

  /**
   * <p>Setter for the field <code>createdById</code>.</p>
   *
   * @param createdById a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.settings.ListTokenManagementRequest} object
   */
  public ListTokenManagementRequest setCreatedById(String createdById) {
    this.createdById = createdById;
    return this;
  }

  /**
   * <p>Getter for the field <code>createdById</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getCreatedById() {
    return createdById;
  }

  /**
   * <p>Setter for the field <code>createdByUsername</code>.</p>
   *
   * @param createdByUsername a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.settings.ListTokenManagementRequest} object
   */
  public ListTokenManagementRequest setCreatedByUsername(String createdByUsername) {
    this.createdByUsername = createdByUsername;
    return this;
  }

  /**
   * <p>Getter for the field <code>createdByUsername</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getCreatedByUsername() {
    return createdByUsername;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListTokenManagementRequest that = (ListTokenManagementRequest) o;
    return Objects.equals(createdById, that.createdById)
        && Objects.equals(createdByUsername, that.createdByUsername);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(createdById, createdByUsername);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListTokenManagementRequest.class)
        .add("createdById", createdById)
        .add("createdByUsername", createdByUsername)
        .toString();
  }
}
