// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

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

/** Get information for a single resource quota. */
@Generated
@JsonSerialize(using = GetQuotaRequest.GetQuotaRequestSerializer.class)
@JsonDeserialize(using = GetQuotaRequest.GetQuotaRequestDeserializer.class)
public class GetQuotaRequest {
  /** Full name of the parent resource. Provide the metastore ID if the parent is a metastore. */
  private String parentFullName;

  /** Securable type of the quota parent. */
  private String parentSecurableType;

  /** Name of the quota. Follows the pattern of the quota type, with "-quota" added as a suffix. */
  private String quotaName;

  public GetQuotaRequest setParentFullName(String parentFullName) {
    this.parentFullName = parentFullName;
    return this;
  }

  public String getParentFullName() {
    return parentFullName;
  }

  public GetQuotaRequest setParentSecurableType(String parentSecurableType) {
    this.parentSecurableType = parentSecurableType;
    return this;
  }

  public String getParentSecurableType() {
    return parentSecurableType;
  }

  public GetQuotaRequest setQuotaName(String quotaName) {
    this.quotaName = quotaName;
    return this;
  }

  public String getQuotaName() {
    return quotaName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetQuotaRequest that = (GetQuotaRequest) o;
    return Objects.equals(parentFullName, that.parentFullName)
        && Objects.equals(parentSecurableType, that.parentSecurableType)
        && Objects.equals(quotaName, that.quotaName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentFullName, parentSecurableType, quotaName);
  }

  @Override
  public String toString() {
    return new ToStringer(GetQuotaRequest.class)
        .add("parentFullName", parentFullName)
        .add("parentSecurableType", parentSecurableType)
        .add("quotaName", quotaName)
        .toString();
  }

  GetQuotaRequestPb toPb() {
    GetQuotaRequestPb pb = new GetQuotaRequestPb();
    pb.setParentFullName(parentFullName);
    pb.setParentSecurableType(parentSecurableType);
    pb.setQuotaName(quotaName);

    return pb;
  }

  static GetQuotaRequest fromPb(GetQuotaRequestPb pb) {
    GetQuotaRequest model = new GetQuotaRequest();
    model.setParentFullName(pb.getParentFullName());
    model.setParentSecurableType(pb.getParentSecurableType());
    model.setQuotaName(pb.getQuotaName());

    return model;
  }

  public static class GetQuotaRequestSerializer extends JsonSerializer<GetQuotaRequest> {
    @Override
    public void serialize(GetQuotaRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetQuotaRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetQuotaRequestDeserializer extends JsonDeserializer<GetQuotaRequest> {
    @Override
    public GetQuotaRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetQuotaRequestPb pb = mapper.readValue(p, GetQuotaRequestPb.class);
      return GetQuotaRequest.fromPb(pb);
    }
  }
}
