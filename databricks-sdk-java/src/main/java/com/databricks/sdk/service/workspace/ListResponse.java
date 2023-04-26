// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>ListResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListResponse {
  /** List of objects. */
  @JsonProperty("objects")
  private Collection<ObjectInfo> objects;

  /**
   * <p>Setter for the field <code>objects</code>.</p>
   *
   * @param objects a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.workspace.ListResponse} object
   */
  public ListResponse setObjects(Collection<ObjectInfo> objects) {
    this.objects = objects;
    return this;
  }

  /**
   * <p>Getter for the field <code>objects</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<ObjectInfo> getObjects() {
    return objects;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListResponse that = (ListResponse) o;
    return Objects.equals(objects, that.objects);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(objects);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListResponse.class).add("objects", objects).toString();
  }
}
