package com.fatec.PortalTI.Service;

import com.fatec.PortalTI.model.Chamado;
import org.springframework.stereotype.Service;

public interface ChamadoService {

    Iterable<Chamado> buscarTodos();

    Chamado buscarPorId(Long id);

    void inserir(Chamado chamado);

    void atualizar(Long id, Chamado chamado);

    void deletar(Long id);

}

