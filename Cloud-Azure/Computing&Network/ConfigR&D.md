# **Passo a passo para configurar recursos e dimensionamento em Máquinas Virtuais (VMs) no Azure**

## **1. Durante a Criação da VM**

Ao criar uma nova máquina virtual no Azure:

### Etapa: "Tamanho da Instância"

* Você verá a aba **"Tamanho"** ou um botão **"Alterar tamanho"**.
* Aqui você pode escolher:

  * Número de **vCPUs**
  * Quantidade de **RAM**
  * **Tipo de série**: B (baixo custo), D (geral), E (memória otimizada), F (alta CPU), etc.
  * **Preço estimado por hora/mês**

> Exemplo:
> `Standard_B2s` → 2 vCPUs, 4 GB RAM (ótimo para testes)

Você pode **filtrar por séries**, **uso** e **preço**.

---

## **2. Após a Criação (Redimensionar uma VM existente)**

Se a VM já estiver criada, siga estes passos para alterar seus recursos:

### **Passo a Passo**

1. Acesse o [Portal do Azure](https://portal.azure.com)
2. Vá para **"Máquinas Virtuais"**
3. Selecione a VM que deseja alterar
4. No menu lateral, clique em **"Tamanho"** (em "Configurações")
5. O Azure mostrará todos os tamanhos disponíveis **compatíveis com a região e a configuração da sua VM**
6. Selecione um novo tamanho
7. Clique em **"Redimensionar"**

> **Importante**: A VM será reiniciada durante o redimensionamento.

---

## **3. Disco e Armazenamento**

### Para alterar disco OS ou dados:

* No menu da VM, vá em **“Discos”**
* Clique no disco do sistema ou disco de dados
* Você pode:

  * Alterar o **tamanho do disco**
  * Mudar o **tipo** (Premium SSD, Standard SSD, Standard HDD)

---

## **4. Opções de Escalabilidade (Autoescalonamento)**

### **Escala manual (VM Scale Sets)**

* Útil para aplicativos web, APIs, ou sistemas que precisam crescer com a demanda.
* Permite configurar número **mínimo/máximo de instâncias**, e o Azure escala conforme necessidade.

---

## **Dicas Importantes**

| Recurso           | Onde configurar                          | Observação                                      |
| ----------------- | ---------------------------------------- | ----------------------------------------------- |
| CPU & RAM         | Na opção **"Tamanho"**                   | Reinício da VM é necessário                     |
| Disco (OS/Dados)  | Em **"Discos"** da VM                    | Pode ser redimensionado a quente (alguns tipos) |
| Rede              | Em **"Rede"**, NSG, IP público etc.      | Pode adicionar interfaces e alterar regras      |
| Autoescalonamento | Em **Scale Set** ou lógica personalizada | Para cargas variáveis                           |
