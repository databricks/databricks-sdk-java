// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

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
@JsonSerialize(using = StsRole.StsRoleSerializer.class)
@JsonDeserialize(using = StsRole.StsRoleDeserializer.class)
public class StsRole {
  /**
   * The external ID that needs to be trusted by the cross-account role. This is always your
   * Databricks account ID.
   */
  private String externalId;

  /** The Amazon Resource Name (ARN) of the cross account role. */
  private String roleArn;

  public StsRole setExternalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  public String getExternalId() {
    return externalId;
  }

  public StsRole setRoleArn(String roleArn) {
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
    StsRole that = (StsRole) o;
    return Objects.equals(externalId, that.externalId) && Objects.equals(roleArn, that.roleArn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalId, roleArn);
  }

  @Override
  public String toString() {
    return new ToStringer(StsRole.class)
        .add("externalId", externalId)
        .add("roleArn", roleArn)
        .toString();
  }

  StsRolePb toPb() {
    StsRolePb pb = new StsRolePb();
    pb.setExternalId(externalId);
    pb.setRoleArn(roleArn);

    return pb;
  }

  static StsRole fromPb(StsRolePb pb) {
    StsRole model = new StsRole();
    model.setExternalId(pb.getExternalId());
    model.setRoleArn(pb.getRoleArn());

    return model;
  }

  public static class StsRoleSerializer extends JsonSerializer<StsRole> {
    @Override
    public void serialize(StsRole value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      StsRolePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class StsRoleDeserializer extends JsonDeserializer<StsRole> {
    @Override
    public StsRole deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      StsRolePb pb = mapper.readValue(p, StsRolePb.class);
      return StsRole.fromPb(pb);
    }
  }
}
