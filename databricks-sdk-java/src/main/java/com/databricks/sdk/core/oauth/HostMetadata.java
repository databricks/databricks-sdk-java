package com.databricks.sdk.core.oauth;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * [Experimental] Parsed response from the /.well-known/databricks-config discovery endpoint.
 *
 * <p><b>Note:</b> This API is experimental and may change or be removed in future releases without
 * notice.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class HostMetadata {
  @JsonProperty("oidc_endpoint")
  private String oidcEndpoint;

  @JsonProperty("account_id")
  private String accountId;

  @JsonProperty("workspace_id")
  private String workspaceId;

  public HostMetadata() {}

  public HostMetadata(String oidcEndpoint, String accountId, String workspaceId) {
    this.oidcEndpoint = oidcEndpoint;
    this.accountId = accountId;
    this.workspaceId = workspaceId;
  }

  public String getOidcEndpoint() {
    return oidcEndpoint;
  }

  public String getAccountId() {
    return accountId;
  }

  public String getWorkspaceId() {
    return workspaceId;
  }
}
