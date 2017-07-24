package bobo.erp.properties.rule;

import bobo.erp.domain.rule.Rule;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by 59814 on 2017/7/20.
 */
@Component
@ConfigurationProperties(prefix = "ruleLine")
public class RuleLineProperties {
    public RuleLineProperties() {
    }

    private Rule rule;

    private String line1Name;           //生产线名
    private Double line1UnitInvest;     //单位投资
    private Integer line1InstallTime;   //安装时间
    private Integer line1ProduceTime;   //生产周期
    private Double line1ChangeInvest;   //转产费用，每周期
    private Integer line1ChangeTime;    //转产周期
    private Double line1Upkeep;         //维护费
    private Double line1ScrapValue;     //残值
    private Double line1Depreciation;   //单位周期折旧
    private Integer line1DepreTime;     //折旧周期
    private Integer line1Score;         //潜力分数

    private String line2Name;
    private Double line2UnitInvest;
    private Integer line2InstallTime;
    private Integer line2ProduceTime;
    private Double line2ChangeInvest;
    private Integer line2ChangeTime;
    private Double line2Upkeep;
    private Double line2ScrapValue;
    private Double line2Depreciation;
    private Integer line2DepreTime;
    private Integer line2Score;

    private String line3Name;
    private Double line3UnitInvest;
    private Integer line3InstallTime;
    private Integer line3ProduceTime;
    private Double line3ChangeInvest;
    private Integer line3ChangeTime;
    private Double line3Upkeep;
    private Double line3ScrapValue;
    private Double line3Depreciation;
    private Integer line3DepreTime;
    private Integer line3Score;

    private String line4Name;
    private Double line4UnitInvest;
    private Integer line4InstallTime;
    private Integer line4ProduceTime;
    private Double line4ChangeInvest;
    private Integer line4ChangeTime;
    private Double line4Upkeep;
    private Double line4ScrapValue;
    private Double line4Depreciation;
    private Integer line4DepreTime;
    private Integer line4Score;

    private String line5Name;
    private Double line5UnitInvest;
    private Integer line5InstallTime;
    private Integer line5ProduceTime;
    private Double line5ChangeInvest;
    private Integer line5ChangeTime;
    private Double line5Upkeep;
    private Double line5ScrapValue;
    private Double line5Depreciation;
    private Integer line5DepreTime;
    private Integer line5Score;

    public Rule getRule() {
        return rule;
    }

    public void setRule(Rule rule) {
        this.rule = rule;
    }

    public String getLine1Name() {
        return line1Name;
    }

    public void setLine1Name(String line1Name) {
        this.line1Name = line1Name;
    }

    public Double getLine1UnitInvest() {
        return line1UnitInvest;
    }

    public void setLine1UnitInvest(Double line1UnitInvest) {
        this.line1UnitInvest = line1UnitInvest;
    }

    public Integer getLine1InstallTime() {
        return line1InstallTime;
    }

    public void setLine1InstallTime(Integer line1InstallTime) {
        this.line1InstallTime = line1InstallTime;
    }

    public Integer getLine1ProduceTime() {
        return line1ProduceTime;
    }

    public void setLine1ProduceTime(Integer line1ProduceTime) {
        this.line1ProduceTime = line1ProduceTime;
    }

    public Double getLine1ChangeInvest() {
        return line1ChangeInvest;
    }

    public void setLine1ChangeInvest(Double line1ChangeInvest) {
        this.line1ChangeInvest = line1ChangeInvest;
    }

    public Integer getLine1ChangeTime() {
        return line1ChangeTime;
    }

    public void setLine1ChangeTime(Integer line1ChangeTime) {
        this.line1ChangeTime = line1ChangeTime;
    }

    public Double getLine1Upkeep() {
        return line1Upkeep;
    }

    public void setLine1Upkeep(Double line1Upkeep) {
        this.line1Upkeep = line1Upkeep;
    }

    public Double getLine1ScrapValue() {
        return line1ScrapValue;
    }

    public void setLine1ScrapValue(Double line1ScrapValue) {
        this.line1ScrapValue = line1ScrapValue;
    }

    public Double getLine1Depreciation() {
        return line1Depreciation;
    }

    public void setLine1Depreciation(Double line1Depreciation) {
        this.line1Depreciation = line1Depreciation;
    }

    public Integer getLine1DepreTime() {
        return line1DepreTime;
    }

    public void setLine1DepreTime(Integer line1DepreTime) {
        this.line1DepreTime = line1DepreTime;
    }

