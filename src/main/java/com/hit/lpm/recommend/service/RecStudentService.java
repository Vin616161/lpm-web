package com.hit.lpm.recommend.service;

import com.hit.lpm.portrait.model.Student;

import java.util.List;

/**
 * @program: lmp-web
 * @description:
 * @author: zhaoyang
 * @create: 2019-11-4 22:13
 **/
public interface RecStudentService {
    List<Integer> getRandomStudentId(int n);

    List<Student> getRandomStudentInfo();
}
