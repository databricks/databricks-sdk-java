// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class EffectivePrivilegePb {
  @JsonProperty("inherited_from_name")
  private String inheritedFromName;

  @JsonProperty("inherited_from_type")
  private SecurableType inheritedFromType;

  @JsonProperty("privilege")
  private Privilege privilege;

  public EffectivePrivilegePb setInheritedFromName(String inheritedFromName) {
    this.inheritedFromName = inheritedFromName;
    return this;
  }

  public String getInheritedFromName() {
    return inheritedFromName;
  }

  public EffectivePrivilegePb setInheritedFromType(SecurableType inheritedFromType) {
    this.inheritedFromType = inheritedFromType;
    return this;
  }

  public SecurableType getInheritedFromType() {
    return inheritedFromType;
  }

  public EffectivePrivilegePb setPrivilege(Privilege privilege) {
    this.privilege = privilege;
    return this;
  }

  public Privilege getPrivilege() {
    return privilege;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EffectivePrivilegePb that = (EffectivePrivilegePb) o;
    return Objects.equals(inheritedFromName, that.inheritedFromName)
        && Objects.equals(inheritedFromType, that.inheritedFromType)
        && Objects.equals(privilege, that.privilege);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inheritedFromName, inheritedFromType, privilege);
  }

  @Override
  public String toString() {
    return new ToStringer(EffectivePrivilegePb.class)
        .add("inheritedFromName", inheritedFromName)
        .add("inheritedFromType", inheritedFromType)
        .add("privilege", privilege)
        .toString();
  }
}
