# Resumo LAB 02

## Benefícios da Nuvem Azure
A Microsoft Azure oferece tudo o que as empresas precisam para crescer, inovar e se manter seguras – tudo isso sem complicação e com a confiança de uma das maiores empresas de tecnologia do mundo.

## **O que são Níveis de Disponibilidade?**

É a **garantia de que um serviço estará funcionando e acessível** durante determinado período de tempo. Quanto maior a disponibilidade, **menor a chance de falhas ou interrupções**.

| Nível de Disponibilidade | Tempo máximo de indisponibilidade por ano |
| ------------------------ | ----------------------------------------- |
| 99% (dois noves)         | \~3 dias e 15 horas                       |
| 99,9% (três noves)       | \~8 horas e 45 minutos                    |
| 99,99% (quatro noves)    | \~52 minutos                              |
| 99,999% (cinco noves)    | \~5 minutos                               |

Quanto mais "noves", **mais confiável** é o serviço.

### **Como a Azure oferece esses níveis?**

A Azure entrega alta disponibilidade com recursos como:

- **Zonas de disponibilidade**: Regiões diferentes e isoladas fisicamente, mas interconectadas. Se uma cair, outra assume.
- **Conjuntos de disponibilidade (Availability Sets)**: Agrupam VMs em racks diferentes para evitar que todas falhem ao mesmo tempo.
- **Balanceadores de carga**: Distribuem o tráfego entre instâncias para manter o desempenho mesmo com falhas.
- **SLA (Acordo de Nível de Serviço)**: A Azure publica SLAs para cada serviço, mostrando a **garantia de tempo ativo**.

> SLA (Service Level Agreement) é o acordo de nível de serviço que define os parâmetros e garantias de um serviço contratado, incluindo tempo de atividade (uptime), desempenho, suporte, entre outros.

### **Por que isso é importante?**

Porque:

- Evita prejuízos com sistemas fora do ar.
- Garante boa experiência para o cliente final.
- Dá mais segurança para operações críticas (como bancos, e-commerces e hospitais).

---

## **Escalabilidade e Elasticidade**
- Escalabilidade: Você pode aumentar ou diminuir recursos conforme a necessidade. A Azure dá conta do recado, automaticamente.

- Elasticidade: A plataforma se adapta ao uso real, o que evita gastos desnecessários e garante performance ideal, mesmo em horários de pico.

Exemplo: Uma loja online pode usar mais servidores na Black Friday e depois reduzir quando o movimento cai — tudo isso sem precisar comprar hardware novo.

## **Confiabilidade, Previsibilidade e Segurança**
- Confiabilidade: Alta disponibilidade com data centers ao redor do mundo — seu serviço não para.

- Previsibilidade: Você sabe quanto está gastando e pode planejar os custos com mais controle.

- Segurança: A Azure tem protocolos rigorosos, criptografia, controle de acesso e conformidade com padrões internacionais (como ISO e LGPD).

## **Governança e Gerenciabilidade**
- Governança: Dá pra definir regras claras sobre quem pode acessar o quê, controlar gastos, e garantir que tudo siga políticas da empresa.

- Gerenciabilidade: Ferramentas como o Azure Monitor e o Azure Policy ajudam a acompanhar o uso, corrigir erros, aplicar padrões e manter tudo funcionando do jeito certo.

Resumo: É como ter um painel de controle completo pra sua nuvem, onde você olha, ajusta e organiza tudo com facilidade.

---

### **Esses são benefícios típicos da nuvem pública**:

- **Alta disponibilidade**: Garantia de que os serviços estarão acessíveis a maior parte do tempo.

- **Escalabilidade**: Capacidade de aumentar recursos conforme a demanda.

- **Elasticidade**: Capacidade de aumentar ou reduzir recursos automaticamente, conforme necessário.

- **Segurança**: Embora haja preocupações, os provedores de nuvem pública investem fortemente em segurança, oferecendo mecanismos avançados de proteção de dados e conformidade.

---

## **Como criar uma Máquina Virtual Windows no Azure**: 
[Clique aqui para saber mais.](.\CreateVMAzure.md)

