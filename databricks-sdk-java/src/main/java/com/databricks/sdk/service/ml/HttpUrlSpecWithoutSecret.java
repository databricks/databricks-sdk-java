// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

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
@JsonSerialize(using = HttpUrlSpecWithoutSecret.HttpUrlSpecWithoutSecretSerializer.class)
@JsonDeserialize(using = HttpUrlSpecWithoutSecret.HttpUrlSpecWithoutSecretDeserializer.class)
public class HttpUrlSpecWithoutSecret {
  /**
   * Enable/disable SSL certificate validation. Default is true. For self-signed certificates, this
   * field must be false AND the destination server must disable certificate validation as well. For
   * security purposes, it is encouraged to perform secret validation with the HMAC-encoded portion
   * of the payload and acknowledge the risk associated with disabling hostname validation whereby
   * it becomes more likely that requests can be maliciously routed to an unintended host.
   */
  private Boolean enableSslVerification;

  /** External HTTPS URL called on event trigger (by using a POST request). */
  private String url;

  public HttpUrlSpecWithoutSecret setEnableSslVerification(Boolean enableSslVerification) {
    this.enableSslVerification = enableSslVerification;
    return this;
  }

  public Boolean getEnableSslVerification() {
    return enableSslVerification;
  }

  public HttpUrlSpecWithoutSecret setUrl(String url) {
    this.url = url;
    return this;
  }

  public String getUrl() {
    return url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    HttpUrlSpecWithoutSecret that = (HttpUrlSpecWithoutSecret) o;
    return Objects.equals(enableSslVerification, that.enableSslVerification)
        && Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableSslVerification, url);
  }

  @Override
  public String toString() {
    return new ToStringer(HttpUrlSpecWithoutSecret.class)
        .add("enableSslVerification", enableSslVerification)
        .add("url", url)
        .toString();
  }

  HttpUrlSpecWithoutSecretPb toPb() {
    HttpUrlSpecWithoutSecretPb pb = new HttpUrlSpecWithoutSecretPb();
    pb.setEnableSslVerification(enableSslVerification);
    pb.setUrl(url);

    return pb;
  }

  static HttpUrlSpecWithoutSecret fromPb(HttpUrlSpecWithoutSecretPb pb) {
    HttpUrlSpecWithoutSecret model = new HttpUrlSpecWithoutSecret();
    model.setEnableSslVerification(pb.getEnableSslVerification());
    model.setUrl(pb.getUrl());

    return model;
  }

  public static class HttpUrlSpecWithoutSecretSerializer
      extends JsonSerializer<HttpUrlSpecWithoutSecret> {
    @Override
    public void serialize(
        HttpUrlSpecWithoutSecret value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      HttpUrlSpecWithoutSecretPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class HttpUrlSpecWithoutSecretDeserializer
      extends JsonDeserializer<HttpUrlSpecWithoutSecret> {
    @Override
    public HttpUrlSpecWithoutSecret deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      HttpUrlSpecWithoutSecretPb pb = mapper.readValue(p, HttpUrlSpecWithoutSecretPb.class);
      return HttpUrlSpecWithoutSecret.fromPb(pb);
    }
  }
}
