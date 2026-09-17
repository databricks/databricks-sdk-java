// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

/**
 * Login input for an MCP service user credential. Carries the OAuth exchange fields as a flat map.
 */
@Generated
public class McpServiceUserMappedCredentialLogin {
  /** OAuth exchange fields: `pkce_verifier`, `authorization_code`, and `oauth_redirect_uri`. */
  @JsonProperty("options")
  private Map<String, String> options;

  public McpServiceUserMappedCredentialLogin setOptions(Map<String, String> options) {
    this.options = options;
    return this;
  }

  public Map<String, String> getOptions() {
    return options;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    McpServiceUserMappedCredentialLogin that = (McpServiceUserMappedCredentialLogin) o;
    return Objects.equals(options, that.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(options);
  }

  @Override
  public String toString() {
    return new ToStringer(McpServiceUserMappedCredentialLogin.class)
        .add("options", options)
        .toString();
  }
}
