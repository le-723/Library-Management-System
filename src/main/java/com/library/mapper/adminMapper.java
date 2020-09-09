package com.library.mapper;

import java.util.HashMap;
import java.util.Map;
import com.library.bean.Admin;
import org.apache.ibatis.annotations.Mapper;


public interface adminMapper {
    int getMatchCount(final long admin_id, final String password);

    int resetPassword(final long admin_id, final String password);

    String getPassword(final long admin_id);

    String getUsername(final long admin_id);
}
