// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ReplacePrivateAccessSettingsRequest {
  /** Properties of the new private access settings object. */
  @JsonProperty("customer_facing_private_access_settings")
  private PrivateAccessSettings customerFacingPrivateAccessSettings;

  /** Databricks private access settings ID. */
  @JsonIgnore private String privateAccessSettingsId;

  public ReplacePrivateAccessSettingsRequest setCustomerFacingPrivateAccessSettings(
      PrivateAccessSettings customerFacingPrivateAccessSettings) {
    this.customerFacingPrivateAccessSettings = customerFacingPrivateAccessSettings;
    return this;
  }

  public PrivateAccessSettings getCustomerFacingPrivateAccessSettings() {
    return customerFacingPrivateAccessSettings;
  }

  public ReplacePrivateAccessSettingsRequest setPrivateAccessSettingsId(
      String privateAccessSettingsId) {
    this.privateAccessSettingsId = privateAccessSettingsId;
    return this;
  }

  public String getPrivateAccessSettingsId() {
    return privateAccessSettingsId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReplacePrivateAccessSettingsRequest that = (ReplacePrivateAccessSettingsRequest) o;
    return Objects.equals(
            customerFacingPrivateAccessSettings, that.customerFacingPrivateAccessSettings)
        && Objects.equals(privateAccessSettingsId, that.privateAccessSettingsId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerFacingPrivateAccessSettings, privateAccessSettingsId);
  }

  @Override
  public String toString() {
    return new ToStringer(ReplacePrivateAccessSettingsRequest.class)
        .add("customerFacingPrivateAccessSettings", customerFacingPrivateAccessSettings)
        .add("privateAccessSettingsId", privateAccessSettingsId)
        .toString();
  }
}
