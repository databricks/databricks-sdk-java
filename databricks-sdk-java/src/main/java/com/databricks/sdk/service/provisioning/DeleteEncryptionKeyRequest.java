// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Delete encryption key configuration
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class DeleteEncryptionKeyRequest {
  /** Databricks encryption key configuration ID. */
  private String customerManagedKeyId;

  /**
   * <p>Setter for the field <code>customerManagedKeyId</code>.</p>
   *
   * @param customerManagedKeyId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.DeleteEncryptionKeyRequest} object
   */
  public DeleteEncryptionKeyRequest setCustomerManagedKeyId(String customerManagedKeyId) {
    this.customerManagedKeyId = customerManagedKeyId;
    return this;
  }

  /**
   * <p>Getter for the field <code>customerManagedKeyId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getCustomerManagedKeyId() {
    return customerManagedKeyId;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteEncryptionKeyRequest that = (DeleteEncryptionKeyRequest) o;
    return Objects.equals(customerManagedKeyId, that.customerManagedKeyId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(customerManagedKeyId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(DeleteEncryptionKeyRequest.class)
        .add("customerManagedKeyId", customerManagedKeyId)
        .toString();
  }
}
