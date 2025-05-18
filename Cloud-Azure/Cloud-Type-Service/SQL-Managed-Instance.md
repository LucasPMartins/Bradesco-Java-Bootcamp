# **Passo a Passo: Criar Instância Gerenciada de SQL no Azure (Azure SQL Managed Instance)**

### 1. **Acesse o Portal do Azure**

- URL: [https://portal.azure.com](https://portal.azure.com)
- Faça login com sua conta.

---

### 2. **Crie um novo recurso**

- Clique em **“Criar um recurso”** no menu esquerdo.
- Pesquise por **“Instância Gerenciada de SQL”** ou **“SQL Managed Instance”**.
- Clique em **“Criar”**.

---

### 3. **Configurações Básicas**

Na aba **“Básico”**:

- **Assinatura**: Escolha sua assinatura ativa.
- **Grupo de Recursos**: Selecione um existente ou clique em **“Criar novo”**.
- **Nome da instância**: Ex: `sqlinstancia01`
- **Região**: Escolha a região desejada (ex: Brazil South).
- **Tipo de Instância**:

  - **Uso geral (General Purpose)** — para cargas de trabalho padrão.
  - **Crítico para a missão (Business Critical)** — para alta performance e HA.

---

### 4. **Configuração de computação e armazenamento**

- Escolha a **família de hardware** (geralmente Gen5).
- Defina o número de **vCores**.
- Defina o tamanho de **armazenamento (GB)**.

> O custo varia bastante com base nesses dois fatores.

---

### 5. **Administrador do SQL**

- Defina o nome de usuário administrador (ex: `sqladmin`).
- Defina a senha segura.

---

### 6. **Configuração de rede**

Essa é uma parte **crucial** da Instância Gerenciada.

- **Sub-rede virtual obrigatória**: a instância precisa estar em uma **sub-rede dedicada**.
- Se necessário, clique em **“Criar nova rede virtual”**.

  - A sub-rede deve estar **vazia** e dedicada apenas à instância.
  - O serviço criará automaticamente os grupos de segurança e roteamento.

---

### 7. **Segurança (opcional)**

- Configure **Azure Defender for SQL** se quiser proteção adicional.
- Pode configurar **autenticação do Azure AD**, **chaves gerenciadas**, etc.

---

### 8. **Revisar + Criar**

- Revise todas as configurações.
- Clique em **“Criar”**.
- A implantação pode levar **30–60 minutos**.

---

### 9. **Conectar à instância**

Após criada:

- Vá para a instância > **"Ponto de Extremidade"** para obter o **FQDN**.
- Use ferramentas como **SQL Server Management Studio (SSMS)** para se conectar.
- Lembre-se de configurar o **NSG** e regras de firewall para permitir conexões.

---

## Dicas

- **Rede**: A instância gerenciada é **inserida em uma VNet**, então pense na topologia de rede antecipadamente.
- **Custo**: Cuidado com o custo de armazenamento + vCores + backups automáticos.
- **Backups**: Incluídos por padrão (retenção de 7–35 dias).
- **Alta Disponibilidade**: Incluso automaticamente nas opções de missão crítica.

Perfeito! Você descreveu corretamente o processo. Abaixo está o **passo a passo detalhado para criar um banco de dados em uma Instância Gerenciada de SQL no Portal do Azure**, com explicações simples para cada etapa:

---

# **Como Criar um Banco de Dados em uma Instância Gerenciada de SQL no Azure**

### **Pré-requisito**

Você já precisa ter uma **Instância Gerenciada de SQL (Azure SQL Managed Instance)** criada.

---

### **1. Acesse sua Instância no Portal do Azure**

- Vá para [https://portal.azure.com](https://portal.azure.com)
- No menu lateral esquerdo, clique em **"Instâncias Gerenciadas de SQL"**
- Selecione a instância onde deseja criar o banco.

---

### **2. Criar novo banco de dados**

- Na página **Visão geral** da instância, clique em **`+ Novo banco de dados`**

  - Isso abrirá o formulário **Criar banco de dados gerenciado do SQL do Azure**

---

### **3. Aba “Básico”**

- **Nome do banco de dados**: Defina um nome único (ex: `MeuBancoTeste`)
- **Assinatura e Grupo de Recursos**: Já estarão preenchidos com os da instância.
- **Instância gerenciada**: Confirme que está correta.

---

### **4. Aba “Fonte de Dados”**

- Escolha:

  - **Nenhuma** → para um banco de dados vazio
  - **Backup** → para restaurar de um backup existente
  - **Modelo de exemplo** → se quiser um banco com dados de exemplo para testes

---

### **5. Aba “Configurações adicionais” (opcional)**

- Aqui você pode definir:

  - **Collation** (ordenação e sensibilidade de dados)
  - **Compatibilidade com versões do SQL Server**
  - **Tags** (para organização/cobrança)

---

### **6. Revisar + Criar**

- Clique em **“Revisar + criar”**
- Verifique se todas as configurações estão corretas
- Clique em **“Criar”**

---

### **Pronto!**

- O banco de dados será criado dentro da instância.
- Após a implantação, você poderá vê-lo listado em **"Bancos de dados"** dentro da sua instância.
