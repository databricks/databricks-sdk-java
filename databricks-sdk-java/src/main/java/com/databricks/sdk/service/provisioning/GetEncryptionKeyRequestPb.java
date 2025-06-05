// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get encryption key configuration */
@Generated
class GetEncryptionKeyRequestPb {
  @JsonIgnore private String customerManagedKeyId;

  public GetEncryptionKeyRequestPb setCustomerManagedKeyId(String customerManagedKeyId) {
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
    GetEncryptionKeyRequestPb that = (GetEncryptionKeyRequestPb) o;
    return Objects.equals(customerManagedKeyId, that.customerManagedKeyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerManagedKeyId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetEncryptionKeyRequestPb.class)
        .add("customerManagedKeyId", customerManagedKeyId)
        .toString();
  }
}
