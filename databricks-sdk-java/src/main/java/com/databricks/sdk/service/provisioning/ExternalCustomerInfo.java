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

@Generated
@JsonSerialize(using = ExternalCustomerInfo.ExternalCustomerInfoSerializer.class)
@JsonDeserialize(using = ExternalCustomerInfo.ExternalCustomerInfoDeserializer.class)
public class ExternalCustomerInfo {
  /** Email of the authoritative user. */
  private String authoritativeUserEmail;

  /** The authoritative user full name. */
  private String authoritativeUserFullName;

  /** The legal entity name for the external workspace */
  private String customerName;

  public ExternalCustomerInfo setAuthoritativeUserEmail(String authoritativeUserEmail) {
    this.authoritativeUserEmail = authoritativeUserEmail;
    return this;
  }

  public String getAuthoritativeUserEmail() {
    return authoritativeUserEmail;
  }

  public ExternalCustomerInfo setAuthoritativeUserFullName(String authoritativeUserFullName) {
    this.authoritativeUserFullName = authoritativeUserFullName;
    return this;
  }

  public String getAuthoritativeUserFullName() {
    return authoritativeUserFullName;
  }

  public ExternalCustomerInfo setCustomerName(String customerName) {
    this.customerName = customerName;
    return this;
  }

  public String getCustomerName() {
    return customerName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExternalCustomerInfo that = (ExternalCustomerInfo) o;
    return Objects.equals(authoritativeUserEmail, that.authoritativeUserEmail)
        && Objects.equals(authoritativeUserFullName, that.authoritativeUserFullName)
        && Objects.equals(customerName, that.customerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authoritativeUserEmail, authoritativeUserFullName, customerName);
  }

  @Override
  public String toString() {
    return new ToStringer(ExternalCustomerInfo.class)
        .add("authoritativeUserEmail", authoritativeUserEmail)
        .add("authoritativeUserFullName", authoritativeUserFullName)
        .add("customerName", customerName)
        .toString();
  }

  ExternalCustomerInfoPb toPb() {
    ExternalCustomerInfoPb pb = new ExternalCustomerInfoPb();
    pb.setAuthoritativeUserEmail(authoritativeUserEmail);
    pb.setAuthoritativeUserFullName(authoritativeUserFullName);
    pb.setCustomerName(customerName);

    return pb;
  }

  static ExternalCustomerInfo fromPb(ExternalCustomerInfoPb pb) {
    ExternalCustomerInfo model = new ExternalCustomerInfo();
    model.setAuthoritativeUserEmail(pb.getAuthoritativeUserEmail());
    model.setAuthoritativeUserFullName(pb.getAuthoritativeUserFullName());
    model.setCustomerName(pb.getCustomerName());

    return model;
  }

  public static class ExternalCustomerInfoSerializer extends JsonSerializer<ExternalCustomerInfo> {
    @Override
    public void serialize(
        ExternalCustomerInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ExternalCustomerInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ExternalCustomerInfoDeserializer
      extends JsonDeserializer<ExternalCustomerInfo> {
    @Override
    public ExternalCustomerInfo deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ExternalCustomerInfoPb pb = mapper.readValue(p, ExternalCustomerInfoPb.class);
      return ExternalCustomerInfo.fromPb(pb);
    }
  }
}
