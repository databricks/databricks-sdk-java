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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(
    using = CreateCustomerManagedKeyRequest.CreateCustomerManagedKeyRequestSerializer.class)
@JsonDeserialize(
    using = CreateCustomerManagedKeyRequest.CreateCustomerManagedKeyRequestDeserializer.class)
public class CreateCustomerManagedKeyRequest {
  /** */
  private CreateAwsKeyInfo awsKeyInfo;

  /** */
  private CreateGcpKeyInfo gcpKeyInfo;

  /** The cases that the key can be used for. */
  private Collection<KeyUseCase> useCases;

  public CreateCustomerManagedKeyRequest setAwsKeyInfo(CreateAwsKeyInfo awsKeyInfo) {
    this.awsKeyInfo = awsKeyInfo;
    return this;
  }

  public CreateAwsKeyInfo getAwsKeyInfo() {
    return awsKeyInfo;
  }

  public CreateCustomerManagedKeyRequest setGcpKeyInfo(CreateGcpKeyInfo gcpKeyInfo) {
    this.gcpKeyInfo = gcpKeyInfo;
    return this;
  }

  public CreateGcpKeyInfo getGcpKeyInfo() {
    return gcpKeyInfo;
  }

  public CreateCustomerManagedKeyRequest setUseCases(Collection<KeyUseCase> useCases) {
    this.useCases = useCases;
    return this;
  }

  public Collection<KeyUseCase> getUseCases() {
    return useCases;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateCustomerManagedKeyRequest that = (CreateCustomerManagedKeyRequest) o;
    return Objects.equals(awsKeyInfo, that.awsKeyInfo)
        && Objects.equals(gcpKeyInfo, that.gcpKeyInfo)
        && Objects.equals(useCases, that.useCases);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awsKeyInfo, gcpKeyInfo, useCases);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateCustomerManagedKeyRequest.class)
        .add("awsKeyInfo", awsKeyInfo)
        .add("gcpKeyInfo", gcpKeyInfo)
        .add("useCases", useCases)
        .toString();
  }

  CreateCustomerManagedKeyRequestPb toPb() {
    CreateCustomerManagedKeyRequestPb pb = new CreateCustomerManagedKeyRequestPb();
    pb.setAwsKeyInfo(awsKeyInfo);
    pb.setGcpKeyInfo(gcpKeyInfo);
    pb.setUseCases(useCases);

    return pb;
  }

  static CreateCustomerManagedKeyRequest fromPb(CreateCustomerManagedKeyRequestPb pb) {
    CreateCustomerManagedKeyRequest model = new CreateCustomerManagedKeyRequest();
    model.setAwsKeyInfo(pb.getAwsKeyInfo());
    model.setGcpKeyInfo(pb.getGcpKeyInfo());
    model.setUseCases(pb.getUseCases());

    return model;
  }

  public static class CreateCustomerManagedKeyRequestSerializer
      extends JsonSerializer<CreateCustomerManagedKeyRequest> {
    @Override
    public void serialize(
        CreateCustomerManagedKeyRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateCustomerManagedKeyRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateCustomerManagedKeyRequestDeserializer
      extends JsonDeserializer<CreateCustomerManagedKeyRequest> {
    @Override
    public CreateCustomerManagedKeyRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateCustomerManagedKeyRequestPb pb =
          mapper.readValue(p, CreateCustomerManagedKeyRequestPb.class);
      return CreateCustomerManagedKeyRequest.fromPb(pb);
    }
  }
}
