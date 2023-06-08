// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ReadPersonalComputeSettingResponse {
  /** TBD */
  @JsonProperty("etag")
  private String etag;

  /** */
  @JsonProperty("personal_compute")
  private PersonalComputeMessage personalCompute;

  /** Name of the corresponding setting. Needs to be 'default' if the setting is a singleton. */
  @JsonProperty("setting_name")
  private String settingName;

  public ReadPersonalComputeSettingResponse setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public ReadPersonalComputeSettingResponse setPersonalCompute(
      PersonalComputeMessage personalCompute) {
    this.personalCompute = personalCompute;
    return this;
  }

  public PersonalComputeMessage getPersonalCompute() {
    return personalCompute;
  }

  public ReadPersonalComputeSettingResponse setSettingName(String settingName) {
    this.settingName = settingName;
    return this;
  }

  public String getSettingName() {
    return settingName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReadPersonalComputeSettingResponse that = (ReadPersonalComputeSettingResponse) o;
    return Objects.equals(etag, that.etag)
        && Objects.equals(personalCompute, that.personalCompute)
        && Objects.equals(settingName, that.settingName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, personalCompute, settingName);
  }

  @Override
  public String toString() {
    return new ToStringer(ReadPersonalComputeSettingResponse.class)
        .add("etag", etag)
        .add("personalCompute", personalCompute)
        .add("settingName", settingName)
        .toString();
  }
}
