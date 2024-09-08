package com.gv.MClientes.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gv.MClientes.entity.Cliente;

@Repository
public interface IClienteRepository extends JpaRepository<Cliente, Long>{

}
