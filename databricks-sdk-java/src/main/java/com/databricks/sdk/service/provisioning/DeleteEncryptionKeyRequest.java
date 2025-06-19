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

/** Delete encryption key configuration */
@Generated
@JsonSerialize(using = DeleteEncryptionKeyRequest.DeleteEncryptionKeyRequestSerializer.class)
@JsonDeserialize(using = DeleteEncryptionKeyRequest.DeleteEncryptionKeyRequestDeserializer.class)
public class DeleteEncryptionKeyRequest {
  /** Databricks encryption key configuration ID. */
  private String customerManagedKeyId;

  public DeleteEncryptionKeyRequest setCustomerManagedKeyId(String customerManagedKeyId) {
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
    DeleteEncryptionKeyRequest that = (DeleteEncryptionKeyRequest) o;
    return Objects.equals(customerManagedKeyId, that.customerManagedKeyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerManagedKeyId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteEncryptionKeyRequest.class)
        .add("customerManagedKeyId", customerManagedKeyId)
        .toString();
  }

  DeleteEncryptionKeyRequestPb toPb() {
    DeleteEncryptionKeyRequestPb pb = new DeleteEncryptionKeyRequestPb();
    pb.setCustomerManagedKeyId(customerManagedKeyId);

    return pb;
  }

  static DeleteEncryptionKeyRequest fromPb(DeleteEncryptionKeyRequestPb pb) {
    DeleteEncryptionKeyRequest model = new DeleteEncryptionKeyRequest();
    model.setCustomerManagedKeyId(pb.getCustomerManagedKeyId());

    return model;
  }

  public static class DeleteEncryptionKeyRequestSerializer
      extends JsonSerializer<DeleteEncryptionKeyRequest> {
    @Override
    public void serialize(
        DeleteEncryptionKeyRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteEncryptionKeyRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteEncryptionKeyRequestDeserializer
      extends JsonDeserializer<DeleteEncryptionKeyRequest> {
    @Override
    public DeleteEncryptionKeyRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteEncryptionKeyRequestPb pb = mapper.readValue(p, DeleteEncryptionKeyRequestPb.class);
      return DeleteEncryptionKeyRequest.fromPb(pb);
    }
  }
}
