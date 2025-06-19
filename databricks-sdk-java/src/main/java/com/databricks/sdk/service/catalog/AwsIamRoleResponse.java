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
@JsonSerialize(using = AwsIamRoleResponse.AwsIamRoleResponseSerializer.class)
@JsonDeserialize(using = AwsIamRoleResponse.AwsIamRoleResponseDeserializer.class)
public class AwsIamRoleResponse {
  /** The external ID used in role assumption to prevent confused deputy problem.. */
  private String externalId;

  /** The Amazon Resource Name (ARN) of the AWS IAM role for S3 data access. */
  private String roleArn;

  /**
   * The Amazon Resource Name (ARN) of the AWS IAM user managed by Databricks. This is the identity
   * that is going to assume the AWS IAM role.
   */
  private String unityCatalogIamArn;

  public AwsIamRoleResponse setExternalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  public String getExternalId() {
    return externalId;
  }

  public AwsIamRoleResponse setRoleArn(String roleArn) {
    this.roleArn = roleArn;
    return this;
  }

  public String getRoleArn() {
    return roleArn;
  }

  public AwsIamRoleResponse setUnityCatalogIamArn(String unityCatalogIamArn) {
    this.unityCatalogIamArn = unityCatalogIamArn;
    return this;
  }

  public String getUnityCatalogIamArn() {
    return unityCatalogIamArn;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AwsIamRoleResponse that = (AwsIamRoleResponse) o;
    return Objects.equals(externalId, that.externalId)
        && Objects.equals(roleArn, that.roleArn)
        && Objects.equals(unityCatalogIamArn, that.unityCatalogIamArn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalId, roleArn, unityCatalogIamArn);
  }

  @Override
  public String toString() {
    return new ToStringer(AwsIamRoleResponse.class)
        .add("externalId", externalId)
        .add("roleArn", roleArn)
        .add("unityCatalogIamArn", unityCatalogIamArn)
        .toString();
  }

  AwsIamRoleResponsePb toPb() {
    AwsIamRoleResponsePb pb = new AwsIamRoleResponsePb();
    pb.setExternalId(externalId);
    pb.setRoleArn(roleArn);
    pb.setUnityCatalogIamArn(unityCatalogIamArn);

    return pb;
  }

  static AwsIamRoleResponse fromPb(AwsIamRoleResponsePb pb) {
    AwsIamRoleResponse model = new AwsIamRoleResponse();
    model.setExternalId(pb.getExternalId());
    model.setRoleArn(pb.getRoleArn());
    model.setUnityCatalogIamArn(pb.getUnityCatalogIamArn());

    return model;
  }

  public static class AwsIamRoleResponseSerializer extends JsonSerializer<AwsIamRoleResponse> {
    @Override
    public void serialize(AwsIamRoleResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AwsIamRoleResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AwsIamRoleResponseDeserializer extends JsonDeserializer<AwsIamRoleResponse> {
    @Override
    public AwsIamRoleResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AwsIamRoleResponsePb pb = mapper.readValue(p, AwsIamRoleResponsePb.class);
      return AwsIamRoleResponse.fromPb(pb);
    }
  }
}
