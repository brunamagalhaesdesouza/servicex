package br.com.brunasouza.servicex.servico.domain;

import br.com.brunasouza.servicex.categoria.domain.Categoria;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="SERVICOS")

public class Servico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SERVICO")
    private Integer idServico;
    @Column(name = "NOME_SERVICO")
    private String nomeServico;
    @Column(name = "VALOR_SERVICO")
    private Double valorServico;
    @ManyToOne
    @JoinColumn(name = "idCategoria")
    private Categoria categoria;

}

