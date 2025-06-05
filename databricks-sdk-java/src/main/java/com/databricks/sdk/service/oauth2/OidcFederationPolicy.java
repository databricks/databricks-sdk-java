// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

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

/** Specifies the policy to use for validating OIDC claims in your federated tokens. */
@Generated
@JsonSerialize(using = OidcFederationPolicy.OidcFederationPolicySerializer.class)
@JsonDeserialize(using = OidcFederationPolicy.OidcFederationPolicyDeserializer.class)
public class OidcFederationPolicy {
  /**
   * The allowed token audiences, as specified in the 'aud' claim of federated tokens. The audience
   * identifier is intended to represent the recipient of the token. Can be any non-empty string
   * value. As long as the audience in the token matches at least one audience in the policy, the
   * token is considered a match. If audiences is unspecified, defaults to your Databricks account
   * id.
   */
  private Collection<String> audiences;

  /** The required token issuer, as specified in the 'iss' claim of federated tokens. */
  private String issuer;

  /**
   * The public keys used to validate the signature of federated tokens, in JWKS format. Most use
   * cases should not need to specify this field. If jwks_uri and jwks_json are both unspecified
   * (recommended), Databricks automatically fetches the public keys from your issuer’s well known
   * endpoint. Databricks strongly recommends relying on your issuer’s well known endpoint for
   * discovering public keys.
   */
  private String jwksJson;

  /**
   * URL of the public keys used to validate the signature of federated tokens, in JWKS format. Most
   * use cases should not need to specify this field. If jwks_uri and jwks_json are both unspecified
   * (recommended), Databricks automatically fetches the public keys from your issuer’s well known
   * endpoint. Databricks strongly recommends relying on your issuer’s well known endpoint for
   * discovering public keys.
   */
  private String jwksUri;

  /**
   * The required token subject, as specified in the subject claim of federated tokens. Must be
   * specified for service principal federation policies. Must not be specified for account
   * federation policies.
   */
  private String subject;

  /**
   * The claim that contains the subject of the token. If unspecified, the default value is 'sub'.
   */
  private String subjectClaim;

  public OidcFederationPolicy setAudiences(Collection<String> audiences) {
    this.audiences = audiences;
    return this;
  }

  public Collection<String> getAudiences() {
    return audiences;
  }

  public OidcFederationPolicy setIssuer(String issuer) {
    this.issuer = issuer;
    return this;
  }

  public String getIssuer() {
    return issuer;
  }

  public OidcFederationPolicy setJwksJson(String jwksJson) {
    this.jwksJson = jwksJson;
    return this;
  }

  public String getJwksJson() {
    return jwksJson;
  }

  public OidcFederationPolicy setJwksUri(String jwksUri) {
    this.jwksUri = jwksUri;
    return this;
  }

  public String getJwksUri() {
    return jwksUri;
  }

  public OidcFederationPolicy setSubject(String subject) {
    this.subject = subject;
    return this;
  }

  public String getSubject() {
    return subject;
  }

  public OidcFederationPolicy setSubjectClaim(String subjectClaim) {
    this.subjectClaim = subjectClaim;
    return this;
  }

  public String getSubjectClaim() {
    return subjectClaim;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OidcFederationPolicy that = (OidcFederationPolicy) o;
    return Objects.equals(audiences, that.audiences)
        && Objects.equals(issuer, that.issuer)
        && Objects.equals(jwksJson, that.jwksJson)
        && Objects.equals(jwksUri, that.jwksUri)
        && Objects.equals(subject, that.subject)
        && Objects.equals(subjectClaim, that.subjectClaim);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audiences, issuer, jwksJson, jwksUri, subject, subjectClaim);
  }

  @Override
  public String toString() {
    return new ToStringer(OidcFederationPolicy.class)
        .add("audiences", audiences)
        .add("issuer", issuer)
        .add("jwksJson", jwksJson)
        .add("jwksUri", jwksUri)
        .add("subject", subject)
        .add("subjectClaim", subjectClaim)
        .toString();
  }

  OidcFederationPolicyPb toPb() {
    OidcFederationPolicyPb pb = new OidcFederationPolicyPb();
    pb.setAudiences(audiences);
    pb.setIssuer(issuer);
    pb.setJwksJson(jwksJson);
    pb.setJwksUri(jwksUri);
    pb.setSubject(subject);
    pb.setSubjectClaim(subjectClaim);

    return pb;
  }

  static OidcFederationPolicy fromPb(OidcFederationPolicyPb pb) {
    OidcFederationPolicy model = new OidcFederationPolicy();
    model.setAudiences(pb.getAudiences());
    model.setIssuer(pb.getIssuer());
    model.setJwksJson(pb.getJwksJson());
    model.setJwksUri(pb.getJwksUri());
    model.setSubject(pb.getSubject());
    model.setSubjectClaim(pb.getSubjectClaim());

    return model;
  }

  public static class OidcFederationPolicySerializer extends JsonSerializer<OidcFederationPolicy> {
    @Override
    public void serialize(
        OidcFederationPolicy value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      OidcFederationPolicyPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class OidcFederationPolicyDeserializer
      extends JsonDeserializer<OidcFederationPolicy> {
    @Override
    public OidcFederationPolicy deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      OidcFederationPolicyPb pb = mapper.readValue(p, OidcFederationPolicyPb.class);
      return OidcFederationPolicy.fromPb(pb);
    }
  }
}
