// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class GcpServiceAccountKey {
    /**
     * The email of the service account.
     */
    @JsonProperty("email")
    private String email;
    
    /**
     * The service account's RSA private key.
     */
    @JsonProperty("private_key")
    private String privateKey;
    
    /**
     * The ID of the service account's private key.
     */
    @JsonProperty("private_key_id")
    private String privateKeyId;
    
    public GcpServiceAccountKey setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getEmail() {
        return email;
    }
    
    public GcpServiceAccountKey setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    public String getPrivateKey() {
        return privateKey;
    }
    
    public GcpServiceAccountKey setPrivateKeyId(String privateKeyId) {
        this.privateKeyId = privateKeyId;
        return this;
    }

    public String getPrivateKeyId() {
        return privateKeyId;
    }
    
}
