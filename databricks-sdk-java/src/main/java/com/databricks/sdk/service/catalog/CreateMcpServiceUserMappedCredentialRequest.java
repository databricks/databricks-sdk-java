// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateMcpServiceUserMappedCredentialRequest {
  /** */
  @JsonProperty("login")
  private McpServiceUserMappedCredentialLogin login;

  /** Resource name of the MCP service. Format: `mcp-services/{catalog}.{schema}.{mcp_service}`. */
  @JsonIgnore private String name;

  public CreateMcpServiceUserMappedCredentialRequest setLogin(
      McpServiceUserMappedCredentialLogin login) {
    this.login = login;
    return this;
  }

  public McpServiceUserMappedCredentialLogin getLogin() {
    return login;
  }

  public CreateMcpServiceUserMappedCredentialRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateMcpServiceUserMappedCredentialRequest that =
        (CreateMcpServiceUserMappedCredentialRequest) o;
    return Objects.equals(login, that.login) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(login, name);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateMcpServiceUserMappedCredentialRequest.class)
        .add("login", login)
        .add("name", name)
        .toString();
  }
}
