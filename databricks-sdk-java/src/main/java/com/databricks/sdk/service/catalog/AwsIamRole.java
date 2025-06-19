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

/** The AWS IAM role configuration */
@Generated
@JsonSerialize(using = AwsIamRole.AwsIamRoleSerializer.class)
@JsonDeserialize(using = AwsIamRole.AwsIamRoleDeserializer.class)
public class AwsIamRole {
  /** The external ID used in role assumption to prevent the confused deputy problem. */
  private String externalId;

  /** The Amazon Resource Name (ARN) of the AWS IAM role used to vend temporary credentials. */
  private String roleArn;

  /**
   * The Amazon Resource Name (ARN) of the AWS IAM user managed by Databricks. This is the identity
   * that is going to assume the AWS IAM role.
   */
  private String unityCatalogIamArn;

  public AwsIamRole setExternalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  public String getExternalId() {
    return externalId;
  }

  public AwsIamRole setRoleArn(String roleArn) {
    this.roleArn = roleArn;
    return this;
  }

  public String getRoleArn() {
    return roleArn;
  }

  public AwsIamRole setUnityCatalogIamArn(String unityCatalogIamArn) {
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
    AwsIamRole that = (AwsIamRole) o;
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
    return new ToStringer(AwsIamRole.class)
        .add("externalId", externalId)
        .add("roleArn", roleArn)
        .add("unityCatalogIamArn", unityCatalogIamArn)
        .toString();
  }

  AwsIamRolePb toPb() {
    AwsIamRolePb pb = new AwsIamRolePb();
    pb.setExternalId(externalId);
    pb.setRoleArn(roleArn);
    pb.setUnityCatalogIamArn(unityCatalogIamArn);

    return pb;
  }

  static AwsIamRole fromPb(AwsIamRolePb pb) {
    AwsIamRole model = new AwsIamRole();
    model.setExternalId(pb.getExternalId());
    model.setRoleArn(pb.getRoleArn());
    model.setUnityCatalogIamArn(pb.getUnityCatalogIamArn());

    return model;
  }

  public static class AwsIamRoleSerializer extends JsonSerializer<AwsIamRole> {
    @Override
    public void serialize(AwsIamRole value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AwsIamRolePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AwsIamRoleDeserializer extends JsonDeserializer<AwsIamRole> {
    @Override
    public AwsIamRole deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AwsIamRolePb pb = mapper.readValue(p, AwsIamRolePb.class);
      return AwsIamRole.fromPb(pb);
    }
  }
}
