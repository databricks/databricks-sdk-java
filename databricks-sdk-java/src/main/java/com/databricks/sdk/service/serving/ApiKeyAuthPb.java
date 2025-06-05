// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class ApiKeyAuthPb {
  @JsonProperty("key")
  private String key;

  @JsonProperty("value")
  private String value;

  @JsonProperty("value_plaintext")
  private String valuePlaintext;

  public ApiKeyAuthPb setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public ApiKeyAuthPb setValue(String value) {
    this.value = value;
    return this;
  }

  public String getValue() {
    return value;
  }

  public ApiKeyAuthPb setValuePlaintext(String valuePlaintext) {
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
    ApiKeyAuthPb that = (ApiKeyAuthPb) o;
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
    return new ToStringer(ApiKeyAuthPb.class)
        .add("key", key)
        .add("value", value)
        .add("valuePlaintext", valuePlaintext)
        .toString();
  }
}
