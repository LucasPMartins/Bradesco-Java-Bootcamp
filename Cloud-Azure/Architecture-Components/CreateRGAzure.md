# **Passo a Passo para Criar um Grupo de Recursos no Azure**  

Um **Grupo de Recursos** no Azure é um contêiner que armazena recursos relacionados a uma solução. Segue abaixo o passo a passo para criar um:  

## **Método 1: Criar via Portal Azure**  

1. **Acesse o Portal Azure**  
   - Entre em [https://portal.azure.com](https://portal.azure.com) com sua conta.  

2. **Navegue até "Grupos de Recursos"**  
   - No menu à esquerda, clique em **"Grupos de Recursos"**.  
   - Ou use a barra de pesquisa e digite **"Grupos de Recursos"**.  

3. **Clique em "Criar"**  
   - No canto superior esquerdo, clique no botão **"+ Criar"**.  

4. **Preencha os Detalhes do Grupo de Recursos**  
   - **Assinatura**: Selecione a assinatura desejada.  
   - **Nome do Grupo de Recursos**: Defina um nome único (ex: `MeuGrupoRecursos`).  
   - **Região**: Escolha a região onde o grupo será armazenado (ex: **"Brasil Sul"**).  

5. **Clique em "Revisar + Criar"**  
   - Confira as informações e clique em **"Criar"**.  

6. **Confirmação**  
   - Após a implantação, clique em **"Ir para o grupo de recursos"** para visualizá-lo.  

---  

## **Método 2: Criar via Azure CLI**  

1. **Abra o Azure CLI**  
   - No terminal (PowerShell, Bash ou Azure Cloud Shell), execute:  

   ```bash
   az group create --name NomeDoGrupo --location regiao
   ```  
   - Exemplo:  
     ```bash
     az group create --name MeuGrupoRecursos --location brazilsouth
     ```  

2. **Verificação**  
   - Para listar os grupos de recursos:  
     ```bash
     az group list
     ```  

---  

## **Método 3: Criar via PowerShell**  

1. **Abra o Azure PowerShell**  
   - Execute o comando:  

   ```powershell
   New-AzResourceGroup -Name "NomeDoGrupo" -Location "regiao"
   ```  
   - Exemplo:  
     ```powershell
     New-AzResourceGroup -Name "MeuGrupoRecursos" -Location "BrazilSouth"
     ```  

2. **Verificação**  
   - Liste os grupos existentes:  
     ```powershell
     Get-AzResourceGroup
     ```  

---