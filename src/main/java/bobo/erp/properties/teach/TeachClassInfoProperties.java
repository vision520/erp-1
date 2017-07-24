package bobo.erp.properties.teach;

import bobo.erp.domain.teach.SubUserInfo;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

/**
 * Created by 59814 on 2017/7/23.
 */
@Component
@ConfigurationProperties(prefix = "teachClassInfo")
public class TeachClassInfoProperties {

    public TeachClassInfoProperties() {
    }

    private Integer userId;
    private String teachClassName;
    private Integer teachClassVolume;
    private Integer ruleId;
    private Integer marketSeriesId;
    private List<SubUserInfo> subUserInfoList;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTeachClassName() {
        return teachClassName;
    }

    public void setTeachClassName(String teachClassName) {
        this.teachClassName = teachClassName;
    }

    public Integer getTeachClassVolume() {
        return teachClassVolume;
    }

    public void setTeachClassVolume(Integer teachClassVolume) {
        this.teachClassVolume = teachClassVolume;
    }

    public List<SubUserInfo> getSubUserInfoList() {
        return subUserInfoList;
    }

    public void setSubUserInfoList(List<SubUserInfo> subUserInfoList) {
        this.subUserInfoList = subUserInfoList;
    }

    public Integer getRuleId() {
        return ruleId;
    }

    public void setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
    }

    public Integer getMarketSeriesId() {
        return marketSeriesId;
    }

    public void setMarketSeriesId(Integer marketSeriesId) {
        this.marketSeriesId = marketSeriesId;
    }
}
