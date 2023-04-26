// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>ListMetastoresResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListMetastoresResponse {
  /** An array of metastore information objects. */
  @JsonProperty("metastores")
  private Collection<MetastoreInfo> metastores;

  /**
   * <p>Setter for the field <code>metastores</code>.</p>
   *
   * @param metastores a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.catalog.ListMetastoresResponse} object
   */
  public ListMetastoresResponse setMetastores(Collection<MetastoreInfo> metastores) {
    this.metastores = metastores;
    return this;
  }

  /**
   * <p>Getter for the field <code>metastores</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<MetastoreInfo> getMetastores() {
    return metastores;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListMetastoresResponse that = (ListMetastoresResponse) o;
    return Objects.equals(metastores, that.metastores);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(metastores);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListMetastoresResponse.class).add("metastores", metastores).toString();
  }
}
