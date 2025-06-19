// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

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
@JsonSerialize(using = SecretScope.SecretScopeSerializer.class)
@JsonDeserialize(using = SecretScope.SecretScopeDeserializer.class)
public class SecretScope {
  /** The type of secret scope backend. */
  private ScopeBackendType backendType;

  /** The metadata for the secret scope if the type is `AZURE_KEYVAULT` */
  private AzureKeyVaultSecretScopeMetadata keyvaultMetadata;

  /** A unique name to identify the secret scope. */
  private String name;

  public SecretScope setBackendType(ScopeBackendType backendType) {
    this.backendType = backendType;
    return this;
  }

  public ScopeBackendType getBackendType() {
    return backendType;
  }

  public SecretScope setKeyvaultMetadata(AzureKeyVaultSecretScopeMetadata keyvaultMetadata) {
    this.keyvaultMetadata = keyvaultMetadata;
    return this;
  }

  public AzureKeyVaultSecretScopeMetadata getKeyvaultMetadata() {
    return keyvaultMetadata;
  }

  public SecretScope setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SecretScope that = (SecretScope) o;
    return Objects.equals(backendType, that.backendType)
        && Objects.equals(keyvaultMetadata, that.keyvaultMetadata)
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backendType, keyvaultMetadata, name);
  }

  @Override
  public String toString() {
    return new ToStringer(SecretScope.class)
        .add("backendType", backendType)
        .add("keyvaultMetadata", keyvaultMetadata)
        .add("name", name)
        .toString();
  }

  SecretScopePb toPb() {
    SecretScopePb pb = new SecretScopePb();
    pb.setBackendType(backendType);
    pb.setKeyvaultMetadata(keyvaultMetadata);
    pb.setName(name);

    return pb;
  }

  static SecretScope fromPb(SecretScopePb pb) {
    SecretScope model = new SecretScope();
    model.setBackendType(pb.getBackendType());
    model.setKeyvaultMetadata(pb.getKeyvaultMetadata());
    model.setName(pb.getName());

    return model;
  }

  public static class SecretScopeSerializer extends JsonSerializer<SecretScope> {
    @Override
    public void serialize(SecretScope value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SecretScopePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SecretScopeDeserializer extends JsonDeserializer<SecretScope> {
    @Override
    public SecretScope deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SecretScopePb pb = mapper.readValue(p, SecretScopePb.class);
      return SecretScope.fromPb(pb);
    }
  }
}
