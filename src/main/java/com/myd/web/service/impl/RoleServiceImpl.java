package com.myd.web.service.impl;

import java.util.List;
import javax.annotation.Resource;

import com.myd.core.generic.GenericDao;
import com.myd.web.dao.RoleMapper;
import com.myd.web.model.Role;
import com.myd.web.service.RoleService;
import org.springframework.stereotype.Service;
import com.myd.core.generic.GenericServiceImpl;

/**
 * 角色Service实现类
 *
 * @author StarZou
 * @since 2014年6月10日 下午4:16:33
 */
@Service
public class RoleServiceImpl extends GenericServiceImpl<Role, Long> implements RoleService {

    @Resource
    private RoleMapper roleMapper;

    @Override
    public GenericDao<Role, Long> getDao() {
        return roleMapper;
    }

    @Override
    public List<Role> selectRolesByUserId(Long userId) {
        return roleMapper.selectRolesByUserId(userId);
    }

}
