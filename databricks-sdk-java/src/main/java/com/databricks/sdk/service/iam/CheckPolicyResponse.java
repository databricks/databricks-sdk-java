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

@Generated
@JsonSerialize(using = CheckPolicyResponse.CheckPolicyResponseSerializer.class)
@JsonDeserialize(using = CheckPolicyResponse.CheckPolicyResponseDeserializer.class)
public class CheckPolicyResponse {
  /** */
  private ConsistencyToken consistencyToken;

  /** */
  private Boolean isPermitted;

  public CheckPolicyResponse setConsistencyToken(ConsistencyToken consistencyToken) {
    this.consistencyToken = consistencyToken;
    return this;
  }

  public ConsistencyToken getConsistencyToken() {
    return consistencyToken;
  }

  public CheckPolicyResponse setIsPermitted(Boolean isPermitted) {
    this.isPermitted = isPermitted;
    return this;
  }

  public Boolean getIsPermitted() {
    return isPermitted;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckPolicyResponse that = (CheckPolicyResponse) o;
    return Objects.equals(consistencyToken, that.consistencyToken)
        && Objects.equals(isPermitted, that.isPermitted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consistencyToken, isPermitted);
  }

  @Override
  public String toString() {
    return new ToStringer(CheckPolicyResponse.class)
        .add("consistencyToken", consistencyToken)
        .add("isPermitted", isPermitted)
        .toString();
  }

  CheckPolicyResponsePb toPb() {
    CheckPolicyResponsePb pb = new CheckPolicyResponsePb();
    pb.setConsistencyToken(consistencyToken);
    pb.setIsPermitted(isPermitted);

    return pb;
  }

  static CheckPolicyResponse fromPb(CheckPolicyResponsePb pb) {
    CheckPolicyResponse model = new CheckPolicyResponse();
    model.setConsistencyToken(pb.getConsistencyToken());
    model.setIsPermitted(pb.getIsPermitted());

    return model;
  }

  public static class CheckPolicyResponseSerializer extends JsonSerializer<CheckPolicyResponse> {
    @Override
    public void serialize(CheckPolicyResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CheckPolicyResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CheckPolicyResponseDeserializer
      extends JsonDeserializer<CheckPolicyResponse> {
    @Override
    public CheckPolicyResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CheckPolicyResponsePb pb = mapper.readValue(p, CheckPolicyResponsePb.class);
      return CheckPolicyResponse.fromPb(pb);
    }
  }
}
