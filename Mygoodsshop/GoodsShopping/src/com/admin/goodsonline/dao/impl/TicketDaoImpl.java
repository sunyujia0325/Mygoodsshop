package com.admin.goodsonline.dao.impl;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.admin.goodsonline.dao.TicketDao;
import com.admin.goodsonline.entity.Ticket;

@Repository("ticketDao")
@SuppressWarnings("all")
public class TicketDaoImpl extends BaseDaoImpl<Ticket> implements TicketDao {

    @Override
    public Integer findTicketByCid(Integer cid) {

//        String hql = "from Ticket t where t.tid = ?";
        String hql = "select tid from Ticket t where t.cid = ?";
        Query query = this.getCurrentSession().createQuery(hql);
        query.setParameter(0, cid);
        return (Integer) query.uniqueResult();

    }

}
