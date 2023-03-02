// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class EffectivePrivilege {
    /**
     * The full name of the object that conveys this privilege via
     * inheritance.\n This field is omitted when privilege is not inherited
     * (it's assigned to the securable itself).
     */
    @JsonProperty("inherited_from_name")
    private String inheritedFromName;
    
    /**
     * The type of the object that conveys this privilege via inheritance.\n
     * This field is omitted when privilege is not inherited (it's assigned to
     * the securable itself).
     */
    @JsonProperty("inherited_from_type")
    private SecurableType inheritedFromType;
    
    /**
     * The privilege assigned to the principal.
     */
    @JsonProperty("privilege")
    private Privilege privilege;
    
    public EffectivePrivilege setInheritedFromName(String inheritedFromName) {
        this.inheritedFromName = inheritedFromName;
        return this;
    }

    public String getInheritedFromName() {
        return inheritedFromName;
    }
    
    public EffectivePrivilege setInheritedFromType(SecurableType inheritedFromType) {
        this.inheritedFromType = inheritedFromType;
        return this;
    }

    public SecurableType getInheritedFromType() {
        return inheritedFromType;
    }
    
    public EffectivePrivilege setPrivilege(Privilege privilege) {
        this.privilege = privilege;
        return this;
    }

    public Privilege getPrivilege() {
        return privilege;
    }
    
}
