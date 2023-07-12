// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class PersonalComputeSetting {
  /**
   * etag used for versioning. The response is at least as fresh as the eTag provided. This is used
   * for optimistic concurrency control as a way to help prevent simultaneous writes of a setting
   * overwriting each other. It is strongly suggested that systems make use of the etag in the read
   * -> update pattern to perform setting updates in order to avoid race conditions. That is, get an
   * etag from a GET request, and pass it with the PATCH request to identify the setting version you
   * are updating.
   */
  @JsonProperty("etag")
  private String etag;

  /** */
  @JsonProperty("personal_compute")
  private PersonalComputeMessage personalCompute;

  /**
   * Name of the corresponding setting. Needs to be 'default' if there is only one setting instance
   * per account.
   */
  @JsonProperty("setting_name")
  private String settingName;

  public PersonalComputeSetting setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public PersonalComputeSetting setPersonalCompute(PersonalComputeMessage personalCompute) {
    this.personalCompute = personalCompute;
    return this;
  }

  public PersonalComputeMessage getPersonalCompute() {
    return personalCompute;
  }

  public PersonalComputeSetting setSettingName(String settingName) {
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
    PersonalComputeSetting that = (PersonalComputeSetting) o;
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
    return new ToStringer(PersonalComputeSetting.class)
        .add("etag", etag)
        .add("personalCompute", personalCompute)
        .add("settingName", settingName)
        .toString();
  }
}
