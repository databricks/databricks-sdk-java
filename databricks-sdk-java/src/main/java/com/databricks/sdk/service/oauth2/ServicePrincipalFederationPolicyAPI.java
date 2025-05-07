// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
 */
@Generated
public class ServicePrincipalFederationPolicyAPI {
  private static final Logger LOG =
      LoggerFactory.getLogger(ServicePrincipalFederationPolicyAPI.class);

  private final ServicePrincipalFederationPolicyService impl;

  /** Regular-use constructor */
  public ServicePrincipalFederationPolicyAPI(ApiClient apiClient) {
    impl = new ServicePrincipalFederationPolicyImpl(apiClient);
  }

  /** Constructor for mocks */
  public ServicePrincipalFederationPolicyAPI(ServicePrincipalFederationPolicyService mock) {
    impl = mock;
  }

  public FederationPolicy create(long servicePrincipalId, FederationPolicy policy) {
    return create(
        new CreateServicePrincipalFederationPolicyRequest()
            .setServicePrincipalId(servicePrincipalId)
            .setPolicy(policy));
  }

  /** Create service principal federation policy. */
  public FederationPolicy create(CreateServicePrincipalFederationPolicyRequest request) {
    return impl.create(request);
  }

  public void delete(long servicePrincipalId, String policyId) {
    delete(
        new DeleteServicePrincipalFederationPolicyRequest()
            .setServicePrincipalId(servicePrincipalId)
            .setPolicyId(policyId));
  }

  /** Delete service principal federation policy. */
  public void delete(DeleteServicePrincipalFederationPolicyRequest request) {
    impl.delete(request);
  }

  public FederationPolicy get(long servicePrincipalId, String policyId) {
    return get(
        new GetServicePrincipalFederationPolicyRequest()
            .setServicePrincipalId(servicePrincipalId)
            .setPolicyId(policyId));
  }

  /** Get service principal federation policy. */
  public FederationPolicy get(GetServicePrincipalFederationPolicyRequest request) {
    return impl.get(request);
  }

  public Iterable<FederationPolicy> list(long servicePrincipalId) {
    return list(
        new ListServicePrincipalFederationPoliciesRequest()
            .setServicePrincipalId(servicePrincipalId));
  }

  /** List service principal federation policies. */
  public Iterable<FederationPolicy> list(ListServicePrincipalFederationPoliciesRequest request) {
    return new Paginator<>(
        request,
        impl::list,
        ListFederationPoliciesResponse::getPolicies,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public FederationPolicy update(
      long servicePrincipalId, String policyId, FederationPolicy policy) {
    return update(
        new UpdateServicePrincipalFederationPolicyRequest()
            .setServicePrincipalId(servicePrincipalId)
            .setPolicyId(policyId)
            .setPolicy(policy));
  }

  /** Update service principal federation policy. */
  public FederationPolicy update(UpdateServicePrincipalFederationPolicyRequest request) {
    return impl.update(request);
  }

  public ServicePrincipalFederationPolicyService impl() {
    return impl;
  }
}
