// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Simple Proto message for testing */
@Generated
public class ExternalFunctionRequest {
  /** The connection name to use. This is required to identify the external connection. */
  @JsonProperty("connection_name")
  private String connectionName;

  /**
   * Additional headers for the request. If not provided, only auth headers from connections would
   * be passed.
   */
  @JsonProperty("headers")
  private String headers;

  /** The JSON payload to send in the request body. */
  @JsonProperty("json")
  private String json;

  /** The HTTP method to use (e.g., 'GET', 'POST'). */
  @JsonProperty("method")
  private ExternalFunctionRequestHttpMethod method;

  /** Query parameters for the request. */
  @JsonProperty("params")
  private String params;

  /** The relative path for the API endpoint. This is required. */
  @JsonProperty("path")
  private String path;

  public ExternalFunctionRequest setConnectionName(String connectionName) {
    this.connectionName = connectionName;
    return this;
  }

  public String getConnectionName() {
    return connectionName;
  }

  public ExternalFunctionRequest setHeaders(String headers) {
    this.headers = headers;
    return this;
  }

  public String getHeaders() {
    return headers;
  }

  public ExternalFunctionRequest setJson(String json) {
    this.json = json;
    return this;
  }

  public String getJson() {
    return json;
  }

  public ExternalFunctionRequest setMethod(ExternalFunctionRequestHttpMethod method) {
    this.method = method;
    return this;
  }

  public ExternalFunctionRequestHttpMethod getMethod() {
    return method;
  }

  public ExternalFunctionRequest setParams(String params) {
    this.params = params;
    return this;
  }

  public String getParams() {
    return params;
  }

  public ExternalFunctionRequest setPath(String path) {
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
    ExternalFunctionRequest that = (ExternalFunctionRequest) o;
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
    return new ToStringer(ExternalFunctionRequest.class)
        .add("connectionName", connectionName)
        .add("headers", headers)
        .add("json", json)
        .add("method", method)
        .add("params", params)
        .add("path", path)
        .toString();
  }
}
