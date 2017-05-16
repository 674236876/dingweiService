package com.myd.web.service.impl;

import com.myd.core.generic.GenericDao;
import com.myd.core.generic.GenericServiceImpl;
import com.myd.utils.JdbcTemplateUtils;
import com.myd.web.dao.UserMapper;
import com.myd.web.model.User;
import com.myd.web.model.UserExample;
import com.myd.web.service.UserService;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 用户Service实现类
 *
 */
@Service
public class UserServiceImpl extends GenericServiceImpl<User, Long> implements UserService {

    @Resource
    private UserMapper userMapper;

    private JdbcTemplate jdbcTemplate = JdbcTemplateUtils.jdbcTemplate();

    @Override
    public int insert(User model) {
        return userMapper.insertSelective(model);
    }

    @Override
    public int update(User model) {
        return userMapper.updateByPrimaryKeySelective(model);
    }

    @Override
    public int delete(Long id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public User authentication(User user) {
        return userMapper.authentication(user);
    }

    @Override
    public User selectById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public GenericDao<User, Long> getDao() {
        return userMapper;
    }

    @Override
    public User selectByUsername(String username) {
        UserExample example = new UserExample();
        example.createCriteria().andUsernameEqualTo(username);
        final List<User> list = userMapper.selectByExample(example);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public Map selectByLoginName(String loginName, String password) {

        String sql = "select o.optId,o.displayName,e.entid,e.name from operator_info o LEFT JOIN enterprise_info e on o.groupid=e.entid where o.loginName = ? and o.loginPassword = ?";
        List list = jdbcTemplate.queryForList(sql, loginName, password);
        if (list.size() == 0) {
            return null;
        }
        Map map = (Map)list.get(0);
        return map;
    }

    @Override
    public List<User> selectList(){
        return userMapper.selectByExample(null);
    }
}
