// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.clusterpolicies;

import javax.annotation.Generated;
import java.util.List;
import java.util.Map;

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
@Generated("databricks-sdk-generator")
public interface PolicyFamiliesService {
	
    PolicyFamily get(GetPolicyFamilyRequest getPolicyFamilyRequest);
    
	
    ListPolicyFamiliesResponse list(ListPolicyFamiliesRequest listPolicyFamiliesRequest);
    
}