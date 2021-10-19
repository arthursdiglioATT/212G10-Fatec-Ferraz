package com.fatec.PortalTI.Service;

import com.fatec.PortalTI.Repository.ChamadoRepository;
import com.fatec.PortalTI.model.Chamado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChamadoServiceI {
    @Autowired
    private ChamadoRepository chamadoRepository;

    public String saveChamado(Chamado chamado) {
        chamadoRepository.save(chamado);
        return "";
    }
}
