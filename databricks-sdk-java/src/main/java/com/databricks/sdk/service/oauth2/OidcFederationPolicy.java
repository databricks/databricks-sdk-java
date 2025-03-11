// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Specifies the policy to use for validating OIDC claims in your federated tokens. */
@Generated
public class OidcFederationPolicy {
  /**
   * The allowed token audiences, as specified in the 'aud' claim of federated tokens. The audience
   * identifier is intended to represent the recipient of the token. Can be any non-empty string
   * value. As long as the audience in the token matches at least one audience in the policy, the
   * token is considered a match. If audiences is unspecified, defaults to your Databricks account
   * id.
   */
  @JsonProperty("audiences")
  private Collection<String> audiences;

  /** The required token issuer, as specified in the 'iss' claim of federated tokens. */
  @JsonProperty("issuer")
  private String issuer;

  /**
   * The public keys used to validate the signature of federated tokens, in JWKS format. Most use
   * cases should not need to specify this field. If jwks_uri and jwks_json are both unspecified
   * (recommended), Databricks automatically fetches the public keys from your issuer’s well known
   * endpoint. Databricks strongly recommends relying on your issuer’s well known endpoint for
   * discovering public keys.
   */
  @JsonProperty("jwks_json")
  private String jwksJson;

  /**
   * The required token subject, as specified in the subject claim of federated tokens. Must be
   * specified for service principal federation policies. Must not be specified for account
   * federation policies.
   */
  @JsonProperty("subject")
  private String subject;

  /**
   * The claim that contains the subject of the token. If unspecified, the default value is 'sub'.
   */
  @JsonProperty("subject_claim")
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
        && Objects.equals(subject, that.subject)
        && Objects.equals(subjectClaim, that.subjectClaim);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audiences, issuer, jwksJson, subject, subjectClaim);
  }

  @Override
  public String toString() {
    return new ToStringer(OidcFederationPolicy.class)
        .add("audiences", audiences)
        .add("issuer", issuer)
        .add("jwksJson", jwksJson)
        .add("subject", subject)
        .add("subjectClaim", subjectClaim)
        .toString();
  }
}
