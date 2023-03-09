// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Delete budget
 */
public class DeleteBudgetRequest {
    /**
     * Budget ID
     */
    
    private String budgetId;
    
    public DeleteBudgetRequest setBudgetId(String budgetId) {
        this.budgetId = budgetId;
        return this;
    }

    public String getBudgetId() {
        return budgetId;
    }
    
}
