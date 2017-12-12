package com.admin.goodsonline.dao;

import com.admin.goodsonline.entity.*;

/**
 * Created by Joryun on 2016/11/30.
 */
public interface PacketDao extends BaseDao<Packet> {

    /**
     * 根据uid查询packet对象
     *
     * @param uid
     * @return
     */
    public Integer findByUid(Integer uid);
}
