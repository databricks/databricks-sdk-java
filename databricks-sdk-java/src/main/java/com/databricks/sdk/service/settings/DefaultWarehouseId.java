// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class DefaultWarehouseId {
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

  /**
   * Name of the corresponding setting. This field is populated in the response, but it will not be
   * respected even if it's set in the request body. The setting name in the path parameter will be
   * respected instead. Setting name is required to be 'default' if the setting only has one
   * instance per workspace.
   */
  @JsonProperty("setting_name")
  private String settingName;

  /** */
  @JsonProperty("string_val")
  private StringMessage stringVal;

  public DefaultWarehouseId setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public DefaultWarehouseId setSettingName(String settingName) {
    this.settingName = settingName;
    return this;
  }

  public String getSettingName() {
    return settingName;
  }

  public DefaultWarehouseId setStringVal(StringMessage stringVal) {
    this.stringVal = stringVal;
    return this;
  }

  public StringMessage getStringVal() {
    return stringVal;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DefaultWarehouseId that = (DefaultWarehouseId) o;
    return Objects.equals(etag, that.etag)
        && Objects.equals(settingName, that.settingName)
        && Objects.equals(stringVal, that.stringVal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, settingName, stringVal);
  }

  @Override
  public String toString() {
    return new ToStringer(DefaultWarehouseId.class)
        .add("etag", etag)
        .add("settingName", settingName)
        .add("stringVal", stringVal)
        .toString();
  }
}
