// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Get encryption key configuration */
public class GetEncryptionKeyRequest {
  /** Databricks encryption key configuration ID. */
  private String customerManagedKeyId;

  public GetEncryptionKeyRequest setCustomerManagedKeyId(String customerManagedKeyId) {
    this.customerManagedKeyId = customerManagedKeyId;
    return this;
  }

  public String getCustomerManagedKeyId() {
    return customerManagedKeyId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetEncryptionKeyRequest that = (GetEncryptionKeyRequest) o;
    return Objects.equals(customerManagedKeyId, that.customerManagedKeyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerManagedKeyId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetEncryptionKeyRequest.class)
        .add("customerManagedKeyId", customerManagedKeyId)
        .toString();
  }
}
