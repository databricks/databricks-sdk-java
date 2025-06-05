// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Simple Proto message for testing */
@Generated
class ExternalFunctionRequestPb {
  @JsonProperty("connection_name")
  private String connectionName;

  @JsonProperty("headers")
  private String headers;

  @JsonProperty("json")
  private String json;

  @JsonProperty("method")
  private ExternalFunctionRequestHttpMethod method;

  @JsonProperty("params")
  private String params;

  @JsonProperty("path")
  private String path;

  public ExternalFunctionRequestPb setConnectionName(String connectionName) {
    this.connectionName = connectionName;
    return this;
  }

  public String getConnectionName() {
    return connectionName;
  }

  public ExternalFunctionRequestPb setHeaders(String headers) {
    this.headers = headers;
    return this;
  }

  public String getHeaders() {
    return headers;
  }

  public ExternalFunctionRequestPb setJson(String json) {
    this.json = json;
    return this;
  }

  public String getJson() {
    return json;
  }

  public ExternalFunctionRequestPb setMethod(ExternalFunctionRequestHttpMethod method) {
    this.method = method;
    return this;
  }

  public ExternalFunctionRequestHttpMethod getMethod() {
    return method;
  }

  public ExternalFunctionRequestPb setParams(String params) {
    this.params = params;
    return this;
  }

  public String getParams() {
    return params;
  }

  public ExternalFunctionRequestPb setPath(String path) {
    this.path = path;
    return this;
  }

  public String getPath() {
    return path;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExternalFunctionRequestPb that = (ExternalFunctionRequestPb) o;
    return Objects.equals(connectionName, that.connectionName)
        && Objects.equals(headers, that.headers)
        && Objects.equals(json, that.json)
        && Objects.equals(method, that.method)
        && Objects.equals(params, that.params)
        && Objects.equals(path, that.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionName, headers, json, method, params, path);
  }

  @Override
  public String toString() {
    return new ToStringer(ExternalFunctionRequestPb.class)
        .add("connectionName", connectionName)
        .add("headers", headers)
        .add("json", json)
        .add("method", method)
        .add("params", params)
        .add("path", path)
        .toString();
  }
}
