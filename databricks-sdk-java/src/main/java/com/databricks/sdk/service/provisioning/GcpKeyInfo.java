// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class GcpKeyInfo {
  /**
   * Globally unique service account email that has access to the KMS key. The service account
   * exists within the Databricks CP project.
   */
  @JsonProperty("gcp_service_account")
  private GcpServiceAccount gcpServiceAccount;

  /**
   * Globally unique kms key resource id of the form
   * projects/testProjectId/locations/us-east4/keyRings/gcpCmkKeyRing/cryptoKeys/cmk-eastus4
   */
  @JsonProperty("kms_key_id")
  private String kmsKeyId;

  public GcpKeyInfo setGcpServiceAccount(GcpServiceAccount gcpServiceAccount) {
    this.gcpServiceAccount = gcpServiceAccount;
    return this;
  }

  public GcpServiceAccount getGcpServiceAccount() {
    return gcpServiceAccount;
  }

  public GcpKeyInfo setKmsKeyId(String kmsKeyId) {
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
    GcpKeyInfo that = (GcpKeyInfo) o;
    return Objects.equals(gcpServiceAccount, that.gcpServiceAccount)
        && Objects.equals(kmsKeyId, that.kmsKeyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gcpServiceAccount, kmsKeyId);
  }

  @Override
  public String toString() {
    return new ToStringer(GcpKeyInfo.class)
        .add("gcpServiceAccount", gcpServiceAccount)
        .add("kmsKeyId", kmsKeyId)
        .toString();
  }
}