    public Integer getLine1Score() {
        return line1Score;
    }

    public void setLine1Score(Integer line1Score) {
        this.line1Score = line1Score;
    }

    public String getLine2Name() {
        return line2Name;
    }

    public void setLine2Name(String line2Name) {
        this.line2Name = line2Name;
    }

    public Double getLine2UnitInvest() {
        return line2UnitInvest;
    }

    public void setLine2UnitInvest(Double line2UnitInvest) {
        this.line2UnitInvest = line2UnitInvest;
    }

    public Integer getLine2InstallTime() {
        return line2InstallTime;
    }

    public void setLine2InstallTime(Integer line2InstallTime) {
        this.line2InstallTime = line2InstallTime;
    }

    public Integer getLine2ProduceTime() {
        return line2ProduceTime;
    }

    public void setLine2ProduceTime(Integer line2ProduceTime) {
        this.line2ProduceTime = line2ProduceTime;
    }

    public Double getLine2ChangeInvest() {
        return line2ChangeInvest;
    }

    public void setLine2ChangeInvest(Double line2ChangeInvest) {
        this.line2ChangeInvest = line2ChangeInvest;
    }

    public Integer getLine2ChangeTime() {
        return line2ChangeTime;
    }

    public void setLine2ChangeTime(Integer line2ChangeTime) {
        this.line2ChangeTime = line2ChangeTime;
    }

    public Double getLine2Upkeep() {
        return line2Upkeep;
    }

    public void setLine2Upkeep(Double line2Upkeep) {
        this.line2Upkeep = line2Upkeep;
    }

    public Double getLine2ScrapValue() {
        return line2ScrapValue;
    }

    public void setLine2ScrapValue(Double line2ScrapValue) {
        this.line2ScrapValue = line2ScrapValue;
    }

    public Double getLine2Depreciation() {
        return line2Depreciation;
    }

    public void setLine2Depreciation(Double line2Depreciation) {
        this.line2Depreciation = line2Depreciation;
    }

    public Integer getLine2DepreTime() {
        return line2DepreTime;
    }

    public void setLine2DepreTime(Integer line2DepreTime) {
        this.line2DepreTime = line2DepreTime;
    }

    public Integer getLine2Score() {
        return line2Score;
    }

    public void setLine2Score(Integer line2Score) {
        this.line2Score = line2Score;
    }

    public String getLine3Name() {
        return line3Name;
    }

    public void setLine3Name(String line3Name) {
        this.line3Name = line3Name;
    }

    public Double getLine3UnitInvest() {
        return line3UnitInvest;
    }

    public void setLine3UnitInvest(Double line3UnitInvest) {
        this.line3UnitInvest = line3UnitInvest;
    }

    public Integer getLine3InstallTime() {
        return line3InstallTime;
    }

    public void setLine3InstallTime(Integer line3InstallTime) {
        this.line3InstallTime = line3InstallTime;
    }

    public Integer getLine3ProduceTime() {
        return line3ProduceTime;
    }

    public void setLine3ProduceTime(Integer line3ProduceTime) {
        this.line3ProduceTime = line3ProduceTime;
    }

    public Double getLine3ChangeInvest() {
        return line3ChangeInvest;
    }

    public void setLine3ChangeInvest(Double line3ChangeInvest) {
        this.line3ChangeInvest = line3ChangeInvest;
    }

    public Integer getLine3ChangeTime() {
        return line3ChangeTime;
    }

    public void setLine3ChangeTime(Integer line3ChangeTime) {
        this.line3ChangeTime = line3ChangeTime;
    }

    public Double getLine3Upkeep() {
        return line3Upkeep;
    }

    public void setLine3Upkeep(Double line3Upkeep) {
        this.line3Upkeep = line3Upkeep;
    }

    public Double getLine3ScrapValue() {
        return line3ScrapValue;
    }

    public void setLine3ScrapValue(Double line3ScrapValue) {
        this.line3ScrapValue = line3ScrapValue;
    }

    public Double getLine3Depreciation() {
        return line3Depreciation;
    }

    public void setLine3Depreciation(Double line3Depreciation) {
        this.line3Depreciation = line3Depreciation;
    }

    public Integer getLine3DepreTime() {
        return line3DepreTime;
    }

    public void setLine3DepreTime(Integer line3DepreTime) {
        this.line3DepreTime = line3DepreTime;
    }

    public Integer getLine3Score() {
        return line3Score;
    }

