// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class TokenPermissionsDescriptionPb {
  @JsonProperty("description")
  private String description;

  @JsonProperty("permission_level")
  private TokenPermissionLevel permissionLevel;

  public TokenPermissionsDescriptionPb setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public TokenPermissionsDescriptionPb setPermissionLevel(TokenPermissionLevel permissionLevel) {
    this.permissionLevel = permissionLevel;
    return this;
  }

  public TokenPermissionLevel getPermissionLevel() {
    return permissionLevel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TokenPermissionsDescriptionPb that = (TokenPermissionsDescriptionPb) o;
    return Objects.equals(description, that.description)
        && Objects.equals(permissionLevel, that.permissionLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, permissionLevel);
  }

  @Override
  public String toString() {
    return new ToStringer(TokenPermissionsDescriptionPb.class)
        .add("description", description)
        .add("permissionLevel", permissionLevel)
        .toString();
  }
}
