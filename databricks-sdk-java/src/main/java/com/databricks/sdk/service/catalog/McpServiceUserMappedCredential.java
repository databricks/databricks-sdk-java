// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

/** A caller's per-user OAuth credential for an MCP service. */
@Generated
public class McpServiceUserMappedCredential {
  /**
   * Token-expiry info for the credential, returned as a flat map: `access_token_expiration` (always
   * set) and `refresh_token_expiration` (set when the credential has a refresh token). Both values
   * are timestamps.
   */
  @JsonProperty("options")
  private Map<String, String> options;

  /**
   * Provisioning state of the credential. `ACTIVE` means the caller is logged in and the credential
   * is usable; any other state means the login has not completed.
   */
  @JsonProperty("provisioning_info")
  private ProvisioningInfo provisioningInfo;

  public McpServiceUserMappedCredential setOptions(Map<String, String> options) {
    this.options = options;
    return this;
  }

  public Map<String, String> getOptions() {
    return options;
  }

  public McpServiceUserMappedCredential setProvisioningInfo(ProvisioningInfo provisioningInfo) {
    this.provisioningInfo = provisioningInfo;
    return this;
  }

  public ProvisioningInfo getProvisioningInfo() {
    return provisioningInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    McpServiceUserMappedCredential that = (McpServiceUserMappedCredential) o;
    return Objects.equals(options, that.options)
        && Objects.equals(provisioningInfo, that.provisioningInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(options, provisioningInfo);
  }

  @Override
  public String toString() {
    return new ToStringer(McpServiceUserMappedCredential.class)
        .add("options", options)
        .add("provisioningInfo", provisioningInfo)
        .toString();
  }
}
