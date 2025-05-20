// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * Specifies the policy to use for validating OIDC claims in your federated tokens from Delta
 * Sharing Clients. Refer to https://docs.databricks.com/en/delta-sharing/create-recipient-oidc-fed
 * for more details.
 */
@Generated
public class OidcFederationPolicy {
  /**
   * The allowed token audiences, as specified in the 'aud' claim of federated tokens. The audience
   * identifier is intended to represent the recipient of the token. Can be any non-empty string
   * value. As long as the audience in the token matches at least one audience in the policy,
   */
  @JsonProperty("audiences")
  private Collection<String> audiences;

  /** The required token issuer, as specified in the 'iss' claim of federated tokens. */
  @JsonProperty("issuer")
  private String issuer;

  /**
   * The required token subject, as specified in the subject claim of federated tokens. The value of
   * subject claim identifies the identity of the user or machine that is accessing the resource.
   * For example for Entra ID (AAD) - For U2M flow, when allowing a group of users to access a
   * resource and the subject claim is `groups`, this must be the Object ID of the group in Entra ID
   * - For U2M flow, when allowing a user to access a resource and the subject claim is `oid`, this
   * must be the Object ID of the user in Entra Id. - For M2M flow, when allowing an OAuth App
   * registered to access a resource and the subject claim is `azp`, this must be the client-id of
   * the oauth app registered in Entra ID.
   */
  @JsonProperty("subject")
  private String subject;

  /**
   * The claim that contains the subject of the token. Depending on the identity provider and the
   * use case U2M or M2M, this can be different. For example for Entra ID (AAD) - For U2M flow, when
   * allowing a group of users to access a resource, this must be `groups` - For U2M flow, when
   * allowing a user to access a resource, this must be `oid` - For M2M flow, when allowing an OAuth
   * App registered to access a resource, this must be `azp`
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
}
