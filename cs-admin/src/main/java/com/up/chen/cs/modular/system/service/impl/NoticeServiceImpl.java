package com.up.chen.cs.modular.system.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.up.chen.cs.modular.system.dao.NoticeMapper;
import com.up.chen.cs.modular.system.model.Notice;
import com.up.chen.cs.modular.system.service.INoticeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 通知表 服务实现类
 * </p>
 *
 */
@Service
public class NoticeServiceImpl extends ServiceImpl<NoticeMapper, Notice> implements INoticeService {

    @Override
    public List<Map<String, Object>> list(String condition) {
        return this.baseMapper.list(condition);
    }
}
