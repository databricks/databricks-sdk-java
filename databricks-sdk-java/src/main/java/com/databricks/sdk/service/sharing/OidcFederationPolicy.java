// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

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

/**
 * Specifies the policy to use for validating OIDC claims in your federated tokens from Delta
 * Sharing Clients. Refer to https://docs.databricks.com/en/delta-sharing/create-recipient-oidc-fed
 * for more details.
 */
@Generated
@JsonSerialize(using = OidcFederationPolicy.OidcFederationPolicySerializer.class)
@JsonDeserialize(using = OidcFederationPolicy.OidcFederationPolicyDeserializer.class)
public class OidcFederationPolicy {
  /**
   * The allowed token audiences, as specified in the 'aud' claim of federated tokens. The audience
   * identifier is intended to represent the recipient of the token. Can be any non-empty string
   * value. As long as the audience in the token matches at least one audience in the policy,
   */
  private Collection<String> audiences;

  /** The required token issuer, as specified in the 'iss' claim of federated tokens. */
  private String issuer;

  /**
   * The required token subject, as specified in the subject claim of federated tokens. The subject
   * claim identifies the identity of the user or machine accessing the resource. Examples for Entra
   * ID (AAD): - U2M flow (group access): If the subject claim is `groups`, this must be the Object
   * ID of the group in Entra ID. - U2M flow (user access): If the subject claim is `oid`, this must
   * be the Object ID of the user in Entra ID. - M2M flow (OAuth App access): If the subject claim
   * is `azp`, this must be the client ID of the OAuth app registered in Entra ID.
   */
  private String subject;

  /**
   * The claim that contains the subject of the token. Depending on the identity provider and the
   * use case (U2M or M2M), this can vary: - For Entra ID (AAD): * U2M flow (group access): Use
   * `groups`. * U2M flow (user access): Use `oid`. * M2M flow (OAuth App access): Use `azp`. - For
   * other IdPs, refer to the specific IdP documentation.
   *
   * <p>Supported `subject_claim` values are: - `oid`: Object ID of the user. - `azp`: Client ID of
   * the OAuth app. - `groups`: Object ID of the group. - `sub`: Subject identifier for other use
   * cases.
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
        && Objects.equals(subject, that.subject)
        && Objects.equals(subjectClaim, that.subjectClaim);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audiences, issuer, subject, subjectClaim);
  }

  @Override
  public String toString() {
    return new ToStringer(OidcFederationPolicy.class)
        .add("audiences", audiences)
        .add("issuer", issuer)
        .add("subject", subject)
        .add("subjectClaim", subjectClaim)
        .toString();
  }

  OidcFederationPolicyPb toPb() {
    OidcFederationPolicyPb pb = new OidcFederationPolicyPb();
    pb.setAudiences(audiences);
    pb.setIssuer(issuer);
    pb.setSubject(subject);
    pb.setSubjectClaim(subjectClaim);

    return pb;
  }

  static OidcFederationPolicy fromPb(OidcFederationPolicyPb pb) {
    OidcFederationPolicy model = new OidcFederationPolicy();
    model.setAudiences(pb.getAudiences());
    model.setIssuer(pb.getIssuer());
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
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      OidcFederationPolicyPb pb = mapper.readValue(p, OidcFederationPolicyPb.class);
      return OidcFederationPolicy.fromPb(pb);
    }
  }
}
