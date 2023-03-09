// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The result and lifecycle state of the run.
 */
public class RunState {
    /**
     * A description of a run’s current location in the run lifecycle. This
     * field is always available in the response.
     */
    @JsonProperty("life_cycle_state")
    private RunLifeCycleState lifeCycleState;
    
    /**
     * This describes an enum
     */
    @JsonProperty("result_state")
    private RunResultState resultState;
    
    /**
     * A descriptive message for the current state. This field is unstructured,
     * and its exact format is subject to change.
     */
    @JsonProperty("state_message")
    private String stateMessage;
    
    /**
     * Whether a run was canceled manually by a user or by the scheduler because
     * the run timed out.
     */
    @JsonProperty("user_cancelled_or_timedout")
    private Boolean userCancelledOrTimedout;
    
    public RunState setLifeCycleState(RunLifeCycleState lifeCycleState) {
        this.lifeCycleState = lifeCycleState;
        return this;
    }

    public RunLifeCycleState getLifeCycleState() {
        return lifeCycleState;
    }
    
    public RunState setResultState(RunResultState resultState) {
        this.resultState = resultState;
        return this;
    }

    public RunResultState getResultState() {
        return resultState;
    }
    
    public RunState setStateMessage(String stateMessage) {
        this.stateMessage = stateMessage;
        return this;
    }

    public String getStateMessage() {
        return stateMessage;
    }
    
    public RunState setUserCancelledOrTimedout(Boolean userCancelledOrTimedout) {
        this.userCancelledOrTimedout = userCancelledOrTimedout;
        return this;
    }

    public Boolean getUserCancelledOrTimedout() {
        return userCancelledOrTimedout;
    }
    
}
