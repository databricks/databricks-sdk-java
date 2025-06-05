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
@JsonSerialize(
    using =
        GenerateTemporaryServiceCredentialRequest
            .GenerateTemporaryServiceCredentialRequestSerializer.class)
@JsonDeserialize(
    using =
        GenerateTemporaryServiceCredentialRequest
            .GenerateTemporaryServiceCredentialRequestDeserializer.class)
public class GenerateTemporaryServiceCredentialRequest {
  /** The Azure cloud options to customize the requested temporary credential */
  private GenerateTemporaryServiceCredentialAzureOptions azureOptions;

  /** The name of the service credential used to generate a temporary credential */
  private String credentialName;

  /** The GCP cloud options to customize the requested temporary credential */
  private GenerateTemporaryServiceCredentialGcpOptions gcpOptions;

  public GenerateTemporaryServiceCredentialRequest setAzureOptions(
      GenerateTemporaryServiceCredentialAzureOptions azureOptions) {
    this.azureOptions = azureOptions;
    return this;
  }

  public GenerateTemporaryServiceCredentialAzureOptions getAzureOptions() {
    return azureOptions;
  }

  public GenerateTemporaryServiceCredentialRequest setCredentialName(String credentialName) {
    this.credentialName = credentialName;
    return this;
  }

  public String getCredentialName() {
    return credentialName;
  }

  public GenerateTemporaryServiceCredentialRequest setGcpOptions(
      GenerateTemporaryServiceCredentialGcpOptions gcpOptions) {
    this.gcpOptions = gcpOptions;
    return this;
  }

  public GenerateTemporaryServiceCredentialGcpOptions getGcpOptions() {
    return gcpOptions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenerateTemporaryServiceCredentialRequest that = (GenerateTemporaryServiceCredentialRequest) o;
    return Objects.equals(azureOptions, that.azureOptions)
        && Objects.equals(credentialName, that.credentialName)
        && Objects.equals(gcpOptions, that.gcpOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(azureOptions, credentialName, gcpOptions);
  }

  @Override
  public String toString() {
    return new ToStringer(GenerateTemporaryServiceCredentialRequest.class)
        .add("azureOptions", azureOptions)
        .add("credentialName", credentialName)
        .add("gcpOptions", gcpOptions)
        .toString();
  }

  GenerateTemporaryServiceCredentialRequestPb toPb() {
    GenerateTemporaryServiceCredentialRequestPb pb =
        new GenerateTemporaryServiceCredentialRequestPb();
    pb.setAzureOptions(azureOptions);
    pb.setCredentialName(credentialName);
    pb.setGcpOptions(gcpOptions);

    return pb;
  }

  static GenerateTemporaryServiceCredentialRequest fromPb(
      GenerateTemporaryServiceCredentialRequestPb pb) {
    GenerateTemporaryServiceCredentialRequest model =
        new GenerateTemporaryServiceCredentialRequest();
    model.setAzureOptions(pb.getAzureOptions());
    model.setCredentialName(pb.getCredentialName());
    model.setGcpOptions(pb.getGcpOptions());

    return model;
  }

  public static class GenerateTemporaryServiceCredentialRequestSerializer
      extends JsonSerializer<GenerateTemporaryServiceCredentialRequest> {
    @Override
    public void serialize(
        GenerateTemporaryServiceCredentialRequest value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      GenerateTemporaryServiceCredentialRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GenerateTemporaryServiceCredentialRequestDeserializer
      extends JsonDeserializer<GenerateTemporaryServiceCredentialRequest> {
    @Override
    public GenerateTemporaryServiceCredentialRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GenerateTemporaryServiceCredentialRequestPb pb =
          mapper.readValue(p, GenerateTemporaryServiceCredentialRequestPb.class);
      return GenerateTemporaryServiceCredentialRequest.fromPb(pb);
    }
  }
}
