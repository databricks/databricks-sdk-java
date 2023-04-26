// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>EffectivePrivilege class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class EffectivePrivilege {
  /**
   * The full name of the object that conveys this privilege via inheritance.
   *
   * <p>This field is omitted when privilege is not inherited (it's assigned to the securable
   * itself).
   */
  @JsonProperty("inherited_from_name")
  private String inheritedFromName;

  /**
   * The type of the object that conveys this privilege via inheritance.
   *
   * <p>This field is omitted when privilege is not inherited (it's assigned to the securable
   * itself).
   */
  @JsonProperty("inherited_from_type")
  private SecurableType inheritedFromType;

  /** The privilege assigned to the principal. */
  @JsonProperty("privilege")
  private Privilege privilege;

  /**
   * <p>Setter for the field <code>inheritedFromName</code>.</p>
   *
   * @param inheritedFromName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.EffectivePrivilege} object
   */
  public EffectivePrivilege setInheritedFromName(String inheritedFromName) {
    this.inheritedFromName = inheritedFromName;
    return this;
  }

  /**
   * <p>Getter for the field <code>inheritedFromName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getInheritedFromName() {
    return inheritedFromName;
  }

  /**
   * <p>Setter for the field <code>inheritedFromType</code>.</p>
   *
   * @param inheritedFromType a {@link com.databricks.sdk.service.catalog.SecurableType} object
   * @return a {@link com.databricks.sdk.service.catalog.EffectivePrivilege} object
   */
  public EffectivePrivilege setInheritedFromType(SecurableType inheritedFromType) {
    this.inheritedFromType = inheritedFromType;
    return this;
  }

  /**
   * <p>Getter for the field <code>inheritedFromType</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.catalog.SecurableType} object
   */
  public SecurableType getInheritedFromType() {
    return inheritedFromType;
  }

  /**
   * <p>Setter for the field <code>privilege</code>.</p>
   *
   * @param privilege a {@link com.databricks.sdk.service.catalog.Privilege} object
   * @return a {@link com.databricks.sdk.service.catalog.EffectivePrivilege} object
   */
  public EffectivePrivilege setPrivilege(Privilege privilege) {
    this.privilege = privilege;
    return this;
  }

  /**
   * <p>Getter for the field <code>privilege</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.catalog.Privilege} object
   */
  public Privilege getPrivilege() {
    return privilege;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EffectivePrivilege that = (EffectivePrivilege) o;
    return Objects.equals(inheritedFromName, that.inheritedFromName)
        && Objects.equals(inheritedFromType, that.inheritedFromType)
        && Objects.equals(privilege, that.privilege);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(inheritedFromName, inheritedFromType, privilege);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(EffectivePrivilege.class)
        .add("inheritedFromName", inheritedFromName)
        .add("inheritedFromType", inheritedFromType)
        .add("privilege", privilege)
        .toString();
  }
}
