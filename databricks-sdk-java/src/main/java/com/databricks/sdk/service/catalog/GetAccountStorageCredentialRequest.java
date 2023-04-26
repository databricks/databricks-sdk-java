// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Gets the named storage credential
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class GetAccountStorageCredentialRequest {
  /** Databricks Unity Catalog metastore ID */
  private String metastoreId;

  /** Name of the storage credential. */
  private String name;

  /**
   * <p>Setter for the field <code>metastoreId</code>.</p>
   *
   * @param metastoreId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.GetAccountStorageCredentialRequest} object
   */
  public GetAccountStorageCredentialRequest setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  /**
   * <p>Getter for the field <code>metastoreId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getMetastoreId() {
    return metastoreId;
  }

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.GetAccountStorageCredentialRequest} object
   */
  public GetAccountStorageCredentialRequest setName(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Getter for the field <code>name</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetAccountStorageCredentialRequest that = (GetAccountStorageCredentialRequest) o;
    return Objects.equals(metastoreId, that.metastoreId) && Objects.equals(name, that.name);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(metastoreId, name);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(GetAccountStorageCredentialRequest.class)
        .add("metastoreId", metastoreId)
        .add("name", name)
        .toString();
  }
}
