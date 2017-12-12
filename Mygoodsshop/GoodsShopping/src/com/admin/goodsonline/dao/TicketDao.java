package com.admin.goodsonline.dao;

import com.admin.goodsonline.entity.*;

/**
 * Created by Joryun on 2016/11/30.
 */
public interface TicketDao extends BaseDao<Ticket> {

    public Integer findTicketByCid(Integer cid);
}
