// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Objects;

/** Simple Proto message for testing */
@Generated
@JsonSerialize(using = ExternalFunctionRequest.ExternalFunctionRequestSerializer.class)
@JsonDeserialize(using = ExternalFunctionRequest.ExternalFunctionRequestDeserializer.class)
public class ExternalFunctionRequest {
  /** The connection name to use. This is required to identify the external connection. */
  private String connectionName;

  /**
   * Additional headers for the request. If not provided, only auth headers from connections would
   * be passed.
   */
  private String headers;

  /** The JSON payload to send in the request body. */
  private String json;

  /** The HTTP method to use (e.g., 'GET', 'POST'). */
  private ExternalFunctionRequestHttpMethod method;

  /** Query parameters for the request. */
  private String params;

  /** The relative path for the API endpoint. This is required. */
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

  ExternalFunctionRequestPb toPb() {
    ExternalFunctionRequestPb pb = new ExternalFunctionRequestPb();
    pb.setConnectionName(connectionName);
    pb.setHeaders(headers);
    pb.setJson(json);
    pb.setMethod(method);
    pb.setParams(params);
    pb.setPath(path);

    return pb;
  }

  static ExternalFunctionRequest fromPb(ExternalFunctionRequestPb pb) {
    ExternalFunctionRequest model = new ExternalFunctionRequest();
    model.setConnectionName(pb.getConnectionName());
    model.setHeaders(pb.getHeaders());
    model.setJson(pb.getJson());
    model.setMethod(pb.getMethod());
    model.setParams(pb.getParams());
    model.setPath(pb.getPath());

    return model;
  }

  public static class ExternalFunctionRequestSerializer
      extends JsonSerializer<ExternalFunctionRequest> {
    @Override
    public void serialize(
        ExternalFunctionRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ExternalFunctionRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ExternalFunctionRequestDeserializer
      extends JsonDeserializer<ExternalFunctionRequest> {
    @Override
    public ExternalFunctionRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ExternalFunctionRequestPb pb = mapper.readValue(p, ExternalFunctionRequestPb.class);
      return ExternalFunctionRequest.fromPb(pb);
    }
  }
}
