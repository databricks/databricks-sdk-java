// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class WrappedBudgetWithStatus {
    /**
     * Budget configuration with daily status.
     */
    @JsonProperty("budget")
    private BudgetWithStatus budget;
    
    public WrappedBudgetWithStatus setBudget(BudgetWithStatus budget) {
        this.budget = budget;
        return this;
    }

    public BudgetWithStatus getBudget() {
        return budget;
    }
    
}
