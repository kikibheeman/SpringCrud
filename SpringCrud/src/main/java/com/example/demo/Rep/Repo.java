package com.example.demo.Rep;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Model1;



@Repository
public interface Repo extends JpaRepository <Model1,Integer>
{

}
