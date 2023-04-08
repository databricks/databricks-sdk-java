// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.secrets;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PutSecret {
  /** If specified, value will be stored as bytes. */
  @JsonProperty("bytes_value")
  private String bytesValue;

  /** A unique name to identify the secret. */
  @JsonProperty("key")
  private String key;

  /** The name of the scope to which the secret will be associated with. */
  @JsonProperty("scope")
  private String scope;

  /** If specified, note that the value will be stored in UTF-8 (MB4) form. */
  @JsonProperty("string_value")
  private String stringValue;

  public PutSecret setBytesValue(String bytesValue) {
    this.bytesValue = bytesValue;
    return this;
  }

  public String getBytesValue() {
    return bytesValue;
  }

  public PutSecret setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public PutSecret setScope(String scope) {
    this.scope = scope;
    return this;
  }

  public String getScope() {
    return scope;
  }

  public PutSecret setStringValue(String stringValue) {
    this.stringValue = stringValue;
    return this;
  }

  public String getStringValue() {
    return stringValue;
  }
}
