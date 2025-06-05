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
@JsonSerialize(using = AwsCredentials.AwsCredentialsSerializer.class)
@JsonDeserialize(using = AwsCredentials.AwsCredentialsDeserializer.class)
public class AwsCredentials {
  /** */
  private StsRole stsRole;

  public AwsCredentials setStsRole(StsRole stsRole) {
    this.stsRole = stsRole;
    return this;
  }

  public StsRole getStsRole() {
    return stsRole;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AwsCredentials that = (AwsCredentials) o;
    return Objects.equals(stsRole, that.stsRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stsRole);
  }

  @Override
  public String toString() {
    return new ToStringer(AwsCredentials.class).add("stsRole", stsRole).toString();
  }

  AwsCredentialsPb toPb() {
    AwsCredentialsPb pb = new AwsCredentialsPb();
    pb.setStsRole(stsRole);

    return pb;
  }

  static AwsCredentials fromPb(AwsCredentialsPb pb) {
    AwsCredentials model = new AwsCredentials();
    model.setStsRole(pb.getStsRole());

    return model;
  }

  public static class AwsCredentialsSerializer extends JsonSerializer<AwsCredentials> {
    @Override
    public void serialize(AwsCredentials value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AwsCredentialsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AwsCredentialsDeserializer extends JsonDeserializer<AwsCredentials> {
    @Override
    public AwsCredentials deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AwsCredentialsPb pb = mapper.readValue(p, AwsCredentialsPb.class);
      return AwsCredentials.fromPb(pb);
    }
  }
}
