// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.scim;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class Name {
    /**
     * Family name of the Databricks user.
     */
    @JsonProperty("familyName")
    private String familyName;
    
    /**
     * Given name of the Databricks user.
     */
    @JsonProperty("givenName")
    private String givenName;
    
    public Name setFamilyName(String familyName) {
        this.familyName = familyName;
        return this;
    }

    public String getFamilyName() {
        return familyName;
    }
    
    public Name setGivenName(String givenName) {
        this.givenName = givenName;
        return this;
    }

    public String getGivenName() {
        return givenName;
    }
    
}
