// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.Generated;

/**
 * These APIs manage account federation policies.
 *
 * <p>Account federation policies allow users and service principals in your Databricks account to
 * securely access Databricks APIs using tokens from your trusted identity providers (IdPs).
 *
 * <p>With token federation, your users and service principals can exchange tokens from your IdP for
 * Databricks OAuth tokens, which can be used to access Databricks APIs. Token federation eliminates
 * the need to manage Databricks secrets, and allows you to centralize management of token issuance
 * policies in your IdP. Databricks token federation is typically used in combination with [SCIM],
 * so users in your IdP are synchronized into your Databricks account.
 *
 * <p>Token federation is configured in your Databricks account using an account federation policy.
 * An account federation policy specifies: * which IdP, or issuer, your Databricks account should
 * accept tokens from * how to determine which Databricks user, or subject, a token is issued for
 *
 * <p>To configure a federation policy, you provide the following: * The required token __issuer__,
 * as specified in the “iss” claim of your tokens. The issuer is an https URL that identifies your
 * IdP. * The allowed token __audiences__, as specified in the “aud” claim of your tokens. This
 * identifier is intended to represent the recipient of the token. As long as the audience in the
 * token matches at least one audience in the policy, the token is considered a match. If
 * unspecified, the default value is your Databricks account id. * The __subject claim__, which
 * indicates which token claim contains the Databricks username of the user the token was issued
 * for. If unspecified, the default value is “sub”. * Optionally, the public keys used to validate
 * the signature of your tokens, in JWKS format. If unspecified (recommended), Databricks
 * automatically fetches the public keys from your issuer’s well known endpoint. Databricks strongly
 * recommends relying on your issuer’s well known endpoint for discovering public keys.
 *
 * <p>An example federation policy is: ``` issuer: "https://idp.mycompany.com/oidc" audiences:
 * ["databricks"] subject_claim: "sub" ```
 *
 * <p>An example JWT token body that matches this policy and could be used to authenticate to
 * Databricks as user `username@mycompany.com` is: ``` { "iss": "https://idp.mycompany.com/oidc",
 * "aud": "databricks", "sub": "username@mycompany.com" } ```
 *
 * <p>You may also need to configure your IdP to generate tokens for your users to exchange with
 * Databricks, if your users do not already have the ability to generate tokens that are compatible
 * with your federation policy.
 *
 * <p>You do not need to configure an OAuth application in Databricks to use token federation.
 *
 * <p>[SCIM]: https://docs.databricks.com/admin/users-groups/scim/index.html
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface AccountFederationPolicyService {
  /** Create account federation policy. */
  FederationPolicy create(
      CreateAccountFederationPolicyRequest createAccountFederationPolicyRequest);

  /** Delete account federation policy. */
  void delete(DeleteAccountFederationPolicyRequest deleteAccountFederationPolicyRequest);

  /** Get account federation policy. */
  FederationPolicy get(GetAccountFederationPolicyRequest getAccountFederationPolicyRequest);

  /** List account federation policies. */
  ListFederationPoliciesResponse list(
      ListAccountFederationPoliciesRequest listAccountFederationPoliciesRequest);

  /** Update account federation policy. */
  FederationPolicy update(
      UpdateAccountFederationPolicyRequest updateAccountFederationPolicyRequest);
}
