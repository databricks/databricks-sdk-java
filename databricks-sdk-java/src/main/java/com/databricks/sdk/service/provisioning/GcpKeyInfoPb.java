// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class GcpKeyInfoPb {
  @JsonProperty("kms_key_id")
  private String kmsKeyId;

  public GcpKeyInfoPb setKmsKeyId(String kmsKeyId) {
    this.kmsKeyId = kmsKeyId;
    return this;
  }

  public String getKmsKeyId() {
    return kmsKeyId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GcpKeyInfoPb that = (GcpKeyInfoPb) o;
    return Objects.equals(kmsKeyId, that.kmsKeyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kmsKeyId);
  }

  @Override
  public String toString() {
    return new ToStringer(GcpKeyInfoPb.class).add("kmsKeyId", kmsKeyId).toString();
  }
}
