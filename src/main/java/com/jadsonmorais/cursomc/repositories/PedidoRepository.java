package com.jadsonmorais.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jadsonmorais.cursomc.domain.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer>{
}
