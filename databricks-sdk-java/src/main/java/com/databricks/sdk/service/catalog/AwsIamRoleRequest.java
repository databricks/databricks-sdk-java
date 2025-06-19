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

@Generated
@JsonSerialize(using = AwsIamRoleRequest.AwsIamRoleRequestSerializer.class)
@JsonDeserialize(using = AwsIamRoleRequest.AwsIamRoleRequestDeserializer.class)
public class AwsIamRoleRequest {
  /** The Amazon Resource Name (ARN) of the AWS IAM role for S3 data access. */
  private String roleArn;

  public AwsIamRoleRequest setRoleArn(String roleArn) {
    this.roleArn = roleArn;
    return this;
  }

  public String getRoleArn() {
    return roleArn;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AwsIamRoleRequest that = (AwsIamRoleRequest) o;
    return Objects.equals(roleArn, that.roleArn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleArn);
  }

  @Override
  public String toString() {
    return new ToStringer(AwsIamRoleRequest.class).add("roleArn", roleArn).toString();
  }

  AwsIamRoleRequestPb toPb() {
    AwsIamRoleRequestPb pb = new AwsIamRoleRequestPb();
    pb.setRoleArn(roleArn);

    return pb;
  }

  static AwsIamRoleRequest fromPb(AwsIamRoleRequestPb pb) {
    AwsIamRoleRequest model = new AwsIamRoleRequest();
    model.setRoleArn(pb.getRoleArn());

    return model;
  }

  public static class AwsIamRoleRequestSerializer extends JsonSerializer<AwsIamRoleRequest> {
    @Override
    public void serialize(AwsIamRoleRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AwsIamRoleRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AwsIamRoleRequestDeserializer extends JsonDeserializer<AwsIamRoleRequest> {
    @Override
    public AwsIamRoleRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AwsIamRoleRequestPb pb = mapper.readValue(p, AwsIamRoleRequestPb.class);
      return AwsIamRoleRequest.fromPb(pb);
    }
  }
}
