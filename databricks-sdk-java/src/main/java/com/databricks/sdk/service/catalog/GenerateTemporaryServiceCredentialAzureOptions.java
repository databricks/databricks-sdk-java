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

/** The Azure cloud options to customize the requested temporary credential */
@Generated
@JsonSerialize(
    using =
        GenerateTemporaryServiceCredentialAzureOptions
            .GenerateTemporaryServiceCredentialAzureOptionsSerializer.class)
@JsonDeserialize(
    using =
        GenerateTemporaryServiceCredentialAzureOptions
            .GenerateTemporaryServiceCredentialAzureOptionsDeserializer.class)
public class GenerateTemporaryServiceCredentialAzureOptions {
  /**
   * The resources to which the temporary Azure credential should apply. These resources are the
   * scopes that are passed to the token provider (see
   * https://learn.microsoft.com/python/api/azure-core/azure.core.credentials.tokencredential?view=azure-python)
   */
  private Collection<String> resources;

  public GenerateTemporaryServiceCredentialAzureOptions setResources(Collection<String> resources) {
    this.resources = resources;
    return this;
  }

  public Collection<String> getResources() {
    return resources;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenerateTemporaryServiceCredentialAzureOptions that =
        (GenerateTemporaryServiceCredentialAzureOptions) o;
    return Objects.equals(resources, that.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resources);
  }

  @Override
  public String toString() {
    return new ToStringer(GenerateTemporaryServiceCredentialAzureOptions.class)
        .add("resources", resources)
        .toString();
  }

  GenerateTemporaryServiceCredentialAzureOptionsPb toPb() {
    GenerateTemporaryServiceCredentialAzureOptionsPb pb =
        new GenerateTemporaryServiceCredentialAzureOptionsPb();
    pb.setResources(resources);

    return pb;
  }

  static GenerateTemporaryServiceCredentialAzureOptions fromPb(
      GenerateTemporaryServiceCredentialAzureOptionsPb pb) {
    GenerateTemporaryServiceCredentialAzureOptions model =
        new GenerateTemporaryServiceCredentialAzureOptions();
    model.setResources(pb.getResources());

    return model;
  }

  public static class GenerateTemporaryServiceCredentialAzureOptionsSerializer
      extends JsonSerializer<GenerateTemporaryServiceCredentialAzureOptions> {
    @Override
    public void serialize(
        GenerateTemporaryServiceCredentialAzureOptions value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      GenerateTemporaryServiceCredentialAzureOptionsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GenerateTemporaryServiceCredentialAzureOptionsDeserializer
      extends JsonDeserializer<GenerateTemporaryServiceCredentialAzureOptions> {
    @Override
    public GenerateTemporaryServiceCredentialAzureOptions deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GenerateTemporaryServiceCredentialAzureOptionsPb pb =
          mapper.readValue(p, GenerateTemporaryServiceCredentialAzureOptionsPb.class);
      return GenerateTemporaryServiceCredentialAzureOptions.fromPb(pb);
    }
  }
}
