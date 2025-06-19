// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

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

/** Get policy family information */
@Generated
@JsonSerialize(using = GetPolicyFamilyRequest.GetPolicyFamilyRequestSerializer.class)
@JsonDeserialize(using = GetPolicyFamilyRequest.GetPolicyFamilyRequestDeserializer.class)
public class GetPolicyFamilyRequest {
  /** The family ID about which to retrieve information. */
  private String policyFamilyId;

  /** The version number for the family to fetch. Defaults to the latest version. */
  private Long version;

  public GetPolicyFamilyRequest setPolicyFamilyId(String policyFamilyId) {
    this.policyFamilyId = policyFamilyId;
    return this;
  }

  public String getPolicyFamilyId() {
    return policyFamilyId;
  }

  public GetPolicyFamilyRequest setVersion(Long version) {
    this.version = version;
    return this;
  }

  public Long getVersion() {
    return version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetPolicyFamilyRequest that = (GetPolicyFamilyRequest) o;
    return Objects.equals(policyFamilyId, that.policyFamilyId)
        && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyFamilyId, version);
  }

  @Override
  public String toString() {
    return new ToStringer(GetPolicyFamilyRequest.class)
        .add("policyFamilyId", policyFamilyId)
        .add("version", version)
        .toString();
  }

  GetPolicyFamilyRequestPb toPb() {
    GetPolicyFamilyRequestPb pb = new GetPolicyFamilyRequestPb();
    pb.setPolicyFamilyId(policyFamilyId);
    pb.setVersion(version);

    return pb;
  }

  static GetPolicyFamilyRequest fromPb(GetPolicyFamilyRequestPb pb) {
    GetPolicyFamilyRequest model = new GetPolicyFamilyRequest();
    model.setPolicyFamilyId(pb.getPolicyFamilyId());
    model.setVersion(pb.getVersion());

    return model;
  }

  public static class GetPolicyFamilyRequestSerializer
      extends JsonSerializer<GetPolicyFamilyRequest> {
    @Override
    public void serialize(
        GetPolicyFamilyRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetPolicyFamilyRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetPolicyFamilyRequestDeserializer
      extends JsonDeserializer<GetPolicyFamilyRequest> {
    @Override
    public GetPolicyFamilyRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetPolicyFamilyRequestPb pb = mapper.readValue(p, GetPolicyFamilyRequestPb.class);
      return GetPolicyFamilyRequest.fromPb(pb);
    }
  }
}
