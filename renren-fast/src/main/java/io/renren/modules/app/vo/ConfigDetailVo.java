package io.renren.modules.app.vo;

import io.renren.modules.app.entity.ActivityConfigEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author liuyd
 * @date 2022/3/30 17:38
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ConfigDetailVo extends ActivityConfigEntity {
    private List<ConfigPrizeVo> prizeList;
}
