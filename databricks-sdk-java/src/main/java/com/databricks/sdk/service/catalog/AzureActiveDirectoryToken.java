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

/**
 * Azure Active Directory token, essentially the Oauth token for Azure Service Principal or Managed
 * Identity. Read more at
 * https://learn.microsoft.com/en-us/azure/databricks/dev-tools/api/latest/aad/service-prin-aad-token
 */
@Generated
@JsonSerialize(using = AzureActiveDirectoryToken.AzureActiveDirectoryTokenSerializer.class)
@JsonDeserialize(using = AzureActiveDirectoryToken.AzureActiveDirectoryTokenDeserializer.class)
public class AzureActiveDirectoryToken {
  /**
   * Opaque token that contains claims that you can use in Azure Active Directory to access cloud
   * services.
   */
  private String aadToken;

  public AzureActiveDirectoryToken setAadToken(String aadToken) {
    this.aadToken = aadToken;
    return this;
  }

  public String getAadToken() {
    return aadToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AzureActiveDirectoryToken that = (AzureActiveDirectoryToken) o;
    return Objects.equals(aadToken, that.aadToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aadToken);
  }

  @Override
  public String toString() {
    return new ToStringer(AzureActiveDirectoryToken.class).add("aadToken", aadToken).toString();
  }

  AzureActiveDirectoryTokenPb toPb() {
    AzureActiveDirectoryTokenPb pb = new AzureActiveDirectoryTokenPb();
    pb.setAadToken(aadToken);

    return pb;
  }

  static AzureActiveDirectoryToken fromPb(AzureActiveDirectoryTokenPb pb) {
    AzureActiveDirectoryToken model = new AzureActiveDirectoryToken();
    model.setAadToken(pb.getAadToken());

    return model;
  }

  public static class AzureActiveDirectoryTokenSerializer
      extends JsonSerializer<AzureActiveDirectoryToken> {
    @Override
    public void serialize(
        AzureActiveDirectoryToken value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AzureActiveDirectoryTokenPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AzureActiveDirectoryTokenDeserializer
      extends JsonDeserializer<AzureActiveDirectoryToken> {
    @Override
    public AzureActiveDirectoryToken deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AzureActiveDirectoryTokenPb pb = mapper.readValue(p, AzureActiveDirectoryTokenPb.class);
      return AzureActiveDirectoryToken.fromPb(pb);
    }
  }
}
