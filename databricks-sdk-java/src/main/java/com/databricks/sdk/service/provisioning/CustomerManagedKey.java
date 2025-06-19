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
@JsonSerialize(using = CustomerManagedKey.CustomerManagedKeySerializer.class)
@JsonDeserialize(using = CustomerManagedKey.CustomerManagedKeyDeserializer.class)
public class CustomerManagedKey {
  /** The Databricks account ID that holds the customer-managed key. */
  private String accountId;

  /** */
  private AwsKeyInfo awsKeyInfo;

  /** Time in epoch milliseconds when the customer key was created. */
  private Long creationTime;

  /** ID of the encryption key configuration object. */
  private String customerManagedKeyId;

  /** */
  private GcpKeyInfo gcpKeyInfo;

  /** The cases that the key can be used for. */
  private Collection<KeyUseCase> useCases;

  public CustomerManagedKey setAccountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  public String getAccountId() {
    return accountId;
  }

  public CustomerManagedKey setAwsKeyInfo(AwsKeyInfo awsKeyInfo) {
    this.awsKeyInfo = awsKeyInfo;
    return this;
  }

  public AwsKeyInfo getAwsKeyInfo() {
    return awsKeyInfo;
  }

  public CustomerManagedKey setCreationTime(Long creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  public Long getCreationTime() {
    return creationTime;
  }

  public CustomerManagedKey setCustomerManagedKeyId(String customerManagedKeyId) {
    this.customerManagedKeyId = customerManagedKeyId;
    return this;
  }

  public String getCustomerManagedKeyId() {
    return customerManagedKeyId;
  }

  public CustomerManagedKey setGcpKeyInfo(GcpKeyInfo gcpKeyInfo) {
    this.gcpKeyInfo = gcpKeyInfo;
    return this;
  }

  public GcpKeyInfo getGcpKeyInfo() {
    return gcpKeyInfo;
  }

  public CustomerManagedKey setUseCases(Collection<KeyUseCase> useCases) {
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
    CustomerManagedKey that = (CustomerManagedKey) o;
    return Objects.equals(accountId, that.accountId)
        && Objects.equals(awsKeyInfo, that.awsKeyInfo)
        && Objects.equals(creationTime, that.creationTime)
        && Objects.equals(customerManagedKeyId, that.customerManagedKeyId)
        && Objects.equals(gcpKeyInfo, that.gcpKeyInfo)
        && Objects.equals(useCases, that.useCases);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId, awsKeyInfo, creationTime, customerManagedKeyId, gcpKeyInfo, useCases);
  }

  @Override
  public String toString() {
    return new ToStringer(CustomerManagedKey.class)
        .add("accountId", accountId)
        .add("awsKeyInfo", awsKeyInfo)
        .add("creationTime", creationTime)
        .add("customerManagedKeyId", customerManagedKeyId)
        .add("gcpKeyInfo", gcpKeyInfo)
        .add("useCases", useCases)
        .toString();
  }

  CustomerManagedKeyPb toPb() {
    CustomerManagedKeyPb pb = new CustomerManagedKeyPb();
    pb.setAccountId(accountId);
    pb.setAwsKeyInfo(awsKeyInfo);
    pb.setCreationTime(creationTime);
    pb.setCustomerManagedKeyId(customerManagedKeyId);
    pb.setGcpKeyInfo(gcpKeyInfo);
    pb.setUseCases(useCases);

    return pb;
  }

  static CustomerManagedKey fromPb(CustomerManagedKeyPb pb) {
    CustomerManagedKey model = new CustomerManagedKey();
    model.setAccountId(pb.getAccountId());
    model.setAwsKeyInfo(pb.getAwsKeyInfo());
    model.setCreationTime(pb.getCreationTime());
    model.setCustomerManagedKeyId(pb.getCustomerManagedKeyId());
    model.setGcpKeyInfo(pb.getGcpKeyInfo());
    model.setUseCases(pb.getUseCases());

    return model;
  }

  public static class CustomerManagedKeySerializer extends JsonSerializer<CustomerManagedKey> {
    @Override
    public void serialize(CustomerManagedKey value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CustomerManagedKeyPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CustomerManagedKeyDeserializer extends JsonDeserializer<CustomerManagedKey> {
    @Override
    public CustomerManagedKey deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CustomerManagedKeyPb pb = mapper.readValue(p, CustomerManagedKeyPb.class);
      return CustomerManagedKey.fromPb(pb);
    }
  }
}
