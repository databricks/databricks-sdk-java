// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Updates the default namespace setting */
@Generated
public class UpdateDefaultWorkspaceNamespaceRequest {
  /** This should always be set to true for Settings RPCs. Added for AIP compliance. */
  @JsonProperty("allow_missing")
  private Boolean allowMissing;

  /**
   * Field mask required to be passed into the PATCH request. Field mask specifies which fields of
   * the setting payload will be updated. For example, for Default Namespace setting, the field mask
   * is supposed to contain fields from the DefaultNamespaceSetting.namespace schema.
   *
   * <p>The field mask needs to supplied as single string. To specify multiple fields in the field
   * mask, use comma as the seperator (no space).
   */
  @JsonProperty("field_mask")
  private String fieldMask;

  /** Default namespace setting. */
  @JsonProperty("setting")
  private DefaultNamespaceSetting setting;

  public UpdateDefaultWorkspaceNamespaceRequest setAllowMissing(Boolean allowMissing) {
    this.allowMissing = allowMissing;
    return this;
  }

  public Boolean getAllowMissing() {
    return allowMissing;
  }

  public UpdateDefaultWorkspaceNamespaceRequest setFieldMask(String fieldMask) {
    this.fieldMask = fieldMask;
    return this;
  }

  public String getFieldMask() {
    return fieldMask;
  }

  public UpdateDefaultWorkspaceNamespaceRequest setSetting(DefaultNamespaceSetting setting) {
    this.setting = setting;
    return this;
  }

  public DefaultNamespaceSetting getSetting() {
    return setting;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateDefaultWorkspaceNamespaceRequest that = (UpdateDefaultWorkspaceNamespaceRequest) o;
    return Objects.equals(allowMissing, that.allowMissing)
        && Objects.equals(fieldMask, that.fieldMask)
        && Objects.equals(setting, that.setting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowMissing, fieldMask, setting);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateDefaultWorkspaceNamespaceRequest.class)
        .add("allowMissing", allowMissing)
        .add("fieldMask", fieldMask)
        .add("setting", setting)
        .toString();
  }
}
