package br.com.brunasouza.servicex.pagamento.repositories;

import br.com.brunasouza.servicex.pagamento.domain.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {
}
