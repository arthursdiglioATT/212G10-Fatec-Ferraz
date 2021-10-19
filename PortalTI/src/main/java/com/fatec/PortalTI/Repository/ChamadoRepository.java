package com.fatec.PortalTI.Repository;

import com.fatec.PortalTI.model.Chamado;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Repository
public interface ChamadoRepository extends CrudRepository<Chamado, Long>{

}
