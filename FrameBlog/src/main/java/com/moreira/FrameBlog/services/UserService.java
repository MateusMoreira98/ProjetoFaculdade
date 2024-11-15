package com.moreira.FrameBlog.services;

import com.moreira.FrameBlog.models.User;
import java.util.List;

public interface UserService {
    User save(final User user);

    List<User> getAll();

    User get(final Long id);

    User update(final Long id, User user);

    void delete(final Long id);
}
