package cn.itcast.user.service;

import cn.itcast.user.mapper.UtoStorageMapper;
import cn.itcast.user.pojo.UtoStorageEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class UtoStorageService {

    @Autowired
    private UtoStorageMapper utoStorageMapper;

    //@Transactional(value = "utoreTransactionManager",readOnly=true)
    @Transactional
    public List<UtoStorageEntity> queryList() {
        return utoStorageMapper.selectAll();
    }



}
