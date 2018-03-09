package com.axmf.jttest.entity;

/**
 * Created by feng on 2017/11/22.
 */

public  class QABean {
    private String deviceId;
    private String platformId;
    private String queryType;
    private String query;

    public QABean(String deviceId, String platformId, String queryType, String query) {
        this.deviceId = deviceId;
        this.platformId = platformId;
        this.queryType = queryType;
        this.query = query;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    public String getQueryType() {
        return queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }
}
