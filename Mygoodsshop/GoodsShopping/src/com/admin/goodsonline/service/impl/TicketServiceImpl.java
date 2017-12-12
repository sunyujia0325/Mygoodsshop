package com.admin.goodsonline.service.impl;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.admin.goodsonline.dao.TicketDao;
import com.admin.goodsonline.service.TicketService;

import javax.annotation.Resource;

@Transactional
@Service("ticketService")
public class TicketServiceImpl implements TicketService {

    @Resource
    private TicketDao ticketDao;


    public Integer findTicketByCid(Integer cid) {
        return ticketDao.findTicketByCid(cid);
//        return ticketDao.get(cid);
    }

}
