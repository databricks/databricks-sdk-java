// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settingsv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class AllowedAppsUserApiScopesMessage {
  /** */
  @JsonProperty("allowed_scopes")
  private Collection<String> allowedScopes;

  public AllowedAppsUserApiScopesMessage setAllowedScopes(Collection<String> allowedScopes) {
    this.allowedScopes = allowedScopes;
    return this;
  }

  public Collection<String> getAllowedScopes() {
    return allowedScopes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AllowedAppsUserApiScopesMessage that = (AllowedAppsUserApiScopesMessage) o;
    return Objects.equals(allowedScopes, that.allowedScopes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedScopes);
  }

  @Override
  public String toString() {
    return new ToStringer(AllowedAppsUserApiScopesMessage.class)
        .add("allowedScopes", allowedScopes)
        .toString();
  }
}
