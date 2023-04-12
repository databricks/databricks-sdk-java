package com.databricks.sdk.client;

import java.util.HashMap;
import java.util.Map;

public class AzureEnvironment {
    private String name;
    private String serviceManagementEndpoint;
    private String resourceManagerEndpoint;
    private String activeDirectoryEndpoint;

    public AzureEnvironment(String name, String serviceManagementEndpoint, String resourceManagerEndpoint,
                            String activeDirectoryEndpoint) {
        this.name = name;
        this.serviceManagementEndpoint = serviceManagementEndpoint;
        this.resourceManagerEndpoint = resourceManagerEndpoint;
        this.activeDirectoryEndpoint = activeDirectoryEndpoint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getServiceManagementEndpoint() {
        return serviceManagementEndpoint;
    }

    public void setServiceManagementEndpoint(String serviceManagementEndpoint) {
        this.serviceManagementEndpoint = serviceManagementEndpoint;
    }

    public String getResourceManagerEndpoint() {
        return resourceManagerEndpoint;
    }

    public void setResourceManagerEndpoint(String resourceManagerEndpoint) {
        this.resourceManagerEndpoint = resourceManagerEndpoint;
    }

    public String getActiveDirectoryEndpoint() {
        return activeDirectoryEndpoint;
    }

    public void setActiveDirectoryEndpoint(String activeDirectoryEndpoint) {
        this.activeDirectoryEndpoint = activeDirectoryEndpoint;
    }

    public static final String ARM_DATABRICKS_RESOURCE_ID = "2ff814a6-3304-4ab8-85cb-cd0e6f879c1d";

    private static final Map<String, AzureEnvironment> ENVIRONMENTS;

    static {
        ENVIRONMENTS = new HashMap<>();
        ENVIRONMENTS.put("PUBLIC", new AzureEnvironment("AzurePublicCloud",
                "https://management.core.windows.net/",
                "https://management.azure.com/",
                "https://login.microsoftonline.com/"));
        ENVIRONMENTS.put("GERMAN", new AzureEnvironment("AzureGermanCloud",
                "https://management.core.cloudapi.de/",
                "https://management.microsoftazure.de/",
                "https://login.microsoftonline.de/"));
        ENVIRONMENTS.put("USGOVERNMENT", new AzureEnvironment("AzureUSGovernmentCloud",
                "https://management.core.usgovcloudapi.net/",
                "https://management.usgovcloudapi.net/",
                "https://login.microsoftonline.us/"));
        ENVIRONMENTS.put("CHINA", new AzureEnvironment("AzureChinaCloud",
                "https://management.core.chinacloudapi.cn/",
                "https://management.chinacloudapi.cn/",
                "https://login.chinacloudapi.cn/"));
    }

    public static AzureEnvironment getEnvironment(String env) {
        if (!ENVIRONMENTS.containsKey(env)) {
            throw new IllegalArgumentException("Cannot find Azure " + env + " Environment");
        }

        return ENVIRONMENTS.get(env);
    }
}
