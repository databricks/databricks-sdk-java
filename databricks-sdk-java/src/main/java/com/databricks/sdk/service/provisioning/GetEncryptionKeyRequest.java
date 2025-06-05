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

/** Get encryption key configuration */
@Generated
@JsonSerialize(using = GetEncryptionKeyRequest.GetEncryptionKeyRequestSerializer.class)
@JsonDeserialize(using = GetEncryptionKeyRequest.GetEncryptionKeyRequestDeserializer.class)
public class GetEncryptionKeyRequest {
  /** Databricks encryption key configuration ID. */
  private String customerManagedKeyId;

  public GetEncryptionKeyRequest setCustomerManagedKeyId(String customerManagedKeyId) {
    this.customerManagedKeyId = customerManagedKeyId;
    return this;
  }

  public String getCustomerManagedKeyId() {
    return customerManagedKeyId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetEncryptionKeyRequest that = (GetEncryptionKeyRequest) o;
    return Objects.equals(customerManagedKeyId, that.customerManagedKeyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerManagedKeyId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetEncryptionKeyRequest.class)
        .add("customerManagedKeyId", customerManagedKeyId)
        .toString();
  }

  GetEncryptionKeyRequestPb toPb() {
    GetEncryptionKeyRequestPb pb = new GetEncryptionKeyRequestPb();
    pb.setCustomerManagedKeyId(customerManagedKeyId);

    return pb;
  }

  static GetEncryptionKeyRequest fromPb(GetEncryptionKeyRequestPb pb) {
    GetEncryptionKeyRequest model = new GetEncryptionKeyRequest();
    model.setCustomerManagedKeyId(pb.getCustomerManagedKeyId());

    return model;
  }

  public static class GetEncryptionKeyRequestSerializer
      extends JsonSerializer<GetEncryptionKeyRequest> {
    @Override
    public void serialize(
        GetEncryptionKeyRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetEncryptionKeyRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetEncryptionKeyRequestDeserializer
      extends JsonDeserializer<GetEncryptionKeyRequest> {
    @Override
    public GetEncryptionKeyRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetEncryptionKeyRequestPb pb = mapper.readValue(p, GetEncryptionKeyRequestPb.class);
      return GetEncryptionKeyRequest.fromPb(pb);
    }
  }
}
