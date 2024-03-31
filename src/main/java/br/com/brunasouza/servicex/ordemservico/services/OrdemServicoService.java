package br.com.brunasouza.servicex.ordemservico.services;

import br.com.brunasouza.servicex.ordemservico.repositories.OrdemServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdemServicoService {

    @Autowired
    private OrdemServicoRepository ordemServicoRepository;
}
