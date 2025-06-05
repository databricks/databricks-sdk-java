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
@JsonSerialize(using = CreateCredentialStsRole.CreateCredentialStsRoleSerializer.class)
@JsonDeserialize(using = CreateCredentialStsRole.CreateCredentialStsRoleDeserializer.class)
public class CreateCredentialStsRole {
  /** The Amazon Resource Name (ARN) of the cross account role. */
  private String roleArn;

  public CreateCredentialStsRole setRoleArn(String roleArn) {
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
    CreateCredentialStsRole that = (CreateCredentialStsRole) o;
    return Objects.equals(roleArn, that.roleArn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleArn);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateCredentialStsRole.class).add("roleArn", roleArn).toString();
  }

  CreateCredentialStsRolePb toPb() {
    CreateCredentialStsRolePb pb = new CreateCredentialStsRolePb();
    pb.setRoleArn(roleArn);

    return pb;
  }

  static CreateCredentialStsRole fromPb(CreateCredentialStsRolePb pb) {
    CreateCredentialStsRole model = new CreateCredentialStsRole();
    model.setRoleArn(pb.getRoleArn());

    return model;
  }

  public static class CreateCredentialStsRoleSerializer
      extends JsonSerializer<CreateCredentialStsRole> {
    @Override
    public void serialize(
        CreateCredentialStsRole value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateCredentialStsRolePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateCredentialStsRoleDeserializer
      extends JsonDeserializer<CreateCredentialStsRole> {
    @Override
    public CreateCredentialStsRole deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateCredentialStsRolePb pb = mapper.readValue(p, CreateCredentialStsRolePb.class);
      return CreateCredentialStsRole.fromPb(pb);
    }
  }
}
