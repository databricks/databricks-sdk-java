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
@JsonSerialize(
    using = CreateCredentialAwsCredentials.CreateCredentialAwsCredentialsSerializer.class)
@JsonDeserialize(
    using = CreateCredentialAwsCredentials.CreateCredentialAwsCredentialsDeserializer.class)
public class CreateCredentialAwsCredentials {
  /** */
  private CreateCredentialStsRole stsRole;

  public CreateCredentialAwsCredentials setStsRole(CreateCredentialStsRole stsRole) {
    this.stsRole = stsRole;
    return this;
  }

  public CreateCredentialStsRole getStsRole() {
    return stsRole;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateCredentialAwsCredentials that = (CreateCredentialAwsCredentials) o;
    return Objects.equals(stsRole, that.stsRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stsRole);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateCredentialAwsCredentials.class).add("stsRole", stsRole).toString();
  }

  CreateCredentialAwsCredentialsPb toPb() {
    CreateCredentialAwsCredentialsPb pb = new CreateCredentialAwsCredentialsPb();
    pb.setStsRole(stsRole);

    return pb;
  }

  static CreateCredentialAwsCredentials fromPb(CreateCredentialAwsCredentialsPb pb) {
    CreateCredentialAwsCredentials model = new CreateCredentialAwsCredentials();
    model.setStsRole(pb.getStsRole());

    return model;
  }

  public static class CreateCredentialAwsCredentialsSerializer
      extends JsonSerializer<CreateCredentialAwsCredentials> {
    @Override
    public void serialize(
        CreateCredentialAwsCredentials value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateCredentialAwsCredentialsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateCredentialAwsCredentialsDeserializer
      extends JsonDeserializer<CreateCredentialAwsCredentials> {
    @Override
    public CreateCredentialAwsCredentials deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateCredentialAwsCredentialsPb pb =
          mapper.readValue(p, CreateCredentialAwsCredentialsPb.class);
      return CreateCredentialAwsCredentials.fromPb(pb);
    }
  }
}
