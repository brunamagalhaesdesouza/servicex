package br.com.brunasouza.servicex.ordemservico.domain;

import br.com.brunasouza.servicex.pagamento.domain.Pagamento;
import br.com.brunasouza.servicex.servico.domain.Servico;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@Entity
@Table(name = "ORDEMSERVICOS")
public class OrdemServico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idOS;
    @Column(name = "DATA_SOLICITACAO")
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private Data dataSolicitacao;
    @Column(name = "VALOR_OS")
    private Double valorOS;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "ordemservico")
    private Pagamento pagamento;
    @ManyToMany
    @JoinTable(name = "SERVICO_OS",
    joinColumns = @JoinColumn(name = "ID_OS"),
    inverseJoinColumns = @JoinColumn(name = "ID_SERVICO"))
    private Set<Servico> servicos;
}
