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
@JsonSerialize(
    using = AzureKeyVaultSecretScopeMetadata.AzureKeyVaultSecretScopeMetadataSerializer.class)
@JsonDeserialize(
    using = AzureKeyVaultSecretScopeMetadata.AzureKeyVaultSecretScopeMetadataDeserializer.class)
public class AzureKeyVaultSecretScopeMetadata {
  /** The DNS of the KeyVault */
  private String dnsName;

  /** The resource id of the azure KeyVault that user wants to associate the scope with. */
  private String resourceId;

  public AzureKeyVaultSecretScopeMetadata setDnsName(String dnsName) {
    this.dnsName = dnsName;
    return this;
  }

  public String getDnsName() {
    return dnsName;
  }

  public AzureKeyVaultSecretScopeMetadata setResourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  public String getResourceId() {
    return resourceId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AzureKeyVaultSecretScopeMetadata that = (AzureKeyVaultSecretScopeMetadata) o;
    return Objects.equals(dnsName, that.dnsName) && Objects.equals(resourceId, that.resourceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dnsName, resourceId);
  }

  @Override
  public String toString() {
    return new ToStringer(AzureKeyVaultSecretScopeMetadata.class)
        .add("dnsName", dnsName)
        .add("resourceId", resourceId)
        .toString();
  }

  AzureKeyVaultSecretScopeMetadataPb toPb() {
    AzureKeyVaultSecretScopeMetadataPb pb = new AzureKeyVaultSecretScopeMetadataPb();
    pb.setDnsName(dnsName);
    pb.setResourceId(resourceId);

    return pb;
  }

  static AzureKeyVaultSecretScopeMetadata fromPb(AzureKeyVaultSecretScopeMetadataPb pb) {
    AzureKeyVaultSecretScopeMetadata model = new AzureKeyVaultSecretScopeMetadata();
    model.setDnsName(pb.getDnsName());
    model.setResourceId(pb.getResourceId());

    return model;
  }

  public static class AzureKeyVaultSecretScopeMetadataSerializer
      extends JsonSerializer<AzureKeyVaultSecretScopeMetadata> {
    @Override
    public void serialize(
        AzureKeyVaultSecretScopeMetadata value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AzureKeyVaultSecretScopeMetadataPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AzureKeyVaultSecretScopeMetadataDeserializer
      extends JsonDeserializer<AzureKeyVaultSecretScopeMetadata> {
    @Override
    public AzureKeyVaultSecretScopeMetadata deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AzureKeyVaultSecretScopeMetadataPb pb =
          mapper.readValue(p, AzureKeyVaultSecretScopeMetadataPb.class);
      return AzureKeyVaultSecretScopeMetadata.fromPb(pb);
    }
  }
}