    public void setLine3Score(Integer line3Score) {
        this.line3Score = line3Score;
    }

    public String getLine4Name() {
        return line4Name;
    }

    public void setLine4Name(String line4Name) {
        this.line4Name = line4Name;
    }

    public Double getLine4UnitInvest() {
        return line4UnitInvest;
    }

    public void setLine4UnitInvest(Double line4UnitInvest) {
        this.line4UnitInvest = line4UnitInvest;
    }

    public Integer getLine4InstallTime() {
        return line4InstallTime;
    }

    public void setLine4InstallTime(Integer line4InstallTime) {
        this.line4InstallTime = line4InstallTime;
    }

    public Integer getLine4ProduceTime() {
        return line4ProduceTime;
    }

    public void setLine4ProduceTime(Integer line4ProduceTime) {
        this.line4ProduceTime = line4ProduceTime;
    }

    public Double getLine4ChangeInvest() {
        return line4ChangeInvest;
    }

    public void setLine4ChangeInvest(Double line4ChangeInvest) {
        this.line4ChangeInvest = line4ChangeInvest;
    }

    public Integer getLine4ChangeTime() {
        return line4ChangeTime;
    }

    public void setLine4ChangeTime(Integer line4ChangeTime) {
        this.line4ChangeTime = line4ChangeTime;
    }

    public Double getLine4Upkeep() {
        return line4Upkeep;
    }

    public void setLine4Upkeep(Double line4Upkeep) {
        this.line4Upkeep = line4Upkeep;
    }

    public Double getLine4ScrapValue() {
        return line4ScrapValue;
    }

    public void setLine4ScrapValue(Double line4ScrapValue) {
        this.line4ScrapValue = line4ScrapValue;
    }

    public Double getLine4Depreciation() {
        return line4Depreciation;
    }

    public void setLine4Depreciation(Double line4Depreciation) {
        this.line4Depreciation = line4Depreciation;
    }

    public Integer getLine4DepreTime() {
        return line4DepreTime;
    }

    public void setLine4DepreTime(Integer line4DepreTime) {
        this.line4DepreTime = line4DepreTime;
    }

    public Integer getLine4Score() {
        return line4Score;
    }

    public void setLine4Score(Integer line4Score) {
        this.line4Score = line4Score;
    }

    public String getLine5Name() {
        return line5Name;
    }

    public void setLine5Name(String line5Name) {
        this.line5Name = line5Name;
    }

    public Double getLine5UnitInvest() {
        return line5UnitInvest;
    }

    public void setLine5UnitInvest(Double line5UnitInvest) {
        this.line5UnitInvest = line5UnitInvest;
    }

    public Integer getLine5InstallTime() {
        return line5InstallTime;
    }

    public void setLine5InstallTime(Integer line5InstallTime) {
        this.line5InstallTime = line5InstallTime;
    }

    public Integer getLine5ProduceTime() {
        return line5ProduceTime;
    }

    public void setLine5ProduceTime(Integer line5ProduceTime) {
        this.line5ProduceTime = line5ProduceTime;
    }

    public Double getLine5ChangeInvest() {
        return line5ChangeInvest;
    }

    public void setLine5ChangeInvest(Double line5ChangeInvest) {
        this.line5ChangeInvest = line5ChangeInvest;
    }

    public Integer getLine5ChangeTime() {
        return line5ChangeTime;
    }

    public void setLine5ChangeTime(Integer line5ChangeTime) {
        this.line5ChangeTime = line5ChangeTime;
    }

    public Double getLine5Upkeep() {
        return line5Upkeep;
    }

    public void setLine5Upkeep(Double line5Upkeep) {
        this.line5Upkeep = line5Upkeep;
    }

    public Double getLine5ScrapValue() {
        return line5ScrapValue;
    }

    public void setLine5ScrapValue(Double line5ScrapValue) {
        this.line5ScrapValue = line5ScrapValue;
    }

    public Double getLine5Depreciation() {
        return line5Depreciation;
    }

    public void setLine5Depreciation(Double line5Depreciation) {
        this.line5Depreciation = line5Depreciation;
    }

    public Integer getLine5DepreTime() {
        return line5DepreTime;
    }

    public void setLine5DepreTime(Integer line5DepreTime) {
        this.line5DepreTime = line5DepreTime;
    }

    public Integer getLine5Score() {
        return line5Score;
    }

    public void setLine5Score(Integer line5Score) {
        this.line5Score = line5Score;
    }
}
