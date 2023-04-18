package com.databricks.sdk;

import com.databricks.sdk.client.DatabricksConfig;
import com.databricks.sdk.client.commons.CommonsHttpClient;
import com.databricks.sdk.client.http.HttpClient;
import com.databricks.sdk.client.oauth.Consent;
import com.databricks.sdk.client.oauth.OAuthClient;
import com.databricks.sdk.client.oauth.RefreshableCredentials;
import com.databricks.sdk.service.clusters.ClusterInfo;

import java.io.IOException;
import java.net.URISyntaxException;

public class App {
    public static void main( String[] args ) throws IOException, URISyntaxException {
        HttpClient hc = new CommonsHttpClient(30);
        String workspaceHost = "https://dbc-ee877747-aacb.cloud.databricks.com/";
        OAuthClient client = new OAuthClient.Builder()
            .withClientId("0oa3yg6ve0T4qvhCY4h7")
            .withClientSecret("")
            .withHost(workspaceHost)
            .withRedirectUrl("http://localhost:8080/callback")
            .withHttpClient(hc)
            .build();
        Consent consent = client.initiateConsent();
        RefreshableCredentials creds = consent.launchExternalBrowser();
        DatabricksConfig config = new DatabricksConfig();
        config.setCredentialsProvider(creds);
        config.setHost(workspaceHost);
        DatabricksWorkspace workspace = new DatabricksWorkspace(config);
        for (ClusterInfo c : workspace.clusters().list(new com.databricks.sdk.service.clusters.List())) {
            System.out.println(c.getClusterName());
        }
    }
}
