// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

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

/** Get object permissions */
@Generated
@JsonSerialize(using = GetPermissionRequest.GetPermissionRequestSerializer.class)
@JsonDeserialize(using = GetPermissionRequest.GetPermissionRequestDeserializer.class)
public class GetPermissionRequest {
  /** The id of the request object. */
  private String requestObjectId;

  /**
   * The type of the request object. Can be one of the following: alerts, authorization, clusters,
   * cluster-policies, dashboards, dbsql-dashboards, directories, experiments, files,
   * instance-pools, jobs, notebooks, pipelines, queries, registered-models, repos,
   * serving-endpoints, or warehouses.
   */
  private String requestObjectType;

  public GetPermissionRequest setRequestObjectId(String requestObjectId) {
    this.requestObjectId = requestObjectId;
    return this;
  }

  public String getRequestObjectId() {
    return requestObjectId;
  }

  public GetPermissionRequest setRequestObjectType(String requestObjectType) {
    this.requestObjectType = requestObjectType;
    return this;
  }

  public String getRequestObjectType() {
    return requestObjectType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetPermissionRequest that = (GetPermissionRequest) o;
    return Objects.equals(requestObjectId, that.requestObjectId)
        && Objects.equals(requestObjectType, that.requestObjectType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestObjectId, requestObjectType);
  }

  @Override
  public String toString() {
    return new ToStringer(GetPermissionRequest.class)
        .add("requestObjectId", requestObjectId)
        .add("requestObjectType", requestObjectType)
        .toString();
  }

  GetPermissionRequestPb toPb() {
    GetPermissionRequestPb pb = new GetPermissionRequestPb();
    pb.setRequestObjectId(requestObjectId);
    pb.setRequestObjectType(requestObjectType);

    return pb;
  }

  static GetPermissionRequest fromPb(GetPermissionRequestPb pb) {
    GetPermissionRequest model = new GetPermissionRequest();
    model.setRequestObjectId(pb.getRequestObjectId());
    model.setRequestObjectType(pb.getRequestObjectType());

    return model;
  }

  public static class GetPermissionRequestSerializer extends JsonSerializer<GetPermissionRequest> {
    @Override
    public void serialize(
        GetPermissionRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetPermissionRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetPermissionRequestDeserializer
      extends JsonDeserializer<GetPermissionRequest> {
    @Override
    public GetPermissionRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetPermissionRequestPb pb = mapper.readValue(p, GetPermissionRequestPb.class);
      return GetPermissionRequest.fromPb(pb);
    }
  }
}
