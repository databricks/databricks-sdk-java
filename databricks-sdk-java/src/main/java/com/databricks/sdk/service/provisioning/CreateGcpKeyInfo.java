// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateGcpKeyInfo {
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

  /**
   * When true, Databricks will not use OAuth to grant the service account access to the KMS key.
   * The customer is responsible for granting access manually.
   */
  @JsonProperty("manual")
  private Boolean manual;

  public CreateGcpKeyInfo setGcpServiceAccount(GcpServiceAccount gcpServiceAccount) {
    this.gcpServiceAccount = gcpServiceAccount;
    return this;
  }

  public GcpServiceAccount getGcpServiceAccount() {
    return gcpServiceAccount;
  }

  public CreateGcpKeyInfo setKmsKeyId(String kmsKeyId) {
    this.kmsKeyId = kmsKeyId;
    return this;
  }

  public String getKmsKeyId() {
    return kmsKeyId;
  }

  public CreateGcpKeyInfo setManual(Boolean manual) {
    this.manual = manual;
    return this;
  }

  public Boolean getManual() {
    return manual;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateGcpKeyInfo that = (CreateGcpKeyInfo) o;
    return Objects.equals(gcpServiceAccount, that.gcpServiceAccount)
        && Objects.equals(kmsKeyId, that.kmsKeyId)
        && Objects.equals(manual, that.manual);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gcpServiceAccount, kmsKeyId, manual);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateGcpKeyInfo.class)
        .add("gcpServiceAccount", gcpServiceAccount)
        .add("kmsKeyId", kmsKeyId)
        .add("manual", manual)
        .toString();
  }
}
