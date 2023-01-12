// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class Widget {
    /**
     * The unique ID for this widget.
     */
    @JsonProperty("id")
    private Long id;
    
    /**
     
     */
    @JsonProperty("options")
    private WidgetOptions options;
    
    /**
     * The visualization description API changes frequently and is unsupported.
     * You can duplicate a visualization by copying description objects received
     * _from the API_ and then using them to create a new one with a POST
     * request to the same endpoint. Databricks does not recommend constructing
     * ad-hoc visualizations entirely in JSON.
     */
    @JsonProperty("visualization")
    private Visualization visualization;
    
    /**
     * Unused field.
     */
    @JsonProperty("width")
    private Long width;
    
    public Widget setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getId() {
        return id;
    }
    
    public Widget setOptions(WidgetOptions options) {
        this.options = options;
        return this;
    }

    public WidgetOptions getOptions() {
        return options;
    }
    
    public Widget setVisualization(Visualization visualization) {
        this.visualization = visualization;
        return this;
    }

    public Visualization getVisualization() {
        return visualization;
    }
    
    public Widget setWidth(Long width) {
        this.width = width;
        return this;
    }

    public Long getWidth() {
        return width;
    }
    
}
