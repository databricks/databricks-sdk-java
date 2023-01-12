// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * List of budgets.
 */
@Generated("databricks-sdk-generator")
public class BudgetList {
    /**
     
     */
    @JsonProperty("budgets")
    private java.util.List<BudgetWithStatus> budgets;
    
    public BudgetList setBudgets(java.util.List<BudgetWithStatus> budgets) {
        this.budgets = budgets;
        return this;
    }

    public java.util.List<BudgetWithStatus> getBudgets() {
        return budgets;
    }
    
}
