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
@JsonSerialize(using = AzureManagedIdentityResponse.AzureManagedIdentityResponseSerializer.class)
@JsonDeserialize(
    using = AzureManagedIdentityResponse.AzureManagedIdentityResponseDeserializer.class)
public class AzureManagedIdentityResponse {
  /**
   * The Azure resource ID of the Azure Databricks Access Connector. Use the format
   * /subscriptions/{guid}/resourceGroups/{rg-name}/providers/Microsoft.Databricks/accessConnectors/{connector-name}.
   */
  private String accessConnectorId;

  /** The Databricks internal ID that represents this managed identity. */
  private String credentialId;

  /**
   * The Azure resource ID of the managed identity. Use the format
   * /subscriptions/{guid}/resourceGroups/{rg-name}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identity-name}.
   * This is only available for user-assgined identities. For system-assigned identities, the
   * access_connector_id is used to identify the identity. If this field is not provided, then we
   * assume the AzureManagedIdentity is for a system-assigned identity.
   */
  private String managedIdentityId;

  public AzureManagedIdentityResponse setAccessConnectorId(String accessConnectorId) {
    this.accessConnectorId = accessConnectorId;
    return this;
  }

  public String getAccessConnectorId() {
    return accessConnectorId;
  }

  public AzureManagedIdentityResponse setCredentialId(String credentialId) {
    this.credentialId = credentialId;
    return this;
  }

  public String getCredentialId() {
    return credentialId;
  }

  public AzureManagedIdentityResponse setManagedIdentityId(String managedIdentityId) {
    this.managedIdentityId = managedIdentityId;
    return this;
  }

  public String getManagedIdentityId() {
    return managedIdentityId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AzureManagedIdentityResponse that = (AzureManagedIdentityResponse) o;
    return Objects.equals(accessConnectorId, that.accessConnectorId)
        && Objects.equals(credentialId, that.credentialId)
        && Objects.equals(managedIdentityId, that.managedIdentityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessConnectorId, credentialId, managedIdentityId);
  }

  @Override
  public String toString() {
    return new ToStringer(AzureManagedIdentityResponse.class)
        .add("accessConnectorId", accessConnectorId)
        .add("credentialId", credentialId)
        .add("managedIdentityId", managedIdentityId)
        .toString();
  }

  AzureManagedIdentityResponsePb toPb() {
    AzureManagedIdentityResponsePb pb = new AzureManagedIdentityResponsePb();
    pb.setAccessConnectorId(accessConnectorId);
    pb.setCredentialId(credentialId);
    pb.setManagedIdentityId(managedIdentityId);

    return pb;
  }

  static AzureManagedIdentityResponse fromPb(AzureManagedIdentityResponsePb pb) {
    AzureManagedIdentityResponse model = new AzureManagedIdentityResponse();
    model.setAccessConnectorId(pb.getAccessConnectorId());
    model.setCredentialId(pb.getCredentialId());
    model.setManagedIdentityId(pb.getManagedIdentityId());

    return model;
  }

  public static class AzureManagedIdentityResponseSerializer
      extends JsonSerializer<AzureManagedIdentityResponse> {
    @Override
    public void serialize(
        AzureManagedIdentityResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AzureManagedIdentityResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AzureManagedIdentityResponseDeserializer
      extends JsonDeserializer<AzureManagedIdentityResponse> {
    @Override
    public AzureManagedIdentityResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AzureManagedIdentityResponsePb pb = mapper.readValue(p, AzureManagedIdentityResponsePb.class);
      return AzureManagedIdentityResponse.fromPb(pb);
    }
  }
}
