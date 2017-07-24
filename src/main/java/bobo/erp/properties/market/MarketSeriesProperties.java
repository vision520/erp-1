package bobo.erp.properties.market;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by 59814 on 2017/7/23.
 */
@Component
@ConfigurationProperties(prefix = "marketSeries")
public class MarketSeriesProperties {
    public MarketSeriesProperties() {
    }
    private String marketSeriesName;
    private Integer marketSeriesUseCount;
    private Date marketSeriesAlterTime;
    private String marketSeriesUploader;

    public String getMarketSeriesName() {
        return marketSeriesName;
    }

    public void setMarketSeriesName(String marketSeriesName) {
        this.marketSeriesName = marketSeriesName;
    }

    public Integer getMarketSeriesUseCount() {
        return marketSeriesUseCount;
    }

    public void setMarketSeriesUseCount(Integer marketSeriesUseCount) {
        this.marketSeriesUseCount = marketSeriesUseCount;
    }

    public Date getMarketSeriesAlterTime() {
        return marketSeriesAlterTime;
    }

    public void setMarketSeriesAlterTime(Date marketSeriesAlterTime) {
        this.marketSeriesAlterTime = marketSeriesAlterTime;
    }

    public String getMarketSeriesUploader() {
        return marketSeriesUploader;
    }

    public void setMarketSeriesUploader(String marketSeriesUploader) {
        this.marketSeriesUploader = marketSeriesUploader;
    }
}
