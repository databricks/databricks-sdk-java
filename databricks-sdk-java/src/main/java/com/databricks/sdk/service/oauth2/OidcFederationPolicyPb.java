// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Specifies the policy to use for validating OIDC claims in your federated tokens. */
@Generated
class OidcFederationPolicyPb {
  @JsonProperty("audiences")
  private Collection<String> audiences;

  @JsonProperty("issuer")
  private String issuer;

  @JsonProperty("jwks_json")
  private String jwksJson;

  @JsonProperty("jwks_uri")
  private String jwksUri;

  @JsonProperty("subject")
  private String subject;

  @JsonProperty("subject_claim")
  private String subjectClaim;

  public OidcFederationPolicyPb setAudiences(Collection<String> audiences) {
    this.audiences = audiences;
    return this;
  }

  public Collection<String> getAudiences() {
    return audiences;
  }

  public OidcFederationPolicyPb setIssuer(String issuer) {
    this.issuer = issuer;
    return this;
  }

  public String getIssuer() {
    return issuer;
  }

  public OidcFederationPolicyPb setJwksJson(String jwksJson) {
    this.jwksJson = jwksJson;
    return this;
  }

  public String getJwksJson() {
    return jwksJson;
  }

  public OidcFederationPolicyPb setJwksUri(String jwksUri) {
    this.jwksUri = jwksUri;
    return this;
  }

  public String getJwksUri() {
    return jwksUri;
  }

  public OidcFederationPolicyPb setSubject(String subject) {
    this.subject = subject;
    return this;
  }

  public String getSubject() {
    return subject;
  }

  public OidcFederationPolicyPb setSubjectClaim(String subjectClaim) {
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
    OidcFederationPolicyPb that = (OidcFederationPolicyPb) o;
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
    return new ToStringer(OidcFederationPolicyPb.class)
        .add("audiences", audiences)
        .add("issuer", issuer)
        .add("jwksJson", jwksJson)
        .add("jwksUri", jwksUri)
        .add("subject", subject)
        .add("subjectClaim", subjectClaim)
        .toString();
  }
}
