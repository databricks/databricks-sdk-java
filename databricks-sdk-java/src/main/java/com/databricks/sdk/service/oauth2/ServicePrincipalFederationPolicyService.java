// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.Generated;

/**
 * These APIs manage service principal federation policies.
 *
 * <p>Service principal federation, also known as Workload Identity Federation, allows your
 * automated workloads running outside of Databricks to securely access Databricks APIs without the
 * need for Databricks secrets. With Workload Identity Federation, your application (or workload)
 * authenticates to Databricks as a Databricks service principal, using tokens provided by the
 * workload runtime.
 *
 * <p>Databricks strongly recommends using Workload Identity Federation to authenticate to
 * Databricks from automated workloads, over alternatives such as OAuth client secrets or Personal
 * Access Tokens, whenever possible. Workload Identity Federation is supported by many popular
 * services, including Github Actions, Azure DevOps, GitLab, Terraform Cloud, and Kubernetes
 * clusters, among others.
 *
 * <p>Workload identity federation is configured in your Databricks account using a service
 * principal federation policy. A service principal federation policy specifies: * which IdP, or
 * issuer, the service principal is allowed to authenticate from * which workload identity, or
 * subject, is allowed to authenticate as the Databricks service principal
 *
 * <p>To configure a federation policy, you provide the following: * The required token __issuer__,
 * as specified in the “iss” claim of workload identity tokens. The issuer is an https URL that
 * identifies the workload identity provider. * The required token __subject__, as specified in the
 * “sub” claim of workload identity tokens. The subject uniquely identifies the workload in the
 * workload runtime environment. * The allowed token __audiences__, as specified in the “aud” claim
 * of workload identity tokens. The audience is intended to represent the recipient of the token. As
 * long as the audience in the token matches at least one audience in the policy, the token is
 * considered a match. If unspecified, the default value is your Databricks account id. *
 * Optionally, the public keys used to validate the signature of the workload identity tokens, in
 * JWKS format. If unspecified (recommended), Databricks automatically fetches the public keys from
 * the issuer’s well known endpoint. Databricks strongly recommends relying on the issuer’s well
 * known endpoint for discovering public keys.
 *
 * <p>An example service principal federation policy, for a Github Actions workload, is: ``` issuer:
 * "https://token.actions.githubusercontent.com" audiences: ["https://github.com/my-github-org"]
 * subject: "repo:my-github-org/my-repo:environment:prod" ```
 *
 * <p>An example JWT token body that matches this policy and could be used to authenticate to
 * Databricks is: ``` { "iss": "https://token.actions.githubusercontent.com", "aud":
 * "https://github.com/my-github-org", "sub": "repo:my-github-org/my-repo:environment:prod" } ```
 *
 * <p>You may also need to configure the workload runtime to generate tokens for your workloads.
 *
 * <p>You do not need to configure an OAuth application in Databricks to use token federation.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface ServicePrincipalFederationPolicyService {
  /** Create service principal federation policy. */
  FederationPolicy create(
      CreateServicePrincipalFederationPolicyRequest createServicePrincipalFederationPolicyRequest);

  /** Delete service principal federation policy. */
  void delete(
      DeleteServicePrincipalFederationPolicyRequest deleteServicePrincipalFederationPolicyRequest);

  /** Get service principal federation policy. */
  FederationPolicy get(
      GetServicePrincipalFederationPolicyRequest getServicePrincipalFederationPolicyRequest);

  /** List service principal federation policies. */
  ListFederationPoliciesResponse list(
      ListServicePrincipalFederationPoliciesRequest listServicePrincipalFederationPoliciesRequest);

  /** Update service principal federation policy. */
  FederationPolicy update(
      UpdateServicePrincipalFederationPolicyRequest updateServicePrincipalFederationPolicyRequest);
}
