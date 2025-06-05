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
import java.util.Collection;
import java.util.Objects;

/** The GCP cloud options to customize the requested temporary credential */
@Generated
@JsonSerialize(
    using =
        GenerateTemporaryServiceCredentialGcpOptions
            .GenerateTemporaryServiceCredentialGcpOptionsSerializer.class)
@JsonDeserialize(
    using =
        GenerateTemporaryServiceCredentialGcpOptions
            .GenerateTemporaryServiceCredentialGcpOptionsDeserializer.class)
public class GenerateTemporaryServiceCredentialGcpOptions {
  /**
   * The scopes to which the temporary GCP credential should apply. These resources are the scopes
   * that are passed to the token provider (see
   * https://google-auth.readthedocs.io/en/latest/reference/google.auth.html#google.auth.credentials.Credentials)
   */
  private Collection<String> scopes;

  public GenerateTemporaryServiceCredentialGcpOptions setScopes(Collection<String> scopes) {
    this.scopes = scopes;
    return this;
  }

  public Collection<String> getScopes() {
    return scopes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenerateTemporaryServiceCredentialGcpOptions that =
        (GenerateTemporaryServiceCredentialGcpOptions) o;
    return Objects.equals(scopes, that.scopes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scopes);
  }

  @Override
  public String toString() {
    return new ToStringer(GenerateTemporaryServiceCredentialGcpOptions.class)
        .add("scopes", scopes)
        .toString();
  }

  GenerateTemporaryServiceCredentialGcpOptionsPb toPb() {
    GenerateTemporaryServiceCredentialGcpOptionsPb pb =
        new GenerateTemporaryServiceCredentialGcpOptionsPb();
    pb.setScopes(scopes);

    return pb;
  }

  static GenerateTemporaryServiceCredentialGcpOptions fromPb(
      GenerateTemporaryServiceCredentialGcpOptionsPb pb) {
    GenerateTemporaryServiceCredentialGcpOptions model =
        new GenerateTemporaryServiceCredentialGcpOptions();
    model.setScopes(pb.getScopes());

    return model;
  }

  public static class GenerateTemporaryServiceCredentialGcpOptionsSerializer
      extends JsonSerializer<GenerateTemporaryServiceCredentialGcpOptions> {
    @Override
    public void serialize(
        GenerateTemporaryServiceCredentialGcpOptions value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      GenerateTemporaryServiceCredentialGcpOptionsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GenerateTemporaryServiceCredentialGcpOptionsDeserializer
      extends JsonDeserializer<GenerateTemporaryServiceCredentialGcpOptions> {
    @Override
    public GenerateTemporaryServiceCredentialGcpOptions deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GenerateTemporaryServiceCredentialGcpOptionsPb pb =
          mapper.readValue(p, GenerateTemporaryServiceCredentialGcpOptionsPb.class);
      return GenerateTemporaryServiceCredentialGcpOptions.fromPb(pb);
    }
  }
}
