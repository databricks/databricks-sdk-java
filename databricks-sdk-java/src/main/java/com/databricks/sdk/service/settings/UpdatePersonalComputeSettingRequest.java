// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Update Personal Compute setting */
@Generated
public class UpdatePersonalComputeSettingRequest {
  /** This should always be set to true for Settings RPCs. Added for AIP compliance. */
  @JsonProperty("allow_missing")
  private Boolean allowMissing;

  /** */
  @JsonProperty("setting")
  private PersonalComputeSetting setting;

  public UpdatePersonalComputeSettingRequest setAllowMissing(Boolean allowMissing) {
    this.allowMissing = allowMissing;
    return this;
  }

  public Boolean getAllowMissing() {
    return allowMissing;
  }

  public UpdatePersonalComputeSettingRequest setSetting(PersonalComputeSetting setting) {
    this.setting = setting;
    return this;
  }

  public PersonalComputeSetting getSetting() {
    return setting;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdatePersonalComputeSettingRequest that = (UpdatePersonalComputeSettingRequest) o;
    return Objects.equals(allowMissing, that.allowMissing) && Objects.equals(setting, that.setting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowMissing, setting);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdatePersonalComputeSettingRequest.class)
        .add("allowMissing", allowMissing)
        .add("setting", setting)
        .toString();
  }
}
