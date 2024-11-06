// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Details required to update a setting. */
@Generated
public class UpdateDisableLegacyFeaturesRequest {
  /** This should always be set to true for Settings API. Added for AIP compliance. */
  @JsonProperty("allow_missing")
  private Boolean allowMissing;

  /**
   * Field mask is required to be passed into the PATCH request. Field mask specifies which fields
   * of the setting payload will be updated. The field mask needs to be supplied as single string.
   * To specify multiple fields in the field mask, use comma as the separator (no space).
   */
  @JsonProperty("field_mask")
  private String fieldMask;

  /** */
  @JsonProperty("setting")
  private DisableLegacyFeatures setting;

  public UpdateDisableLegacyFeaturesRequest setAllowMissing(Boolean allowMissing) {
    this.allowMissing = allowMissing;
    return this;
  }

  public Boolean getAllowMissing() {
    return allowMissing;
  }

  public UpdateDisableLegacyFeaturesRequest setFieldMask(String fieldMask) {
    this.fieldMask = fieldMask;
    return this;
  }

  public String getFieldMask() {
    return fieldMask;
  }

  public UpdateDisableLegacyFeaturesRequest setSetting(DisableLegacyFeatures setting) {
    this.setting = setting;
    return this;
  }

  public DisableLegacyFeatures getSetting() {
    return setting;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateDisableLegacyFeaturesRequest that = (UpdateDisableLegacyFeaturesRequest) o;
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
    return new ToStringer(UpdateDisableLegacyFeaturesRequest.class)
        .add("allowMissing", allowMissing)
        .add("fieldMask", fieldMask)
        .add("setting", setting)
        .toString();
  }
}
