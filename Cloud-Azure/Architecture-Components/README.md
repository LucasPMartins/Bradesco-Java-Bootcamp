# **RESUMO LAB 04**

## **1. Regiões, Pares de Regiões e Regiões Soberanas do Azure**

### **Regiões do Azure**
- **Definição**: Uma região do Azure é uma **área geográfica** que contém um ou mais **datacenters interconectados** com rede de alta velocidade.
- **Objetivo**: Permitir que os clientes implantem recursos próximos aos usuários finais para **reduzir a latência** e cumprir requisitos de **residência de dados**.
- **Exemplos**:
  - **Américas**: Leste dos EUA, Oeste dos EUA, Sul do Brasil, Centro do Canadá.
  - **Europa**: Europa Setentrional (Irlanda), Europa Ocidental (Holanda).
  - **Ásia**: Ásia Oriental (Hong Kong), Sudeste Asiático (Singapura).

### **Pares de Regiões**
- **Definição**: A Microsoft emparelha regiões geograficamente próximas (geralmente a pelo menos **300 km de distância**) para garantir **resiliência**.
- **Características**:
  - **Failover automático**: Se uma região falhar, os serviços podem ser recuperados na região parceira.
  - **Atualizações sequenciais**: A Microsoft atualiza uma região por vez para evitar downtime simultâneo.
  - **Replicação de dados**: Alguns serviços (como **Azure Storage**) replicam dados automaticamente entre pares.
- **Exemplo de Pares**:
  - **Leste dos EUA** ↔ **Oeste dos EUA**
  - **Europa Setentrional** ↔ **Europa Ocidental**

### **Regiões Soberanas**
- **Definição**: São ambientes isolados do Azure projetados para **governos e setores regulamentados**, com conformidade rigorosa.
- **Principais Nuvens Soberanas**:
  - **Azure Government (EUA)**: Para agências governamentais dos EUA.
  - **Azure China (21Vianet)**: Operado pela **21Vianet** na China, seguindo regulamentações locais.

---

## **2. Zonas de Disponibilidade**
- **Definição**: São **datacenters fisicamente separados** dentro de uma mesma região, cada um com infraestrutura independente (energia, resfriamento, rede).
- **Objetivo**: Fornecer **alta disponibilidade (99,99% SLA)** e proteção contra falhas localizadas (incêndios, inundações, falhas de energia).
- **Como funciona**:
  - Cada região habilitada para Availability Zones possui **pelo menos 3 zonas**.
  - Os recursos podem ser **distribuídos entre zonas** para tolerância a falhas (ex: VMs em **Zona 1, Zona 2, Zona 3**).
- **Exemplo de Uso**:
  - Um banco de dados **Azure SQL** configurado com **redundância de zona** continuará funcionando mesmo se uma zona falhar.

---

## **3. Datacenters do Azure**
- **Estrutura Física**: Cada datacenter é uma instalação com:
  - **Servidores** (computação).
  - **Armazenamento em massa** (SSDs, HDDs).
  - **Rede de fibra óptica** (conexão de alta velocidade entre datacenters).
- **Segurança**:
  - **Proteção física**: Biometria, câmeras, guardas 24/7.
  - **Redundância**: Energia e conexão de internet redundantes.
- **Escala Global**: A Microsoft opera **mais de 200 datacenters** em mais de **60 regiões**.

---

## **4. Recursos e Grupos de Recursos**
### **Recursos**
- **Definição**: Qualquer serviço gerenciado pelo Azure (ex: **VM, Banco de Dados SQL, Rede Virtual, Conta de Armazenamento**).
- **Propriedades**:
  - Cada recurso tem um **ID único**.
  - Pode ser movido entre **grupos de recursos**, mas não entre **assinaturas** sem recriação.

### **Grupos de Recursos**
- **Definição**: Um **contêiner lógico** que agrupa recursos relacionados (ex: todos os componentes de um aplicativo).
- **Funções**:
  - **Gerenciamento centralizado** (excluir, monitorar, aplicar políticas).
  - **Organização por projeto/departamento** (ex: `RG-Prod`, `RG-Test`).
- **Regras**:
  - Um recurso **só pode pertencer a um grupo de recursos**.
  - Grupos de recursos **não podem ser aninhados**.

---

## **5. Assinaturas**
- **Definição**: Representam um **contrato de faturamento** com a Microsoft e um limite de recursos.
- **Tipos**:
  - **Enterprise Agreement (EA)**: Para grandes empresas.
  - **Pay-as-you-go**: Pagamento conforme o uso.
  - **Azure for Students/Free Tier**: Para testes e aprendizado.
- **Uso Prático**:
  - **Isolamento de custos**: Uma assinatura para DEV, outra para PROD.
  - **Limites de cota**: Cada assinatura tem limites (ex: número máximo de VMs).

---

## **6. Grupos de Gerenciamento**
- **Definição**: Hierarquia que organiza **assinaturas** para **governança em escala**.
- **Estrutura**:
  ```
  Root Management Group (Tenant)  
  ├── Management Group (Departamento de TI)  
  │   ├── Subscription (PROD)  
  │   └── Subscription (DEV)  
  └── Management Group (Financeiro)  
      └── Subscription (Contabilidade)  
  ```
- **Vantagens**:
  - Aplicar **RBAC (controle de acesso)** e **Azure Policies** em várias assinaturas.
  - Simplificar a gestão em organizações grandes.

---

## **7. Hierarquia Completa do Azure**
1. **Management Groups** (Governança centralizada).
2. **Subscriptions** (Unidade de cobrança e escalabilidade).
3. **Resource Groups** (Agrupamento lógico de recursos).
4. **Resources** (Serviços individuais, como VMs, bancos de dados).

### **Exemplo Prático:**
```
Management Group (Empresa X)  
├── Subscription (Produção)  
│   └── Resource Group (App-Ecommerce)  
│       ├── Virtual Machine (VM-Web)  
│       ├── SQL Database (DB-Pedidos)  
│       └── Storage Account (Storage-Images)  
└── Subscription (Desenvolvimento)  
    └── Resource Group (App-Teste)  
        ├── VM (VM-Test)  
        └── Cosmos DB (DB-Test)  
```

### **Resumo de Benefícios:**
- **Alta disponibilidade** (Zonas de Disponibilidade e Pares de Regiões).
- **Governança escalável** (Management Groups e Azure Policy).
- **Isolamento lógico** (Resource Groups e Subscriptions).
- **Conformidade global** (Regiões Soberanas).

Esse modelo permite que empresas gerenciem recursos na nuvem com **segurança, eficiência e flexibilidade**.

## **Passo a Passo para Criar um Grupo de Recursos no Azure:**
[Clique aqui para saber mais.](CreateRGAzure.md)