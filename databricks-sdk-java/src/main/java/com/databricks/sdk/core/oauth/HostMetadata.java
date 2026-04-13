package com.databricks.sdk.core.oauth;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

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

  @JsonProperty("cloud")
  private String cloud;

  @JsonProperty("host_type")
  private String hostType;

  @JsonProperty("token_federation_default_oidc_audiences")
  private List<String> tokenFederationDefaultOidcAudiences;

  public HostMetadata() {}

  public HostMetadata(String oidcEndpoint, String accountId, String workspaceId) {
    this.oidcEndpoint = oidcEndpoint;
    this.accountId = accountId;
    this.workspaceId = workspaceId;
  }

  public HostMetadata(String oidcEndpoint, String accountId, String workspaceId, String cloud) {
    this.oidcEndpoint = oidcEndpoint;
    this.accountId = accountId;
    this.workspaceId = workspaceId;
    this.cloud = cloud;
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

  public String getCloud() {
    return cloud;
  }

  public String getHostType() {
    return hostType;
  }

  public List<String> getTokenFederationDefaultOidcAudiences() {
    return tokenFederationDefaultOidcAudiences;
  }
}
