// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class WrappedBudget {
    /**
     * Budget configuration to be created.
     */
    @JsonProperty("budget")
    private Budget budget;
    
    /**
     * Budget ID
     */
    
    private String budgetId;
    
    public WrappedBudget setBudget(Budget budget) {
        this.budget = budget;
        return this;
    }

    public Budget getBudget() {
        return budget;
    }
    
    public WrappedBudget setBudgetId(String budgetId) {
        this.budgetId = budgetId;
        return this;
    }

    public String getBudgetId() {
        return budgetId;
    }
    
}
