package com.admin.goodsonline.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.admin.goodsonline.dao.PacketDao;
import com.admin.goodsonline.service.PacketService;

import javax.annotation.Resource;

@Transactional
@Service("packetService")
public class PacketServiceImpl implements PacketService {

    @Resource
    private PacketDao packetDao;

    public Integer findPacketByUid(Integer uid) {
        return packetDao.findByUid(uid);
    }
}
