package br.com.rd.exerciciospring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TB_CUPOM_ITEM")
public class CupomItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CUPOM_ITEM")
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_CUPOM")
    private Cupom cupom;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_PRODUTO")
    private Produto produto;

    @Column(name = "QT_PRODUTO")
    private Long quantidade;

    @Column(name = "VL_PRODUTO")
    private BigDecimal vlProduto;
}
