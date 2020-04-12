package com.webank.wedatasphere.linkis.udf.entity;

import java.util.Objects;

public class UDFCacheKey {
    private String userName;
    private Long treeId;
    private String type;
    private String category;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getTreeId() {
        return treeId;
    }

    public void setTreeId(Long treeId) {
        this.treeId = treeId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public UDFCacheKey(String userName, Long treeId, String type, String category) {
        this.userName = userName;
        this.treeId = treeId;
        this.type = type;
        this.category = category;
    }

    public UDFCacheKey() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UDFCacheKey)) return false;
        UDFCacheKey that = (UDFCacheKey) o;
        return Objects.equals(userName, that.userName) &&
                Objects.equals(treeId, that.treeId) &&
                Objects.equals(type, that.type) &&
                Objects.equals(category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, treeId, type, category);
    }

    @Override
    public String toString() {
        return "UDFCacheKey{" +
                "userName='" + userName + '\'' +
                ", treeId=" + treeId +
                ", type='" + type + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
