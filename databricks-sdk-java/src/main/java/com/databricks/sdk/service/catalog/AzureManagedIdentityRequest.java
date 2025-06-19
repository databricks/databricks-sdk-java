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
@JsonSerialize(using = AzureManagedIdentityRequest.AzureManagedIdentityRequestSerializer.class)
@JsonDeserialize(using = AzureManagedIdentityRequest.AzureManagedIdentityRequestDeserializer.class)
public class AzureManagedIdentityRequest {
  /**
   * The Azure resource ID of the Azure Databricks Access Connector. Use the format
   * /subscriptions/{guid}/resourceGroups/{rg-name}/providers/Microsoft.Databricks/accessConnectors/{connector-name}.
   */
  private String accessConnectorId;

  /**
   * The Azure resource ID of the managed identity. Use the format
   * /subscriptions/{guid}/resourceGroups/{rg-name}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identity-name}.
   * This is only available for user-assgined identities. For system-assigned identities, the
   * access_connector_id is used to identify the identity. If this field is not provided, then we
   * assume the AzureManagedIdentity is for a system-assigned identity.
   */
  private String managedIdentityId;

  public AzureManagedIdentityRequest setAccessConnectorId(String accessConnectorId) {
    this.accessConnectorId = accessConnectorId;
    return this;
  }

  public String getAccessConnectorId() {
    return accessConnectorId;
  }

  public AzureManagedIdentityRequest setManagedIdentityId(String managedIdentityId) {
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
    AzureManagedIdentityRequest that = (AzureManagedIdentityRequest) o;
    return Objects.equals(accessConnectorId, that.accessConnectorId)
        && Objects.equals(managedIdentityId, that.managedIdentityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessConnectorId, managedIdentityId);
  }

  @Override
  public String toString() {
    return new ToStringer(AzureManagedIdentityRequest.class)
        .add("accessConnectorId", accessConnectorId)
        .add("managedIdentityId", managedIdentityId)
        .toString();
  }

  AzureManagedIdentityRequestPb toPb() {
    AzureManagedIdentityRequestPb pb = new AzureManagedIdentityRequestPb();
    pb.setAccessConnectorId(accessConnectorId);
    pb.setManagedIdentityId(managedIdentityId);

    return pb;
  }

  static AzureManagedIdentityRequest fromPb(AzureManagedIdentityRequestPb pb) {
    AzureManagedIdentityRequest model = new AzureManagedIdentityRequest();
    model.setAccessConnectorId(pb.getAccessConnectorId());
    model.setManagedIdentityId(pb.getManagedIdentityId());

    return model;
  }

  public static class AzureManagedIdentityRequestSerializer
      extends JsonSerializer<AzureManagedIdentityRequest> {
    @Override
    public void serialize(
        AzureManagedIdentityRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AzureManagedIdentityRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AzureManagedIdentityRequestDeserializer
      extends JsonDeserializer<AzureManagedIdentityRequest> {
    @Override
    public AzureManagedIdentityRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AzureManagedIdentityRequestPb pb = mapper.readValue(p, AzureManagedIdentityRequestPb.class);
      return AzureManagedIdentityRequest.fromPb(pb);
    }
  }
}
