package cn.smallbun.screw.core.metadata.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: jie.tang
 * @Date: 2020-07-30 14:51
 * @Desc:
 */
@Data
public class IndexModel implements Serializable {

    private String catalog;

    private String schema;

    private String tableName;

    private boolean nonUnique;

    private String indexName;

    private short type;

    private String columnName;

    private String ascOrDesc;
}
