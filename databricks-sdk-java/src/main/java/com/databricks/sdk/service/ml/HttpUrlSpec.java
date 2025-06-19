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
@JsonSerialize(using = HttpUrlSpec.HttpUrlSpecSerializer.class)
@JsonDeserialize(using = HttpUrlSpec.HttpUrlSpecDeserializer.class)
public class HttpUrlSpec {
  /**
   * Value of the authorization header that should be sent in the request sent by the wehbook. It
   * should be of the form `"<auth type> <credentials>"`. If set to an empty string, no
   * authorization header will be included in the request.
   */
  private String authorization;

  /**
   * Enable/disable SSL certificate validation. Default is true. For self-signed certificates, this
   * field must be false AND the destination server must disable certificate validation as well. For
   * security purposes, it is encouraged to perform secret validation with the HMAC-encoded portion
   * of the payload and acknowledge the risk associated with disabling hostname validation whereby
   * it becomes more likely that requests can be maliciously routed to an unintended host.
   */
  private Boolean enableSslVerification;

  /**
   * Shared secret required for HMAC encoding payload. The HMAC-encoded payload will be sent in the
   * header as: { "X-Databricks-Signature": $encoded_payload }.
   */
  private String secret;

  /** External HTTPS URL called on event trigger (by using a POST request). */
  private String url;

  public HttpUrlSpec setAuthorization(String authorization) {
    this.authorization = authorization;
    return this;
  }

  public String getAuthorization() {
    return authorization;
  }

  public HttpUrlSpec setEnableSslVerification(Boolean enableSslVerification) {
    this.enableSslVerification = enableSslVerification;
    return this;
  }

  public Boolean getEnableSslVerification() {
    return enableSslVerification;
  }

  public HttpUrlSpec setSecret(String secret) {
    this.secret = secret;
    return this;
  }

  public String getSecret() {
    return secret;
  }

  public HttpUrlSpec setUrl(String url) {
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
    HttpUrlSpec that = (HttpUrlSpec) o;
    return Objects.equals(authorization, that.authorization)
        && Objects.equals(enableSslVerification, that.enableSslVerification)
        && Objects.equals(secret, that.secret)
        && Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorization, enableSslVerification, secret, url);
  }

  @Override
  public String toString() {
    return new ToStringer(HttpUrlSpec.class)
        .add("authorization", authorization)
        .add("enableSslVerification", enableSslVerification)
        .add("secret", secret)
        .add("url", url)
        .toString();
  }

  HttpUrlSpecPb toPb() {
    HttpUrlSpecPb pb = new HttpUrlSpecPb();
    pb.setAuthorization(authorization);
    pb.setEnableSslVerification(enableSslVerification);
    pb.setSecret(secret);
    pb.setUrl(url);

    return pb;
  }

  static HttpUrlSpec fromPb(HttpUrlSpecPb pb) {
    HttpUrlSpec model = new HttpUrlSpec();
    model.setAuthorization(pb.getAuthorization());
    model.setEnableSslVerification(pb.getEnableSslVerification());
    model.setSecret(pb.getSecret());
    model.setUrl(pb.getUrl());

    return model;
  }

  public static class HttpUrlSpecSerializer extends JsonSerializer<HttpUrlSpec> {
    @Override
    public void serialize(HttpUrlSpec value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      HttpUrlSpecPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class HttpUrlSpecDeserializer extends JsonDeserializer<HttpUrlSpec> {
    @Override
    public HttpUrlSpec deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      HttpUrlSpecPb pb = mapper.readValue(p, HttpUrlSpecPb.class);
      return HttpUrlSpec.fromPb(pb);
    }
  }
}
