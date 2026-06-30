// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ApiKeyAuth {
  /** The name of the API key parameter used for authentication. */
  @JsonProperty("key")
  private String key;

  /**
   * The Databricks secret key reference for an API Key. If you prefer to paste your token directly,
   * see `value_plaintext`.
   */
  @JsonProperty("value")
  private String value;

  /**
   * The API Key provided as a plaintext string. If you prefer to reference your token using
   * Databricks Secrets, see `value`.
   */
  @JsonProperty("value_plaintext")
  private String valuePlaintext;

  public ApiKeyAuth setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public ApiKeyAuth setValue(String value) {
    this.value = value;
    return this;
  }

  public String getValue() {
    return value;
  }

  public ApiKeyAuth setValuePlaintext(String valuePlaintext) {
    this.valuePlaintext = valuePlaintext;
    return this;
  }

  public String getValuePlaintext() {
    return valuePlaintext;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ApiKeyAuth that = (ApiKeyAuth) o;
    return Objects.equals(key, that.key)
        && Objects.equals(value, that.value)
        && Objects.equals(valuePlaintext, that.valuePlaintext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value, valuePlaintext);
  }

  @Override
  public String toString() {
    return new ToStringer(ApiKeyAuth.class)
        .add("key", key)
        .add("value", value)
        .add("valuePlaintext", valuePlaintext)
        .toString();
  }
}
