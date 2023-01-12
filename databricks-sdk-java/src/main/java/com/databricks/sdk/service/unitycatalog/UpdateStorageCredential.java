// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class UpdateStorageCredential {
    /**
     * The AWS IAM role configuration.
     */
    @JsonProperty("aws_iam_role")
    private AwsIamRole awsIamRole;
    
    /**
     * The Azure service principal configuration.
     */
    @JsonProperty("azure_service_principal")
    private AzureServicePrincipal azureServicePrincipal;
    
    /**
     * Comment associated with the credential.
     */
    @JsonProperty("comment")
    private String comment;
    
    /**
     * The GCP service account key configuration.
     */
    @JsonProperty("gcp_service_account_key")
    private GcpServiceAccountKey gcpServiceAccountKey;
    
    /**
     * The credential name. The name MUST be unique within the Metastore.
     */
    @JsonProperty("name")
    private String name;
    
    /**
     * Username of current owner of credential.
     */
    @JsonProperty("owner")
    private String owner;
    
    public UpdateStorageCredential setAwsIamRole(AwsIamRole awsIamRole) {
        this.awsIamRole = awsIamRole;
        return this;
    }

    public AwsIamRole getAwsIamRole() {
        return awsIamRole;
    }
    
    public UpdateStorageCredential setAzureServicePrincipal(AzureServicePrincipal azureServicePrincipal) {
        this.azureServicePrincipal = azureServicePrincipal;
        return this;
    }

    public AzureServicePrincipal getAzureServicePrincipal() {
        return azureServicePrincipal;
    }
    
    public UpdateStorageCredential setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public String getComment() {
        return comment;
    }
    
    public UpdateStorageCredential setGcpServiceAccountKey(GcpServiceAccountKey gcpServiceAccountKey) {
        this.gcpServiceAccountKey = gcpServiceAccountKey;
        return this;
    }

    public GcpServiceAccountKey getGcpServiceAccountKey() {
        return gcpServiceAccountKey;
    }
    
    public UpdateStorageCredential setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public UpdateStorageCredential setOwner(String owner) {
        this.owner = owner;
        return this;
    }

    public String getOwner() {
        return owner;
    }
    
}
