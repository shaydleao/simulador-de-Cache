# cache memory simulator kotlin

## Simulador de Cache (Mapeamento Direto)

### Requisitos:

Elabore, na sua linguagem de programação de preferência, um simulador de memória cache
utilizando a técnica de Mapeamento Direto.

O seu software deve permitir a criação de uma determinada quantidade (base 2) de espaços em
memória cache e em memória principal, sendo que cada espaço recebe um endereço em binário.
A quantidade de bits utilizada para referenciar cada endereço depende da quantidade de espaços
em memória. (Exemplo: Qtd_bits = Log 2 Qtd_enderecos)

Mostre quais são os bits usados como Tag e quais os bits usados para identificar a linha da
memória cache.

O objetivo do software é mostrar ao usuário a quantidade de hits e misses dada uma sequência de
endereços (pode ser aleatório, ou fornecido pelo usuário), bem como calcular o hit_rate
(percentual de hits na memória cache).
