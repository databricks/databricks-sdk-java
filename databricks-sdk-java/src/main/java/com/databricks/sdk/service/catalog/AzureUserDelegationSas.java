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
 * Azure temporary credentials for API authentication. Read more at
 * https://docs.microsoft.com/en-us/rest/api/storageservices/create-user-delegation-sas
 */
@Generated
@JsonSerialize(using = AzureUserDelegationSas.AzureUserDelegationSasSerializer.class)
@JsonDeserialize(using = AzureUserDelegationSas.AzureUserDelegationSasDeserializer.class)
public class AzureUserDelegationSas {
  /** The signed URI (SAS Token) used to access blob services for a given path */
  private String sasToken;

  public AzureUserDelegationSas setSasToken(String sasToken) {
    this.sasToken = sasToken;
    return this;
  }

  public String getSasToken() {
    return sasToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AzureUserDelegationSas that = (AzureUserDelegationSas) o;
    return Objects.equals(sasToken, that.sasToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sasToken);
  }

  @Override
  public String toString() {
    return new ToStringer(AzureUserDelegationSas.class).add("sasToken", sasToken).toString();
  }

  AzureUserDelegationSasPb toPb() {
    AzureUserDelegationSasPb pb = new AzureUserDelegationSasPb();
    pb.setSasToken(sasToken);

    return pb;
  }

  static AzureUserDelegationSas fromPb(AzureUserDelegationSasPb pb) {
    AzureUserDelegationSas model = new AzureUserDelegationSas();
    model.setSasToken(pb.getSasToken());

    return model;
  }

  public static class AzureUserDelegationSasSerializer
      extends JsonSerializer<AzureUserDelegationSas> {
    @Override
    public void serialize(
        AzureUserDelegationSas value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AzureUserDelegationSasPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AzureUserDelegationSasDeserializer
      extends JsonDeserializer<AzureUserDelegationSas> {
    @Override
    public AzureUserDelegationSas deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AzureUserDelegationSasPb pb = mapper.readValue(p, AzureUserDelegationSasPb.class);
      return AzureUserDelegationSas.fromPb(pb);
    }
  }
}
