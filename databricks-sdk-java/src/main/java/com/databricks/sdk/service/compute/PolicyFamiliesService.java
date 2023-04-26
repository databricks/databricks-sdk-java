// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.compute;

/**
 * View available policy families. A policy family contains a policy definition providing best
 * practices for configuring clusters for a particular use case.
 *
 * <p>Databricks manages and provides policy families for several common cluster use cases. You
 * cannot create, edit, or delete policy families.
 *
 * <p>Policy families cannot be used directly to create clusters. Instead, you create cluster
 * policies using a policy family. Cluster policies created using a policy family inherit the policy
 * family's policy definition.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public interface PolicyFamiliesService {

  /**
   * <p>get.</p>
   *
   * @param getPolicyFamilyRequest a {@link com.databricks.sdk.service.compute.GetPolicyFamilyRequest} object
   * @return a {@link com.databricks.sdk.service.compute.PolicyFamily} object
   */
  PolicyFamily get(GetPolicyFamilyRequest getPolicyFamilyRequest);

  /**
   * <p>list.</p>
   *
   * @param listPolicyFamiliesRequest a {@link com.databricks.sdk.service.compute.ListPolicyFamiliesRequest} object
   * @return a {@link com.databricks.sdk.service.compute.ListPolicyFamiliesResponse} object
   */
  ListPolicyFamiliesResponse list(ListPolicyFamiliesRequest listPolicyFamiliesRequest);
}
