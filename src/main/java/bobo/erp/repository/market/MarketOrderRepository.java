package bobo.erp.repository.market;

import bobo.erp.domain.market.MarketOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by 59814 on 2017/7/23.
 */
public interface MarketOrderRepository extends JpaRepository<MarketOrder, Integer> {
    public List<MarketOrder> findByMarketSeriesId(Integer seriesId);
}
