// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class CreateResponse {
    /**
     * Comment details.
     */
    @JsonProperty("comment")
    private CommentObject comment;
    
    public CreateResponse setComment(CommentObject comment) {
        this.comment = comment;
        return this;
    }

    public CommentObject getComment() {
        return comment;
    }
    
}
