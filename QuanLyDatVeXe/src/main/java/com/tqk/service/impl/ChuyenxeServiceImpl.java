/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tqk.service.impl;

import com.tqk.pojo.Chuyenxe;
import com.tqk.repository.ChuyenXeRepository;
import com.tqk.service.ChuyenxeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ADMIN
 */

@Service
public class ChuyenxeServiceImpl implements ChuyenxeService{

    @Autowired
    private ChuyenXeRepository repo;
    
    @Override
    public List<Chuyenxe> getCX() {
        return this.repo.getCX();
    }
    
}
