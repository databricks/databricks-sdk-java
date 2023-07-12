// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.compute;

import java.util.Collection;
import java.util.Map;

import com.databricks.sdk.support.Generated;

/**
 * View available policy families. A policy family contains a policy definition
 * providing best practices for configuring clusters for a particular use case.
 * 
 * Databricks manages and provides policy families for several common cluster
 * use cases. You cannot create, edit, or delete policy families.
 * 
 * Policy families cannot be used directly to create clusters. Instead, you
 * create cluster policies using a policy family. Cluster policies created using
 * a policy family inherit the policy family's policy definition.
 *
 * This is the high-level interface, that contains generated methods.
 *
 * Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface PolicyFamiliesService {
	/**
   * Get policy family information.
   * 
   * Retrieve the information for an policy family based on its identifier.
   */
  PolicyFamily get(GetPolicyFamilyRequest getPolicyFamilyRequest);
  
	/**
   * List policy families.
   * 
   * Retrieve a list of policy families. This API is paginated.
   */
  ListPolicyFamiliesResponse list(ListPolicyFamiliesRequest listPolicyFamiliesRequest);
  
}