package com.admin.goodsonline.dao.impl;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.admin.goodsonline.dao.PacketDao;
import com.admin.goodsonline.entity.Packet;

@Repository("packetDao")
@SuppressWarnings("all")

public class PacketDaoImpl extends BaseDaoImpl<Packet> implements PacketDao {

    @Override
    public Integer findByUid(Integer uid) {
//        String hql = "from Packet p where p.uid = ?";
        String hql = "select pacid from Packet p where p.uid = ?";
        Query query = this.getCurrentSession().createQuery(hql);
        query.setParameter(0, uid);
        return (Integer) query.uniqueResult();
    }
}
