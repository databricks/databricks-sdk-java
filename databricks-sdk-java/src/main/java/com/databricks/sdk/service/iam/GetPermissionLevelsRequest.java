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

/** Get object permission levels */
@Generated
@JsonSerialize(using = GetPermissionLevelsRequest.GetPermissionLevelsRequestSerializer.class)
@JsonDeserialize(using = GetPermissionLevelsRequest.GetPermissionLevelsRequestDeserializer.class)
public class GetPermissionLevelsRequest {
  /** */
  private String requestObjectId;

  /**
   * The type of the request object. Can be one of the following: alerts, authorization, clusters,
   * cluster-policies, dashboards, dbsql-dashboards, directories, experiments, files,
   * instance-pools, jobs, notebooks, pipelines, queries, registered-models, repos,
   * serving-endpoints, or warehouses.
   */
  private String requestObjectType;

  public GetPermissionLevelsRequest setRequestObjectId(String requestObjectId) {
    this.requestObjectId = requestObjectId;
    return this;
  }

  public String getRequestObjectId() {
    return requestObjectId;
  }

  public GetPermissionLevelsRequest setRequestObjectType(String requestObjectType) {
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
    GetPermissionLevelsRequest that = (GetPermissionLevelsRequest) o;
    return Objects.equals(requestObjectId, that.requestObjectId)
        && Objects.equals(requestObjectType, that.requestObjectType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestObjectId, requestObjectType);
  }

  @Override
  public String toString() {
    return new ToStringer(GetPermissionLevelsRequest.class)
        .add("requestObjectId", requestObjectId)
        .add("requestObjectType", requestObjectType)
        .toString();
  }

  GetPermissionLevelsRequestPb toPb() {
    GetPermissionLevelsRequestPb pb = new GetPermissionLevelsRequestPb();
    pb.setRequestObjectId(requestObjectId);
    pb.setRequestObjectType(requestObjectType);

    return pb;
  }

  static GetPermissionLevelsRequest fromPb(GetPermissionLevelsRequestPb pb) {
    GetPermissionLevelsRequest model = new GetPermissionLevelsRequest();
    model.setRequestObjectId(pb.getRequestObjectId());
    model.setRequestObjectType(pb.getRequestObjectType());

    return model;
  }

  public static class GetPermissionLevelsRequestSerializer
      extends JsonSerializer<GetPermissionLevelsRequest> {
    @Override
    public void serialize(
        GetPermissionLevelsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetPermissionLevelsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetPermissionLevelsRequestDeserializer
      extends JsonDeserializer<GetPermissionLevelsRequest> {
    @Override
    public GetPermissionLevelsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetPermissionLevelsRequestPb pb = mapper.readValue(p, GetPermissionLevelsRequestPb.class);
      return GetPermissionLevelsRequest.fromPb(pb);
    }
  }
}
