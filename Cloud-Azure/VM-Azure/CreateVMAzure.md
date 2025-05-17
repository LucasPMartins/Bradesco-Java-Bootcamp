## **Passo a Passo para Criar uma Máquina Virtual Windows no Azure**

### 1. **Acesse o Portal do Azure**

- Vá para: [https://portal.azure.com](https://portal.azure.com)
- Faça login com sua conta da Microsoft.

### 2. **Crie um novo recurso**

- No menu esquerdo, clique em **"Criar um recurso"**.
- Escolha **"Máquina Virtual"** (ou procure por "Virtual Machine").

### 3. **Configure os parâmetros básicos**

Na aba **"Básico"**:

- **Assinatura**: Escolha sua assinatura do Azure.
- **Grupo de recursos**: Crie um novo ou selecione um existente.
- **Nome da máquina virtual**: Ex: `vm-windows-test`.
- **Região**: Escolha a localização mais próxima (ex: Brazil South).
- **Imagem**: Escolha o sistema operacional, como:

  - `Windows Server 2022 Datacenter`
  - `Windows 11 Pro`
- **Tamanho**: Clique em "Alterar tamanho" e escolha um de acordo com seu orçamento (por ex: `Standard_B2s` para testes).
- **Nome de usuário**: Nome do administrador.
- **Senha**: Crie uma senha segura.
- **Portas de entrada públicas**:

  - Se quiser acessar via **RDP**, habilite a **porta 3389**.

### 4. **Disco**

Na aba **"Disco"**:

- Use o padrão SSD Premium ou Standard, conforme seu uso.
- Mantenha as opções padrão, ou personalize conforme necessidade.

### 5. **Rede**

Na aba **"Rede"**:

- Use uma rede virtual padrão ou crie uma nova.
- Confirme que o IP público está habilitado (para acesso remoto).
- Habilite a porta RDP 3389 se quiser conectar via Área de Trabalho Remota.

### 6. **Revisar + Criar**

- Revise todas as configurações.
- Clique em **"Criar"**.
- Aguarde a implantação (poucos minutos).

### 7. **Conectar via RDP**

- Vá até a máquina virtual criada.
- Clique em **"Conectar"** > **"RDP"**.
- Baixe o arquivo `.rdp` e abra no seu PC.
- Insira o usuário e senha criados.

## **Dicas Importantes**

- **Custos**: VMs no Azure são cobradas por tempo de uso + armazenamento. Desligue a VM quando não estiver usando.
- **Backup**: Considere configurar backups automáticos.
- **Firewall**: Certifique-se de que a porta RDP está aberta no NSG (grupo de segurança de rede) se não conseguir se conectar.

## **Instalar servidor Web**
Para ver a VM em ação, instale o servidor Web do IIS. Abra um prompt do PowerShell na VM e execute o seguinte comando:

```PowerShell
Install-WindowsFeature -name Web-Server -IncludeManagementTools
```

Quando terminar, feche a conexão RDP com a VM.