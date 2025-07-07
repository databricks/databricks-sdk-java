// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Manifest of a specific securable kind. */
@Generated
public class SecurableKindManifest {
  /** Privileges that can be assigned to the securable. */
  @JsonProperty("assignable_privileges")
  private Collection<String> assignablePrivileges;

  /** A list of capabilities in the securable kind. */
  @JsonProperty("capabilities")
  private Collection<String> capabilities;

  /** Detailed specs of allowed options. */
  @JsonProperty("options")
  private Collection<OptionSpec> options;

  /** Securable kind to get manifest of. */
  @JsonProperty("securable_kind")
  private SecurableKind securableKind;

  /** Securable Type of the kind. */
  @JsonProperty("securable_type")
  private SecurableType securableType;

  public SecurableKindManifest setAssignablePrivileges(Collection<String> assignablePrivileges) {
    this.assignablePrivileges = assignablePrivileges;
    return this;
  }

  public Collection<String> getAssignablePrivileges() {
    return assignablePrivileges;
  }

  public SecurableKindManifest setCapabilities(Collection<String> capabilities) {
    this.capabilities = capabilities;
    return this;
  }

  public Collection<String> getCapabilities() {
    return capabilities;
  }

  public SecurableKindManifest setOptions(Collection<OptionSpec> options) {
    this.options = options;
    return this;
  }

  public Collection<OptionSpec> getOptions() {
    return options;
  }

  public SecurableKindManifest setSecurableKind(SecurableKind securableKind) {
    this.securableKind = securableKind;
    return this;
  }

  public SecurableKind getSecurableKind() {
    return securableKind;
  }

  public SecurableKindManifest setSecurableType(SecurableType securableType) {
    this.securableType = securableType;
    return this;
  }

  public SecurableType getSecurableType() {
    return securableType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SecurableKindManifest that = (SecurableKindManifest) o;
    return Objects.equals(assignablePrivileges, that.assignablePrivileges)
        && Objects.equals(capabilities, that.capabilities)
        && Objects.equals(options, that.options)
        && Objects.equals(securableKind, that.securableKind)
        && Objects.equals(securableType, that.securableType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignablePrivileges, capabilities, options, securableKind, securableType);
  }

  @Override
  public String toString() {
    return new ToStringer(SecurableKindManifest.class)
        .add("assignablePrivileges", assignablePrivileges)
        .add("capabilities", capabilities)
        .add("options", options)
        .add("securableKind", securableKind)
        .add("securableType", securableType)
        .toString();
  }
}
